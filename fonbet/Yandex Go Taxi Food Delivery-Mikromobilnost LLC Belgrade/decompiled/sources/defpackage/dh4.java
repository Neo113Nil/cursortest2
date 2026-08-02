package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldh4;", "Lj530;", "Luh4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class dh4 extends j530 {
    public final long a;
    public final ml6 b;
    public final float c;
    public final ehr0 w;
    public final tls x;

    public dh4(long j, ml6 ml6Var, ehr0 ehr0Var, tls tlsVar, int i) {
        j = (i & 1) != 0 ? ldc.m : j;
        ml6Var = (i & 2) != 0 ? null : ml6Var;
        this.a = j;
        this.b = ml6Var;
        this.c = 1.0f;
        this.w = ehr0Var;
        this.x = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        uh4 uh4Var = new uh4();
        uh4Var.a = this.a;
        uh4Var.b = this.b;
        uh4Var.c = this.c;
        uh4Var.w = this.w;
        uh4Var.x = 9205357640488583168L;
        return uh4Var;
    }

    public final boolean equals(Object obj) {
        dh4 dh4Var = obj instanceof dh4 ? (dh4) obj : null;
        return dh4Var != null && ldc.c(this.a, dh4Var.a) && jl40.l(this.b, dh4Var.b) && this.c == dh4Var.c && jl40.l(this.w, dh4Var.w);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        uh4 uh4Var = (uh4) e530Var;
        uh4Var.a = this.a;
        uh4Var.b = this.b;
        uh4Var.c = this.c;
        ehr0 ehr0Var = uh4Var.w;
        ehr0 ehr0Var2 = this.w;
        if (!jl40.l(ehr0Var, ehr0Var2)) {
            uh4Var.w = ehr0Var2;
            qje.P(uh4Var).D();
        }
        rzo.D(uh4Var);
    }

    public final int hashCode() {
        int i = ldc.n;
        int hashCode = Long.hashCode(this.a) * 31;
        ml6 ml6Var = this.b;
        return this.w.hashCode() + g8e.c(this.c, (hashCode + (ml6Var != null ? ml6Var.hashCode() : 0)) * 31, 31);
    }
}
