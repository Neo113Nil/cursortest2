package com.yandex.div.internal.drawable;

/* compiled from: LinearGradientDrawable.kt */
/* loaded from: classes7.dex */
public final class LinearGradientDrawableKt {
    private static final float snap(float f, float f2, float f3) {
        return Math.abs(f2 - f) <= f3 ? f2 : f;
    }

    public static /* synthetic */ float snap$default(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f3 = 1.0E-4f;
        }
        return snap(f, f2, f3);
    }
}
