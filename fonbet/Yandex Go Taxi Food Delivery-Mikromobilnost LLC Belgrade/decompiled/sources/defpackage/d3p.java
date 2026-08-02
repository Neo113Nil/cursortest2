package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;

/* loaded from: classes8.dex */
public final class d3p implements w201 {
    public final String a;
    public final i501 b;
    public final h1p c;
    public final String d;
    public final String e;
    public final EatsOrderStatus f;
    public final String g;
    public final String h;
    public final a3p i;
    public final z2p j;
    public final List k;
    public final y2p l;
    public final e401 m;

    public d3p(String str, i501 i501Var, h1p h1pVar, String str2, String str3, EatsOrderStatus eatsOrderStatus, String str4, String str5, a3p a3pVar, z2p z2pVar, List list, y2p y2pVar, e401 e401Var) {
        this.a = str;
        this.b = i501Var;
        this.c = h1pVar;
        this.d = str2;
        this.e = str3;
        this.f = eatsOrderStatus;
        this.g = str4;
        this.h = str5;
        this.i = a3pVar;
        this.j = z2pVar;
        this.k = list;
        this.l = y2pVar;
        this.m = e401Var;
    }

    public final z2p c() {
        List list = this.k;
        int size = list.size();
        if (size != 0) {
            return size != 1 ? (z2p) list.get(1) : (z2p) list.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3p)) {
            return false;
        }
        d3p d3pVar = (d3p) obj;
        return jl40.l(this.a, d3pVar.a) && jl40.l(this.b, d3pVar.b) && jl40.l(this.c, d3pVar.c) && jl40.l(this.d, d3pVar.d) && jl40.l(this.e, d3pVar.e) && this.f == d3pVar.f && jl40.l(this.g, d3pVar.g) && jl40.l(this.h, d3pVar.h) && jl40.l(this.i, d3pVar.i) && jl40.l(this.j, d3pVar.j) && jl40.l(this.k, d3pVar.k) && jl40.l(this.l, d3pVar.l) && jl40.l(this.m, d3pVar.m);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a3p a3pVar = this.i;
        int hashCode6 = (hashCode5 + (a3pVar == null ? 0 : a3pVar.hashCode())) * 31;
        z2p z2pVar = this.j;
        int c = unr0.c((hashCode6 + (z2pVar == null ? 0 : z2pVar.hashCode())) * 31, 31, this.k);
        y2p y2pVar = this.l;
        int hashCode7 = (c + (y2pVar == null ? 0 : y2pVar.hashCode())) * 31;
        e401 e401Var = this.m;
        return hashCode7 + (e401Var != null ? e401Var.hashCode() : 0);
    }

    public final z2p m() {
        List list = this.k;
        int size = list.size();
        if (size == 0 || size == 1) {
            return null;
        }
        return (z2p) list.get(0);
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalServiceOrderTracking(id=");
        sb.append(this.a);
        sb.append(", cardSwipeBehaviour=");
        sb.append(this.b);
        sb.append(", eatsService=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", iconUrl=");
        g8e.D(sb, this.g, ", overlayImageUrl=", this.h, ", timeline=");
        sb.append(this.i);
        sb.append(", trailButton=");
        sb.append(this.j);
        sb.append(", buttons=");
        sb.append(this.k);
        sb.append(", action=");
        sb.append(this.l);
        sb.append(", popUp=");
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
