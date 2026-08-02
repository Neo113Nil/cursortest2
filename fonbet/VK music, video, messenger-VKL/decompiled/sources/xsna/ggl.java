package xsna;

import com.coremedia.iso.boxes.FileTypeBox;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.siw;

/* compiled from: DefaultImageFormatChecker.kt */
/* loaded from: classes.dex */
public final class ggl implements siw.a {
    public static final byte[] b = {-1, -40, -1};
    public static final int c = 3;
    public static final byte[] d = {-119, 80, 78, 71, AmfConstants.TYPE_UNSUPPORTED_MARKER, 10, 26, 10};
    public static final int e = 8;
    public static final byte[] f = a75.b("GIF87a");
    public static final byte[] g = a75.b("GIF89a");
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;
    public static final int k;
    public static final byte[] l;
    public static final byte[][] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final int p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public final int a;

    static {
        byte[] b2 = a75.b("BM");
        h = b2;
        i = b2.length;
        j = new byte[]{0, 0, 1, 0};
        k = 4;
        l = a75.b(FileTypeBox.TYPE);
        m = new byte[][]{a75.b("heic"), a75.b("heix"), a75.b("hevc"), a75.b("hevx"), a75.b("mif1"), a75.b("msf1")};
        n = new byte[]{73, 73, 42, 0};
        o = new byte[]{77, 77, 0, 42};
        p = 4;
        q = new byte[]{3, 0, 8, 0};
        r = a75.b(FileTypeBox.TYPE);
        s = a75.b("avif");
    }

    public ggl() {
        Object d0 = rl3.d0(new Integer[]{21, 20, Integer.valueOf(c), Integer.valueOf(e), 6, Integer.valueOf(i), Integer.valueOf(k), 12, 4, 12});
        if (d0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = ((Number) d0).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    @Override // xsna.siw.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final siw a(int i2, byte[] bArr) {
        boolean z;
        boolean z2;
        if (!pjx0.g(i2, bArr)) {
            boolean z3 = false;
            if (i2 >= 3 && a75.d(bArr, b, 0)) {
                return hgl.a;
            }
            if (i2 >= 8 && a75.d(bArr, d, 0)) {
                return hgl.b;
            }
            if (i2 >= 6 && (a75.d(bArr, f, 0) || a75.d(bArr, g, 0))) {
                return hgl.c;
            }
            byte[] bArr2 = h;
            if (i2 < bArr2.length ? false : a75.d(bArr, bArr2, 0)) {
                return hgl.d;
            }
            byte[] bArr3 = j;
            if (i2 < bArr3.length ? false : a75.d(bArr, bArr3, 0)) {
                return hgl.e;
            }
            if (i2 >= 12) {
                if ((bArr.length < 4 ? -1 : ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) >= 8 && a75.d(bArr, r, 4)) {
                    z = a75.d(bArr, s, 8);
                    if (!z) {
                        return hgl.n;
                    }
                    if (i2 >= 12 && bArr[3] >= 8 && a75.d(bArr, l, 4)) {
                        for (byte[] bArr4 : m) {
                            if (a75.d(bArr, bArr4, 8)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        return hgl.k;
                    }
                    if (i2 >= 4 && a75.d(bArr, q, 0)) {
                        return hgl.m;
                    }
                    if (i2 >= p && (a75.d(bArr, n, 0) || a75.d(bArr, o, 0))) {
                        z3 = true;
                    }
                    if (z3) {
                        return hgl.l;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        } else {
            if (!pjx0.g(i2, bArr)) {
                throw new IllegalStateException("Check failed.");
            }
            if (pjx0.f(bArr)) {
                return hgl.f;
            }
            if (pjx0.e(bArr)) {
                return hgl.g;
            }
            if (pjx0.c(i2, bArr)) {
                return pjx0.b(bArr) ? hgl.j : pjx0.d(bArr) ? hgl.i : hgl.h;
            }
        }
        return siw.c;
    }

    @Override // xsna.siw.a
    public final int b() {
        return this.a;
    }
}
