package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ldf implements rbn {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ldf(float f, float f2, float f3, float f4) {
        int i;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder k = oo31.k("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, Extension.FIX_SPACE, f2, Extension.FIX_SPACE);
            k.append(f3);
            k.append(Extension.FIX_SPACE);
            k.append(f4);
            k.append('.');
            mhe0.a(k.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            i = d2 == d3 ? 0 : eja1.E((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int E = eja1.E((float) ((-(d6 + d7)) / d5), fArr, 0);
            int E2 = eja1.E((float) ((d6 - d7) / d5), fArr, E) + E;
            if (E2 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    i = E2 - 1;
                }
            }
            i = E2;
        }
        float f10 = (f6 - f5) * 2.0f;
        int E3 = eja1.E((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, i) + i;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < E3; i2++) {
            float f11 = fArr[i2];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            min = Math.min(min, f12);
            max = Math.max(max, f12);
        }
        long a = ior.a(min, max);
        this.e = Float.intBitsToFloat((int) (a >> 32));
        this.f = Float.intBitsToFloat((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0204, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0234, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025f  */
    @Override // defpackage.rbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        float f2;
        boolean isNaN;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float max = Math.max(f, 1.1920929E-7f);
        float f3 = this.a;
        float f4 = this.c;
        float f5 = f4 - max;
        double d = 0.0f - max;
        float f6 = 0.0f;
        double d2 = ((d - ((f3 - max) * 2.0d)) + f5) * 3.0d;
        double d3 = (r7 - r5) * 3.0d;
        double d4 = ((r7 - f5) * 3.0d) + (-r5) + (1.0f - max);
        float f7 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double a = vfc.a(d7, 27.0d, (((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6), 54.0d);
            double d9 = d8 * d8 * d8;
            double d10 = (a * a) + d9;
            double d11 = d5 / 3.0d;
            if (d10 < 0.0d) {
                double sqrt = Math.sqrt(-d9);
                double d12 = (-a) / sqrt;
                if (d12 < -1.0d) {
                    d12 = -1.0d;
                }
                if (d12 > 1.0d) {
                    d12 = 1.0d;
                }
                double acos = Math.acos(d12);
                double c = cjb1.c((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * c) - d11);
                float f8 = cos < 0.0f ? 0.0f : cos;
                if (f8 > 1.0f) {
                    f8 = 1.0f;
                }
                if (Math.abs(f8 - cos) > 1.05E-6f) {
                    f8 = Float.NaN;
                }
                if (Float.isNaN(f8)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * c) - d11);
                    f8 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (Math.abs(f8 - cos2) > 1.05E-6f) {
                        f8 = Float.NaN;
                    }
                    if (Float.isNaN(f8)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * c) - d11);
                        if (cos3 >= 0.0f) {
                            f6 = cos3;
                        }
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                }
                f7 = f8;
                isNaN = Float.isNaN(f7);
                float f9 = this.d;
                float f10 = this.b;
                if (!isNaN) {
                }
            } else if (d10 == 0.0d) {
                float f11 = -cjb1.c((float) a);
                float f12 = (float) d11;
                float f13 = (f11 * 2.0f) - f12;
                float f14 = f13 < 0.0f ? 0.0f : f13;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - f13) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (Float.isNaN(f14)) {
                    float f15 = (-f11) - f12;
                    if (f15 >= 0.0f) {
                        f6 = f15;
                    }
                    f2 = f6 > 1.0f ? 1.0f : f6;
                } else {
                    f7 = f14;
                }
                isNaN = Float.isNaN(f7);
                float f92 = this.d;
                float f102 = this.b;
                if (!isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d10);
                float c2 = (float) ((cjb1.c((float) ((-a) + sqrt2)) - cjb1.c((float) (a + sqrt2))) - d11);
                if (c2 >= 0.0f) {
                    f6 = c2;
                }
                f2 = f6 > 1.0f ? 1.0f : f6;
            }
        } else {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
                    float f16 = (float) ((-d) / d3);
                    if (f16 >= 0.0f) {
                        f6 = f16;
                    }
                    f2 = f6 > 1.0f ? 1.0f : f6;
                }
                isNaN = Float.isNaN(f7);
                float f922 = this.d;
                float f1022 = this.b;
                if (!isNaN) {
                    StringBuilder k = oo31.k("The cubic curve with parameters (", f3, Extension.FIX_SPACE, f1022, Extension.FIX_SPACE);
                    vfc.x(k, f4, Extension.FIX_SPACE, f922, ") has no solution at ");
                    k.append(f);
                    throw new IllegalArgumentException(k.toString());
                }
                float f17 = ((((((f1022 - f922) + 0.33333334f) * f7) + (f922 - (2.0f * f1022))) * f7) + f1022) * 3.0f * f7;
                float f18 = this.e;
                if (f17 < f18) {
                    f17 = f18;
                }
                float f19 = this.f;
                return f17 > f19 ? f19 : f17;
            }
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d13 = d2 * 2.0d;
            float f20 = (float) ((sqrt3 - d3) / d13);
            float f21 = f20 < 0.0f ? 0.0f : f20;
            if (f21 > 1.0f) {
                f21 = 1.0f;
            }
            if (Math.abs(f21 - f20) > 1.05E-6f) {
                f21 = Float.NaN;
            }
            if (Float.isNaN(f21)) {
                float f22 = (float) (((-d3) - sqrt3) / d13);
                if (f22 >= 0.0f) {
                    f6 = f22;
                }
                f2 = f6 > 1.0f ? 1.0f : f6;
            } else {
                f7 = f21;
            }
            isNaN = Float.isNaN(f7);
            float f9222 = this.d;
            float f10222 = this.b;
            if (!isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ldf)) {
            return false;
        }
        ldf ldfVar = (ldf) obj;
        return this.a == ldfVar.a && this.b == ldfVar.b && this.c == ldfVar.c && this.d == ldfVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.a);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", c=");
        sb.append(this.c);
        sb.append(", d=");
        return n.n(sb, this.d, ')');
    }
}
