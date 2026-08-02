package androidx.compose.ui.graphics.colorspace;

import defpackage.a3k0;
import defpackage.b64;
import defpackage.f73;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.lz41;
import defpackage.ny61;
import defpackage.r5m;
import defpackage.rzo;
import defpackage.tls;
import defpackage.ugc;
import defpackage.wgc;
import defpackage.wm01;
import defpackage.x4e;
import defpackage.y6i0;
import defpackage.yci0;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class a extends ugc {
    public static final yci0 r = new yci0();
    public final lz41 d;
    public final float e;
    public final float f;
    public final wm01 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final r5m k;
    public final tls l;
    public final a3k0 m;
    public final r5m n;
    public final tls o;
    public final a3k0 p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01da, code lost:
    
        if ((((r23 - r11) * r1) - ((r1 - r13) * r3)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, float[] fArr, lz41 lz41Var, float[] fArr2, r5m r5mVar, r5m r5mVar2, float f, float f2, wm01 wm01Var, int i) {
        super(str, 12884901888L, i);
        ?? r44;
        ?? r26;
        int i2;
        float f3;
        float f4;
        boolean z;
        this.d = lz41Var;
        this.e = f;
        this.f = f2;
        this.g = wm01Var;
        this.k = r5mVar;
        this.l = new tls() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                double a = a.this.k.a(((Number) obj).doubleValue());
                a aVar = a.this;
                return Double.valueOf(y6i0.b(a, aVar.e, aVar.f));
            }
        };
        this.m = new a3k0(this, 0);
        this.n = r5mVar2;
        this.o = new tls() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(a.this.n.a(y6i0.b(doubleValue, r6.e, r6.f)));
            }
        };
        this.p = new a3k0(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            ny61.g("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            ny61.g(x4e.e("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max"));
            throw null;
        }
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
            f73.j(fArr, fArr3, 6);
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
            float f20 = lz41Var.a;
            r44 = 0;
            float f21 = lz41Var.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = f20 / f21;
            float f29 = (f16 / f17) - f27;
            float f30 = f28 - f27;
            float f31 = (f24 / f17) - f23;
            float f32 = ((f26 - f23) * f29) - (f30 * f31);
            float f33 = ((f25 / f19) - f23) * f29;
            r26 = 1;
            float f34 = (f18 / f19) - f27;
            float f35 = f33 - (f31 * f34);
            i2 = 6;
            float f36 = f32 / f35;
            float a = b64.a(f36, f34, f30, f29);
            float f37 = (1.0f - a) - f36;
            float f38 = f37 / f15;
            float f39 = a / f17;
            float f40 = f36 / f19;
            this.i = new float[]{f14 * f38, f37, (f22 - f15) * f38, f16 * f39, a, (f24 - f17) * f39, f18 * f40, f36, (f25 - f19) * f40};
        } else {
            r44 = 0;
            r26 = 1;
            i2 = 6;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                ny61.e(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.i = fArr2;
        }
        this.j = ffx.U(this.i);
        float e = kp50.e(fArr3);
        float[] fArr4 = wgc.a;
        if (e / kp50.e(wgc.b) > 0.9f) {
            float[] fArr5 = wgc.a;
            float f41 = fArr3[r44];
            float f42 = fArr5[r44];
            float f43 = fArr3[r26];
            float f44 = fArr5[r26];
            float f45 = fArr3[2];
            float f46 = fArr5[2];
            float f47 = fArr3[3];
            float f48 = fArr5[3];
            float f49 = fArr3[4];
            float f50 = fArr5[4];
            float f51 = fArr3[5];
            float f52 = fArr5[5];
            float f53 = f51 - f52;
            f4 = 0.0f;
            float[] fArr6 = new float[i2];
            fArr6[r44] = f41 - f42;
            fArr6[r26] = f43 - f44;
            fArr6[2] = f45 - f46;
            fArr6[3] = f47 - f48;
            fArr6[4] = f49 - f50;
            fArr6[5] = f53;
            float f54 = fArr6[r44];
            float f55 = fArr6[r26];
            if (((f44 - f52) * f54) - ((f42 - f50) * f55) >= 0.0f && ((f42 - f46) * f55) - ((f44 - f48) * f54) >= 0.0f) {
                float f56 = fArr6[2];
                float f57 = fArr6[3];
                if (((f48 - f44) * f56) - ((f46 - f42) * f57) >= 0.0f && ((f46 - f50) * f57) - ((f48 - f52) * f56) >= 0.0f) {
                    float f58 = fArr6[4];
                    float f59 = fArr6[5];
                    if (((f52 - f48) * f58) - ((f50 - f46) * f59) >= 0.0f) {
                    }
                }
            }
        } else {
            f4 = 0.0f;
        }
        int i3 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr7 = wgc.a;
            if (fArr3 != fArr7) {
                for (int i4 = r44; i4 < 6; i4++) {
                    if (Float.compare(fArr3[i4], fArr7[i4]) != 0 && Math.abs(fArr3[i4] - fArr7[i4]) > 0.001f) {
                        break;
                    }
                }
            }
            if (ffx.w(lz41Var, rzo.e) && f == f4 && f2 == f3) {
                float[] fArr8 = wgc.a;
                a aVar = wgc.e;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(r5mVar.a(d) - aVar.k.a(d)) <= 0.001d && Math.abs(r5mVar2.a(d) - aVar.n.a(d)) <= 0.001d) {
                    }
                }
            }
            z = r44;
            this.q = z;
        }
        z = r26;
        this.q = z;
    }

    @Override // defpackage.ugc
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.ugc
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.ugc
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.ugc
    public final long d(float f, float f2, float f3) {
        double d = f;
        a3k0 a3k0Var = this.p;
        float a = (float) a3k0Var.a(d);
        float a2 = (float) a3k0Var.a(f2);
        float a3 = (float) a3k0Var.a(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * a3) + (fArr[3] * a2) + (fArr[0] * a);
        float f5 = (fArr[7] * a3) + (fArr[4] * a2) + (fArr[1] * a);
        return (Float.floatToRawIntBits(f4) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.ugc
    public final float e(float f, float f2, float f3) {
        double d = f;
        a3k0 a3k0Var = this.p;
        float a = (float) a3k0Var.a(d);
        float a2 = (float) a3k0Var.a(f2);
        float a3 = (float) a3k0Var.a(f3);
        float[] fArr = this.i;
        return (fArr[8] * a3) + (fArr[5] * a2) + (fArr[2] * a);
    }

    @Override // defpackage.ugc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.e, this.e) != 0 || Float.compare(aVar.f, this.f) != 0 || !jl40.l(this.d, aVar.d) || !Arrays.equals(this.h, aVar.h)) {
            return false;
        }
        wm01 wm01Var = aVar.g;
        wm01 wm01Var2 = this.g;
        if (wm01Var2 != null) {
            return jl40.l(wm01Var2, wm01Var);
        }
        if (wm01Var == null) {
            return true;
        }
        if (jl40.l(this.k, aVar.k)) {
            return jl40.l(this.n, aVar.n);
        }
        return false;
    }

    @Override // defpackage.ugc
    public final long f(float f, float f2, float f3, float f4, ugc ugcVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        a3k0 a3k0Var = this.m;
        return rzo.c((float) a3k0Var.a(f5), (float) a3k0Var.a(f6), (float) a3k0Var.a(f7), f4, ugcVar);
    }

    @Override // defpackage.ugc
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        wm01 wm01Var = this.g;
        int hashCode2 = floatToIntBits2 + (wm01Var != null ? wm01Var.hashCode() : 0);
        if (wm01Var != null) {
            return hashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, float[] fArr, lz41 lz41Var, final wm01 wm01Var, int i) {
        this(str, fArr, lz41Var, null, r4, r0, 0.0f, 1.0f, wm01Var, i);
        double d;
        r5m r5mVar;
        r5m r5mVar2;
        double d2 = wm01Var.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = wm01Var.g;
        double d4 = wm01Var.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            r5mVar = new r5m() { // from class: c3k0
                @Override // defpackage.r5m
                public final double a(double d5) {
                    int i5 = i4;
                    wm01 wm01Var2 = wm01Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = wgc.a;
                            return wgc.a(wm01Var2, d5);
                        case 1:
                            float[] fArr3 = wgc.a;
                            return wgc.c(wm01Var2, d5);
                        case 2:
                            double d6 = wm01Var2.b;
                            return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                        case 3:
                            double d7 = wm01Var2.b;
                            double d8 = wm01Var2.c;
                            double d9 = wm01Var2.d;
                            return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                        case 4:
                            float[] fArr4 = wgc.a;
                            return wgc.b(wm01Var2, d5);
                        case 5:
                            float[] fArr5 = wgc.a;
                            return wgc.d(wm01Var2, d5);
                        case 6:
                            double d10 = wm01Var2.b;
                            double d11 = wm01Var2.c;
                            double d12 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = wm01Var2.b;
                            double d14 = wm01Var2.c;
                            double d15 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                r5mVar = new r5m() { // from class: c3k0
                    @Override // defpackage.r5m
                    public final double a(double d5) {
                        int i52 = i5;
                        wm01 wm01Var2 = wm01Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = wgc.a;
                                return wgc.a(wm01Var2, d5);
                            case 1:
                                float[] fArr3 = wgc.a;
                                return wgc.c(wm01Var2, d5);
                            case 2:
                                double d6 = wm01Var2.b;
                                return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                            case 3:
                                double d7 = wm01Var2.b;
                                double d8 = wm01Var2.c;
                                double d9 = wm01Var2.d;
                                return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                            case 4:
                                float[] fArr4 = wgc.a;
                                return wgc.b(wm01Var2, d5);
                            case 5:
                                float[] fArr5 = wgc.a;
                                return wgc.d(wm01Var2, d5);
                            case 6:
                                double d10 = wm01Var2.b;
                                double d11 = wm01Var2.c;
                                double d12 = wm01Var2.d;
                                return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = wm01Var2.b;
                                double d14 = wm01Var2.c;
                                double d15 = wm01Var2.d;
                                return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                r5mVar = new r5m() { // from class: c3k0
                    @Override // defpackage.r5m
                    public final double a(double d5) {
                        int i52 = i6;
                        wm01 wm01Var2 = wm01Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = wgc.a;
                                return wgc.a(wm01Var2, d5);
                            case 1:
                                float[] fArr3 = wgc.a;
                                return wgc.c(wm01Var2, d5);
                            case 2:
                                double d6 = wm01Var2.b;
                                return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                            case 3:
                                double d7 = wm01Var2.b;
                                double d8 = wm01Var2.c;
                                double d9 = wm01Var2.d;
                                return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                            case 4:
                                float[] fArr4 = wgc.a;
                                return wgc.b(wm01Var2, d5);
                            case 5:
                                float[] fArr5 = wgc.a;
                                return wgc.d(wm01Var2, d5);
                            case 6:
                                double d10 = wm01Var2.b;
                                double d11 = wm01Var2.c;
                                double d12 = wm01Var2.d;
                                return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = wm01Var2.b;
                                double d14 = wm01Var2.c;
                                double d15 = wm01Var2.d;
                                return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                r5mVar = new r5m() { // from class: c3k0
                    @Override // defpackage.r5m
                    public final double a(double d5) {
                        int i52 = i7;
                        wm01 wm01Var2 = wm01Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = wgc.a;
                                return wgc.a(wm01Var2, d5);
                            case 1:
                                float[] fArr3 = wgc.a;
                                return wgc.c(wm01Var2, d5);
                            case 2:
                                double d6 = wm01Var2.b;
                                return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                            case 3:
                                double d7 = wm01Var2.b;
                                double d8 = wm01Var2.c;
                                double d9 = wm01Var2.d;
                                return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                            case 4:
                                float[] fArr4 = wgc.a;
                                return wgc.b(wm01Var2, d5);
                            case 5:
                                float[] fArr5 = wgc.a;
                                return wgc.d(wm01Var2, d5);
                            case 6:
                                double d10 = wm01Var2.b;
                                double d11 = wm01Var2.c;
                                double d12 = wm01Var2.d;
                                return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = wm01Var2.b;
                                double d14 = wm01Var2.c;
                                double d15 = wm01Var2.d;
                                return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            r5mVar2 = new r5m() { // from class: c3k0
                @Override // defpackage.r5m
                public final double a(double d5) {
                    int i52 = i2;
                    wm01 wm01Var2 = wm01Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wgc.a;
                            return wgc.a(wm01Var2, d5);
                        case 1:
                            float[] fArr3 = wgc.a;
                            return wgc.c(wm01Var2, d5);
                        case 2:
                            double d6 = wm01Var2.b;
                            return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                        case 3:
                            double d7 = wm01Var2.b;
                            double d8 = wm01Var2.c;
                            double d9 = wm01Var2.d;
                            return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                        case 4:
                            float[] fArr4 = wgc.a;
                            return wgc.b(wm01Var2, d5);
                        case 5:
                            float[] fArr5 = wgc.a;
                            return wgc.d(wm01Var2, d5);
                        case 6:
                            double d10 = wm01Var2.b;
                            double d11 = wm01Var2.c;
                            double d12 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = wm01Var2.b;
                            double d14 = wm01Var2.c;
                            double d15 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            r5mVar2 = new r5m() { // from class: c3k0
                @Override // defpackage.r5m
                public final double a(double d5) {
                    int i52 = i3;
                    wm01 wm01Var2 = wm01Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wgc.a;
                            return wgc.a(wm01Var2, d5);
                        case 1:
                            float[] fArr3 = wgc.a;
                            return wgc.c(wm01Var2, d5);
                        case 2:
                            double d6 = wm01Var2.b;
                            return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                        case 3:
                            double d7 = wm01Var2.b;
                            double d8 = wm01Var2.c;
                            double d9 = wm01Var2.d;
                            return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                        case 4:
                            float[] fArr4 = wgc.a;
                            return wgc.b(wm01Var2, d5);
                        case 5:
                            float[] fArr5 = wgc.a;
                            return wgc.d(wm01Var2, d5);
                        case 6:
                            double d10 = wm01Var2.b;
                            double d11 = wm01Var2.c;
                            double d12 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = wm01Var2.b;
                            double d14 = wm01Var2.c;
                            double d15 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            r5mVar2 = new r5m() { // from class: c3k0
                @Override // defpackage.r5m
                public final double a(double d5) {
                    int i52 = i8;
                    wm01 wm01Var2 = wm01Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wgc.a;
                            return wgc.a(wm01Var2, d5);
                        case 1:
                            float[] fArr3 = wgc.a;
                            return wgc.c(wm01Var2, d5);
                        case 2:
                            double d6 = wm01Var2.b;
                            return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                        case 3:
                            double d7 = wm01Var2.b;
                            double d8 = wm01Var2.c;
                            double d9 = wm01Var2.d;
                            return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                        case 4:
                            float[] fArr4 = wgc.a;
                            return wgc.b(wm01Var2, d5);
                        case 5:
                            float[] fArr5 = wgc.a;
                            return wgc.d(wm01Var2, d5);
                        case 6:
                            double d10 = wm01Var2.b;
                            double d11 = wm01Var2.c;
                            double d12 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = wm01Var2.b;
                            double d14 = wm01Var2.c;
                            double d15 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            r5mVar2 = new r5m() { // from class: c3k0
                @Override // defpackage.r5m
                public final double a(double d5) {
                    int i52 = i9;
                    wm01 wm01Var2 = wm01Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wgc.a;
                            return wgc.a(wm01Var2, d5);
                        case 1:
                            float[] fArr3 = wgc.a;
                            return wgc.c(wm01Var2, d5);
                        case 2:
                            double d6 = wm01Var2.b;
                            return d5 >= wm01Var2.e ? Math.pow((d6 * d5) + wm01Var2.c, wm01Var2.a) : wm01Var2.d * d5;
                        case 3:
                            double d7 = wm01Var2.b;
                            double d8 = wm01Var2.c;
                            double d9 = wm01Var2.d;
                            return d5 >= wm01Var2.e ? Math.pow((d7 * d5) + d8, wm01Var2.a) + wm01Var2.f : (d9 * d5) + wm01Var2.g;
                        case 4:
                            float[] fArr4 = wgc.a;
                            return wgc.b(wm01Var2, d5);
                        case 5:
                            float[] fArr5 = wgc.a;
                            return wgc.d(wm01Var2, d5);
                        case 6:
                            double d10 = wm01Var2.b;
                            double d11 = wm01Var2.c;
                            double d12 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d12 ? (Math.pow(d5, 1.0d / wm01Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = wm01Var2.b;
                            double d14 = wm01Var2.c;
                            double d15 = wm01Var2.d;
                            return d5 >= wm01Var2.e * d15 ? (Math.pow(d5 - wm01Var2.f, 1.0d / wm01Var2.a) - d14) / d13 : (d5 - wm01Var2.g) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, float[] fArr, lz41 lz41Var, final double d, float f, float f2, int i) {
        this(str, fArr, lz41Var, null, r11, r12, f, f2, new wm01(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        r5m r5mVar;
        r5m r5mVar2 = r;
        if (d == 1.0d) {
            r5mVar = r5mVar2;
        } else {
            final int i2 = 0;
            r5mVar = new r5m() { // from class: b3k0
                @Override // defpackage.r5m
                public final double a(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            r5mVar2 = new r5m() { // from class: b3k0
                @Override // defpackage.r5m
                public final double a(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        r5m r5mVar3 = r5mVar2;
    }
}
