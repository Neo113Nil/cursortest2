package xsna;

/* compiled from: FloatToDecimal.java */
/* loaded from: classes12.dex */
public final class oqr {
    public final byte[] a = new byte[15];
    public int b;

    public static int e(long j, long j2) {
        long r = o19.r(j, j2);
        return (int) ((((r & 4294967295L) + 4294967295L) >>> 32) | (r >>> 31));
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

    public final void d() {
        int i;
        byte b;
        while (true) {
            i = this.b;
            b = this.a[i];
            if (b != 48) {
                break;
            } else {
                this.b = i - 1;
            }
        }
        if (b == 46) {
            this.b = i + 1;
        }
    }

    public final void f(int i, int i2) {
        int numberOfLeadingZeros = (int) (((32 - Integer.numberOfLeadingZeros(i)) * 661971961083L) >> 41);
        long j = i;
        long[] jArr = o19.h;
        if (j >= jArr[numberOfLeadingZeros]) {
            numberOfLeadingZeros++;
        }
        int i3 = (int) (j * jArr[9 - numberOfLeadingZeros]);
        int i4 = i2 + numberOfLeadingZeros;
        int i5 = (int) ((i3 * 1441151881) >>> 57);
        int i6 = i3 - (100000000 * i5);
        int i7 = 1;
        if (i4 > 0 && i4 <= 7) {
            c(i5);
            int r = ((int) (o19.r((i6 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
            while (i7 < i4) {
                int i8 = r * 10;
                c(i8 >>> 28);
                r = i8 & 268435455;
                i7++;
            }
            a(46);
            while (i7 <= 8) {
                int i9 = r * 10;
                c(i9 >>> 28);
                r = i9 & 268435455;
                i7++;
            }
            d();
            return;
        }
        if (-3 < i4 && i4 <= 0) {
            c(0);
            a(46);
            while (i4 < 0) {
                c(0);
                i4++;
            }
            c(i5);
            b(i6);
            d();
            return;
        }
        c(i5);
        a(46);
        b(i6);
        d();
        int i10 = i4 - 1;
        a(69);
        if (i10 < 0) {
            a(45);
            i10 = -i10;
        }
        if (i10 < 10) {
            c(i10);
            return;
        }
        int i11 = (i10 * 103) >>> 10;
        c(i11);
        c(i10 - (i11 * 10));
    }

    public final void g(int i, int i2, int i3) {
        char c;
        long j;
        long j2;
        int i4 = i2 & 1;
        long j3 = i2 << 2;
        long j4 = j3 + 2;
        if ((i2 != 8388608) || (i == -149)) {
            j = j3 - 2;
            c = ')';
            j2 = i * 661971961083L;
        } else {
            c = ')';
            j = j3 - 1;
            j2 = (i * 661971961083L) - 274743187321L;
        }
        int i5 = (int) (j2 >> c);
        int i6 = ((int) (((-i5) * 913124641741L) >> 38)) + i + 33;
        long j5 = o19.i[(i5 + 324) << 1] + 1;
        int e = e(j5, j3 << i6);
        int e2 = e(j5, j << i6);
        int e3 = e(j5, j4 << i6);
        int i7 = e >> 2;
        if (i7 >= 100) {
            int i8 = ((int) ((i7 * 1717986919) >>> 34)) * 10;
            int i9 = i8 + 10;
            boolean z = e2 + i4 <= (i8 << 2);
            if (z != ((i9 << 2) + i4 <= e3)) {
                if (!z) {
                    i8 = i9;
                }
                f(i8, i5);
                return;
            }
        }
        int i10 = i7 + 1;
        boolean z2 = e2 + i4 <= (i7 << 2);
        if (z2 != ((i10 << 2) + i4 <= e3)) {
            if (!z2) {
                i7 = i10;
            }
            f(i7, i5 + i3);
        } else {
            int i11 = e - ((i7 + i10) << 1);
            if (i11 >= 0 && (i11 != 0 || (i7 & 1) != 0)) {
                i7 = i10;
            }
            f(i7, i5 + i3);
        }
    }
}
