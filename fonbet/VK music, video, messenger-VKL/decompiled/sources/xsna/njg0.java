package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Rgb.kt */
/* loaded from: classes11.dex */
public final class njg0 extends d8g {
    public static final a690 r = new a690(2);
    public final blx0 d;
    public final float e;
    public final float f;
    public final pjp0 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final m6o k;
    public final c l;
    public final oyr m;
    public final m6o n;
    public final b o;
    public final tp1 p;
    public final boolean q;

    /* compiled from: Rgb.kt */
    public static final class a {
        public static float a(float[] fArr) {
            if (fArr.length < 6) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float a = pm0.a(f, f6, (((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3), 0.5f);
            return a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -a : a;
        }
    }

    /* compiled from: Rgb.kt */
    public static final class b extends Lambda implements izs<Double, Double> {
        public b() {
            super(1);
        }

        @Override // xsna.izs
        public final Double invoke(Double d) {
            double doubleValue = d.doubleValue();
            return Double.valueOf(njg0.this.n.b(swe0.e(doubleValue, r8.e, r8.f)));
        }
    }

    /* compiled from: Rgb.kt */
    public static final class c extends Lambda implements izs<Double, Double> {
        public c() {
            super(1);
        }

        @Override // xsna.izs
        public final Double invoke(Double d) {
            double b = njg0.this.k.b(d.doubleValue());
            njg0 njg0Var = njg0.this;
            return Double.valueOf(swe0.e(b, njg0Var.e, njg0Var.f));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public njg0(String str, float[] fArr, blx0 blx0Var, pjp0 pjp0Var, int i) {
        this(str, fArr, blx0Var, null, r4 ? new i4f0(pjp0Var, 1) : r0 == -2.0d ? new i630(pjp0Var, 12) : (r7 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE && r5 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) ? new cxd0(pjp0Var, 2) : new x310(pjp0Var, 6), r0 == -3.0d ? new hi70(pjp0Var, 3) : r0 == -2.0d ? new bj50(pjp0Var, 7) : (r7 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE && r5 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) ? new oe40(pjp0Var, 6) : new u730(pjp0Var, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, pjp0Var, i);
        double d = pjp0Var.a;
        boolean z = d == -3.0d;
        double d2 = pjp0Var.g;
        double d3 = pjp0Var.f;
    }

    @Override // xsna.d8g
    public final float[] a(float[] fArr) {
        e8g.g(this.j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        oyr oyrVar = this.m;
        fArr[0] = (float) oyrVar.b(d);
        fArr[1] = (float) oyrVar.b(fArr[1]);
        fArr[2] = (float) oyrVar.b(fArr[2]);
        return fArr;
    }

    @Override // xsna.d8g
    public final float b(int i) {
        return this.f;
    }

    @Override // xsna.d8g
    public final float c(int i) {
        return this.e;
    }

    @Override // xsna.d8g
    public final boolean d() {
        return this.q;
    }

    @Override // xsna.d8g
    public final long e(float f, float f2, float f3) {
        double d = f;
        tp1 tp1Var = this.p;
        float b2 = (float) tp1Var.b(d);
        float b3 = (float) tp1Var.b(f2);
        float b4 = (float) tp1Var.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * b4) + (fArr[3] * b3) + (fArr[0] * b2);
        float f5 = (fArr[7] * b4) + (fArr[4] * b3) + (fArr[1] * b2);
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // xsna.d8g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || njg0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        njg0 njg0Var = (njg0) obj;
        pjp0 pjp0Var = njg0Var.g;
        if (Float.compare(njg0Var.e, this.e) != 0 || Float.compare(njg0Var.f, this.f) != 0 || !epx.f(this.d, njg0Var.d) || !Arrays.equals(this.h, njg0Var.h)) {
            return false;
        }
        pjp0 pjp0Var2 = this.g;
        if (pjp0Var2 != null) {
            return epx.f(pjp0Var2, pjp0Var);
        }
        if (pjp0Var == null) {
            return true;
        }
        if (epx.f(this.k, njg0Var.k)) {
            return epx.f(this.n, njg0Var.n);
        }
        return false;
    }

    @Override // xsna.d8g
    public final float[] f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        tp1 tp1Var = this.p;
        fArr[0] = (float) tp1Var.b(d);
        fArr[1] = (float) tp1Var.b(fArr[1]);
        fArr[2] = (float) tp1Var.b(fArr[2]);
        e8g.g(this.i, fArr);
        return fArr;
    }

    @Override // xsna.d8g
    public final float g(float f, float f2, float f3) {
        double d = f;
        tp1 tp1Var = this.p;
        float b2 = (float) tp1Var.b(d);
        float b3 = (float) tp1Var.b(f2);
        float b4 = (float) tp1Var.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * b4) + (fArr[5] * b3) + (fArr[2] * b2);
    }

    @Override // xsna.d8g
    public final long h(float f, float f2, float f3, float f4, d8g d8gVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        oyr oyrVar = this.m;
        return f870.b((float) oyrVar.b(f5), (float) oyrVar.b(f6), (float) oyrVar.b(f7), f4, d8gVar);
    }

    @Override // xsna.d8g
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f2))) * 31;
        pjp0 pjp0Var = this.g;
        int hashCode2 = floatToIntBits2 + (pjp0Var != null ? pjp0Var.hashCode() : 0);
        if (pjp0Var == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e2, code lost:
    
        if ((((r26 - r12) * r3) - ((r1 - r14) * r10)) >= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public njg0(String str, float[] fArr, blx0 blx0Var, float[] fArr2, m6o m6oVar, m6o m6oVar2, float f, float f2, pjp0 pjp0Var, int i) {
        super(str, x6g.a, i);
        ?? r23;
        ?? r25;
        char c2;
        float f3;
        float f4;
        boolean z;
        this.d = blx0Var;
        this.e = f;
        this.f = f2;
        this.g = pjp0Var;
        this.k = m6oVar;
        this.l = new c();
        this.m = new oyr(this, 19);
        this.n = m6oVar2;
        this.o = new b();
        this.p = new tp1(this, 29);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = f5 + f6 + fArr[2];
                fArr3[0] = f5 / f7;
                fArr3[1] = f6 / f7;
                float f8 = fArr[3];
                float f9 = fArr[4];
                float f10 = f8 + f9 + fArr[5];
                fArr3[2] = f8 / f10;
                fArr3[3] = f9 / f10;
                float f11 = fArr[6];
                float f12 = fArr[7];
                float f13 = f11 + f12 + fArr[8];
                fArr3[4] = f11 / f13;
                fArr3[5] = f12 / f13;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.h = fArr3;
            if (fArr2 == null) {
                float f14 = fArr3[0];
                float f15 = fArr3[1];
                float f16 = fArr3[2];
                float f17 = fArr3[3];
                float f18 = fArr3[4];
                float f19 = fArr3[5];
                f3 = 1.0f;
                float f20 = blx0Var.a;
                r23 = 0;
                float f21 = blx0Var.b;
                c2 = 2;
                float f22 = 1;
                float f23 = (f22 - f14) / f15;
                float f24 = (f22 - f16) / f17;
                float f25 = (f22 - f18) / f19;
                float f26 = (f22 - f20) / f21;
                float f27 = f14 / f15;
                float f28 = f20 / f21;
                float f29 = (f16 / f17) - f27;
                float f30 = f28 - f27;
                float f31 = f24 - f23;
                float f32 = ((f26 - f23) * f29) - (f30 * f31);
                float f33 = (f25 - f23) * f29;
                r25 = 1;
                float f34 = (f18 / f19) - f27;
                float f35 = f32 / (f33 - (f31 * f34));
                float a2 = yq.a(f35, f34, f30, f29);
                float f36 = (1.0f - a2) - f35;
                float f37 = f36 / f15;
                float f38 = a2 / f17;
                float f39 = f35 / f19;
                this.i = new float[]{f37 * f14, f36, ((1.0f - f14) - f15) * f37, f38 * f16, a2, ((1.0f - f16) - f17) * f38, f39 * f18, f35, ((1.0f - f18) - f19) * f39};
            } else {
                r23 = 0;
                r25 = 1;
                c2 = 2;
                f3 = 1.0f;
                if (fArr2.length == 9) {
                    this.i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.j = e8g.e(this.i);
            float a3 = a.a(fArr3);
            float[] fArr4 = h8g.a;
            if (a3 / a.a(h8g.b) > 0.9f) {
                float[] fArr5 = h8g.a;
                float f40 = fArr3[r23];
                float f41 = fArr5[r23];
                float f42 = fArr3[r25];
                float f43 = fArr5[r25];
                float f44 = fArr3[c2];
                float f45 = fArr5[c2];
                float f46 = fArr3[3];
                float f47 = fArr5[3];
                float f48 = fArr3[4];
                float f49 = fArr5[4];
                float f50 = fArr3[5];
                float f51 = fArr5[5];
                f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float[] fArr6 = new float[6];
                fArr6[r23] = f40 - f41;
                fArr6[r25] = f42 - f43;
                fArr6[c2] = f44 - f45;
                fArr6[3] = f46 - f47;
                fArr6[4] = f48 - f49;
                fArr6[5] = f50 - f51;
                float f52 = fArr6[r23];
                float f53 = fArr6[r25];
                if (((f43 - f51) * f52) - ((f41 - f49) * f53) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((f41 - f45) * f53) - ((f43 - f47) * f52) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f54 = fArr6[c2];
                    float f55 = fArr6[3];
                    if (((f47 - f43) * f54) - ((f45 - f41) * f55) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((f45 - f49) * f55) - ((f47 - f51) * f54) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f56 = fArr6[4];
                        float f57 = fArr6[5];
                        if (((f51 - f47) * f56) - ((f49 - f45) * f57) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                    }
                }
            } else {
                f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int i2 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
            if (i != 0) {
                float[] fArr7 = h8g.a;
                if (fArr3 != fArr7) {
                    for (int i3 = r23; i3 < 6; i3++) {
                        if (Float.compare(fArr3[i3], fArr7[i3]) != 0 && Math.abs(fArr3[i3] - fArr7[i3]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (e8g.c(blx0Var, crx0.l) && f == f4 && f2 == f3) {
                    float[] fArr8 = h8g.a;
                    njg0 njg0Var = h8g.e;
                    for (double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(m6oVar.b(d) - njg0Var.k.b(d)) <= 0.001d && Math.abs(m6oVar2.b(d) - njg0Var.n.b(d)) <= 0.001d) {
                        }
                    }
                }
                z = r23;
                this.q = z;
                return;
            }
            z = r25;
            this.q = z;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public njg0(String str, float[] fArr, blx0 blx0Var, final double d, float f, float f2, int i) {
        this(str, fArr, blx0Var, null, r11, d != 1.0d ? new m6o() { // from class: xsna.mjg0
            @Override // xsna.m6o
            public final double b(double d2) {
                if (d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, d);
            }
        } : r3, f, f2, new pjp0(d, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE), i);
        m6o m6oVar = r;
        m6o m6oVar2 = d == 1.0d ? m6oVar : new m6o() { // from class: xsna.ljg0
            @Override // xsna.m6o
            public final double b(double d2) {
                if (d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, 1.0d / d);
            }
        };
    }
}
