package xsna;

import java.math.BigInteger;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: FftMultiplier.java */
/* loaded from: classes12.dex */
public final class x6r {
    public static final double a = Math.cos(0.7853981633974483d);
    public static final double b = Math.sin(0.7853981633974483d);
    public static volatile a[] c = new a[20];
    public static volatile a[] d = new a[20];

    /* compiled from: FftMultiplier.java */
    public static final class b {
        public double a;
        public double b;
    }

    public static int a(int i) {
        if (i <= 9728) {
            return 19;
        }
        if (i <= 18432) {
            return 18;
        }
        if (i <= 69632) {
            return 17;
        }
        if (i <= 262144) {
            return 16;
        }
        if (i <= 983040) {
            return 15;
        }
        if (i <= 3670016) {
            return 14;
        }
        if (i <= 13631488) {
            return 13;
        }
        if (i <= 25165824) {
            return 12;
        }
        if (i <= 92274688) {
            return 11;
        }
        if (i <= 335544320) {
            return 10;
        }
        return i <= 1207959552 ? 9 : 8;
    }

    public static a b(int i) {
        if (i == 1) {
            a aVar = new a(1);
            aVar.l(1.0d, 0);
            aVar.d(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0);
            return aVar;
        }
        a aVar2 = new a(i);
        aVar2.n(0, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        int i2 = i / 2;
        aVar2.n(i2, a, b);
        double d2 = 1.5707963267948966d / i;
        int i3 = 1;
        while (i3 < i2) {
            double d3 = i3 * d2;
            double cos = Math.cos(d3);
            double sin = Math.sin(d3);
            aVar2.n(i3, cos, sin);
            int i4 = i3;
            aVar2.n(i - i4, sin, cos);
            i3 = i4 + 1;
        }
        return aVar2;
    }

    public static void c(a aVar, a[] aVarArr) {
        int i = aVar.b;
        double[] dArr = aVar.a;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        while (numberOfLeadingZeros >= 2) {
            a aVar2 = aVarArr[numberOfLeadingZeros - 2];
            int i2 = 1 << numberOfLeadingZeros;
            int i3 = 0;
            while (i3 < i) {
                int i4 = 0;
                while (true) {
                    int i5 = i2 / 4;
                    if (i4 < i5) {
                        double k = aVar2.k(i4);
                        double c2 = aVar2.c(i4);
                        double d2 = (k * k) + ((-c2) * c2);
                        double d3 = 2.0d * k * c2;
                        int i6 = i3 + i4;
                        int i7 = i5 + i6;
                        double[] dArr2 = dArr;
                        int i8 = (i2 / 2) + i6;
                        int i9 = numberOfLeadingZeros;
                        a aVar3 = aVar2;
                        int b2 = dq.b(i2, 3, 4, i6);
                        double k2 = aVar.k(i7) + dArr2[aVar.m(i6)];
                        double c3 = aVar.c(i7) + dArr2[aVar.e(i6)];
                        double k3 = aVar.k(i8) + k2;
                        double c4 = aVar.c(i8) + c3;
                        double k4 = aVar.k(b2) + k3;
                        int i10 = i3;
                        double c5 = aVar.c(b2) + c4;
                        double c6 = aVar.c(i7) + dArr2[aVar.m(i6)];
                        double k5 = dArr2[aVar.e(i6)] - aVar.k(i7);
                        double k6 = c6 - aVar.k(i8);
                        double c7 = k5 - aVar.c(i8);
                        double c8 = k6 - aVar.c(b2);
                        double k7 = aVar.k(b2) + c7;
                        double d4 = (c8 * k) + (k7 * c2);
                        double d5 = ((-c8) * c2) + (k7 * k);
                        double k8 = dArr2[aVar.m(i6)] - aVar.k(i7);
                        double c9 = dArr2[aVar.e(i6)] - aVar.c(i7);
                        double k9 = aVar.k(i8) + k8;
                        double c10 = aVar.c(i8) + c9;
                        double k10 = k9 - aVar.k(b2);
                        double c11 = c10 - aVar.c(b2);
                        double d6 = (k10 * d2) + (c11 * d3);
                        double d7 = ((-k10) * d3) + (c11 * d2);
                        double c12 = dArr2[aVar.m(i6)] - aVar.c(i7);
                        double k11 = aVar.k(i7) + dArr2[aVar.e(i6)];
                        double k12 = c12 - aVar.k(i8);
                        double c13 = k11 - aVar.c(i8);
                        double c14 = aVar.c(b2) + k12;
                        double k13 = c13 - aVar.k(b2);
                        int i11 = i;
                        aVar.l(k4, i6);
                        aVar.d(c5, i6);
                        aVar.l(d4, i7);
                        aVar.d(d5, i7);
                        aVar.l(d6, i8);
                        aVar.d(d7, i8);
                        aVar.l((c14 * k) + ((-k13) * c2), b2);
                        aVar.d((c14 * c2) + (k13 * k), b2);
                        i4++;
                        i = i11;
                        numberOfLeadingZeros = i9;
                        dArr = dArr2;
                        aVar2 = aVar3;
                        i3 = i10;
                        i2 = i2;
                    }
                }
                i3 += i2;
            }
            numberOfLeadingZeros -= 2;
        }
        int i12 = i;
        double[] dArr3 = dArr;
        if (numberOfLeadingZeros > 0) {
            for (int i13 = 0; i13 < i12; i13 += 2) {
                double d8 = dArr3[aVar.m(i13)];
                double d9 = dArr3[aVar.e(i13)];
                int i14 = i13 + 1;
                double d10 = dArr3[aVar.m(i14)];
                double d11 = dArr3[aVar.e(i14)];
                int m = aVar.m(i13);
                dArr3[m] = dArr3[m] + d10;
                int e = aVar.e(i13);
                dArr3[e] = dArr3[e] + d11;
                aVar.l(d8 - d10, i14);
                aVar.d(d9 - d11, i14);
            }
        }
    }

    public static void d(a aVar, a aVar2, a aVar3, int i, double d2) {
        double sqrt = Math.sqrt(3.0d) * i * (-0.5d);
        for (int i2 = 0; i2 < aVar.b; i2++) {
            double k = aVar3.k(i2) + aVar2.k(i2) + aVar.k(i2);
            double c2 = aVar3.c(i2) + aVar2.c(i2) + aVar.c(i2);
            double c3 = (aVar3.c(i2) - aVar2.c(i2)) * sqrt;
            double k2 = (aVar2.k(i2) - aVar3.k(i2)) * sqrt;
            double k3 = (aVar3.k(i2) + aVar2.k(i2)) * 0.5d;
            double c4 = (aVar3.c(i2) + aVar2.c(i2)) * 0.5d;
            double k4 = (aVar.k(i2) - k3) + c3;
            double c5 = (aVar.c(i2) + k2) - c4;
            double k5 = (aVar.k(i2) - k3) - c3;
            double c6 = (aVar.c(i2) - k2) - c4;
            aVar.l(k * d2, i2);
            aVar.d(c2 * d2, i2);
            aVar2.l(k4 * d2, i2);
            aVar2.d(c5 * d2, i2);
            aVar3.l(k5 * d2, i2);
            aVar3.d(c6 * d2, i2);
        }
    }

    public static void e(a aVar, a[] aVarArr, a aVar2) {
        int i;
        int i2 = aVar.b;
        int i3 = i2 / 3;
        int i4 = 0;
        a aVar3 = new a(aVar, 0, i3);
        int i5 = i3 * 2;
        a aVar4 = new a(aVar, i3, i5);
        a aVar5 = new a(aVar, i5, i2);
        d(aVar3, aVar4, aVar5, 1, 1.0d);
        b bVar = new b();
        while (true) {
            i = i2 / 4;
            if (i4 >= i) {
                break;
            }
            bVar.a = aVar2.k(i4);
            bVar.b = aVar2.c(i4);
            aVar4.h(i4, bVar);
            aVar5.h(i4, bVar);
            aVar5.h(i4, bVar);
            i4++;
        }
        for (int i6 = i; i6 < i3; i6++) {
            int i7 = i6 - i;
            bVar.a = aVar2.k(i7);
            bVar.b = aVar2.c(i7);
            aVar4.i(i6, bVar);
            aVar5.i(i6, bVar);
            aVar5.i(i6, bVar);
        }
        c(aVar3, aVarArr);
        c(aVar4, aVarArr);
        c(aVar5, aVarArr);
    }

    public static BigInteger f(a aVar, int i, int i2) {
        a aVar2 = aVar;
        int i3 = i2;
        long j = i3;
        int min = (int) Math.min(aVar2.b, (2147483648L / j) + 1);
        int i4 = (int) ((((min * j) + 31) * 8) / 32);
        byte[] bArr = new byte[i4];
        int i5 = 1;
        int i6 = (1 << i3) - 1;
        int i7 = 32 - i3;
        int i8 = (i4 * 8) - i3;
        int i9 = 0;
        int i10 = i4 - 4;
        int min2 = Math.min(Math.max(0, i8 >> 3), i10);
        long j2 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 <= i5) {
            int i13 = i9;
            while (i13 < min) {
                long round = Math.round(aVar2.a[(i13 << 1) + i11]) + j2;
                long j3 = round >> i3;
                int min3 = Math.min(Math.max(i9, i8 >> 3), i10);
                i12 = (int) (((round & i6) << ((i7 - i8) + (min3 << 3))) | (i12 >>> ((min2 - min3) << 3)));
                bArr[min3] = (byte) (i12 >>> 24);
                bArr[min3 + 1] = (byte) (i12 >>> 16);
                bArr[min3 + 2] = (byte) (i12 >>> 8);
                bArr[min3 + 3] = (byte) i12;
                i8 -= i2;
                i13++;
                aVar2 = aVar;
                i3 = i2;
                min2 = min3;
                j2 = j3;
                i9 = 0;
            }
            i11++;
            aVar2 = aVar;
            i3 = i2;
            i5 = 1;
            i9 = 0;
        }
        return new BigInteger(i, bArr);
    }

