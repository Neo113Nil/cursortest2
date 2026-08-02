package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ex31;
import defpackage.ny61;
import defpackage.org0;
import defpackage.oyr;

/* loaded from: classes11.dex */
public final class e implements ex31 {
    public final int a;

    public e(int i) {
        this.a = i;
    }

    public static ObjectAnimator c(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator d(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.ex31
    public final Animator a(View view, ViewGroup viewGroup) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(org0.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i = this.a;
        if (i == 3) {
            return c(view, translationX, translationX - dimensionPixelSize, translationX);
        }
        if (i == 5) {
            return c(view, translationX, dimensionPixelSize + translationX, translationX);
        }
        if (i == 48) {
            return d(view, translationY, dimensionPixelSize + translationY, translationY);
        }
        if (i == 80) {
            return d(view, translationY, translationY - dimensionPixelSize, translationY);
        }
        if (i == 8388611) {
            return c(view, translationX, viewGroup.getLayoutDirection() == 1 ? translationX - dimensionPixelSize : dimensionPixelSize + translationX, translationX);
        }
        if (i == 8388613) {
            return c(view, translationX, viewGroup.getLayoutDirection() == 1 ? dimensionPixelSize + translationX : translationX - dimensionPixelSize, translationX);
        }
        ny61.g(oyr.i(i, "Invalid slide direction: "));
        return null;
    }

    @Override // defpackage.ex31
    public final Animator b(View view, ViewGroup viewGroup) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(org0.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i = this.a;
        if (i == 3) {
            return c(view, dimensionPixelSize + translationX, translationX, translationX);
        }
        if (i == 5) {
            return c(view, translationX - dimensionPixelSize, translationX, translationX);
        }
        if (i == 48) {
            return d(view, translationY - dimensionPixelSize, translationY, translationY);
        }
        if (i == 80) {
            return d(view, dimensionPixelSize + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return c(view, viewGroup.getLayoutDirection() == 1 ? dimensionPixelSize + translationX : translationX - dimensionPixelSize, translationX, translationX);
        }
        if (i == 8388613) {
            return c(view, viewGroup.getLayoutDirection() == 1 ? translationX - dimensionPixelSize : dimensionPixelSize + translationX, translationX, translationX);
        }
        ny61.g(oyr.i(i, "Invalid slide direction: "));
        return null;
    }
}
