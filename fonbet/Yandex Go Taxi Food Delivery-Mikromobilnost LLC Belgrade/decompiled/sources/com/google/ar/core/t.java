package com.google.ar.core;

import android.animation.ValueAnimator;

/* loaded from: classes11.dex */
final class t implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ InstallActivity d;

    public t(InstallActivity installActivity, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = installActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float f = this.b;
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        this.d.getWindow().setLayout((int) ((this.a * animatedFraction) + (f * animatedFraction2)), (int) ((this.c * animatedFraction) + (this.b * animatedFraction2)));
        this.d.getWindow().getDecorView().refreshDrawableState();
    }
}
