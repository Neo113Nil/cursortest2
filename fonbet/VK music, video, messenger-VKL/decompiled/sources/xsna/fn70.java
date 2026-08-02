package xsna;

import org.chromium.net.NetError;

/* compiled from: NumberOutput.java */
/* loaded from: classes12.dex */
public final class fn70 {
    public static final String a = String.valueOf(Integer.MIN_VALUE);
    public static final String b = String.valueOf(Long.MIN_VALUE);
    public static final int[] c = new int[1000];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    c[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
    }

    public static int a(int i, int i2, byte[] bArr) {
        int i3 = c[i];
        bArr[i2] = (byte) (i3 >> 16);
        int i4 = i2 + 2;
        bArr[i2 + 1] = (byte) (i3 >> 8);
        int i5 = i2 + 3;
        bArr[i4] = (byte) i3;
        return i5;
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3 = c[i];
        cArr[i2] = (char) (i3 >> 16);
        int i4 = i2 + 2;
        cArr[i2 + 1] = (char) ((i3 >> 8) & 127);
        int i5 = i2 + 3;
        cArr[i4] = (char) (i3 & 127);
        return i5;
    }

    public static int c(int i, int i2, byte[] bArr) {
        int i3 = c[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    public static int d(char[] cArr, int i, int i2) {
        int i3 = c[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    public static int e(int i, int i2, byte[] bArr) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = c;
        int i7 = iArr[i5];
        bArr[i2] = (byte) (i7 >> 16);
        bArr[i2 + 1] = (byte) (i7 >> 8);
        bArr[i2 + 2] = (byte) i7;
        int i8 = iArr[i6];
        bArr[i2 + 3] = (byte) (i8 >> 16);
        bArr[i2 + 4] = (byte) (i8 >> 8);
        bArr[i2 + 5] = (byte) i8;
        int i9 = iArr[i4];
        bArr[i2 + 6] = (byte) (i9 >> 16);
        int i10 = i2 + 8;
        bArr[i2 + 7] = (byte) (i9 >> 8);
        int i11 = i2 + 9;
        bArr[i10] = (byte) i9;
        return i11;
    }

    public static int f(char[] cArr, int i, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = c;
        int i6 = iArr[i5];
        cArr[i2] = (char) (i6 >> 16);
        cArr[i2 + 1] = (char) ((i6 >> 8) & 127);
        cArr[i2 + 2] = (char) (i6 & 127);
        int i7 = iArr[i3 - (i5 * 1000)];
        cArr[i2 + 3] = (char) (i7 >> 16);
        cArr[i2 + 4] = (char) ((i7 >> 8) & 127);
        cArr[i2 + 5] = (char) (i7 & 127);
        int i8 = iArr[i4];
        cArr[i2 + 6] = (char) (i8 >> 16);
        int i9 = i2 + 8;
        cArr[i2 + 7] = (char) ((i8 >> 8) & 127);
        int i10 = i2 + 9;
        cArr[i9] = (char) (i8 & 127);
        return i10;
    }

    public static int g(int i, int i2, byte[] bArr) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = a;
                int length = str.length();
                int i4 = 0;
                while (i4 < length) {
                    bArr[i2] = (byte) str.charAt(i4);
                    i4++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i5 = i / 1000;
                return a(i - (i5 * 1000), c(i5, i2, bArr), bArr);
            }
            if (i >= 10) {
                return c(i, i2, bArr);
            }
            int i6 = i2 + 1;
            bArr[i2] = (byte) (i + 48);
            return i6;
        }
        if (i < 1000000000) {
            int i7 = i / 1000;
            int i8 = i7 / 1000;
            return a(i - (i7 * 1000), a(i7 - (i8 * 1000), c(i8, i2, bArr), bArr), bArr);
        }
        int i9 = i - 1000000000;
        if (i9 >= 1000000000) {
            i9 = i - 2000000000;
            i3 = i2 + 1;
            bArr[i2] = 50;
        } else {
            i3 = i2 + 1;
            bArr[i2] = 49;
        }
        return e(i9, i3, bArr);
    }

    public static int h(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = a;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return length + i2;
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return b(cArr, i - (i4 * 1000), d(cArr, i4, i2));
            }
            if (i >= 10) {
                return d(cArr, i, i2);
            }
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
        if (i < 1000000000) {
            int i5 = i / 1000;
            int i6 = i5 / 1000;
            return b(cArr, i - (i5 * 1000), b(cArr, i5 - (i6 * 1000), d(cArr, i6, i2)));
        }
        int i7 = i - 1000000000;
        if (i7 >= 1000000000) {
            i7 = i - 2000000000;
            i3 = i2 + 1;
            cArr[i2] = '2';
        } else {
            i3 = i2 + 1;
            cArr[i2] = '1';
        }
        return f(cArr, i7, i3);
    }

