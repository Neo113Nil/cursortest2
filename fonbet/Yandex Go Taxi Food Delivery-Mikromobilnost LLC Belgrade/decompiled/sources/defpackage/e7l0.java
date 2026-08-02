package defpackage;

/* loaded from: classes9.dex */
public final class e7l0 {
    public final f7l0 a;
    public final f7l0 b;
    public final Throwable c;

    public /* synthetic */ e7l0(f7l0 f7l0Var, k4e k4eVar, Throwable th, int i) {
        this(f7l0Var, (i & 2) != 0 ? null : k4eVar, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7l0)) {
            return false;
        }
        e7l0 e7l0Var = (e7l0) obj;
        return jl40.l(this.a, e7l0Var.a) && jl40.l(this.b, e7l0Var.b) && jl40.l(this.c, e7l0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f7l0 f7l0Var = this.b;
        int hashCode2 = (hashCode + (f7l0Var == null ? 0 : f7l0Var.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectResult(plan=");
        sb.append(this.a);
        sb.append(", nextPlan=");
        sb.append(this.b);
        sb.append(", throwable=");
        return unr0.s(sb, this.c, ')');
    }

    public e7l0(f7l0 f7l0Var, f7l0 f7l0Var2, Throwable th) {
        this.a = f7l0Var;
        this.b = f7l0Var2;
        this.c = th;
    }
}
