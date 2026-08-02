package xsna;

import xsna.rkj0;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public final class esx0 extends d730<rkj0.a> {
    public final gt1 a;

    public esx0(gt1 gt1Var) {
        this.a = gt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        esx0 esx0Var = obj instanceof esx0 ? (esx0) obj : null;
        if (esx0Var == null) {
            return false;
        }
        return epx.f(this.a, esx0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final rkj0.a r() {
        rkj0.a aVar = new rkj0.a();
        aVar.p = this.a;
        return aVar;
    }

    @Override // xsna.d730
    public final void s(rkj0.a aVar) {
        aVar.p = this.a;
    }
}
