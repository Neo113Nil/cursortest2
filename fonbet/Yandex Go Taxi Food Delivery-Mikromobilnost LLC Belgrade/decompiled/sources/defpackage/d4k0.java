package defpackage;

/* loaded from: classes2.dex */
public final class d4k0 {
    public final String a;
    public final jec b;

    public d4k0(String str, jec jecVar) {
        this.a = str;
        this.b = jecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4k0)) {
            return false;
        }
        d4k0 d4k0Var = (d4k0) obj;
        return this.a.equals(d4k0Var.a) && this.b.equals(d4k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Light(__typename=" + this.a + ", colorFields=" + this.b + ')';
    }
}
