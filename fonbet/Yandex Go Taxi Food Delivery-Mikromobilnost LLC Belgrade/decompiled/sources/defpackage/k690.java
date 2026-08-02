package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk690;", "Lj530;", "Lm690;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class k690 extends j530 {
    public final j690 a;

    public k690(j690 j690Var, u290 u290Var) {
        this.a = j690Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        m690 m690Var = new m690();
        m690Var.a = this.a;
        return m690Var;
    }

    public final boolean equals(Object obj) {
        k690 k690Var = obj instanceof k690 ? (k690) obj : null;
        if (k690Var == null) {
            return false;
        }
        return jl40.l(this.a, k690Var.a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((m690) e530Var).a = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
