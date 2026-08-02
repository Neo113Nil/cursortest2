package xsna;

import java.util.ArrayList;

/* compiled from: DialogsFoldersReorderLpTask.kt */
/* loaded from: classes2.dex */
public final class nqm extends e500 {
    public final ArrayList c;
    public final w2w d;

    public nqm(ArrayList arrayList, w2w w2wVar) {
        super("DialogsFoldersReorderLpTask");
        this.c = arrayList;
        this.d = w2wVar;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.M = true;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.d.I0().b().c().q(this.c);
        s3q0 s3q0Var = s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqm)) {
            return false;
        }
        nqm nqmVar = (nqm) obj;
        return this.c.equals(nqmVar.c) && epx.f(this.d, nqmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DialogsFoldersReorderLpTask(order=" + this.c + ", env=" + this.d + ')';
    }
}
