package xsna;

import xsna.siw;

/* compiled from: FrescoSvgFormatChecker.kt */
/* loaded from: classes.dex */
public final class khs implements siw.a {
    public static final int a = "<svg".getBytes(emb.c).length;
    public static final byte[] b = a75.b("<svg");
    public static final byte[] c = a75.b("<?xm");

    @Override // xsna.siw.a
    public final siw a(int i, byte[] bArr) {
        return (a75.d(bArr, b, 0) || a75.d(bArr, c, 0)) ? ecl.b : siw.c;
    }

    @Override // xsna.siw.a
    public final int b() {
        return a;
    }
}
