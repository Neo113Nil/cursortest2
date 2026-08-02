package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcfq0;", "Lj530;", "Lffq0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class cfq0 extends j530 {
    public final boolean a;
    public final zx40 b;
    public final prv c;
    public final boolean w;
    public final boolean x;
    public final awk0 y;
    public final sls z;

    public cfq0(boolean z, zx40 zx40Var, prv prvVar, boolean z2, boolean z3, awk0 awk0Var, sls slsVar) {
        this.a = z;
        this.b = zx40Var;
        this.c = prvVar;
        this.w = z2;
        this.x = z3;
        this.y = awk0Var;
        this.z = slsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        ffq0 ffq0Var = new ffq0(this.b, this.c, this.w, this.x, null, this.y, this.z);
        ffq0Var.S = this.a;
        return ffq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cfq0.class != obj.getClass()) {
            return false;
        }
        cfq0 cfq0Var = (cfq0) obj;
        return this.a == cfq0Var.a && jl40.l(this.b, cfq0Var.b) && jl40.l(this.c, cfq0Var.c) && this.w == cfq0Var.w && this.x == cfq0Var.x && jl40.l(this.y, cfq0Var.y) && this.z == cfq0Var.z;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ffq0 ffq0Var = (ffq0) e530Var;
        boolean z = ffq0Var.S;
        boolean z2 = this.a;
        if (z != z2) {
            ffq0Var.S = z2;
            qje.P(ffq0Var).D();
        }
        ffq0Var.S0(this.b, this.c, this.w, this.x, null, this.y, this.z);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        zx40 zx40Var = this.b;
        int hashCode2 = (hashCode + (zx40Var != null ? zx40Var.hashCode() : 0)) * 31;
        prv prvVar = this.c;
        int e = unr0.e(unr0.e((hashCode2 + (prvVar != null ? prvVar.hashCode() : 0)) * 31, 31, this.w), 31, this.x);
        awk0 awk0Var = this.y;
        return this.z.hashCode() + ((e + (awk0Var != null ? Integer.hashCode(awk0Var.a) : 0)) * 31);
    }
}
