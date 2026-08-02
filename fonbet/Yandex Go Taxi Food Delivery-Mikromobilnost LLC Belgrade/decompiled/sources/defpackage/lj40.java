package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.model.MtTransportSystemId;

/* loaded from: classes6.dex */
public final class lj40 implements fj40 {
    public final Set a;
    public final MtTransportSystemId b;
    public final String c;
    public final String d;
    public final w211 e;
    public final List f;
    public final MtTransportType g;
    public final kdc h;
    public final String i;
    public final long j;
    public final String k;
    public final List l;
    public final Subpolyline m;
    public final double n;
    public final int o;
    public final String p;

    public lj40(Set set, MtTransportSystemId mtTransportSystemId, String str, String str2, w211 w211Var, List list, MtTransportType mtTransportType, kdc kdcVar, String str3, long j, String str4, List list2, Subpolyline subpolyline, double d, int i, String str5) {
        this.a = set;
        this.b = mtTransportSystemId;
        this.c = str;
        this.d = str2;
        this.e = w211Var;
        this.f = list;
        this.g = mtTransportType;
        this.h = kdcVar;
        this.i = str3;
        this.j = j;
        this.k = str4;
        this.l = list2;
        this.m = subpolyline;
        this.n = d;
        this.o = i;
        this.p = str5;
    }

    @Override // defpackage.fj40
    public final kdc a() {
        return this.h;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.o;
    }

    @Override // defpackage.hz30
    public final Subpolyline c() {
        return this.m;
    }

    @Override // defpackage.fj40
    public final String d() {
        return this.k;
    }

    @Override // defpackage.fj40
    public final List e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj40)) {
            return false;
        }
        lj40 lj40Var = (lj40) obj;
        return jl40.l(this.a, lj40Var.a) && this.b == lj40Var.b && jl40.l(this.c, lj40Var.c) && jl40.l(this.d, lj40Var.d) && jl40.l(this.e, lj40Var.e) && jl40.l(this.f, lj40Var.f) && this.g == lj40Var.g && jl40.l(this.h, lj40Var.h) && jl40.l(this.i, lj40Var.i) && this.j == lj40Var.j && jl40.l(this.k, lj40Var.k) && jl40.l(this.l, lj40Var.l) && jl40.l(this.m, lj40Var.m) && Double.compare(this.n, lj40Var.n) == 0 && this.o == lj40Var.o && jl40.l(this.p, lj40Var.p);
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.n;
    }

    @Override // defpackage.fj40
    public final MtTransportType getType() {
        return this.g;
    }

    public final int hashCode() {
        Set set = this.a;
        int hashCode = (this.b.hashCode() + ((set == null ? 0 : set.hashCode()) * 31)) * 31;
        String str = this.c;
        int b = oyr.b(this.o, unr0.a((this.m.hashCode() + unr0.c(unr0.b(qv10.c(unr0.b(smw0.d(this.h, (this.g.hashCode() + unr0.c((this.e.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f)) * 31, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31);
        String str2 = this.p;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtUndergroundSection(wagons=");
        sb.append(this.a);
        sb.append(", transportSystemId=");
        sb.append(this.b);
        sb.append(", lineNum=");
        g8e.D(sb, this.c, ", lineName=", this.d, ", transportId=");
        sb.append(this.e);
        sb.append(", alerts=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(this.g);
        sb.append(", color=");
        sb.append(this.h);
        sb.append(", departureTime=");
        ly3.y(this.j, this.i, ", departureTimeInMillis=", sb);
        sb.append(", arrivalTime=");
        sb.append(this.k);
        sb.append(", stops=");
        sb.append(this.l);
        sb.append(", subpolyline=");
        sb.append(this.m);
        sb.append(", duration=");
        sb.append(this.n);
        sb.append(", sectionId=");
        sb.append(this.o);
        return unr0.r(sb, ", lineId=", this.p, Extension.C_BRAKE);
    }
}
