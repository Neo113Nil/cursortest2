package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hw30 implements nw30 {
    public final String a;
    public final Route b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final String g;

    public hw30(String str, Route route, String str2, String str3, Integer num, String str4, String str5) {
        this.a = str;
        this.b = route;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw30)) {
            return false;
        }
        hw30 hw30Var = (hw30) obj;
        return jl40.l(this.a, hw30Var.a) && jl40.l(this.b, hw30Var.b) && jl40.l(this.c, hw30Var.c) && jl40.l(this.d, hw30Var.d) && jl40.l(this.e, hw30Var.e) && jl40.l(this.f, hw30Var.f) && jl40.l(this.g, hw30Var.g);
    }

    @Override // defpackage.nw30
    public final Route getRoute() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Route route = this.b;
        int hashCode2 = (hashCode + (route == null ? 0 : route.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bike(routeUri=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", startingAddress=");
        g8e.D(sb, this.c, ", destinationAddress=", this.d, ", freeReservationMinutes=");
        tse0.w(this.e, ", price=", this.f, ", reservationIconTag=", sb);
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }

    public hw30() {
        this("", null, null, null, null, null, null);
    }
}
