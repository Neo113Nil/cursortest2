package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lflz0;", "Lj530;", "Lglz0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class flz0 extends j530 {
    public final boolean a;
    public final zx40 b;
    public final prv c;
    public final boolean w;
    public final boolean x;
    public final awk0 y;
    public final tls z;

    public flz0(boolean z, zx40 zx40Var, prv prvVar, boolean z2, boolean z3, awk0 awk0Var, tls tlsVar) {
        this.a = z;
        this.b = zx40Var;
        this.c = prvVar;
        this.w = z2;
        this.x = z3;
        this.y = awk0Var;
        this.z = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new glz0(this.a, this.b, this.c, this.w, this.x, this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || flz0.class != obj.getClass()) {
            return false;
        }
        flz0 flz0Var = (flz0) obj;
        return this.a == flz0Var.a && jl40.l(this.b, flz0Var.b) && jl40.l(this.c, flz0Var.c) && this.w == flz0Var.w && this.x == flz0Var.x && jl40.l(this.y, flz0Var.y) && this.z == flz0Var.z;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        glz0 glz0Var = (glz0) e530Var;
        boolean z = glz0Var.S;
        boolean z2 = this.a;
        if (z != z2) {
            glz0Var.S = z2;
            qje.P(glz0Var).D();
        }
        glz0Var.T = this.z;
        glz0Var.S0(this.b, this.c, this.w, this.x, null, this.y, glz0Var.U);
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
