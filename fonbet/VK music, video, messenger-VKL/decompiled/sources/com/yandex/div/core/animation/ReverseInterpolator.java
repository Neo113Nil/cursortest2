package com.yandex.div.core.animation;

import android.view.animation.Interpolator;

/* compiled from: ReverseInterpolator.kt */
/* loaded from: classes7.dex */
public final class ReverseInterpolator implements Interpolator {
    private final Interpolator base;

    public ReverseInterpolator(Interpolator interpolator) {
        this.base = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.base.getInterpolation(1.0f - f);
    }
}
