package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ex31;

/* loaded from: classes11.dex */
public final class a implements ex31 {
    public float a = 1.0f;

    @Override // defpackage.ex31
    public final Animator a(View view, ViewGroup viewGroup) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new FadeProvider$1(view, alpha, 0.0f, 0.0f, 1.0f));
        ofFloat.addListener(new FadeProvider$2(view, alpha));
        return ofFloat;
    }

    @Override // defpackage.ex31
    public final Animator b(View view, ViewGroup viewGroup) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        float f = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new FadeProvider$1(view, 0.0f, alpha, 0.0f, f));
        ofFloat.addListener(new FadeProvider$2(view, alpha));
        return ofFloat;
    }
}
