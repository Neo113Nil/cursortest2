package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: SplineBasedDecay.kt */
/* loaded from: classes11.dex */
public final class s82 {
    public static final float[] a;

    /* compiled from: SplineBasedDecay.kt */
    public static final class a {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.a);
            sb.append(", velocityCoefficient=");
            return xq.c(')', this.b, sb);
        }
    }

    static {
        float f;
        float a2;
        float f2;
        float f3;
        float f4;
        float f5;
        float a3;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                a2 = wq.a(f13, f9, 2.0f, f9);
                f2 = f11 - a2;
                f3 = a2 * 3.0f * f2;
                f4 = a2 * a2 * a2;
                float f14 = (((a2 * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f11;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                }
                if (f14 > f12) {
                    f13 = a2;
                } else {
                    f9 = a2;
                }
                f11 = f5;
            }
            float f15 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + a2) * f3) + f4;
            float f16 = f5;
            while (true) {
                a3 = wq.a(f16, f10, f, f10);
                f6 = f5 - a3;
                f7 = a3 * 3.0f * f6;
                f8 = a3 * a3 * a3;
                float f17 = (((f6 * f15) + a3) * f7) + f8;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = a3;
                    } else {
                        f10 = a3;
                    }
                    f15 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((a3 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static a a(float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = 1.0f;
        float f4 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float f5 = 100;
        int i = (int) (f5 * f4);
        if (i < 100) {
            float f6 = i / f5;
            int i2 = i + 1;
            float f7 = i2 / f5;
            float[] fArr = a;
            float f8 = fArr[i];
            float f9 = (fArr[i2] - f8) / (f7 - f6);
            float b = u11.b(f4, f6, f9, f8);
            f2 = f9;
            f3 = b;
        }
        return new a(f3, f2);
    }
}