    public static a[] g(int i) {
        a[] aVarArr = new a[i + 1];
        while (i >= 0) {
            if (i < 20) {
                if (c[i] == null) {
                    c[i] = b(1 << i);
                }
                aVarArr[i] = c[i];
            } else {
                aVarArr[i] = b(1 << i);
            }
            i -= 2;
        }
        return aVarArr;
    }

    public static a h(int i) {
        if (i >= 20) {
            return b(3 << i);
        }
        if (d[i] == null) {
            d[i] = b(3 << i);
        }
        return d[i];
    }

    public static void i(a aVar, a[] aVarArr) {
        int i;
        int i2 = aVar.b;
        double[] dArr = aVar.a;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i2);
        int i3 = 1;
        if (numberOfLeadingZeros % 2 != 0) {
            for (int i4 = 0; i4 < i2; i4 += 2) {
                int i5 = i4 + 1;
                double d2 = dArr[aVar.m(i5)];
                double d3 = dArr[aVar.e(i5)];
                double d4 = dArr[aVar.m(i4)];
                double d5 = dArr[aVar.e(i4)];
                int m = aVar.m(i4);
                dArr[m] = dArr[m] + d2;
                int e = aVar.e(i4);
                dArr[e] = dArr[e] + d3;
                aVar.l(d4 - d2, i5);
                aVar.d(d5 - d3, i5);
            }
            i = 2;
        } else {
            i = 1;
        }
        while (i <= numberOfLeadingZeros) {
            a aVar2 = aVarArr[i - 1];
            int i6 = i3 << (i + 1);
            int i7 = 0;
            while (i7 < i2) {
                int i8 = 0;
                while (true) {
                    int i9 = i6 / 4;
                    if (i8 < i9) {
                        double k = aVar2.k(i8);
                        double c2 = aVar2.c(i8);
                        double d6 = (k * k) + ((-c2) * c2);
                        double d7 = 2.0d * k * c2;
                        double[] dArr2 = dArr;
                        int i10 = i7 + i8;
                        int i11 = i9 + i10;
                        int i12 = i;
                        int i13 = (i6 / 2) + i10;
                        int b2 = dq.b(i6, 3, 4, i10);
                        double d8 = dArr2[aVar.m(i10)];
                        double d9 = dArr2[aVar.e(i10)];
                        double d10 = dArr2[aVar.m(i11)];
                        double d11 = dArr2[aVar.e(i11)];
                        int i14 = i6;
                        double d12 = (d10 * k) + ((-d11) * c2);
                        double d13 = (d10 * c2) + (d11 * k);
                        double d14 = dArr2[aVar.m(i13)];
                        double d15 = dArr2[aVar.e(i13)];
                        double d16 = (d14 * d6) + ((-d15) * d7);
                        double d17 = (d14 * d7) + (d15 * d6);
                        double d18 = dArr2[aVar.m(b2)];
                        double d19 = dArr2[aVar.e(b2)];
                        double d20 = (d18 * k) + (d19 * c2);
                        double d21 = ((-d18) * c2) + (d19 * k);
                        double d22 = d9 + d13 + d17 + d21;
                        double d23 = (d9 + d12) - d17;
                        aVar.l(d8 + d12 + d16 + d20, i10);
                        aVar.d(d22, i10);
                        aVar.l(((d8 - d13) - d16) + d21, i11);
                        aVar.d(d23 - d20, i11);
                        aVar.l(((d8 - d12) + d16) - d20, i13);
                        aVar.d(((d9 - d13) + d17) - d21, i13);
                        aVar.l(((d8 + d13) - d16) - d21, b2);
                        aVar.d(((d9 - d12) - d17) + d20, b2);
                        i8++;
                        dArr = dArr2;
                        aVar2 = aVar2;
                        i = i12;
                        i6 = i14;
                        i7 = i7;
                        numberOfLeadingZeros = numberOfLeadingZeros;
                    }
                }
                i7 += i6;
            }
            i += 2;
            i3 = 1;
        }
        double[] dArr3 = dArr;
        int i15 = numberOfLeadingZeros;
        for (int i16 = 0; i16 < i2; i16++) {
            int i17 = -i15;
            int m2 = aVar.m(i16);
            int e2 = aVar.e(i16);
            double d24 = dArr3[m2];
            double d25 = dArr3[e2];
            dArr3[m2] = Math.scalb(d24, i17);
            dArr3[e2] = Math.scalb(d25, i17);
        }
    }

    public static void j(a aVar, a[] aVarArr, a aVar2) {
        int i;
        int i2 = aVar.b;
        int i3 = i2 / 3;
        a aVar3 = new a(aVar, 0, i3);
        int i4 = i3 * 2;
        a aVar4 = new a(aVar, i3, i4);
        int i5 = 0;
        a aVar5 = new a(aVar, i4, i2);
        i(aVar3, aVarArr);
        i(aVar4, aVarArr);
        i(aVar5, aVarArr);
        b bVar = new b();
        while (true) {
            i = i2 / 4;
            if (i5 >= i) {
                break;
            }
            bVar.a = aVar2.k(i5);
            bVar.b = aVar2.c(i5);
            aVar4.f(i5, bVar);
            aVar5.f(i5, bVar);
            aVar5.f(i5, bVar);
            i5++;
        }
        for (int i6 = i; i6 < i3; i6++) {
            int i7 = i6 - i;
            bVar.a = aVar2.k(i7);
            bVar.b = aVar2.c(i7);
            aVar4.g(i6, bVar);
            aVar5.g(i6, bVar);
            aVar5.g(i6, bVar);
        }
        d(aVar3, aVar4, aVar5, -1, 0.3333333333333333d);
    }

    public static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() == 0 || bigInteger.signum() == 0) {
            return BigInteger.ZERO;
        }
        if (bigInteger2 == bigInteger) {
            if (bigInteger2.signum() == 0) {
                return BigInteger.ZERO;
            }
            if (bigInteger2.bitLength() < 33220) {
                return bigInteger2.multiply(bigInteger2);
            }
            byte[] byteArray = bigInteger2.toByteArray();
            int length = byteArray.length * 8;
            int a2 = a(length);
            int i = ((length + a2) - 1) / a2;
            int i2 = i + 1;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
            int i3 = 32 - numberOfLeadingZeros;
            int i4 = 1 << i3;
            int i5 = (i4 * 3) / 4;
            if (i2 >= i5) {
                a l = l(i4, a2, byteArray);
                a[] g = g(i3);
                l.b(g[i3]);
                c(l, g);
                l.o();
                i(l, g);
                l.a(g[i3]);
                return f(l, 1, a2);
            }
            a l2 = l(i5, a2, byteArray);
            int i6 = 30 - numberOfLeadingZeros;
            a[] g2 = g(i6);
            a h = h(i6);
            a h2 = h(28 - numberOfLeadingZeros);
            l2.b(h);
            e(l2, g2, h2);
            l2.o();
            j(l2, g2, h2);
            l2.a(h);
            return f(l2, 1, a2);
        }
        int bitLength = bigInteger.bitLength();
        int bitLength2 = bigInteger2.bitLength();
        if (bitLength + bitLength2 > 2147483648L) {
            throw new ArithmeticException("BigInteger would overflow supported range");
        }
        if (bitLength <= 1920 || bitLength2 <= 1920 || (bitLength <= 33220 && bitLength2 <= 33220)) {
            return bigInteger.multiply(bigInteger2);
        }
        int signum = bigInteger2.signum() * bigInteger.signum();
        if (bigInteger.signum() < 0) {
            bigInteger = bigInteger.negate();
        }
        byte[] byteArray2 = bigInteger.toByteArray();
        if (bigInteger2.signum() < 0) {
            bigInteger2 = bigInteger2.negate();
        }
        byte[] byteArray3 = bigInteger2.toByteArray();
        int max = Math.max(byteArray2.length, byteArray3.length) * 8;
        int a3 = a(max);
        int i7 = ((max + a3) - 1) / a3;
        int i8 = i7 + 1;
        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(i7);
        int i9 = 32 - numberOfLeadingZeros2;
        int i10 = 1 << i9;
        int i11 = (i10 * 3) / 4;
        if (i8 >= i11 || i9 <= 3) {
            a[] g3 = g(i9);
            a l3 = l(i10, a3, byteArray2);
            l3.b(g3[i9]);
            c(l3, g3);
            a l4 = l(i10, a3, byteArray3);
            l4.b(g3[i9]);
            c(l4, g3);
            l3.j(l4);
            i(l3, g3);
            l3.a(g3[i9]);
            return f(l3, signum, a3);
        }
        int i12 = 30 - numberOfLeadingZeros2;
        a[] g4 = g(i12);
        a h3 = h(i12);
        a h4 = h(28 - numberOfLeadingZeros2);
        a l5 = l(i11, a3, byteArray2);
        l5.b(h3);
        e(l5, g4, h4);
        a l6 = l(i11, a3, byteArray3);
        l6.b(h3);
        e(l6, g4, h4);
        l5.j(l6);
        j(l5, g4, h4);
        l5.a(h3);
        return f(l5, signum, a3);
    }

    public static a l(int i, int i2, byte[] bArr) {
        a aVar = new a(i);
        if (bArr.length < 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 4 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        int i3 = 1 << i2;
        int i4 = i3 / 2;
        int i5 = i3 - 1;
        int i6 = 32 - i2;
        int length = (bArr.length * 8) - i2;
        int i7 = 0;
        int i8 = 0;
        while (length > (-i2)) {
            int min = Math.min(Math.max(0, length >> 3), bArr.length - 4);
            i7 = (i4 - (((((bArr[min + 3] & 255) | ((((bArr[min] & 255) << 24) | ((bArr[min + 1] & 255) << 16)) | ((bArr[min + 2] & 255) << 8))) >>> ((i6 - length) + (min << 3))) & i5) + i7)) >>> 31;
            aVar.l(r9 - ((-i7) & i3), i8);
            i8++;
            length -= i2;
        }
        if (i7 > 0) {
            aVar.l(i7, i8);
        }
        return aVar;
    }

    /* compiled from: FftMultiplier.java */
    public static final class a {
        public final double[] a;
        public final int b;
        public final int c;

        public a(int i) {
            this.a = new double[i << 1];
            this.b = i;
            this.c = 0;
        }

        public final void a(a aVar) {
            int i = aVar.c;
            double[] dArr = aVar.a;
            int i2 = this.c;
            for (int i3 = 0; i3 < this.b; i3++) {
                double[] dArr2 = this.a;
                double d = dArr2[i2];
                int i4 = i2 + 1;
                double d2 = dArr2[i4];
                int i5 = i + 1;
                dArr2[i2] = (dArr[i] * d) + (dArr[i5] * d2);
                dArr2[i4] = ((-d) * dArr[i5]) + (d2 * dArr[i]);
                i2 += 2;
                i += 2;
            }
        }

        public final void b(a aVar) {
            int i = aVar.c;
            double[] dArr = aVar.a;
            int i2 = this.b;
            int i3 = this.c;
            int i4 = (i2 + i3) << 1;
            while (i3 < i4) {
                double[] dArr2 = this.a;
                double d = dArr2[i3];
                dArr2[i3] = dArr[i] * d;
                dArr2[i3 + 1] = d * dArr[i + 1];
                i += 2;
                i3 += 2;
            }
        }

        public final double c(int i) {
            return this.a[(i << 1) + this.c + 1];
        }

        public final void d(double d, int i) {
            this.a[(i << 1) + this.c + 1] = d;
        }

        public final int e(int i) {
            return (i << 1) + this.c + 1;
        }

        public final void f(int i, b bVar) {
            int m = m(i);
            int e = e(i);
            double[] dArr = this.a;
            double d = dArr[m];
            double d2 = dArr[e];
            double d3 = bVar.a;
            double d4 = bVar.b;
            dArr[m] = (d * d3) + ((-d2) * d4);
            dArr[e] = (d * d4) + (d2 * d3);
        }

        public final void g(int i, b bVar) {
            int m = m(i);
            int e = e(i);
            double[] dArr = this.a;
            double d = dArr[m];
            double d2 = dArr[e];
            double d3 = bVar.b;
            double d4 = -d2;
            double d5 = bVar.a;
            dArr[m] = ((-d) * d3) + (d4 * d5);
            dArr[e] = (d * d5) + (d4 * d3);
        }

        public final void h(int i, b bVar) {
            int m = m(i);
            int e = e(i);
            double[] dArr = this.a;
            double d = dArr[m];
            double d2 = dArr[e];
            double d3 = bVar.a;
            double d4 = bVar.b;
            dArr[m] = (d * d3) + (d2 * d4);
            dArr[e] = ((-d) * d4) + (d2 * d3);
        }

        public final void i(int i, b bVar) {
            int m = m(i);
            int e = e(i);
            double[] dArr = this.a;
            double d = dArr[m];
            double d2 = dArr[e];
            double d3 = -d;
            double d4 = bVar.b;
            double d5 = bVar.a;
            dArr[m] = (d3 * d4) + (d2 * d5);
            dArr[e] = (d3 * d5) + ((-d2) * d4);
        }

        public final void j(a aVar) {
            a aVar2 = this;
            int i = aVar.c;
            double[] dArr = aVar.a;
            int i2 = aVar2.b;
            int i3 = aVar2.c;
            int i4 = (i2 + i3) << 1;
            while (i3 < i4) {
                double[] dArr2 = aVar2.a;
                double d = dArr2[i3];
                int i5 = i3 + 1;
                double d2 = dArr2[i5];
                double d3 = dArr[i];
                double d4 = dArr[i + 1];
                dArr2[i3] = (d * d3) + ((-d2) * d4);
                dArr2[i5] = (d * d4) + (d2 * d3);
                i += 2;
                i3 += 2;
                aVar2 = this;
                dArr = dArr;
            }
        }

        public final double k(int i) {
            return this.a[(i << 1) + this.c];
        }

        public final void l(double d, int i) {
            this.a[(i << 1) + this.c] = d;
        }

        public final int m(int i) {
            return (i << 1) + this.c;
        }

        public final void n(int i, double d, double d2) {
            int m = m(i);
            double[] dArr = this.a;
            dArr[m] = d;
            dArr[m + 1] = d2;
        }

        public final void o() {
            int i = this.b;
            int i2 = this.c;
            int i3 = (i + i2) << 1;
            while (i2 < i3) {
                double[] dArr = this.a;
                double d = dArr[i2];
                int i4 = i2 + 1;
                double d2 = dArr[i4];
                dArr[i2] = (d * d) + ((-d2) * d2);
                dArr[i4] = d * 2.0d * d2;
                i2 += 2;
            }
        }

        public a(a aVar, int i, int i2) {
            this.b = i2 - i;
            this.a = aVar.a;
            this.c = i << 1;
        }
    }
}
