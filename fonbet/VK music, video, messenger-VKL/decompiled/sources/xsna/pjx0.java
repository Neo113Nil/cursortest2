package xsna;

import java.io.UnsupportedEncodingException;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: WebpSupportStatus.java */
/* loaded from: classes12.dex */
public final class pjx0 {
    public static boolean a = false;
    public static final byte[] b = a("RIFF");
    public static final byte[] c = a("WEBP");
    public static final byte[] d = a("VP8 ");
    public static final byte[] e = a("VP8L");
    public static final byte[] f = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean b(byte[] bArr) {
        return h(bArr, f, 12) && ((bArr[20] & 2) == 2);
    }

    public static boolean c(int i, byte[] bArr) {
        return i >= 21 && h(bArr, f, 12);
    }

    public static boolean d(byte[] bArr) {
        return h(bArr, f, 12) && ((bArr[20] & AmfConstants.TYPE_TYPED_OBJECT_MARKER) == 16);
    }

    public static boolean e(byte[] bArr) {
        return h(bArr, e, 12);
    }

    public static boolean f(byte[] bArr) {
        return h(bArr, d, 12);
    }

    public static boolean g(int i, byte[] bArr) {
        return i >= 20 && h(bArr, b, 0) && h(bArr, c, 8);
    }

    public static boolean h(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 != null && bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2 + i] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }
}
