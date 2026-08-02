package xsna;

import java.io.IOException;

/* compiled from: JpegExtractor.java */
/* loaded from: classes12.dex */
public final class v0y implements pgq {
    public final pgq a;

    public v0y(int i) {
        if ((i & 1) != 0) {
            this.a = new uvj0(65496, 2, "image/jpeg");
        } else {
            this.a = new x0y();
        }
    }

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
    public final void release() {
        this.a.release();
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.a.seek(j, j2);
    }
}
