package xsna;

import com.facebook.soloader.MinElf;
import java.util.Arrays;

/* compiled from: OtelEncodingUtils.java */
/* loaded from: classes11.dex */
public final class oz80 {
    public static final char[] a;
    public static final byte[] b;
    public static final boolean[] c;

    static {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr["0123456789abcdef".charAt(i2)] = (byte) i2;
        }
        b = bArr;
        boolean[] zArr = new boolean[MinElf.PN_XNUM];
        int i3 = 48;
        while (i3 < 103) {
            zArr[i3] = i3 <= 57 || 97 <= i3;
            i3++;
        }
        c = zArr;
    }

    public static byte a(char c2, char c3) {
        byte[] bArr;
        byte b2;
        byte b3;
        if (c2 >= 128 || (b2 = (bArr = b)[c2]) == -1) {
            throw new IllegalArgumentException("invalid character " + c2);
        }
        if (c3 < 128 && (b3 = bArr[c3]) != -1) {
            return (byte) (b3 | (b2 << 4));
        }
        throw new IllegalArgumentException("invalid character " + c3);
    }

    public static void b(byte b2, char[] cArr, int i) {
        int i2 = b2 & 255;
        char[] cArr2 = a;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | 256];
    }

    public static void c(long j, char[] cArr, int i) {
        b((byte) ((j >> 56) & 255), cArr, i);
        b((byte) ((j >> 48) & 255), cArr, i + 2);
        b((byte) ((j >> 40) & 255), cArr, i + 4);
        b((byte) ((j >> 32) & 255), cArr, i + 6);
        b((byte) ((j >> 24) & 255), cArr, i + 8);
        b((byte) ((j >> 16) & 255), cArr, i + 10);
        b((byte) ((j >> 8) & 255), cArr, i + 12);
        b((byte) (j & 255), cArr, i + 14);
    }
}
