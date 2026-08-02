package xsna;

import xsna.dxj;
import xsna.wpm;

/* compiled from: DialogsFolderDeleteLpTask.kt */
/* loaded from: classes2.dex */
public final class vpm extends e500 {
    public final w2w c;
    public final int d;

    public vpm(int i, w2w w2wVar) {
        super("DialogsFolderDeleteLpTask");
        this.c = w2wVar;
        this.d = i;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.I.add(Integer.valueOf(this.d));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        pdm c = w2wVar.I0().b().c();
        int i = this.d;
        rdm e = c.e(i);
        if (e != null) {
            int i2 = wpm.a.$EnumSwitchMapping$0[e.c.ordinal()];
            if (i2 == 1 || i2 == 2) {
                w2wVar.e1(w2wVar, new dxj.b(w2wVar));
            }
        }
        w2wVar.I0().b().c().a(i);
        s3q0 s3q0Var = s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpm)) {
            return false;
        }
        vpm vpmVar = (vpm) obj;
        return epx.f(this.c, vpmVar.c) && this.d == vpmVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFolderDeleteLpTask(env=");
        sb.append(this.c);
        sb.append(", id=");
        return vu5.b(sb, this.d, ')');
    }
}
