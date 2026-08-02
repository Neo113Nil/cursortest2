package defpackage;

/* loaded from: classes2.dex */
public final class e1u0 implements za70 {
    public final g1u0 a;

    public e1u0(g1u0 g1u0Var) {
        this.a = g1u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1u0) && this.a.equals(((e1u0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(invoice=" + this.a + ')';
    }
}
