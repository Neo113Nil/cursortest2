package defpackage;

/* loaded from: classes10.dex */
public final class ea3 extends ha3 {
    public final pa90 a;
    public final n9o b;

    public ea3(pa90 pa90Var, n9o n9oVar) {
        this.a = pa90Var;
        this.b = n9oVar;
    }

    @Override // defpackage.ha3
    public final pa90 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea3)) {
            return false;
        }
        ea3 ea3Var = (ea3) obj;
        return jl40.l(this.a, ea3Var.a) && this.b.equals(ea3Var.b);
    }

    public final int hashCode() {
        pa90 pa90Var = this.a;
        return this.b.hashCode() + ((pa90Var == null ? 0 : pa90Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}
