package defpackage;

/* loaded from: classes2.dex */
public final class fha0 {
    public final String a;
    public final jec b;

    public fha0(String str, jec jecVar) {
        this.a = str;
        this.b = jecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fha0)) {
            return false;
        }
        fha0 fha0Var = (fha0) obj;
        return this.a.equals(fha0Var.a) && this.b.equals(fha0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Light1(__typename=" + this.a + ", colorFields=" + this.b + ')';
    }
}
