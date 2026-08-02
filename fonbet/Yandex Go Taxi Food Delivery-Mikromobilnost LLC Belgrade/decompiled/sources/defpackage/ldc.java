package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import skeletor.render.SkeletonContentView;

/* loaded from: classes.dex */
public final class ldc {
    public static final long b = rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA);
    public static final long c = rzo.f(4282664004L);
    public static final long d = rzo.f(4287137928L);
    public static final long e = rzo.f(4291611852L);
    public static final long f = rzo.f(_Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    public static final long g = rzo.f(4294901760L);
    public static final long h = rzo.f(4278255360L);
    public static final long i = rzo.f(4278190335L);
    public static final long j = rzo.f(4294967040L);
    public static final long k;
    public static final long l;
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final long a;

    static {
        rzo.f(4278255615L);
        k = rzo.f(4294902015L);
        l = rzo.d(0);
        float[] fArr = wgc.a;
        m = rzo.c(0.0f, 0.0f, 0.0f, 0.0f, wgc.u);
    }

    public /* synthetic */ ldc(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, ugc ugcVar) {
        f6e f6eVar;
        ugc f2 = f(j2);
        int i2 = f2.c;
        int i3 = ugcVar.c;
        if ((i2 | i3) < 0) {
            f6eVar = ffx.z(f2, ugcVar);
        } else {
            wx40 wx40Var = g6e.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = wx40Var.b(i4);
            if (b2 == null) {
                b2 = ffx.z(f2, ugcVar);
                wx40Var.i(i4, b2);
            }
            f6eVar = (f6e) b2;
        }
        return f6eVar.a(j2);
    }

    public static long b(long j2, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = d(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = h(j2);
        }
        if ((i2 & 4) != 0) {
            f4 = g(j2);
        }
        if ((i2 & 8) != 0) {
            f5 = e(j2);
        }
        return rzo.c(f3, f4, f5, f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float O;
        float f2;
        if ((63 & j2) == 0) {
            O = (float) y5e.O((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            O = (float) y5e.O((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return O / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        float f2;
        if ((63 & j2) == 0) {
            return ((float) y5e.O((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= SelfTester_JCP.ENCRYPT_CBC;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608);
                f2 = vnr.a;
                float f3 = intBitsToFloat - f2;
                return i5 == 0 ? f3 : -f3;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final ugc f(long j2) {
        float[] fArr = wgc.a;
        return wgc.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        float f2;
        if ((63 & j2) == 0) {
            return ((float) y5e.O((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= SelfTester_JCP.ENCRYPT_CBC;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608);
                f2 = vnr.a;
                float f3 = intBitsToFloat - f2;
                return i5 == 0 ? f3 : -f3;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        float f2;
        if ((63 & j2) == 0) {
            return ((float) y5e.O((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= SelfTester_JCP.ENCRYPT_CBC;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608);
                f2 = vnr.a;
                float f3 = intBitsToFloat - f2;
                return i5 == 0 ? f3 : -f3;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(Extension.FIX_SPACE);
        sb.append(g(j2));
        sb.append(Extension.FIX_SPACE);
        sb.append(e(j2));
        sb.append(Extension.FIX_SPACE);
        sb.append(d(j2));
        sb.append(Extension.FIX_SPACE);
        return b64.p(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ldc) {
            return this.a == ((ldc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
