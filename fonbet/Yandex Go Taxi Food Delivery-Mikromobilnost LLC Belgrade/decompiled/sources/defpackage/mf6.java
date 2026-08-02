package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmf6;", "Lj530;", "Lnf6;", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class mf6 extends j530 {
    public final wg6 a;
    public final lx40 b;
    public final to5 c;

    public mf6(wg6 wg6Var, lx40 lx40Var) {
        to5 to5Var = x4c.F;
        this.a = wg6Var;
        this.b = lx40Var;
        this.c = to5Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        nf6 nf6Var = new nf6();
        nf6Var.a = this.a;
        nf6Var.b = this.b;
        nf6Var.c = this.c;
        return nf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mf6.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        mf6 mf6Var = (mf6) obj;
        return jl40.l(this.a, mf6Var.a) && jl40.l(this.b, mf6Var.b) && jl40.l(this.c, mf6Var.c);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        nf6 nf6Var = (nf6) e530Var;
        nf6Var.a = this.a;
        nf6Var.b = this.b;
        nf6Var.c = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c.a) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
