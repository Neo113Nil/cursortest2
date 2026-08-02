package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ex31;

/* loaded from: classes11.dex */
public final class d implements ex31 {
    public final float a;
    public float b;
    public float c;
    public final float d;
    public final boolean e;
    public boolean f;

    public d(boolean z) {
        this.a = 1.0f;
        this.b = 1.1f;
        this.c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = z;
    }

    public static ObjectAnimator c(float f, float f2, final View view) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.ScaleProvider$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.ex31
    public final Animator a(View view, ViewGroup viewGroup) {
        if (this.f) {
            return this.e ? c(this.a, this.b, view) : c(this.d, this.c, view);
        }
        return null;
    }

    @Override // defpackage.ex31
    public final Animator b(View view, ViewGroup viewGroup) {
        return this.e ? c(this.c, this.d, view) : c(this.b, this.a, view);
    }

    public d() {
        this(true);
    }
}
