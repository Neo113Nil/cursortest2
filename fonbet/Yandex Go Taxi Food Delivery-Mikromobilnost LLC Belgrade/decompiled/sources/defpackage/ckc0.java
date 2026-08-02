package defpackage;

/* loaded from: classes2.dex */
public final class ckc0 implements ekc0 {
    public final cie0 a;

    public ckc0(cie0 cie0Var) {
        this.a = cie0Var;
    }

    public final cie0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckc0) && jl40.l(this.a, ((ckc0) obj).a);
    }

    public final int hashCode() {
        cie0 cie0Var = this.a;
        if (cie0Var == null) {
            return 0;
        }
        return cie0Var.hashCode();
    }

    public final String toString() {
        return "PrimitiveArg(value=" + this.a + ')';
    }
}
