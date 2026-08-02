package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Color.kt */
@vby
/* loaded from: classes11.dex */
public final class l5g {
    public static final long b = f870.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final /* synthetic */ int l = 0;
    public final long a;

    /* compiled from: Color.kt */
    public static final class a {
    }

    static {
        f870.d(4282664004L);
        c = f870.d(4287137928L);
        f870.d(4291611852L);
        d = f870.d(4294967295L);
        e = f870.d(4294901760L);
        f = f870.d(4278255360L);
        g = f870.d(4278190335L);
        h = f870.d(4294967040L);
        i = f870.d(4278255615L);
        f870.d(4294902015L);
        j = f870.c(0);
        float[] fArr = h8g.a;
        k = f870.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h8g.u);
    }

    public /* synthetic */ l5g(long j2) {
        this.a = j2;
    }

    public static final /* synthetic */ l5g a(long j2) {
        return new l5g(j2);
    }

    public static final long b(long j2, d8g d8gVar) {
        u4j u4jVar;
        d8g g2 = g(j2);
        int i2 = g2.c;
        int i3 = d8gVar.c;
        if ((i2 | i3) < 0) {
            u4jVar = e8g.d(g2, d8gVar);
        } else {
            pg50<u4j> pg50Var = v4j.a;
            int i4 = i2 | (i3 << 6);
            u4j b2 = pg50Var.b(i4);
            if (b2 == null) {
                b2 = e8g.d(g2, d8gVar);
                pg50Var.k(i4, b2);
            }
            u4jVar = b2;
        }
        return u4jVar.a(j2);
    }

    public static long c(int i2, long j2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = e(j2);
        }
        return f870.b((i2 & 2) != 0 ? i(j2) : 1.0f, h(j2), f(j2), f2, g(j2));
    }

    public static final boolean d(long j2, long j3) {
        return j2 == j3;
    }

    public static final float e(long j2) {
        float z;
        float f2;
        if ((63 & j2) == 0) {
            z = (float) emi.z((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            z = (float) emi.z((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return z / f2;
    }

    public static final float f(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) emi.z((j2 >>> 32) & 255)) / 255.0f;
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
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - ypr.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final d8g g(long j2) {
        float[] fArr = h8g.a;
        return h8g.y[(int) (j2 & 63)];
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) emi.z((j2 >>> 40) & 255)) / 255.0f;
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
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - ypr.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float i(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) emi.z((j2 >>> 48) & 255)) / 255.0f;
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
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - ypr.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String j(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(i(j2));
        sb.append(", ");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(f(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        return ho8.a(sb, g(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l5g) {
            return this.a == ((l5g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}
