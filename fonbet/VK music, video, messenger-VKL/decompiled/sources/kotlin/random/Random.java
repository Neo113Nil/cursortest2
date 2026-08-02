package kotlin.random;

import io.jsonwebtoken.JwtParser;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bkq;
import xsna.fsk;
import xsna.gg;
import xsna.ji;
import xsna.qta0;
import xsna.qz9;
import xsna.sua0;
import xsna.tgw;
import xsna.vu5;
import xsna.vwx;

/* compiled from: Random.kt */
/* loaded from: classes11.dex */
public abstract class Random {
    public static final Default b = new Default(0);
    public static final gg c;

    /* compiled from: Random.kt */
    public static final class Default extends Random implements Serializable {

        /* compiled from: Random.kt */
        /* loaded from: classes8.dex */
        public static final class a implements Serializable {
            public static final a b = new a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return Random.b;
            }
        }

        public /* synthetic */ Default(int i) {
            this();
        }

        private final void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return a.b;
        }

        @Override // kotlin.random.Random
        public final int a(int i) {
            return Random.c.a(i);
        }

        @Override // kotlin.random.Random
        public final boolean d() {
            return Random.c.d();
        }

        @Override // kotlin.random.Random
        public final void e(byte[] bArr) {
            Random.c.e(bArr);
        }

        @Override // kotlin.random.Random
        public final byte[] f(int i, byte[] bArr) {
            Random.c.f(i, bArr);
            return bArr;
        }

        @Override // kotlin.random.Random
        public final double g() {
            return Random.c.g();
        }

        @Override // kotlin.random.Random
        public final double h(double d, double d2) {
            return Random.c.h(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, d2);
        }

        @Override // kotlin.random.Random
        public final float i() {
            return Random.c.i();
        }

        @Override // kotlin.random.Random
        public final int j() {
            return Random.c.j();
        }

        @Override // kotlin.random.Random
        public final int k(int i) {
            return Random.c.k(i);
        }

        @Override // kotlin.random.Random
        public final int l(int i, int i2) {
            return Random.c.l(i, i2);
        }

        @Override // kotlin.random.Random
        public final long m() {
            return Random.c.m();
        }

        @Override // kotlin.random.Random
        public final long n(long j) {
            throw null;
        }

        @Override // kotlin.random.Random
        public final long o(long j, long j2) {
            return Random.c.o(j, j2);
        }

        private Default() {
        }
    }

    static {
        qta0.a.getClass();
        Integer num = vwx.a.a;
        c = (num == null || num.intValue() >= 34) ? new sua0() : new bkq();
    }

    public abstract int a(int i);

    public boolean d() {
        return a(1) != 0;
    }

    public void e(byte[] bArr) {
        f(bArr.length, bArr);
    }

    public byte[] f(int i, byte[] bArr) {
        if (bArr.length < 0 || i < 0 || i > bArr.length) {
            throw new IllegalArgumentException(vu5.b(ji.b(i, "fromIndex (0) or toIndex (", ") are out of range: 0.."), bArr.length, JwtParser.SEPARATOR_CHAR).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "fromIndex (0) must be not greater than toIndex (", ").").toString());
        }
        int i2 = i / 4;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int j = j();
            bArr[i3] = (byte) j;
            bArr[i3 + 1] = (byte) (j >>> 8);
            bArr[i3 + 2] = (byte) (j >>> 16);
            bArr[i3 + 3] = (byte) (j >>> 24);
            i3 += 4;
        }
        int i5 = i - i3;
        int a = a(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i3 + i6] = (byte) (a >>> (i6 * 8));
        }
        return bArr;
    }

    public double g() {
        return fsk.q(a(26), a(27));
    }

    public double h(double d, double d2) {
        double g;
        if (d2 <= d) {
            throw new IllegalArgumentException(qz9.c(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            g = d + (g() * d3);
        } else {
            double d4 = 2;
            double g2 = ((d2 / d4) - (d / d4)) * g();
            g = d + g2 + g2;
        }
        return g >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : g;
    }

    public float i() {
        return a(24) / 1.6777216E7f;
    }

    public int j() {
        return a(32);
    }

    public int k(int i) {
        return l(0, i);
    }

    public int l(int i, int i2) {
        int j;
        int i3;
        int i4;
        if (i2 <= i) {
            throw new IllegalArgumentException(qz9.c(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = a(31 - Integer.numberOfLeadingZeros(i5));
            } else {
                do {
                    j = j() >>> 1;
                    i3 = j % i5;
                } while ((i5 - 1) + (j - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int j2 = j();
            if (i <= j2 && j2 < i2) {
                return j2;
            }
        }
    }

    public long m() {
        return (j() << 32) + j();
    }

    public long n(long j) {
        return o(0L, j);
    }

    public long o(long j, long j2) {
        long m;
        long j3;
        long j4;
        int j5;
        if (j2 <= j) {
            throw new IllegalArgumentException(qz9.c(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
        long j6 = j2 - j;
        if (j6 > 0) {
            if (((-j6) & j6) == j6) {
                int i = (int) j6;
                int i2 = (int) (j6 >>> 32);
                if (i != 0) {
                    j5 = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    j5 = j();
                } else {
                    j4 = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (j() & 4294967295L);
                }
                j4 = j5 & 4294967295L;
            } else {
                do {
                    m = m() >>> 1;
                    j3 = m % j6;
                } while ((j6 - 1) + (m - j3) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long m2 = m();
            if (j <= m2 && m2 < j2) {
                return m2;
            }
        }
    }
}
