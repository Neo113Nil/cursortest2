package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lblp0;", "Lj530;", "Laip0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class blp0 extends j530 {
    public final oip0 a;
    public final boolean b;

    public blp0(oip0 oip0Var, boolean z) {
        this.a = oip0Var;
        this.b = z;
    }

    @Override // defpackage.j530
    public final e530 a() {
        aip0 aip0Var = new aip0();
        aip0Var.a = this.a;
        aip0Var.b = this.b;
        return aip0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof blp0)) {
            return false;
        }
        blp0 blp0Var = (blp0) obj;
        return jl40.l(this.a, blp0Var.a) && this.b == blp0Var.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        aip0 aip0Var = (aip0) e530Var;
        aip0Var.a = this.a;
        aip0Var.b = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + unr0.e(this.a.hashCode() * 31, 31, false);
    }
}
