package defpackage;

/* loaded from: classes2.dex */
public final class psu0 {
    public final String a;
    public final lsu0 b;
    public final nsu0 c;
    public final msu0 d;
    public final ksu0 e;

    public psu0(String str, lsu0 lsu0Var, nsu0 nsu0Var, msu0 msu0Var, ksu0 ksu0Var) {
        this.a = str;
        this.b = lsu0Var;
        this.c = nsu0Var;
        this.d = msu0Var;
        this.e = ksu0Var;
    }

    public final ksu0 a() {
        return this.e;
    }

    public final lsu0 b() {
        return this.b;
    }

    public final msu0 c() {
        return this.d;
    }

    public final nsu0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psu0)) {
            return false;
        }
        psu0 psu0Var = (psu0) obj;
        return jl40.l(this.a, psu0Var.a) && jl40.l(this.b, psu0Var.b) && jl40.l(this.c, psu0Var.c) && jl40.l(this.d, psu0Var.d) && jl40.l(this.e, psu0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lsu0 lsu0Var = this.b;
        int hashCode2 = (hashCode + (lsu0Var == null ? 0 : lsu0Var.a.hashCode())) * 31;
        nsu0 nsu0Var = this.c;
        int hashCode3 = (hashCode2 + (nsu0Var == null ? 0 : nsu0Var.hashCode())) * 31;
        msu0 msu0Var = this.d;
        int hashCode4 = (hashCode3 + (msu0Var == null ? 0 : msu0Var.a.hashCode())) * 31;
        ksu0 ksu0Var = this.e;
        return hashCode4 + (ksu0Var != null ? ksu0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StrictPlaqueAction(__typename=" + this.a + ", onDeeplinkCrossAction=" + this.b + ", onServiceSpecificCrossAction=" + this.c + ", onJustInteractCrossAction=" + this.d + ", onActionPerformCrossAction=" + this.e + ')';
    }
}
