package xsna;

import java.io.IOException;

/* compiled from: HeifExtractor.java */
/* loaded from: classes12.dex */
public final class r1v implements pgq {
    public final pgq a;
    public final boolean b;

    public r1v(int i) {
        boolean z = (i & 1) != 0;
        this.b = z;
        if (z) {
            this.a = new uvj0(-1, -1, "image/heif");
        } else {
            this.a = new q1v();
        }
    }

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        return this.a.b(qgqVar, pzb0Var);
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        return this.b ? s1v.t((tel) qgqVar, false) : this.a.d(qgqVar);
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
