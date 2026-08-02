package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes11.dex */
class SlideDistanceProvider$1 extends AnimatorListenerAdapter {
    final /* synthetic */ float val$originalTranslation;
    final /* synthetic */ View val$view;

    public SlideDistanceProvider$1(View view, float f) {
        this.val$view = view;
        this.val$originalTranslation = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.val$view.setTranslationX(this.val$originalTranslation);
    }
}
