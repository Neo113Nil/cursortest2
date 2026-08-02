package com.yandex.div.core.animation;

import android.view.animation.Interpolator;

/* compiled from: ReverseInterpolator.kt */
/* loaded from: classes7.dex */
public final class ReverseInterpolatorKt {
    public static final Interpolator reversed(Interpolator interpolator) {
        return new ReverseInterpolator(interpolator);
    }
}
