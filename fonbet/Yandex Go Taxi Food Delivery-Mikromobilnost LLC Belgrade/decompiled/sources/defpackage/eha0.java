package defpackage;

/* loaded from: classes2.dex */
public final class eha0 {
    public final gha0 a;
    public final dha0 b;

    public eha0(gha0 gha0Var, dha0 dha0Var) {
        this.a = gha0Var;
        this.b = dha0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eha0)) {
            return false;
        }
        eha0 eha0Var = (eha0) obj;
        return this.a.equals(eha0Var.a) && this.b.equals(eha0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "IconImage(light=" + this.a + ", dark=" + this.b + ')';
    }
}
