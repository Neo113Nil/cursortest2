package defpackage;

/* loaded from: classes2.dex */
public final class o2j0 implements q2j0 {
    public final n2j0 a;

    public o2j0(n2j0 n2j0Var) {
        this.a = n2j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2j0) && jl40.l(this.a, ((o2j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Form(formInfo=" + this.a + ')';
    }
}
