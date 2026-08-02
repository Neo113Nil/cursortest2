package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmi6;", "Lj530;", "Lni6;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class mi6 extends j530 {
    public final jt1 a;
    public final boolean b;
    public final tls c;

    public mi6(jt1 jt1Var, boolean z, tls tlsVar) {
        this.a = jt1Var;
        this.b = z;
        this.c = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        ni6 ni6Var = new ni6();
        ni6Var.a = this.a;
        ni6Var.b = this.b;
        return ni6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        mi6 mi6Var = obj instanceof mi6 ? (mi6) obj : null;
        return mi6Var != null && jl40.l(this.a, mi6Var.a) && this.b == mi6Var.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ni6 ni6Var = (ni6) e530Var;
        ni6Var.a = this.a;
        ni6Var.b = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
