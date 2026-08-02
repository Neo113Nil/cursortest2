package xsna;

/* compiled from: DoubleToDecimal.java */
/* loaded from: classes12.dex */
public final class j7o {
    public final byte[] a = new byte[24];
    public int b;

    public static long e(long j, long j2, long j3) {
        long r = o19.r(j2, j3);
        long j4 = j * j3;
        long r2 = o19.r(j, j3);
        long j5 = (j4 >>> 1) + r;
        return (r2 + (j5 >>> 63)) | (((j5 & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63);
    }

    public final void a(int i) {
        int i2 = this.b + 1;
        this.b = i2;
        this.a[i2] = (byte) i;
    }

    public final void b(int i) {
        int r = ((int) (o19.r((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = r * 10;
            c(i3 >>> 28);
            r = i3 & 268435455;
        }
    }

    public final void c(int i) {
        int i2 = this.b + 1;
        this.b = i2;
        this.a[i2] = (byte) (i + 48);
    }

    public final void d(int i) {
        int i2;
        byte b;
        if (i != 0) {
            b(i);
        }
        while (true) {
            i2 = this.b;
            b = this.a[i2];
            if (b != 48) {
                break;
            } else {
                this.b = i2 - 1;
            }
        }
        if (b == 46) {
            this.b = i2 + 1;
        }
    }

    public final void f(int i, long j) {
        int numberOfLeadingZeros = (int) (((64 - Long.numberOfLeadingZeros(j)) * 661971961083L) >> 41);
        long[] jArr = o19.h;
        if (j >= jArr[numberOfLeadingZeros]) {
            numberOfLeadingZeros++;
        }
        long j2 = j * jArr[17 - numberOfLeadingZeros];
        int i2 = i + numberOfLeadingZeros;
        long r = o19.r(j2, 193428131138340668L) >>> 20;
        int i3 = (int) (j2 - (100000000 * r));
        int i4 = (int) ((1441151881 * r) >>> 57);
        int i5 = (int) (r - (100000000 * i4));
        int i6 = 1;
        if (i2 > 0 && i2 <= 7) {
            c(i4);
            int r2 = ((int) (o19.r((i5 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
            while (i6 < i2) {
                int i7 = r2 * 10;
                c(i7 >>> 28);
                r2 = i7 & 268435455;
                i6++;
            }
            a(46);
            while (i6 <= 8) {
                int i8 = r2 * 10;
                c(i8 >>> 28);
                r2 = i8 & 268435455;
                i6++;
            }
            d(i3);
            return;
        }
        if (-3 < i2 && i2 <= 0) {
            c(0);
            a(46);
            while (i2 < 0) {
                c(0);
                i2++;
            }
            c(i4);
            b(i5);
            d(i3);
            return;
        }
        c(i4);
        a(46);
        b(i5);
        d(i3);
        int i9 = i2 - 1;
        a(69);
        if (i9 < 0) {
            a(45);
            i9 = -i9;
        }
        if (i9 < 10) {
            c(i9);
            return;
        }
        if (i9 >= 100) {
            int i10 = (i9 * 1311) >>> 17;
            c(i10);
            i9 -= i10 * 100;
        }
        int i11 = (i9 * 103) >>> 10;
        c(i11);
        c(i9 - (i11 * 10));
    }

    public final void g(int i, int i2, long j) {
        int i3;
        char c;
        long j2;
        long j3;
        int i4 = ((int) j) & 1;
        long j4 = j << 2;
        long j5 = j4 + 2;
        if ((j != 4503599627370496L) || (i == -1074)) {
            j2 = j4 - 2;
            i3 = 1;
            c = 2;
            j3 = i * 661971961083L;
        } else {
            i3 = 1;
            c = 2;
            j2 = j4 - 1;
            j3 = (i * 661971961083L) - 274743187321L;
        }
        int i5 = (int) (j3 >> 41);
        int i6 = ((int) (((-i5) * 913124641741L) >> 38)) + i + 2;
        long[] jArr = o19.i;
        int i7 = (i5 + 324) << i3;
        long j6 = jArr[i7];
        long j7 = jArr[i7 | i3];
        long e = e(j6, j7, j4 << i6);
        long e2 = e(j6, j7, j2 << i6);
        long e3 = e(j6, j7, j5 << i6);
        long j8 = e >> c;
        int i8 = i3;
        if (j8 >= 100) {
            long r = o19.r(j8, 1844674407370955168L) * 10;
            long j9 = r + 10;
            long j10 = i4;
            int i9 = e2 + j10 <= (r << c) ? i8 : 0;
            if (i9 != ((j9 << c) + j10 <= e3 ? i8 : 0)) {
                f(i5, i9 != 0 ? r : j9);
                return;
            }
        }
        long j11 = j8 + 1;
        long j12 = i4;
        int i10 = e2 + j12 <= (j8 << c) ? i8 : 0;
        if (i10 != ((j11 << c) + j12 <= e3 ? i8 : 0)) {
            if (i10 == 0) {
                j8 = j11;
            }
            f(i5 + i2, j8);
        } else {
            long j13 = e - ((j8 + j11) << i8);
            if (j13 >= 0 && (j13 != 0 || (j8 & 1) != 0)) {
                j8 = j11;
            }
            f(i5 + i2, j8);
        }
    }
}
