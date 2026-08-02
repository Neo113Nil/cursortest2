package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.a710;
import defpackage.je4;
import defpackage.mj2;
import defpackage.org0;

/* loaded from: classes11.dex */
public final class d extends a710 {
    public final float g;
    public final float h;
    public final float i;

    public d(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(org0.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(org0.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(org0.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a() {
        je4 je4Var = this.f;
        this.f = null;
        if (je4Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.e);
        animatorSet.start();
    }

    public final void b(je4 je4Var, final int i, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i2;
        final boolean z = je4Var.d == 0;
        View view = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i2 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i2 = 0;
        }
        float f = scaleX + i2;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(mj2.c(this.c, this.d, je4Var.c));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                d.this.b.setTranslationX(0.0f);
                d.this.c(i, 0.0f, z);
            }
        });
        ofFloat.addListener(animatorListenerAdapter);
        ofFloat.start();
    }

    public final void c(int i, float f, boolean z) {
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            if (z2) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float a = mj2.a(0.0f, f5, interpolation);
            float f7 = a + 1.0f;
            float a2 = 1.0f - mj2.a(0.0f, f6, interpolation);
            if (Float.isNaN(f7) || Float.isNaN(a2)) {
                return;
            }
            view.setScaleX(f7);
            view.setScaleY(a2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - a : 1.0f;
                    float f9 = a2 != 0.0f ? (f7 / a2) * f8 : 1.0f;
                    if (!Float.isNaN(f8) && !Float.isNaN(f9)) {
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }
}
