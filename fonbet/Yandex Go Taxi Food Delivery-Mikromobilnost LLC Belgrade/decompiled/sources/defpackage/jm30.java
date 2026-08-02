package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class jm30 implements fj40 {
    public final List a;
    public final boolean b;
    public final String c;
    public final MtTransportType d;
    public final kdc e;
    public final String f;
    public final long g;
    public final String h;
    public final List i;
    public final Subpolyline j;
    public final double k;
    public final int l;
    public final String m;

    public jm30(List list, boolean z, String str, MtTransportType mtTransportType, kdc kdcVar, String str2, long j, String str3, List list2, Subpolyline subpolyline, double d, int i, String str4) {
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = mtTransportType;
        this.e = kdcVar;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = list2;
        this.j = subpolyline;
        this.k = d;
        this.l = i;
        this.m = str4;
    }

    @Override // defpackage.fj40
    public final kdc a() {
        return this.e;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.l;
    }

    @Override // defpackage.hz30
    public final Subpolyline c() {
        return this.j;
    }

    @Override // defpackage.fj40
    public final String d() {
        return this.h;
    }

    @Override // defpackage.fj40
    public final List e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm30)) {
            return false;
        }
        jm30 jm30Var = (jm30) obj;
        return jl40.l(this.a, jm30Var.a) && this.b == jm30Var.b && jl40.l(this.c, jm30Var.c) && this.d == jm30Var.d && jl40.l(this.e, jm30Var.e) && jl40.l(this.f, jm30Var.f) && this.g == jm30Var.g && jl40.l(this.h, jm30Var.h) && jl40.l(this.i, jm30Var.i) && jl40.l(this.j, jm30Var.j) && Double.compare(this.k, jm30Var.k) == 0 && this.l == jm30Var.l && jl40.l(this.m, jm30Var.m);
    }

    public final w1u f() {
        return (w1u) a.P(this.a);
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.k;
    }

    @Override // defpackage.fj40
    public final MtTransportType getType() {
        return this.d;
    }

    public final int hashCode() {
        int b = oyr.b(this.l, unr0.a((this.j.hashCode() + unr0.c(unr0.b(qv10.c(unr0.b(smw0.d(this.e, (this.d.hashCode() + unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31);
        String str = this.m;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtGroundSection(threads=");
        sb.append(this.a);
        sb.append(", isAeroExpress=");
        sb.append(this.b);
        sb.append(", lineName=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", color=");
        sb.append(this.e);
        sb.append(", departureTime=");
        sb.append(this.f);
        sb.append(", departureTimeInMillis=");
        uw51.v(this.g, ", arrivalTime=", this.h, sb);
        sb.append(", stops=");
        sb.append(this.i);
        sb.append(", subpolyline=");
        sb.append(this.j);
        nzs.o(sb, ", duration=", this.k, ", sectionId=");
        return xvz.h(this.l, ", lineId=", this.m, Extension.C_BRAKE, sb);
    }
}
