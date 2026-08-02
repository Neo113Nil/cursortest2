package xsna;

import java.util.Collection;

/* compiled from: DialogsFoldersCountersChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class bqm extends e500 {
    public final Collection<spm> c;
    public final w2w d;

    public bqm(Collection<spm> collection, w2w w2wVar) {
        super("DialogsFoldersCountersChangeLpTask");
        this.c = collection;
        this.d = w2wVar;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.H.addAll(this.c);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        new dqm(this.c).o(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqm)) {
            return false;
        }
        bqm bqmVar = (bqm) obj;
        return epx.f(this.c, bqmVar.c) && epx.f(this.d, bqmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DialogsFoldersCountersChangeLpTask(models=" + this.c + ", env=" + this.d + ')';
    }
}
