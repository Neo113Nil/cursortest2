package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lch4;", "Lj530;", "Lth4;", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ch4 extends j530 {
    public final wp2 a;
    public final ehr0 b;
    public final tls c;

    public ch4(wp2 wp2Var, ehr0 ehr0Var, tls tlsVar) {
        this.a = wp2Var;
        this.b = ehr0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        th4 th4Var = new th4();
        th4Var.a = this.a;
        th4Var.b = this.b;
        th4Var.c = 9205357640488583168L;
        th4Var.z = ldc.l;
        return th4Var;
    }

    public final boolean equals(Object obj) {
        ch4 ch4Var = obj instanceof ch4 ? (ch4) obj : null;
        return ch4Var != null && jl40.l(this.a, ch4Var.a) && jl40.l(this.b, ch4Var.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        th4 th4Var = (th4) e530Var;
        th4Var.a = this.a;
        th4Var.b = this.b;
        th4Var.A = true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
