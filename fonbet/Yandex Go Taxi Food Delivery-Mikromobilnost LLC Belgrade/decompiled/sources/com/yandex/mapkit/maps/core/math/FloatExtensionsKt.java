package com.yandex.mapkit.maps.core.math;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0007\u001a\u00020\t\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"checkValid", "", "fallback", "(FLjava/lang/Float;)Ljava/lang/Float;", "FLOAT_EPSILON", "isIdentical", "", "other", "DOUBLE_EPSILON", "", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FloatExtensionsKt {
    private static final double DOUBLE_EPSILON = 1.0E-9d;
    private static final float FLOAT_EPSILON = 1.0E-6f;

    public static final Float checkValid(float f, Float f2) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? f2 : Float.valueOf(f);
    }

    public static final boolean isIdentical(double d, double d2) {
        return Math.abs(d - d2) < DOUBLE_EPSILON;
    }

    public static final boolean isIdentical(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-6f;
    }

    public static final float checkValid(float f, float f2) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? f2 : f;
    }
}
