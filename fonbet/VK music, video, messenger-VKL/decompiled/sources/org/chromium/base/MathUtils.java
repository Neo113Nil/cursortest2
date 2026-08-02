package org.chromium.base;

import xsna.pm0;
import xsna.u11;

/* loaded from: classes8.dex */
public class MathUtils {
    public static final float EPSILON = 0.001f;

    private MathUtils() {
    }

    public static boolean areFloatsEqual(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public static float clamp(float f, float f2, float f3) {
        float f4 = f2 > f3 ? f3 : f2;
        if (f2 <= f3) {
            f2 = f3;
        }
        return f < f4 ? f4 : f > f2 ? f2 : f;
    }

    public static float distance(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    public static float flipSignIf(float f, boolean z) {
        return z ? -f : f;
    }

    public static float interpolate(float f, float f2, float f3) {
        return u11.b(f2, f, f3, f);
    }

    public static float map(float f, float f2, float f3, float f4, float f5) {
        return (((f - f2) / (f3 - f2)) * (f5 - f4)) + f4;
    }

    public static int positiveModulo(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static double roundTwoDecimalPlaces(double d) {
        return Math.round(d * 100.0d) / 100.0d;
    }

    public static float smoothstep(float f) {
        return pm0.a(f, 2.0f, 3.0f, f * f);
    }

    public static int clamp(int i, int i2, int i3) {
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        return i < i4 ? i4 : i > i2 ? i2 : i;
    }

    public static float distance(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public static int flipSignIf(int i, boolean z) {
        return z ? -i : i;
    }

    public static long clamp(long j, long j2, long j3) {
        long j4 = j2 > j3 ? j3 : j2;
        if (j2 <= j3) {
            j2 = j3;
        }
        return j < j4 ? j4 : j > j2 ? j2 : j;
    }
}
