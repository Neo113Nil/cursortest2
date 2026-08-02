package com.vkontakte.android;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.navigation.NavigationDelegateActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.a52;
import xsna.gz80;
import xsna.h03;
import xsna.iah0;
import xsna.oz50;
import xsna.p90;
import xsna.rsr;
import xsna.tb0;
import xsna.vxn0;

/* loaded from: classes7.dex */
public class TabletDialogActivity extends NavigationDelegateActivity implements View.OnClickListener {
    public FitSystemWindowsFragmentWrapperFrameLayout K;

    @Nullable
    public a52 L;
    public CopyOnWriteArrayList w;
    public int x = 49;
    public int y = iah0.a(32);
    public int z = iah0.a(760);
    public int A = -1;
    public int B = 32;
    public Class<? extends FragmentImpl> C = null;
    public Bundle D = null;
    public int E = R.color.white;
    public int F = -1;
    public int G = 0;
    public boolean H = false;
    public boolean I = false;
    public float J = -1.0f;

    public static class a extends oz50.a {
        public final void b() {
            this.b.putInt("gravity", 17);
        }
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void Li(tb0 tb0Var) {
        if (this.w == null) {
            this.w = new CopyOnWriteArrayList();
        }
        this.w.add(tb0Var);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public void O1(Configuration configuration) {
        super.O1(configuration);
        X1(getWindow(), getWindow().getAttributes(), this.q, p90.f(this));
    }

    public final void X1(Window window, WindowManager.LayoutParams layoutParams, boolean z, boolean z2) {
        TabletDialogActivity tabletDialogActivity;
        Window window2;
        WindowManager.LayoutParams layoutParams2;
        if (z || z2) {
            if (this.A < 0 || this.I) {
                tabletDialogActivity = this;
                window2 = window;
                layoutParams2 = layoutParams;
            } else {
                Rect rect = new Rect();
                View decorView = window.getDecorView();
                tabletDialogActivity = this;
                window2 = window;
                layoutParams2 = layoutParams;
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(new vxn0(tabletDialogActivity, decorView, rect, layoutParams2, window2));
            }
            if (z2) {
                layoutParams2.width = -1;
                layoutParams2.height = -1;
            } else {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                layoutParams2.width = Math.min(tabletDialogActivity.z, i - (tabletDialogActivity.y << 1));
                int i3 = tabletDialogActivity.A;
                if (i3 >= 0) {
                    layoutParams2.height = Math.min(i2, i3) - tabletDialogActivity.K.getInsetTop();
                }
            }
            layoutParams2.softInputMode = tabletDialogActivity.B;
            layoutParams2.gravity = tabletDialogActivity.x;
            window2.setAttributes(layoutParams2);
            window2.setSoftInputMode(tabletDialogActivity.B);
            float f = tabletDialogActivity.J;
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                window2.setElevation(f);
            }
        } else {
            tabletDialogActivity = this;
            window2 = window;
        }
        int i4 = tabletDialogActivity.G;
        if (i4 != 0) {
            window2.setWindowAnimations(i4);
        }
    }

    @Override // com.vkontakte.android.VKActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (!this.H && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && motionEvent.getAction() == 0) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CopyOnWriteArrayList copyOnWriteArrayList = this.w;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((tb0) it.next()).onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        FragmentImpl fragmentImpl = (FragmentImpl) ((ParentSupportFragment) n().a.H("fragment_default_tag"));
        if (fragmentImpl == null || !fragmentImpl.a0()) {
            if (getFragmentManager().getBackStackEntryCount() > 1) {
                getFragmentManager().popBackStack();
            } else {
                finish();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        onBackPressed();
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.x = extras.getInt("gravity", this.x);
            this.y = extras.getInt("min_spacing", this.y);
            this.z = extras.getInt("max_width", this.z);
            Bundle extras2 = intent.getExtras();
            rsr rsrVar = oz50.k;
            FragmentEntry c = oz50.b.c(extras2);
            if (c != null) {
                this.C = c.b;
                this.D = c.c;
            } else {
                this.C = null;
                this.D = null;
            }
            this.E = extras.getInt("window_background_resource", -1);
            this.F = extras.getInt("window_background_color", -1);
            this.G = extras.getInt("window_animation", this.G);
            this.B = extras.getInt("input_mode", this.B);
            this.A = extras.getInt("preferred_height", this.A);
            this.H = extras.getBoolean("closeOnTouchOutside");
            this.J = extras.getFloat("elevation");
            this.I = extras.getBoolean("withoutAdjustResize");
        }
        setFinishOnTouchOutside(!this.H);
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = new FitSystemWindowsFragmentWrapperFrameLayout(this, 0);
        this.K = fitSystemWindowsFragmentWrapperFrameLayout;
        fitSystemWindowsFragmentWrapperFrameLayout.setId(R.id.fragment_wrapper);
        if (!this.q) {
            this.K.setClipToPadding(true);
        }
        setContentView(this.K);
        View findViewById = getWindow().getDecorView().findViewById(R.id.title);
        if (findViewById != null) {
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        View findViewById2 = getWindow().getDecorView().findViewById(R.id.title);
        if (findViewById2 != null) {
            ((ViewGroup) findViewById2.getParent()).removeView(findViewById2);
        }
        if (this.E == -1 && this.F == -1) {
            getWindow().setBackgroundDrawableResource(R.color.white);
        }
        if (this.E != -1) {
            getWindow().setBackgroundDrawableResource(this.E);
        }
        if (this.F != -1) {
            getWindow().setBackgroundDrawable(new ColorDrawable(this.F));
        }
        if (this.q && !gz80.a(24)) {
            this.L = new a52(getWindow(), this.K);
        }
        getResources().getConfiguration();
        X1(getWindow(), getWindow().getAttributes(), this.q, p90.f(this));
        Class<? extends FragmentImpl> cls = this.C;
        if (cls == null || bundle != null) {
            return;
        }
        try {
            n().q().c(R.id.fragment_wrapper, new FragmentEntry(cls, this.D).Ab());
        } catch (Exception e) {
            h03.b(e);
            finish();
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        a52 a52Var = this.L;
        if (a52Var != null) {
            a52Var.a.getViewTreeObserver().removeOnGlobalLayoutListener(a52Var.c);
        }
        super.onPause();
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        a52 a52Var = this.L;
        if (a52Var != null) {
            a52Var.a.getViewTreeObserver().addOnGlobalLayoutListener(a52Var.c);
        }
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void yk(tb0 tb0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.w;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(tb0Var);
        }
    }
}
