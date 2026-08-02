package defpackage;

/* loaded from: classes2.dex */
public final class f1u0 {
    public final String a;
    public final lxw b;

    public f1u0(String str, lxw lxwVar) {
        this.a = str;
        this.b = lxwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1u0)) {
            return false;
        }
        f1u0 f1u0Var = (f1u0) obj;
        return this.a.equals(f1u0Var.a) && this.b.equals(f1u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalStart(__typename=" + this.a + ", invoice=" + this.b + ')';
    }
}
