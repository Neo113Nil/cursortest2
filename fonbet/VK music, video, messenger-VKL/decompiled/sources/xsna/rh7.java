package xsna;

import java.io.IOException;

/* compiled from: BmpExtractor.java */
/* loaded from: classes12.dex */
public final class rh7 implements pgq {
    public final uvj0 a = new uvj0(16973, 2, "image/bmp");

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        return this.a.b(qgqVar, pzb0Var);
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        return this.a.d(qgqVar);
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.a.e(rgqVar);
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.a.seek(j, j2);
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
