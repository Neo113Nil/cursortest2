package com.google.android.material.transition;

import android.animation.ValueAnimator;
import android.view.View;
import defpackage.sy01;

/* loaded from: classes11.dex */
class FadeThroughProvider$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float val$endFraction;
    final /* synthetic */ float val$endValue;
    final /* synthetic */ float val$startFraction;
    final /* synthetic */ float val$startValue;
    final /* synthetic */ View val$view;

    public FadeThroughProvider$1(View view, float f, float f2, float f3, float f4) {
        this.val$view = view;
        this.val$startValue = f;
        this.val$endValue = f2;
        this.val$startFraction = f3;
        this.val$endFraction = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.val$view.setAlpha(sy01.d(this.val$startValue, this.val$endValue, this.val$startFraction, this.val$endFraction, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
