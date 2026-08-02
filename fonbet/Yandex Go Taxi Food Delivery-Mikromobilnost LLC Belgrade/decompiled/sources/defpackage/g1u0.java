package defpackage;

/* loaded from: classes2.dex */
public final class g1u0 {
    public final f1u0 a;

    public g1u0(f1u0 f1u0Var) {
        this.a = f1u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1u0) && this.a.equals(((g1u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invoice(externalStart=" + this.a + ')';
    }
}
