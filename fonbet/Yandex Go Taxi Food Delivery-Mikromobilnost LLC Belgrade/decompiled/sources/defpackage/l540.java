package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class l540 implements fj40 {
    public final List a;
    public final MtTransportType b;
    public final Subpolyline c;
    public final double d;
    public final int e;
    public final String f;
    public final String g;
    public final List h;
    public final long i;
    public final kdc j;
    public final String k;

    public l540(List list, MtTransportType mtTransportType, Subpolyline subpolyline, double d, int i, String str, String str2, List list2, long j, kdc kdcVar, String str3) {
        this.a = list;
        this.b = mtTransportType;
        this.c = subpolyline;
        this.d = d;
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = list2;
        this.i = j;
        this.j = kdcVar;
        this.k = str3;
    }

    @Override // defpackage.fj40
    public final kdc a() {
        return this.j;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.e;
    }

    @Override // defpackage.hz30
    public final Subpolyline c() {
        return this.c;
    }

    @Override // defpackage.fj40
    public final String d() {
        return this.g;
    }

    @Override // defpackage.fj40
    public final List e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l540)) {
            return false;
        }
        l540 l540Var = (l540) obj;
        return jl40.l(this.a, l540Var.a) && this.b == l540Var.b && jl40.l(this.c, l540Var.c) && Double.compare(this.d, l540Var.d) == 0 && this.e == l540Var.e && jl40.l(this.f, l540Var.f) && jl40.l(this.g, l540Var.g) && jl40.l(this.h, l540Var.h) && this.i == l540Var.i && jl40.l(this.j, l540Var.j) && jl40.l(this.k, l540Var.k);
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.d;
    }

    @Override // defpackage.fj40
    public final MtTransportType getType() {
        return this.b;
    }

    public final int hashCode() {
        List list = this.a;
        int d = smw0.d(this.j, qv10.c(unr0.c(unr0.b(unr0.b(oyr.b(this.e, unr0.a((this.c.hashCode() + ((this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
        String str = this.k;
        return d + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTaxiSection(jams=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", subpolyline=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", sectionId=");
        sb.append(this.e);
        sb.append(", departureTime=");
        sb.append(this.f);
        sb.append(", arrivalTime=");
        sb.append(this.g);
        sb.append(", stops=");
        sb.append(this.h);
        x4e.A(this.i, ", departureTimeInMillis=", ", color=", sb);
        sb.append(this.j);
        sb.append(", lineId=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
