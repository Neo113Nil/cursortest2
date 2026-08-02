package com.vkontakte.android.activities;

import android.R;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vkontakte.android.VKActivity;
import xsna.gdr0;
import xsna.iah0;

/* loaded from: classes7.dex */
public class TabletsDialogActivity extends VKActivity {
    public final int v = 17;
    public final int w = iah0.a(32);
    public final int x = iah0.a(760);
    public final int y = 32;
    public final int z = R.color.white;

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public final void O1(Configuration configuration) {
        super.O1(configuration);
        T1(getWindow(), this.q);
    }

    public final void T1(Window window, boolean z) {
        if (z) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = Math.min(this.x, getResources().getDisplayMetrics().widthPixels - (this.w << 1));
            attributes.height = -1;
            int i = this.y;
            attributes.softInputMode = i;
            attributes.gravity = this.v;
            window.setAttributes(attributes);
            window.setSoftInputMode(i);
        }
        window.setBackgroundDrawableResource(this.z);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        T1(getWindow(), this.q);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        setContentView(((gdr0) getSystemService("layout_inflater")).inflate(i, (ViewGroup) null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = new FitSystemWindowsFragmentWrapperFrameLayout(this, 0);
        if (!this.q) {
            fitSystemWindowsFragmentWrapperFrameLayout.setClipToPadding(true);
        }
        fitSystemWindowsFragmentWrapperFrameLayout.addView(view);
        super.setContentView(fitSystemWindowsFragmentWrapperFrameLayout);
    }
}
