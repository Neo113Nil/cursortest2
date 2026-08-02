package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes11.dex */
class ScaleProvider$1 extends AnimatorListenerAdapter {
    final /* synthetic */ float val$originalScaleX;
    final /* synthetic */ float val$originalScaleY;
    final /* synthetic */ View val$view;

    public ScaleProvider$1(View view, float f, float f2) {
        this.val$view = view;
        this.val$originalScaleX = f;
        this.val$originalScaleY = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.val$view.setScaleX(this.val$originalScaleX);
        this.val$view.setScaleY(this.val$originalScaleY);
    }
}