    public static int i(int i, byte[] bArr, long j) {
        int e;
        if (j < 0) {
            if (j > -2147483648L) {
                return g((int) j, i, bArr);
            }
            if (j == Long.MIN_VALUE) {
                String str = b;
                int length = str.length();
                int i2 = 0;
                while (i2 < length) {
                    bArr[i] = (byte) str.charAt(i2);
                    i2++;
                    i++;
                }
                return i;
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return g((int) j, i, bArr);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i3 = (int) j2;
            int[] iArr = c;
            if (i3 >= 1000000) {
                int i4 = i3 / 1000;
                int i5 = i3 - (i4 * 1000);
                int i6 = i4 / 1000;
                int c2 = c(i6, i, bArr);
                int i7 = iArr[i4 - (i6 * 1000)];
                bArr[c2] = (byte) (i7 >> 16);
                bArr[c2 + 1] = (byte) (i7 >> 8);
                bArr[c2 + 2] = (byte) i7;
                int i8 = iArr[i5];
                bArr[c2 + 3] = (byte) (i8 >> 16);
                int i9 = c2 + 5;
                bArr[c2 + 4] = (byte) (i8 >> 8);
                e = c2 + 6;
                bArr[i9] = (byte) i8;
            } else if (i3 < 1000) {
                e = c(i3, i, bArr);
            } else {
                int i10 = i3 / 1000;
                int i11 = i3 - (i10 * 1000);
                int i12 = iArr[i10];
                if (i10 > 9) {
                    if (i10 > 99) {
                        bArr[i] = (byte) (i12 >> 16);
                        i++;
                    }
                    bArr[i] = (byte) (i12 >> 8);
                    i++;
                }
                bArr[i] = (byte) i12;
                int i13 = iArr[i11];
                bArr[i + 1] = (byte) (i13 >> 16);
                int i14 = i + 3;
                bArr[i + 2] = (byte) (i13 >> 8);
                e = i + 4;
                bArr[i14] = (byte) i13;
            }
        } else {
            long j4 = j2 / 1000000000;
            int c3 = c((int) j4, i, bArr);
            e = e((int) (j2 - (1000000000 * j4)), c3, bArr);
        }
        return e((int) j3, e, bArr);
    }

    public static int j(long j, char[] cArr, int i) {
        int f;
        if (j < 0) {
            if (j > -2147483648L) {
                return h(cArr, (int) j, i);
            }
            if (j == Long.MIN_VALUE) {
                String str = b;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return length + i;
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return h(cArr, (int) j, i);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i2 = (int) j2;
            int[] iArr = c;
            if (i2 >= 1000000) {
                int i3 = i2 / 1000;
                int i4 = i2 - (i3 * 1000);
                int i5 = i3 / 1000;
                int d = d(cArr, i5, i);
                int i6 = iArr[i3 - (i5 * 1000)];
                cArr[d] = (char) (i6 >> 16);
                cArr[d + 1] = (char) ((i6 >> 8) & 127);
                cArr[d + 2] = (char) (i6 & 127);
                int i7 = iArr[i4];
                cArr[d + 3] = (char) (i7 >> 16);
                int i8 = d + 5;
                cArr[d + 4] = (char) ((i7 >> 8) & 127);
                f = d + 6;
                cArr[i8] = (char) (i7 & 127);
            } else if (i2 < 1000) {
                f = d(cArr, i2, i);
            } else {
                int i9 = i2 / 1000;
                int i10 = i2 - (i9 * 1000);
                int i11 = iArr[i9];
                if (i9 > 9) {
                    if (i9 > 99) {
                        cArr[i] = (char) (i11 >> 16);
                        i++;
                    }
                    cArr[i] = (char) ((i11 >> 8) & 127);
                    i++;
                }
                cArr[i] = (char) (i11 & 127);
                int i12 = iArr[i10];
                cArr[i + 1] = (char) (i12 >> 16);
                int i13 = i + 3;
                cArr[i + 2] = (char) ((i12 >> 8) & 127);
                f = i + 4;
                cArr[i13] = (char) (i12 & 127);
            }
        } else {
            long j4 = j2 / 1000000000;
            int d2 = d(cArr, (int) j4, i);
            f = f(cArr, (int) (j2 - (1000000000 * j4)), d2);
        }
        return f(cArr, (int) j3, f);
    }

    public static String k(double d, boolean z) {
        char c2;
        if (!z) {
            return Double.toString(d);
        }
        j7o j7oVar = new j7o();
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        long j = 4503599627370495L & doubleToRawLongBits;
        int i = ((int) (doubleToRawLongBits >>> 52)) & 2047;
        if (i < 2047) {
            j7oVar.b = -1;
            if (doubleToRawLongBits < 0) {
                j7oVar.a(45);
            }
            if (i != 0) {
                int i2 = 1075 - i;
                long j2 = j | 4503599627370496L;
                if ((i2 > 0) & (i2 < 53)) {
                    long j3 = j2 >> i2;
                    if ((j3 << i2) == j2) {
                        j7oVar.f(0, j3);
                    }
                }
                j7oVar.g(-i2, 0, j2);
            } else if (j == 0) {
                c2 = doubleToRawLongBits == 0 ? (char) 1 : (char) 2;
            } else if (j < 3) {
                j7oVar.g(-1074, -1, j * 10);
            } else {
                j7oVar.g(-1074, 0, j);
            }
            c2 = 0;
        } else {
            c2 = j != 0 ? (char) 5 : doubleToRawLongBits > 0 ? (char) 3 : (char) 4;
        }
        if (c2 != 0) {
            return c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0";
        }
        return new String(j7oVar.a, 0, 0, j7oVar.b + 1);
    }

    public static String l(float f, boolean z) {
        char c2;
        if (!z) {
            return Float.toString(f);
        }
        oqr oqrVar = new oqr();
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i = 8388607 & floatToRawIntBits;
        int i2 = (floatToRawIntBits >>> 23) & 255;
        if (i2 < 255) {
            oqrVar.b = -1;
            if (floatToRawIntBits < 0) {
                oqrVar.a(45);
            }
            if (i2 != 0) {
                int i3 = 150 - i2;
                int i4 = i | 8388608;
                if ((i3 > 0) & (i3 < 24)) {
                    int i5 = i4 >> i3;
                    if ((i5 << i3) == i4) {
                        oqrVar.f(i5, 0);
                    }
                }
                oqrVar.g(-i3, i4, 0);
            } else if (i == 0) {
                c2 = floatToRawIntBits == 0 ? (char) 1 : (char) 2;
            } else if (i < 8) {
                oqrVar.g(NetError.ERR_SSL_BAD_PEER_PUBLIC_KEY, i * 10, -1);
            } else {
                oqrVar.g(NetError.ERR_SSL_BAD_PEER_PUBLIC_KEY, i, 0);
            }
            c2 = 0;
        } else {
            c2 = i != 0 ? (char) 5 : floatToRawIntBits > 0 ? (char) 3 : (char) 4;
        }
        if (c2 != 0) {
            return c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0";
        }
        return new String(oqrVar.a, 0, 0, oqrVar.b + 1);
    }
}
