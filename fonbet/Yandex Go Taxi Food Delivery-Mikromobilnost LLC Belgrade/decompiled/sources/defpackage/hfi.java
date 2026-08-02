package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hfi {
    public final String a;
    public final int b;
    public final String c;
    public final gfi d;
    public final String e;
    public final String f;
    public final i5v g;
    public final vwa0 h;
    public final List i;
    public final List j;
    public final fa90 k;
    public final Object l;
    public final Object m;
    public final List n;
    public final List o;
    public final ncz0 p;

    public hfi(String str, int i, String str2, gfi gfiVar, String str3, String str4, i5v i5vVar, vwa0 vwa0Var, List list, List list2, fa90 fa90Var, Object obj, Object obj2, List list3, ArrayList arrayList, ncz0 ncz0Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = gfiVar;
        this.e = str3;
        this.f = str4;
        this.g = i5vVar;
        this.h = vwa0Var;
        this.i = list;
        this.j = list2;
        this.k = fa90Var;
        this.l = obj;
        this.m = obj2;
        this.n = list3;
        this.o = arrayList;
        this.p = ncz0Var;
    }

    public final List a() {
        return this.j;
    }

    public final Object b() {
        return this.m;
    }

    public final List c() {
        return this.i;
    }

    public final gfi d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfi)) {
            return false;
        }
        hfi hfiVar = (hfi) obj;
        return jl40.l(this.a, hfiVar.a) && this.b == hfiVar.b && jl40.l(this.c, hfiVar.c) && this.d.equals(hfiVar.d) && jl40.l(this.e, hfiVar.e) && jl40.l(this.f, hfiVar.f) && jl40.l(this.g, hfiVar.g) && jl40.l(this.h, hfiVar.h) && this.i.equals(hfiVar.i) && this.j.equals(hfiVar.j) && jl40.l(this.k, hfiVar.k) && jl40.l(this.l, hfiVar.l) && jl40.l(this.m, hfiVar.m) && this.n.equals(hfiVar.n) && jl40.l(this.o, hfiVar.o) && jl40.l(this.p, hfiVar.p);
    }

    public final List f() {
        return this.n;
    }

    public final String g() {
        return this.f;
    }

    public final i5v h() {
        return this.g;
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int b2 = unr0.b((this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i5v i5vVar = this.g;
        int hashCode2 = (hashCode + (i5vVar == null ? 0 : i5vVar.a.hashCode())) * 31;
        vwa0 vwa0Var = this.h;
        int c = unr0.c(unr0.c((hashCode2 + (vwa0Var == null ? 0 : vwa0Var.hashCode())) * 31, 31, this.i), 31, this.j);
        fa90 fa90Var = this.k;
        int c2 = smw0.c((c + (fa90Var == null ? 0 : fa90Var.hashCode())) * 31, 31, this.l);
        Object obj = this.m;
        int c3 = unr0.c((c2 + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.n);
        List list = this.o;
        int hashCode3 = (c3 + (list == null ? 0 : list.hashCode())) * 31;
        ncz0 ncz0Var = this.p;
        return hashCode3 + (ncz0Var != null ? ncz0Var.hashCode() : 0);
    }

    public final Object i() {
        return this.l;
    }

    public final String j() {
        return this.c;
    }

    public final fa90 k() {
        return this.k;
    }

    public final vwa0 l() {
        return this.h;
    }

    public final List m() {
        return this.o;
    }

    public final int n() {
        return this.b;
    }

    public final String o() {
        return this.e;
    }

    public final ncz0 p() {
        return this.p;
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "DeliveryOrder(deliveryId=", this.a, ", revision=", ", originalOrderId=");
        u.append(this.c);
        u.append(", context=");
        u.append(this.d);
        u.append(", summary=");
        g8e.D(u, this.e, ", description=", this.f, ", iconStrategy=");
        u.append(this.g);
        u.append(", performer=");
        u.append(this.h);
        u.append(", cardBottomSections=");
        nnm.w(u, this.i, ", actions=", this.j, ", paidWaitingInfo=");
        u.append(this.k);
        u.append(", meta=");
        u.append(this.l);
        u.append(", adsOnMapMeta=");
        u.append(this.m);
        u.append(", deliveryPoints=");
        u.append(this.n);
        u.append(", performerPathPoints=");
        u.append(this.o);
        u.append(", timeline=");
        u.append(this.p);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
