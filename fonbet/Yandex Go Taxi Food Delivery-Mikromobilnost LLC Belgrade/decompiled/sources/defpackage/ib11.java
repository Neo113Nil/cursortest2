package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class ib11 {
    public final MtTransportType a;
    public final String b;
    public final kdc c;
    public final bdc d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final w211 j;
    public final String k;
    public final List l;

    public /* synthetic */ ib11(MtTransportType mtTransportType, String str, kdc kdcVar, bdc bdcVar, String str2, String str3, String str4, boolean z, boolean z2, w211 w211Var, String str5, List list, int i) {
        this(mtTransportType, str, kdcVar, bdcVar, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : w211Var, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? EmptyList.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib11)) {
            return false;
        }
        ib11 ib11Var = (ib11) obj;
        return this.a == ib11Var.a && jl40.l(this.b, ib11Var.b) && jl40.l(this.c, ib11Var.c) && jl40.l(this.d, ib11Var.d) && jl40.l(this.e, ib11Var.e) && jl40.l(this.f, ib11Var.f) && jl40.l(this.g, ib11Var.g) && this.h == ib11Var.h && this.i == ib11Var.i && jl40.l(this.j, ib11Var.j) && jl40.l(this.k, ib11Var.k) && jl40.l(this.l, ib11Var.l);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        kdc kdcVar = this.c;
        int e = unr0.e(unr0.e(unr0.b(unr0.b(unr0.b(oyr.b(this.d.a, (b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        w211 w211Var = this.j;
        return this.l.hashCode() + unr0.b((e + (w211Var != null ? w211Var.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportVariant(transportType=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", bgColor=");
        sb.append(this.c);
        sb.append(", textColor=");
        sb.append(this.d);
        sb.append(", fullName=");
        g8e.D(sb, this.e, ", scheduleText=", this.f, ", circleText=");
        tse0.y(this.g, ", isMapkitColor=", ", hasLiveMarker=", sb, this.h);
        sb.append(this.i);
        sb.append(", transportId=");
        sb.append(this.j);
        sb.append(", vehicleId=");
        return tse0.j(this.k, ", lineAlerts=", Extension.C_BRAKE, sb, this.l);
    }

    public ib11(MtTransportType mtTransportType, String str, kdc kdcVar, bdc bdcVar, String str2, String str3, String str4, boolean z, boolean z2, w211 w211Var, String str5, List list) {
        this.a = mtTransportType;
        this.b = str;
        this.c = kdcVar;
        this.d = bdcVar;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = z2;
        this.j = w211Var;
        this.k = str5;
        this.l = list;
    }
}
