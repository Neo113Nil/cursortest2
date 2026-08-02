package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class ew4 {
    public static final Charset a = Charset.forName("UTF-8");

    public static byte[] a(int i, String str) {
        byte[] bytes = str.getBytes(a);
        int length = bytes.length;
        zv4 zv4Var = new zv4(i, new byte[(length * 3) / 4]);
        if (!zv4Var.D(length, bytes)) {
            ny61.g("bad base-64");
            return null;
        }
        int i2 = zv4Var.a;
        byte[] bArr = (byte[]) zv4Var.b;
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    public static byte[] b(int i, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        boolean z = (i & 1) == 0;
        byte[] bArr2 = (i & 8) == 0 ? bw4.c : bw4.d;
        int i3 = (length / 3) * 4;
        if (!z) {
            int i4 = length % 3;
            if (i4 == 1) {
                i3 += 2;
            } else if (i4 == 2) {
                i3 += 3;
            }
        } else if (length % 3 > 0) {
            i3 += 4;
        }
        byte[] bArr3 = new byte[i3];
        int i5 = 0;
        int i6 = -1;
        while (true) {
            int i7 = i2 + 3;
            if (i7 > length) {
                break;
            }
            int i8 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i5] = bArr2[(i8 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(i8 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(i8 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[i8 & 63];
            int i9 = i5 + 4;
            i6--;
            if (i6 == 0) {
                i5 += 5;
                bArr3[i9] = 10;
                i6 = 19;
            } else {
                i5 = i9;
            }
            i2 = i7;
        }
        if (i2 == length - 1) {
            int i10 = (bArr[i2] & 255) << 4;
            bArr3[i5] = bArr2[(i10 >> 6) & 63];
            int i11 = i5 + 2;
            bArr3[i5 + 1] = bArr2[i10 & 63];
            if (z) {
                bArr3[i11] = 61;
                bArr3[i5 + 3] = 61;
                return bArr3;
            }
        } else if (i2 == length - 2) {
            int i12 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr3[i5] = bArr2[(i12 >> 12) & 63];
            int i13 = i5 + 2;
            bArr3[i5 + 1] = bArr2[(i12 >> 6) & 63];
            int i14 = i5 + 3;
            bArr3[i13] = bArr2[i12 & 63];
            if (z) {
                bArr3[i14] = 61;
            }
        }
        return bArr3;
    }

    public static String c(int i, byte[] bArr) {
        try {
            return new String(b(i, bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            ny61.f(e);
            return null;
        }
    }
}
