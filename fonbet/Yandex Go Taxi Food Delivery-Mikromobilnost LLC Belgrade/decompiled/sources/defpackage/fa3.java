package defpackage;

/* loaded from: classes10.dex */
public final class fa3 extends ha3 {
    public final pa90 a;

    public fa3(pa90 pa90Var) {
        this.a = pa90Var;
    }

    @Override // defpackage.ha3
    public final pa90 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa3) && jl40.l(this.a, ((fa3) obj).a);
    }

    public final int hashCode() {
        pa90 pa90Var = this.a;
        if (pa90Var == null) {
            return 0;
        }
        return pa90Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
