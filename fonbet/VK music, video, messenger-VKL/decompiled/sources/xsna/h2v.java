package xsna;

/* compiled from: HexExtensions.kt */
/* loaded from: classes8.dex */
public final class h2v {
    public static final int[] a;
    public static final long[] b;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 16) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < 16) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 16) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < 16) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        b = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) oxp0.a(j)));
    }

    public static final int b(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final int c(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String d(int i) {
        if (i2v.c.b.a) {
            return new String(new char[]{"0123456789abcdef".charAt((i >> 28) & 15), "0123456789abcdef".charAt((i >> 24) & 15), "0123456789abcdef".charAt((i >> 20) & 15), "0123456789abcdef".charAt((i >> 16) & 15), "0123456789abcdef".charAt((i >> 12) & 15), "0123456789abcdef".charAt((i >> 8) & 15), "0123456789abcdef".charAt((i >> 4) & 15), "0123456789abcdef".charAt(i & 15)});
        }
        long j = i;
        long j2 = 0;
        int a2 = a(j2 + j2 + 8 + j2);
        char[] cArr = new char[a2];
        int c = c("", cArr, 0);
        int i2 = 32;
        int i3 = 0;
        while (i3 < 8) {
            i2 -= 4;
            cArr[c] = "0123456789abcdef".charAt((int) ((j >> i2) & 15));
            i3++;
            c++;
        }
        int c2 = c("", cArr, c);
        return c2 == a2 ? new String(cArr) : brm0.q(cArr, 0, c2);
    }
}
