package xsna;

import java.util.List;

/* compiled from: DslConstraintSet.kt */
/* loaded from: classes11.dex */
public final class dno implements g6j {
    public final izs<i6j, s3q0> b;
    public final i6j c;

    public dno() {
        throw null;
    }

    public dno(izs izsVar) {
        this.b = izsVar;
        i6j i6jVar = new i6j(null);
        izsVar.invoke(i6jVar);
        this.c = i6jVar;
    }

    @Override // xsna.g6j
    public void b(ftk0 ftk0Var, List list) {
        this.c.a(ftk0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dno)) {
            return false;
        }
        return epx.f(this.c, ((dno) obj).c);
    }

    public final int hashCode() {
        return this.c.a.hashCode();
    }
}
