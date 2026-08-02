package defpackage;

import com.yandex.mapkit.transport.masstransit.TransportContour;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class b3v0 {
    public static final b3v0 j = new b3v0("", MtTransportType.SUBURBAN, "", new w211("", ""), false, EmptyList.a, null, new gdc(mqg0.white), null);
    public final String a;
    public final MtTransportType b;
    public final String c;
    public final w211 d;
    public final boolean e;
    public final List f;
    public final TransportContour g;
    public final kdc h;
    public final String i;

    public b3v0(String str, MtTransportType mtTransportType, String str2, w211 w211Var, boolean z, List list, TransportContour transportContour, kdc kdcVar, String str3) {
        this.a = str;
        this.b = mtTransportType;
        this.c = str2;
        this.d = w211Var;
        this.e = z;
        this.f = list;
        this.g = transportContour;
        this.h = kdcVar;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3v0)) {
            return false;
        }
        b3v0 b3v0Var = (b3v0) obj;
        return jl40.l(this.a, b3v0Var.a) && this.b == b3v0Var.b && jl40.l(this.c, b3v0Var.c) && this.d.equals(b3v0Var.d) && this.e == b3v0Var.e && this.f.equals(b3v0Var.f) && jl40.l(this.g, b3v0Var.g) && this.h.equals(b3v0Var.h) && jl40.l(this.i, b3v0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int c = unr0.c(unr0.e((this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        TransportContour transportContour = this.g;
        int d = smw0.d(this.h, (c + (transportContour == null ? 0 : transportContour.hashCode())) * 31, 31);
        String str2 = this.i;
        return d + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuburbanThread(name=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", alternativeDepartureStopId=");
        sb.append(this.c);
        sb.append(", transportId=");
        sb.append(this.d);
        sb.append(", isAeroExpress=");
        sb.append(this.e);
        sb.append(", alerts=");
        sb.append(this.f);
        sb.append(", contour=");
        sb.append(this.g);
        sb.append(", color=");
        sb.append(this.h);
        sb.append(", lineId=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
