package defpackage;

/* loaded from: classes2.dex */
public final class a4k0 {
    public final String a;
    public final jec b;

    public a4k0(String str, jec jecVar) {
        this.a = str;
        this.b = jecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4k0)) {
            return false;
        }
        a4k0 a4k0Var = (a4k0) obj;
        return this.a.equals(a4k0Var.a) && this.b.equals(a4k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Dark(__typename=" + this.a + ", colorFields=" + this.b + ')';
    }
}
