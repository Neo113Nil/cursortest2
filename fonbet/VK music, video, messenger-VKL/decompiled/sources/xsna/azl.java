package xsna;

/* compiled from: Density.kt */
/* loaded from: classes11.dex */
public interface azl {
    default long E(long j) {
        if (j != 9205357640488583168L) {
            return byc0.b(k1(Float.intBitsToFloat((int) (j >> 32))), k1(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long I(int i) {
        return i0(j1(i));
    }

    default float I0(float f) {
        return getDensity() * f;
    }

    default long J(float f) {
        return i0(k1(f));
    }

    default int K0(long j) {
        return Math.round(u0(j));
    }

    default float O0(long j) {
        float d;
        float fontScale;
        if (!gno0.a(fno0.c(j), 4294967296L)) {
            wzw.b("Only Sp can convert to Px");
        }
        float[] fArr = r5s.a;
        if (getFontScale() >= 1.03f) {
            q5s a = r5s.a(getFontScale());
            d = fno0.d(j);
            if (a != null) {
                return a.a(d);
            }
            fontScale = getFontScale();
        } else {
            d = fno0.d(j);
            fontScale = getFontScale();
        }
        return fontScale * d;
    }

    float getDensity();

    float getFontScale();

    default long i0(float f) {
        float[] fArr = r5s.a;
        if (getFontScale() < 1.03f) {
            return l2l0.n(f / getFontScale(), 4294967296L);
        }
        q5s a = r5s.a(getFontScale());
        return l2l0.n(a != null ? a.b(f) : f / getFontScale(), 4294967296L);
    }

    default float j1(int i) {
        return i / getDensity();
    }

    default float k1(float f) {
        return f / getDensity();
    }

    default long p1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float I0 = I0(uco.c(j));
        float I02 = I0(uco.b(j));
        return (Float.floatToRawIntBits(I02) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32);
    }

    default int r0(float f) {
        float I0 = I0(f);
        if (Float.isInfinite(I0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(I0);
    }

    default float u0(long j) {
        if (!gno0.a(fno0.c(j), 4294967296L)) {
            wzw.b("Only Sp can convert to Px");
        }
        return I0(O0(j));
    }
}
