package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnrv;", "Lj530;", "Lorv;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class nrv extends j530 {
    public final h8w a;
    public final prv b;

    public nrv(h8w h8wVar, prv prvVar) {
        this.a = h8wVar;
        this.b = prvVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        cqh a = this.b.a(this.a);
        orv orvVar = new orv();
        orvVar.c = a;
        orvVar.E0(a);
        return orvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrv)) {
            return false;
        }
        nrv nrvVar = (nrv) obj;
        return jl40.l(this.a, nrvVar.a) && jl40.l(this.b, nrvVar.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        orv orvVar = (orv) e530Var;
        cqh a = this.b.a(this.a);
        orvVar.F0(orvVar.c);
        orvVar.c = a;
        orvVar.E0(a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
