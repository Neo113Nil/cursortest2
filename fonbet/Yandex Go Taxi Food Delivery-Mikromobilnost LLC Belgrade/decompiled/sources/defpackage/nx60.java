package defpackage;

/* loaded from: classes.dex */
public final class nx60 extends n750 {
    public final mx60 a;
    public final pey b;

    public nx60(pey peyVar, mx60 mx60Var) {
        this.a = mx60Var;
        this.b = peyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx60)) {
            return false;
        }
        nx60 nx60Var = (nx60) obj;
        return jl40.l(this.a, nx60Var.a) && jl40.l(this.b, nx60Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pey peyVar = this.b;
        return hashCode + (peyVar == null ? 0 : peyVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
