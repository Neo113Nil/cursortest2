package defpackage;

import okio.ByteString;

/* loaded from: classes10.dex */
public abstract class kgt {
    public static final ByteString a = cvw.u("GIF87a");
    public static final ByteString b = cvw.u("GIF89a");
    public static final ByteString c = cvw.u("RIFF");
    public static final ByteString d = cvw.u("WEBP");
    public static final ByteString e = cvw.u("VP8X");
    public static final ByteString f = cvw.u("ftyp");
    public static final ByteString g = cvw.u("msf1");
    public static final ByteString h = cvw.u("hevc");
    public static final ByteString i = cvw.u("hevx");

    public static final boolean a(qq6 qq6Var) {
        if (qq6Var.Q(4L, f)) {
            return qq6Var.Q(8L, g) || qq6Var.Q(8L, h) || qq6Var.Q(8L, i);
        }
        return false;
    }

    public static final boolean b(qq6 qq6Var) {
        return qq6Var.Q(0L, c) && qq6Var.Q(8L, d) && qq6Var.Q(12L, e) && qq6Var.S(17L) && ((byte) (qq6Var.h().e(16L) & 2)) > 0;
    }

    public static final boolean c(qq6 qq6Var) {
        return qq6Var.Q(0L, b) || qq6Var.Q(0L, a);
    }
}
