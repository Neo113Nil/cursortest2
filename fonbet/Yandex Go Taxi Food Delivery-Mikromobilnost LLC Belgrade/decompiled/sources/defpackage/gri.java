package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gri {
    public final String a;
    public final dqi b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final String g;
    public final i5v h;
    public final Object i;
    public final List j;
    public final vwa0 k;
    public final kqi l;
    public final p6i m;
    public final p6i n;
    public final tqi o;
    public final ncz0 p;
    public final eqi q;
    public final uzc r;
    public final xpi s;
    public final pqi t;
    public final fa90 u;
    public final zb80 v;
    public final p460 w;
    public final cri x;

    public gri(String str, dqi dqiVar, List list, List list2, List list3, String str2, String str3, i5v i5vVar, Object obj, List list4, vwa0 vwa0Var, kqi kqiVar, p6i p6iVar, p6i p6iVar2, tqi tqiVar, ncz0 ncz0Var, eqi eqiVar, uzc uzcVar, xpi xpiVar, pqi pqiVar, fa90 fa90Var, zb80 zb80Var, p460 p460Var, cri criVar) {
        this.a = str;
        this.b = dqiVar;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = str2;
        this.g = str3;
        this.h = i5vVar;
        this.i = obj;
        this.j = list4;
        this.k = vwa0Var;
        this.l = kqiVar;
        this.m = p6iVar;
        this.n = p6iVar2;
        this.o = tqiVar;
        this.p = ncz0Var;
        this.q = eqiVar;
        this.r = uzcVar;
        this.s = xpiVar;
        this.t = pqiVar;
        this.u = fa90Var;
        this.v = zb80Var;
        this.w = p460Var;
        this.x = criVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        return this.a.equals(griVar.a) && this.b.equals(griVar.b) && this.c.equals(griVar.c) && this.d.equals(griVar.d) && this.e.equals(griVar.e) && jl40.l(this.f, griVar.f) && jl40.l(this.g, griVar.g) && jl40.l(this.h, griVar.h) && jl40.l(this.i, griVar.i) && jl40.l(this.j, griVar.j) && jl40.l(this.k, griVar.k) && jl40.l(this.l, griVar.l) && this.m.equals(griVar.m) && this.n.equals(griVar.n) && jl40.l(this.o, griVar.o) && jl40.l(this.p, griVar.p) && jl40.l(this.q, griVar.q) && jl40.l(this.r, griVar.r) && jl40.l(this.s, griVar.s) && jl40.l(this.t, griVar.t) && jl40.l(this.u, griVar.u) && jl40.l(this.v, griVar.v) && jl40.l(this.w, griVar.w) && jl40.l(this.x, griVar.x);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c(unr0.c(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        i5v i5vVar = this.h;
        int c = smw0.c((hashCode + (i5vVar == null ? 0 : i5vVar.a.hashCode())) * 31, 31, this.i);
        List list = this.j;
        int hashCode2 = (c + (list == null ? 0 : list.hashCode())) * 31;
        vwa0 vwa0Var = this.k;
        int hashCode3 = (hashCode2 + (vwa0Var == null ? 0 : vwa0Var.hashCode())) * 31;
        kqi kqiVar = this.l;
        int b2 = ly3.b(ly3.b((hashCode3 + (kqiVar == null ? 0 : kqiVar.a.hashCode())) * 31, 31, this.m.a), 31, this.n.a);
        tqi tqiVar = this.o;
        int hashCode4 = (b2 + (tqiVar == null ? 0 : tqiVar.hashCode())) * 31;
        ncz0 ncz0Var = this.p;
        int hashCode5 = (hashCode4 + (ncz0Var == null ? 0 : ncz0Var.hashCode())) * 31;
        eqi eqiVar = this.q;
        int hashCode6 = (hashCode5 + (eqiVar == null ? 0 : eqiVar.a.hashCode())) * 31;
        uzc uzcVar = this.r;
        int hashCode7 = (hashCode6 + (uzcVar == null ? 0 : uzcVar.hashCode())) * 31;
        xpi xpiVar = this.s;
        int hashCode8 = (hashCode7 + (xpiVar == null ? 0 : xpiVar.hashCode())) * 31;
        pqi pqiVar = this.t;
        int hashCode9 = (hashCode8 + (pqiVar == null ? 0 : pqiVar.hashCode())) * 31;
        fa90 fa90Var = this.u;
        int hashCode10 = (hashCode9 + (fa90Var == null ? 0 : fa90Var.hashCode())) * 31;
        zb80 zb80Var = this.v;
        int hashCode11 = (hashCode10 + (zb80Var == null ? 0 : zb80Var.hashCode())) * 31;
        p460 p460Var = this.w;
        int hashCode12 = (hashCode11 + (p460Var == null ? 0 : p460Var.hashCode())) * 31;
        cri criVar = this.x;
        return hashCode12 + (criVar != null ? criVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryState(id=");
        sb.append(this.a);
        sb.append(", context=");
        sb.append(this.b);
        sb.append(", points=");
        nnm.w(sb, this.c, ", primaryActions=", this.d, ", secondaryActions=");
        oyr.D(", summary=", this.f, ", description=", sb, this.e);
        sb.append(this.g);
        sb.append(", iconStrategy=");
        sb.append(this.h);
        sb.append(", meta=");
        sb.append(this.i);
        sb.append(", onFirstLoadActions=");
        sb.append(this.j);
        sb.append(", performer=");
        sb.append(this.k);
        sb.append(", performerPath=");
        sb.append(this.l);
        sb.append(", dynamicContent=");
        sb.append(this.m);
        sb.append(", bottomDynamicContent=");
        sb.append(this.n);
        sb.append(", postcard=");
        sb.append(this.o);
        sb.append(", timeline=");
        sb.append(this.p);
        sb.append(", costDetails=");
        sb.append(this.q);
        sb.append(", completedStateButtons=");
        sb.append(this.r);
        sb.append(", accentButton=");
        sb.append(this.s);
        sb.append(", poll=");
        sb.append(this.t);
        sb.append(", paidWaitingInfo=");
        sb.append(this.u);
        sb.append(", orderingControl=");
        sb.append(this.v);
        sb.append(", neuroPostcard=");
        sb.append(this.w);
        sb.append(", topAccentBar=");
        sb.append(this.x);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
