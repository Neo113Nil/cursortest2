package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhfu;", "Lj530;", "Ljfu;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class hfu extends j530 {
    public final ety0 a;
    public final int b;
    public final int c;

    public hfu(ety0 ety0Var, int i, int i2) {
        this.a = ety0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        jfu jfuVar = new jfu();
        jfuVar.a = this.a;
        jfuVar.b = this.b;
        jfuVar.c = this.c;
        jfuVar.x = -1;
        jfuVar.y = -1;
        return jfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfu)) {
            return false;
        }
        hfu hfuVar = (hfu) obj;
        return jl40.l(this.a, hfuVar.a) && this.b == hfuVar.b && this.c == hfuVar.c;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        jfu jfuVar = (jfu) e530Var;
        ety0 ety0Var = jfuVar.a;
        ety0 ety0Var2 = this.a;
        boolean l = jl40.l(ety0Var, ety0Var2);
        int i = this.b;
        int i2 = this.c;
        if (l && jfuVar.b == i && jfuVar.c == i2) {
            return;
        }
        jfuVar.a = ety0Var2;
        jfuVar.b = i;
        jfuVar.c = i2;
        jfuVar.z = bb1.I(ety0Var2, qje.P(jfuVar).S);
        jfuVar.w = true;
        qje.P(jfuVar).C();
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
