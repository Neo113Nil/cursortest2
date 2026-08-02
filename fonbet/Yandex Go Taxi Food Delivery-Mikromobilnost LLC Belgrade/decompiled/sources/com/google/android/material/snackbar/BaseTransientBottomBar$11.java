package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* loaded from: classes11.dex */
class BaseTransientBottomBar$11 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ b this$0;

    public BaseTransientBottomBar$11(b bVar) {
        this.this$0 = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.this$0.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
