package com.google.ar.core;

import java.util.Locale;

/* loaded from: classes11.dex */
class Quaternion {
    public static final Quaternion a = new Quaternion();
    private float w;
    private float x;
    private float y;
    private float z;

    public Quaternion() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.w = 1.0f;
    }

    public static Quaternion h(Quaternion quaternion, Quaternion quaternion2, float f) {
        Quaternion quaternion3 = new Quaternion();
        float f2 = (quaternion.x * quaternion2.x) + (quaternion.y * quaternion2.y) + (quaternion.z * quaternion2.z) + (quaternion.w * quaternion2.w);
        if (f2 < 0.0f) {
            Quaternion quaternion4 = new Quaternion();
            quaternion4.x = 0.0f;
            quaternion4.y = 0.0f;
            quaternion4.z = 0.0f;
            quaternion4.w = 1.0f;
            float f3 = quaternion2.x;
            float f4 = quaternion2.y;
            float f5 = quaternion2.z;
            float f6 = quaternion2.w;
            f2 = -f2;
            quaternion4.x = -f3;
            quaternion4.y = -f4;
            quaternion4.z = -f5;
            quaternion4.w = -f6;
            quaternion2 = quaternion4;
        }
        float f7 = 1.0f - f;
        float acos = (float) Math.acos(f2);
        float sqrt = (float) Math.sqrt(1.0f - (f2 * f2));
        if (Math.abs(sqrt) > 0.001d) {
            float f8 = 1.0f / sqrt;
            float sin = (float) Math.sin(f7 * acos);
            f = ((float) Math.sin(f * acos)) * f8;
            f7 = sin * f8;
        }
        quaternion3.x = (quaternion2.x * f) + (quaternion.x * f7);
        quaternion3.y = (quaternion2.y * f) + (quaternion.y * f7);
        float f9 = (quaternion2.z * f) + (quaternion.z * f7);
        quaternion3.z = f9;
        float f10 = (f * quaternion2.w) + (f7 * quaternion.w);
        quaternion3.w = f10;
        float f11 = f9 * f9;
        float f12 = f10 * f10;
        float sqrt2 = (float) (1.0d / Math.sqrt(f12 + (f11 + ((r4 * r4) + (r3 * r3)))));
        quaternion3.x *= sqrt2;
        quaternion3.y *= sqrt2;
        quaternion3.z *= sqrt2;
        quaternion3.w *= sqrt2;
        return quaternion3;
    }

    public static void i(Quaternion quaternion, float[] fArr, int i, float[] fArr2, int i2) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = quaternion.x;
        float f5 = quaternion.y;
        float f6 = quaternion.z;
        float f7 = quaternion.w;
        float f8 = f5 * f3;
        float f9 = f6 * f2;
        float f10 = f7 * f2;
        float f11 = f6 * f;
        float f12 = f4 * f3;
        float f13 = f7 * f3;
        float f14 = f4 * f2;
        float f15 = f5 * f;
        float f16 = -f4;
        float f17 = f2 * f5;
        float f18 = f3 * f6;
        float f19 = ((f7 * f) + f8) - f9;
        float f20 = -f6;
        float f21 = -f5;
        float f22 = (f13 + f14) - f15;
        float f23 = (f10 + f11) - f12;
        float f24 = ((f * f16) - f17) - f18;
        float f25 = f23 * f20;
        fArr2[i2] = (f25 + ((f24 * f16) + (f19 * f7))) - (f22 * f21);
        fArr2[i2 + 1] = ((f22 * f16) + ((f24 * f21) + (f23 * f7))) - (f19 * f20);
        float f26 = f19 * f21;
        fArr2[i2 + 2] = (f26 + ((f24 * f20) + (f22 * f7))) - (f23 * f16);
    }

    public final float a() {
        return this.x;
    }

    public final float b() {
        return this.y;
    }

    public final float c() {
        return this.z;
    }

    public final float d() {
        return this.w;
    }

    public final void e(float[] fArr, int i) {
        fArr[i] = this.x;
        fArr[i + 1] = this.y;
        fArr[i + 2] = this.z;
        fArr[i + 3] = this.w;
    }

    public final Quaternion f() {
        return new Quaternion(-this.x, -this.y, -this.z, this.w);
    }

    public final Quaternion g(Quaternion quaternion) {
        Quaternion quaternion2 = new Quaternion();
        float f = this.x;
        float f2 = quaternion.w;
        float f3 = this.y;
        float f4 = quaternion.z;
        float f5 = this.z;
        float f6 = quaternion.y;
        float f7 = this.w;
        quaternion2.x = (((f * f2) + (f3 * f4)) - (f5 * f6)) + (quaternion.x * f7);
        float f8 = this.x;
        float f9 = -f8;
        float f10 = quaternion.x;
        quaternion2.y = (f9 * f4) + (f3 * f2) + (f5 * f10) + (f6 * f7);
        float f11 = quaternion.y;
        float f12 = this.y;
        quaternion2.z = ((f8 * f11) - (f12 * f10)) + (f5 * f2) + (f4 * f7);
        quaternion2.w = (((f9 * f10) - (f12 * f11)) - (this.z * quaternion.z)) + (f7 * f2);
        return quaternion2;
    }

    public final void j(float[] fArr, int i) {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.z;
        float f4 = this.w;
        float f5 = (f * f) + (f2 * f2) + (f3 * f3) + (f4 * f4);
        float f6 = f5 > 0.0f ? 2.0f / f5 : 0.0f;
        float f7 = f * f6;
        float f8 = f2 * f6;
        float f9 = f6 * f3;
        float f10 = f4 * f7;
        float f11 = f4 * f8;
        float f12 = f4 * f9;
        float f13 = f7 * f;
        float f14 = f * f8;
        float f15 = f * f9;
        float f16 = f8 * f2;
        float f17 = f2 * f9;
        float f18 = f3 * f9;
        fArr[i] = 1.0f - (f16 + f18);
        fArr[i + 4] = f14 - f12;
        fArr[i + 8] = f15 + f11;
        fArr[i + 1] = f14 + f12;
        fArr[i + 5] = 1.0f - (f18 + f13);
        fArr[i + 9] = f17 - f10;
        fArr[i + 2] = f15 - f11;
        fArr[i + 6] = f17 + f10;
        fArr[i + 10] = 1.0f - (f13 + f16);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z), Float.valueOf(this.w));
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }
}
