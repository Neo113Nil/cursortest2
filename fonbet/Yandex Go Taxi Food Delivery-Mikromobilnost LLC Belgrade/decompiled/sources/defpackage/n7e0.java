package defpackage;

/* loaded from: classes2.dex */
public final class n7e0 implements za70 {
    public final l7e0 a;
    public final m7e0 b;

    public n7e0(l7e0 l7e0Var, m7e0 m7e0Var) {
        this.a = l7e0Var;
        this.b = m7e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7e0)) {
            return false;
        }
        n7e0 n7e0Var = (n7e0) obj;
        return this.a.equals(n7e0Var.a) && this.b.equals(n7e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(configuration=" + this.a + ", darkConfiguration=" + this.b + ')';
    }
}
