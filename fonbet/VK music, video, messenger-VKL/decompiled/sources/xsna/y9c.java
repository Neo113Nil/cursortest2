package xsna;

/* compiled from: ChildParentSemantics.kt */
/* loaded from: classes11.dex */
public final class y9c extends d730<x9c> {
    public final g54 a;

    public y9c(g54 g54Var) {
        this.a = g54Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y9c) {
            return this.a == ((y9c) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final x9c r() {
        x9c x9cVar = new x9c();
        x9cVar.p = this.a;
        return x9cVar;
    }

    @Override // xsna.d730
    public final void s(x9c x9cVar) {
        x9c x9cVar2 = x9cVar;
        x9cVar2.p = this.a;
        itl.f(x9cVar2).R();
    }
}
