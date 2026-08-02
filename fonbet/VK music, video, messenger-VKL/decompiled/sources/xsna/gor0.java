package xsna;

import xsna.dt1;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public final class gor0 extends d730<hor0> {
    public final dt1.c a;

    public gor0(dt1.c cVar) {
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gor0 gor0Var = obj instanceof gor0 ? (gor0) obj : null;
        if (gor0Var == null) {
            return false;
        }
        return epx.f(this.a, gor0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final hor0 r() {
        hor0 hor0Var = new hor0();
        hor0Var.p = this.a;
        return hor0Var;
    }

    @Override // xsna.d730
    public final void s(hor0 hor0Var) {
        hor0Var.p = this.a;
    }
}
