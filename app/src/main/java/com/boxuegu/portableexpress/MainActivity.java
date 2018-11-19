package com.boxuegu.portableexpress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private FrameLayout main_body;
    private TextView bottom_bar_text;
    private ImageView bottom_bar_image_home;
    private LinearLayout main_bottom_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private TextView t = (TextView) findViewById(R.id.bottom_bar_text);

    private void initView() {
        main_body = (FrameLayout) findViewById(R.id.main_body);
        bottom_bar_text = (TextView) findViewById(R.id.bottom_bar_text);
        bottom_bar_image_home = (ImageView) findViewById(R.id.bottom_bar_image_home);
        main_bottom_bar = (LinearLayout) findViewById(R.id.main_bottom_bar);
    }
}
