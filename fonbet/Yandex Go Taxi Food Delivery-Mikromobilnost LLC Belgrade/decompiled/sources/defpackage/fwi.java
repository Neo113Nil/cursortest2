package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public interface fwi {
    default float H(int i) {
        return i / getDensity();
    }

    default float I(float f) {
        return f / getDensity();
    }

    default long R(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float w0 = w0(c8m.b(j));
        float w02 = w0(c8m.a(j));
        return (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    default long W(float f) {
        float[] fArr = ezr.a;
        if (u0() < 1.03f) {
            return uh6.K(f / u0(), 4294967296L);
        }
        dzr a = ezr.a(u0());
        return uh6.K(a != null ? a.a(f) : f / u0(), 4294967296L);
    }

    default long f(long j) {
        if (j != 9205357640488583168L) {
            return cl91.o(I(Float.intBitsToFloat((int) (j >> 32))), I(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
        }
        return 9205357640488583168L;
    }

    default int f0(float f) {
        float w0 = w0(f);
        if (Float.isInfinite(w0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(w0);
    }

    float getDensity();

    default float i(long j) {
        if (!tty0.a(sty0.b(j), 4294967296L)) {
            kxv.b("Only Sp can convert to Px");
        }
        float[] fArr = ezr.a;
        if (u0() < 1.03f) {
            return u0() * sty0.c(j);
        }
        dzr a = ezr.a(u0());
        if (a != null) {
            return a.b(sty0.c(j));
        }
        return u0() * sty0.c(j);
    }

    default float i0(long j) {
        if (!tty0.a(sty0.b(j), 4294967296L)) {
            kxv.b("Only Sp can convert to Px");
        }
        return w0(i(j));
    }

    default long n(float f) {
        return W(I(f));
    }

    float u0();

    default float w0(float f) {
        return getDensity() * f;
    }
}
