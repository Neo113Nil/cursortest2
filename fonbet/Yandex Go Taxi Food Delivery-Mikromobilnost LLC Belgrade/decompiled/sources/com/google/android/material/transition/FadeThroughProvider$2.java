package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes11.dex */
class FadeThroughProvider$2 extends AnimatorListenerAdapter {
    final /* synthetic */ float val$originalAlpha;
    final /* synthetic */ View val$view;

    public FadeThroughProvider$2(View view, float f) {
        this.val$view = view;
        this.val$originalAlpha = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.val$view.setAlpha(this.val$originalAlpha);
    }
}
