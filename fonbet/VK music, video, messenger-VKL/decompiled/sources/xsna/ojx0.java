package xsna;

import java.io.IOException;

/* compiled from: WebpExtractor.java */
/* loaded from: classes12.dex */
public final class ojx0 implements pgq {
    public final xi90 a = new xi90(4);
    public final uvj0 b = new uvj0(-1, -1, "image/webp");

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        return this.b.b(qgqVar, pzb0Var);
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        xi90 xi90Var = this.a;
        xi90Var.M(4);
        tel telVar = (tel) qgqVar;
        telVar.peekFully(xi90Var.a, 0, 4, false);
        if (xi90Var.E() == 1380533830) {
            telVar.b(4, false);
            xi90Var.M(4);
            telVar.peekFully(xi90Var.a, 0, 4, false);
            if (xi90Var.E() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.b.e(rgqVar);
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.b.seek(j, j2);
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
