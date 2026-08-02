package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class bjz implements w201 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final qiz g;
    public final LogisticsOrderTracking$Status h;
    public final yiz i;
    public final wiz j;
    public final ajz k;
    public final niz l;
    public final ziz m;
    public final miz n;
    public final List o;
    public final i501 p;
    public final diz q;

    public bjz(String str, String str2, String str3, String str4, String str5, String str6, qiz qizVar, LogisticsOrderTracking$Status logisticsOrderTracking$Status, yiz yizVar, wiz wizVar, ajz ajzVar, niz nizVar, ziz zizVar, miz mizVar, List list, i501 i501Var, diz dizVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = qizVar;
        this.h = logisticsOrderTracking$Status;
        this.i = yizVar;
        this.j = wizVar;
        this.k = ajzVar;
        this.l = nizVar;
        this.m = zizVar;
        this.n = mizVar;
        this.o = list;
        this.p = i501Var;
        this.q = dizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjz)) {
            return false;
        }
        bjz bjzVar = (bjz) obj;
        return jl40.l(this.a, bjzVar.a) && jl40.l(this.b, bjzVar.b) && jl40.l(this.c, bjzVar.c) && jl40.l(this.d, bjzVar.d) && jl40.l(this.e, bjzVar.e) && jl40.l(this.f, bjzVar.f) && jl40.l(this.g, bjzVar.g) && this.h == bjzVar.h && jl40.l(this.i, bjzVar.i) && jl40.l(this.j, bjzVar.j) && jl40.l(this.k, bjzVar.k) && jl40.l(this.l, bjzVar.l) && jl40.l(this.m, bjzVar.m) && jl40.l(this.n, bjzVar.n) && jl40.l(this.o, bjzVar.o) && jl40.l(this.p, bjzVar.p) && jl40.l(this.q, bjzVar.q);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int b = unr0.b(unr0.b((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e), 31, this.f);
        qiz qizVar = this.g;
        int hashCode4 = (this.h.hashCode() + ((b + (qizVar == null ? 0 : qizVar.hashCode())) * 31)) * 31;
        yiz yizVar = this.i;
        int hashCode5 = (hashCode4 + (yizVar == null ? 0 : yizVar.hashCode())) * 31;
        wiz wizVar = this.j;
        int hashCode6 = (hashCode5 + (wizVar == null ? 0 : wizVar.hashCode())) * 31;
        ajz ajzVar = this.k;
        int hashCode7 = (this.l.hashCode() + ((hashCode6 + (ajzVar == null ? 0 : ajzVar.hashCode())) * 31)) * 31;
        ziz zizVar = this.m;
        int hashCode8 = (hashCode7 + (zizVar == null ? 0 : zizVar.hashCode())) * 31;
        miz mizVar = this.n;
        int hashCode9 = (this.p.hashCode() + unr0.c((hashCode8 + (mizVar == null ? 0 : mizVar.hashCode())) * 31, 31, this.o)) * 31;
        diz dizVar = this.q;
        return hashCode9 + (dizVar != null ? dizVar.hashCode() : 0);
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.p;
    }

    public final String toString() {
        StringBuilder v = b64.v("LogisticsOrderTracking(id=", this.a, ", deliveryId=", this.b, ", originalOrderId=");
        g8e.D(v, this.c, ", localUuid=", this.d, ", title=");
        g8e.D(v, this.e, ", subtitle=", this.f, ", image=");
        v.append(this.g);
        v.append(", status=");
        v.append(this.h);
        v.append(", performerSearch=");
        v.append(this.i);
        v.append(", performer=");
        v.append(this.j);
        v.append(", vehicle=");
        v.append(this.k);
        v.append(", details=");
        v.append(this.l);
        v.append(", products=");
        v.append(this.m);
        v.append(", cancellation=");
        v.append(this.n);
        v.append(", bottomSections=");
        v.append(this.o);
        v.append(", cardSwipeBehaviour=");
        v.append(this.p);
        v.append(", analyticsData=");
        v.append(this.q);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
