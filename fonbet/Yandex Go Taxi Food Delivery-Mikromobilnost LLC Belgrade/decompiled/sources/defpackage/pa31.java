package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpa31;", "Lj530;", "Lqa31;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class pa31 extends j530 {
    public final to5 a;

    public pa31(to5 to5Var) {
        this.a = to5Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        qa31 qa31Var = new qa31();
        qa31Var.a = this.a;
        return qa31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        pa31 pa31Var = obj instanceof pa31 ? (pa31) obj : null;
        if (pa31Var == null) {
            return false;
        }
        return jl40.l(this.a, pa31Var.a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((qa31) e530Var).a = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
