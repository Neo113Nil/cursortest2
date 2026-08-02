package xsna;

import com.unity3d.services.UnityAdsConstants;
import io.jsonwebtoken.JwtParser;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Easing.kt */
/* loaded from: classes11.dex */
public final class nkk implements huo {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public nkk(float f, float f2, float f3, float f4) {
        int i;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder a = bxj0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            a.append(f3);
            a.append(", ");
            a.append(f4);
            a.append(JwtParser.SEPARATOR_CHAR);
            ixc0.a(a.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            i = d2 == d3 ? 0 : sa30.T((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int T = sa30.T((float) ((-(d6 + d7)) / d5), fArr, 0);
            int T2 = sa30.T((float) ((d6 - d7) / d5), fArr, T) + T;
            if (T2 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    i = T2 - 1;
                }
            }
            i = T2;
        }
        float f10 = (f6 - f5) * 2.0f;
        int T3 = sa30.T((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, i) + i;
        float min = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        for (int i2 = 0; i2 < T3; i2++) {
            float f11 = fArr[i2];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f11) + (((f4 - (f2 * 2.0f)) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 3.0f)) * f11) + f5) * f11) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            min = Math.min(min, f12);
            max = Math.max(max, f12);
        }
        long a2 = gqr.a(min, max);
        this.e = Float.intBitsToFloat((int) (a2 >> 32));
        this.f = Float.intBitsToFloat((int) (a2 & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // xsna.huo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        float f2;
        boolean isNaN;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f) {
            return f;
        }
        float max = Math.max(f, 1.1920929E-7f);
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - max;
        float f4 = this.a;
        float f5 = this.c;
        float f6 = f5 - max;
        double d = f3;
        float f7 = 0.0f;
        double d2 = ((d - ((f4 - max) * 2.0d)) + f6) * 3.0d;
        double d3 = (r7 - f3) * 3.0d;
        double d4 = ((r7 - f6) * 3.0d) + (-f3) + (1.0f - max);
        float f8 = Float.NaN;
        if (Math.abs(d4 - ConnectivityTracker.DEFAULT_UPLINK_BITRATE) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                double sqrt = Math.sqrt(-d10);
                double d13 = (-d9) / sqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double acos = Math.acos(d13);
                double r = q6x.r((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * r) - d12);
                float f9 = cos < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : cos;
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                if (Math.abs(f9 - cos) > 1.05E-6f) {
                    f9 = Float.NaN;
                }
                if (Float.isNaN(f9)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * r) - d12);
                    f9 = cos2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : cos2;
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (Math.abs(f9 - cos2) > 1.05E-6f) {
                        f9 = Float.NaN;
                    }
                    if (Float.isNaN(f9)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * r) - d12);
                        if (cos3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f7 = cos3;
                        }
                        f2 = f7 > 1.0f ? 1.0f : f7;
                    }
                }
                f8 = f9;
                isNaN = Float.isNaN(f8);
                float f10 = this.d;
                float f11 = this.b;
                if (isNaN) {
                }
            } else if (d11 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                float f12 = -q6x.r((float) d9);
                float f13 = (float) d12;
                float f14 = (f12 * 2.0f) - f13;
                float f15 = f14 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f14;
                if (f15 > 1.0f) {
                    f15 = 1.0f;
                }
                if (Math.abs(f15 - f14) > 1.05E-6f) {
                    f15 = Float.NaN;
                }
                if (Float.isNaN(f15)) {
                    float f16 = (-f12) - f13;
                    if (f16 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f7 = f16;
                    }
                    f2 = f7 > 1.0f ? 1.0f : f7;
                } else {
                    f8 = f15;
                }
                isNaN = Float.isNaN(f8);
                float f102 = this.d;
                float f112 = this.b;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                float r2 = (float) ((q6x.r((float) ((-d9) + sqrt2)) - q6x.r((float) (d9 + sqrt2))) - d12);
                if (r2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f7 = r2;
                }
                f2 = f7 > 1.0f ? 1.0f : f7;
            }
        } else {
            if (Math.abs(d2 - ConnectivityTracker.DEFAULT_UPLINK_BITRATE) < 1.0E-7d) {
                if (Math.abs(d3 - ConnectivityTracker.DEFAULT_UPLINK_BITRATE) >= 1.0E-7d) {
                    float f17 = (float) ((-d) / d3);
                    if (f17 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f7 = f17;
                    }
                    f2 = f7 > 1.0f ? 1.0f : f7;
                }
                isNaN = Float.isNaN(f8);
                float f1022 = this.d;
                float f1122 = this.b;
                if (isNaN) {
                    float f18 = ((((((f1122 - f1022) + 0.33333334f) * f8) + (f1022 - (2.0f * f1122))) * f8) + f1122) * 3.0f * f8;
                    float f19 = this.e;
                    if (f18 < f19) {
                        f18 = f19;
                    }
                    float f20 = this.f;
                    return f18 > f20 ? f20 : f18;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f4 + ", " + f1122 + ", " + f5 + ", " + f1022 + ") has no solution at " + f);
            }
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f21 = (float) ((sqrt3 - d3) / d14);
            float f22 = f21 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f21;
            if (f22 > 1.0f) {
                f22 = 1.0f;
            }
            if (Math.abs(f22 - f21) > 1.05E-6f) {
                f22 = Float.NaN;
            }
            if (Float.isNaN(f22)) {
                float f23 = (float) (((-d3) - sqrt3) / d14);
                if (f23 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f7 = f23;
                }
                f2 = f7 > 1.0f ? 1.0f : f7;
            } else {
                f8 = f22;
            }
            isNaN = Float.isNaN(f8);
            float f10222 = this.d;
            float f11222 = this.b;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nkk)) {
            return false;
        }
        nkk nkkVar = (nkk) obj;
        return this.a == nkkVar.a && this.b == nkkVar.b && this.c == nkkVar.c && this.d == nkkVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.a);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", c=");
        sb.append(this.c);
        sb.append(", d=");
        return xq.c(')', this.d, sb);
    }
}
