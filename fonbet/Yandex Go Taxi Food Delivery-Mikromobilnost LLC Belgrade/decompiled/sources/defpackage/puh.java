package defpackage;

import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class puh extends quh {
    public final String a;
    public final String b;
    public final UUID c;
    public final String d;
    public final String e;
    public final i5v f;
    public final vwa0 g;
    public final List h;
    public final oxa0 i;
    public final List j;
    public final List k;
    public final List l;
    public final fa90 m;
    public final Object n;
    public final Object o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final List t;
    public final ncz0 u;
    public final boolean v;
    public final boolean w;

    public puh(String str, String str2, UUID uuid, String str3, String str4, i5v i5vVar, vwa0 vwa0Var, List list, oxa0 oxa0Var, List list2, List list3, List list4, fa90 fa90Var, Object obj, Object obj2, boolean z, boolean z2, boolean z3, boolean z4, List list5, ncz0 ncz0Var, boolean z5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = uuid;
        this.d = str3;
        this.e = str4;
        this.f = i5vVar;
        this.g = vwa0Var;
        this.h = list;
        this.i = oxa0Var;
        this.j = list2;
        this.k = list3;
        this.l = list4;
        this.m = fa90Var;
        this.n = obj;
        this.o = obj2;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = list5;
        this.u = ncz0Var;
        this.v = z5;
        this.w = z6;
    }

    public final boolean a() {
        return this.q;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.w;
    }

    public final boolean d() {
        return this.r;
    }

    public final boolean e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puh)) {
            return false;
        }
        puh puhVar = (puh) obj;
        return jl40.l(this.a, puhVar.a) && jl40.l(this.b, puhVar.b) && jl40.l(this.c, puhVar.c) && jl40.l(this.d, puhVar.d) && jl40.l(this.e, puhVar.e) && jl40.l(this.f, puhVar.f) && jl40.l(this.g, puhVar.g) && jl40.l(this.h, puhVar.h) && jl40.l(this.i, puhVar.i) && jl40.l(this.j, puhVar.j) && jl40.l(this.k, puhVar.k) && jl40.l(this.l, puhVar.l) && jl40.l(this.m, puhVar.m) && jl40.l(this.n, puhVar.n) && jl40.l(this.o, puhVar.o) && this.p == puhVar.p && this.q == puhVar.q && this.r == puhVar.r && this.s == puhVar.s && jl40.l(this.t, puhVar.t) && jl40.l(this.u, puhVar.u) && this.v == puhVar.v && this.w == puhVar.w;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.c;
        int b = unr0.b((hashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int hashCode3 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        i5v i5vVar = this.f;
        int hashCode4 = (hashCode3 + (i5vVar == null ? 0 : i5vVar.a.hashCode())) * 31;
        vwa0 vwa0Var = this.g;
        int hashCode5 = (hashCode4 + (vwa0Var == null ? 0 : vwa0Var.hashCode())) * 31;
        List list = this.h;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        oxa0 oxa0Var = this.i;
        int c = unr0.c(unr0.c(unr0.c((hashCode6 + (oxa0Var == null ? 0 : oxa0Var.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        fa90 fa90Var = this.m;
        int c2 = smw0.c((c + (fa90Var == null ? 0 : fa90Var.hashCode())) * 31, 31, this.n);
        Object obj = this.o;
        int c3 = unr0.c(unr0.e(unr0.e(unr0.e(unr0.e((c2 + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
        ncz0 ncz0Var = this.u;
        return Boolean.hashCode(this.w) + unr0.e((c3 + (ncz0Var != null ? ncz0Var.hashCode() : 0)) * 31, 31, this.v);
    }

    public final String toString() {
        StringBuilder v = b64.v("Order(deliveryId=", this.a, ", originalOrderId=", this.b, ", localUuid=");
        v.append(this.c);
        v.append(", summary=");
        v.append(this.d);
        v.append(", description=");
        v.append(this.e);
        v.append(", iconStrategy=");
        v.append(this.f);
        v.append(", performer=");
        v.append(this.g);
        v.append(", performerPathPoints=");
        v.append(this.h);
        v.append(", performerSearch=");
        v.append(this.i);
        v.append(", cardBottomSections=");
        v.append(this.j);
        v.append(", deliveryPoints=");
        nnm.w(v, this.k, ", actions=", this.l, ", paidWaitingInfo=");
        v.append(this.m);
        v.append(", meta=");
        v.append(this.n);
        v.append(", adsOnMapMeta=");
        v.append(this.o);
        v.append(", isCompleted=");
        v.append(this.p);
        v.append(", autoOpenPostcard=");
        nnm.v(", isCancelling=", ", isPerformerPositionAvailable=", v, this.q, this.r);
        v.append(this.s);
        v.append(", displayTargets=");
        v.append(this.t);
        v.append(", timeline=");
        v.append(this.u);
        v.append(", shouldDetailsCardBeShown=");
        v.append(this.v);
        v.append(", shouldTrackGeo=");
        return x4e.i(v, this.w, Extension.C_BRAKE);
    }
}
