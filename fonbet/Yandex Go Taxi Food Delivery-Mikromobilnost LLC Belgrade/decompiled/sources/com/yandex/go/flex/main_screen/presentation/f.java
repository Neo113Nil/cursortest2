package com.yandex.go.flex.main_screen.presentation;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import defpackage.c40;
import defpackage.g18;
import defpackage.k20;
import defpackage.mrg0;
import defpackage.xw31;

/* loaded from: classes.dex */
public final class f {
    public final FrameLayout a;
    public final FrameLayout b;
    public MainScreenFlexSdkViewFabDelegate$State c = MainScreenFlexSdkViewFabDelegate$State.Hidden;
    public g18 d = g18.u1;
    public final OvershootInterpolator e = new OvershootInterpolator(0.75f);
    public final int f;

    public f(FrameLayout frameLayout, FrameLayout frameLayout2, Resources resources) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.f = resources.getDimensionPixelSize(mrg0.component_float_button_icon_shadow_compensation);
    }

    public final void a() {
        g18 k20Var;
        MainScreenFlexSdkViewFabDelegate$State mainScreenFlexSdkViewFabDelegate$State = this.c;
        MainScreenFlexSdkViewFabDelegate$State mainScreenFlexSdkViewFabDelegate$State2 = MainScreenFlexSdkViewFabDelegate$State.Shown;
        if (mainScreenFlexSdkViewFabDelegate$State == mainScreenFlexSdkViewFabDelegate$State2) {
            return;
        }
        FrameLayout frameLayout = this.b;
        int childCount = frameLayout.getChildCount();
        FrameLayout frameLayout2 = this.a;
        if (childCount == 0 && frameLayout2.getChildCount() == 0) {
            this.c = MainScreenFlexSdkViewFabDelegate$State.WaitingForButtons;
            return;
        }
        this.c = mainScreenFlexSdkViewFabDelegate$State2;
        frameLayout2.setVisibility(0);
        frameLayout.setVisibility(0);
        this.d.cancel();
        Runnable runnable = new Runnable() { // from class: com.yandex.go.flex.main_screen.presentation.e
            @Override // java.lang.Runnable
            public final void run() {
                float width;
                float width2;
                f fVar = f.this;
                TimeInterpolator timeInterpolator = fVar.e;
                int i = fVar.f;
                FrameLayout frameLayout3 = fVar.b;
                FrameLayout frameLayout4 = fVar.a;
                if (fVar.c == MainScreenFlexSdkViewFabDelegate$State.Shown) {
                    if (frameLayout4.equals(frameLayout4)) {
                        width = i;
                    } else {
                        Object parent = frameLayout3.getParent();
                        width = (((parent instanceof View ? (View) parent : null) != null ? r4.getWidth() : 0.0f) - i) - frameLayout3.getWidth();
                    }
                    ViewPropertyAnimator animate = frameLayout4.animate();
                    animate.cancel();
                    boolean z = false;
                    int i2 = 2;
                    animate.setInterpolator(timeInterpolator).setDuration(500L).withEndAction(new c40(z, fVar, i2)).x(width);
                    if (frameLayout3.equals(frameLayout4)) {
                        width2 = i;
                    } else {
                        Object parent2 = frameLayout3.getParent();
                        width2 = (((parent2 instanceof View ? (View) parent2 : null) != null ? r6.getWidth() : 0.0f) - i) - frameLayout3.getWidth();
                    }
                    ViewPropertyAnimator animate2 = frameLayout3.animate();
                    animate2.cancel();
                    animate2.setInterpolator(timeInterpolator).setDuration(500L).withEndAction(new c40(z, fVar, i2)).x(width2);
                }
            }
        };
        Rect rect = xw31.a;
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            k20Var = new k20(10, frameLayout, xw31.c(frameLayout, runnable));
        } else {
            runnable.run();
            k20Var = g18.u1;
        }
        this.d = k20Var;
    }
}
