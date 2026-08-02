package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.a710;
import defpackage.je4;
import defpackage.mj2;
import defpackage.org0;

/* loaded from: classes11.dex */
public final class b extends a710 {
    public final float g;
    public final float h;

    public b(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(org0.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(org0.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    public final void b(je4 je4Var, Animator.AnimatorListener animatorListener) {
        View view = this.b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(mj2.c(this.c, this.d, je4Var.c));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                b.this.b.setTranslationY(0.0f);
                b.this.c(0.0f);
            }
        });
        ofFloat.addListener(animatorListener);
        ofFloat.start();
    }

    public final void c(float f) {
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.g / width;
        float f3 = this.h / height;
        float a = 1.0f - mj2.a(0.0f, f2, interpolation);
        float a2 = 1.0f - mj2.a(0.0f, f3, interpolation);
        if (Float.isNaN(a) || Float.isNaN(a2)) {
            return;
        }
        view.setScaleX(a);
        view.setPivotY(height);
        view.setScaleY(a2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a2 != 0.0f ? a / a2 : 1.0f);
            }
        }
    }
}
