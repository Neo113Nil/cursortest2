package defpackage;

/* loaded from: classes8.dex */
public final class aqc0 implements za70 {
    public final bqc0 a;

    public aqc0(bqc0 bqc0Var) {
        this.a = bqc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqc0) && jl40.l(this.a, ((aqc0) obj).a);
    }

    public final int hashCode() {
        bqc0 bqc0Var = this.a;
        if (bqc0Var == null) {
            return 0;
        }
        return bqc0Var.hashCode();
    }

    public final String toString() {
        return "Data(plaque=" + this.a + ')';
    }
}
