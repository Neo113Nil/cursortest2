package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: MssimCalculator.kt */
/* loaded from: classes3.dex */
public final class u140 {
    public static final double a;
    public static final double b;

    static {
        double d = 2;
        a = Math.pow(2.5500000000000003d, d);
        b = Math.pow(7.6499999999999995d, d);
    }

    public static double a(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        double d;
        int i4 = i;
        int i5 = i2;
        byte[] bArr3 = bArr;
        int i6 = 0;
        int i7 = 16;
        i9x p = swe0.p(16, swe0.q(0, i5));
        int i8 = p.b;
        int i9 = p.c;
        int i10 = p.d;
        if ((i10 <= 0 || i8 > i9) && (i10 >= 0 || i9 > i8)) {
            i3 = 0;
            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        } else {
            int i11 = 0;
            double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            while (true) {
                int i12 = i8 + 8 <= i5 ? 8 : i5 - i8;
                i9x p2 = swe0.p(i7, swe0.q(i6, i4));
                int i13 = p2.b;
                int i14 = i6;
                int i15 = p2.c;
                int i16 = p2.d;
                if ((i16 > 0 && i13 <= i15) || (i16 < 0 && i15 <= i13)) {
                    while (true) {
                        i11++;
                        int i17 = i13 + 8 <= i4 ? 8 : i4 - i13;
                        int i18 = (i8 * i4) + i13;
                        double b2 = b(bArr3, i18, i4, i17, i12);
                        double b3 = b(bArr2, i18, i4, i17, i12);
                        int i19 = i14;
                        double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        double d4 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        double d5 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        while (i19 < i12) {
                            int i20 = i14;
                            while (i20 < i17) {
                                int a2 = rqi.a(i19, i4, i20, i18);
                                double d6 = (bArr[a2] & 255) - b2;
                                double d7 = (bArr2[a2] & 255) - b3;
                                d3 = (d6 * d6) + d3;
                                d4 = (d7 * d7) + d4;
                                d5 = (d7 * d6) + d5;
                                i20++;
                                i4 = i;
                                i19 = i19;
                            }
                            i19++;
                            i4 = i;
                        }
                        double d8 = (i17 * i12) - 1;
                        double d9 = d3 / d8;
                        double d10 = d4 / d8;
                        double d11 = d5 / d8;
                        double[] dArr = new double[3];
                        dArr[i14] = d9;
                        dArr[1] = d10;
                        dArr[2] = d11;
                        double d12 = dArr[i14];
                        double d13 = dArr[1];
                        double d14 = dArr[2];
                        double d15 = 2;
                        double d16 = a;
                        double d17 = (d15 * b2 * b3) + d16;
                        double d18 = d15 * d14;
                        double d19 = b;
                        d2 += ((d18 + d19) * d17) / (((d12 + d13) + d19) * (((b3 * b3) + (b2 * b2)) + d16));
                        if (i13 == i15) {
                            break;
                        }
                        i13 += i16;
                        i4 = i;
                        bArr3 = bArr;
                    }
                }
                if (i8 == i9) {
                    break;
                }
                i8 += i10;
                i4 = i;
                i5 = i2;
                bArr3 = bArr;
                i6 = i14;
                i7 = 16;
            }
            i3 = i11;
            d = d2;
        }
        if (i3 == 0) {
            return 1.0d;
        }
        return d / i3;
    }

    public static double b(byte[] bArr, int i, int i2, int i3, int i4) {
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                d += bArr[rqi.a(i5, i2, i6, i)] & 255;
            }
        }
        return d / (i3 * i4);
    }
}
