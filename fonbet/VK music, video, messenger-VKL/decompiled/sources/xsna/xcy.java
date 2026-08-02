package xsna;

import java.util.List;

/* compiled from: Caching.kt */
/* loaded from: classes8.dex */
public final class xcy implements vcy {
    public final vcy b;

    public xcy(vcy vcyVar) {
        this.b = vcyVar;
    }

    @Override // xsna.vcy
    public final List<wcy> d() {
        return this.b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        xcy xcyVar = obj instanceof xcy ? (xcy) obj : null;
        vcy vcyVar = xcyVar != null ? xcyVar.b : null;
        vcy vcyVar2 = this.b;
        if (!epx.f(vcyVar2, vcyVar)) {
            return false;
        }
        dcy k = vcyVar2.k();
        if (!(k instanceof dcy)) {
            return false;
        }
        vcy vcyVar3 = obj instanceof vcy ? (vcy) obj : null;
        dcy k2 = vcyVar3 != null ? vcyVar3.k() : null;
        if (k2 == null || !(k2 instanceof dcy)) {
            return false;
        }
        return epx.f(((pfc) k).a(), ((pfc) k2).a());
    }

    @Override // xsna.vcy
    public final boolean g() {
        return this.b.g();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.vcy
    public final dcy k() {
        return this.b.k();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.b;
    }
}
