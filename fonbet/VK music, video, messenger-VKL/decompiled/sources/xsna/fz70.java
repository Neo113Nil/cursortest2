package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Oklab.kt */
/* loaded from: classes11.dex */
public final class fz70 extends d8g {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] f2 = e8g.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, e8g.b(bj0.b.a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = f2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = e8g.e(f2);
        g = e8g.e(fArr);
    }

    @Override // xsna.d8g
    public final float[] a(float[] fArr) {
        e8g.g(d, fArr);
        fArr[0] = q6x.r(fArr[0]);
        fArr[1] = q6x.r(fArr[1]);
        fArr[2] = q6x.r(fArr[2]);
        e8g.g(e, fArr);
        return fArr;
    }

    @Override // xsna.d8g
    public final float b(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // xsna.d8g
    public final float c(int i) {
        if (i == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return -0.5f;
    }

    @Override // xsna.d8g
    public final long e(float f2, float f3, float f4) {
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f7 * f7 * f7;
        float f10 = f8 * f8 * f8;
        float[] fArr2 = f;
        float f11 = (fArr2[6] * f10) + (fArr2[3] * f9) + (fArr2[0] * f6 * f6 * f6);
        return (Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    @Override // xsna.d8g
    public final float[] f(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -0.5f ? f4 : -0.5f;
        fArr[2] = f5 <= 0.5f ? f5 : 0.5f;
        e8g.g(g, fArr);
        float f6 = fArr[0];
        fArr[0] = f6 * f6 * f6;
        float f7 = fArr[1];
        fArr[1] = f7 * f7 * f7;
        float f8 = fArr[2];
        fArr[2] = f8 * f8 * f8;
        e8g.g(f, fArr);
        return fArr;
    }

    @Override // xsna.d8g
    public final float g(float f2, float f3, float f4) {
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    @Override // xsna.d8g
    public final long h(float f2, float f3, float f4, float f5, d8g d8gVar) {
        float[] fArr = d;
        float f6 = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        float r = q6x.r(f6);
        float r2 = q6x.r(f7);
        float r3 = q6x.r(f8);
        float[] fArr2 = e;
        return f870.b((fArr2[6] * r3) + (fArr2[3] * r2) + (fArr2[0] * r), (fArr2[7] * r3) + (fArr2[4] * r2) + (fArr2[1] * r), (fArr2[8] * r3) + (fArr2[5] * r2) + (fArr2[2] * r), f5, d8gVar);
    }
}
