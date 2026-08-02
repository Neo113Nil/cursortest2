package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kw30 implements nw30 {
    public final String a;
    public final Route b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final String h;
    public final Integer i;

    public kw30(String str, Route route, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, int i) {
        str = (i & 1) != 0 ? "" : str;
        route = (i & 2) != 0 ? null : route;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        num = (i & 16) != 0 ? null : num;
        str4 = (i & 32) != 0 ? null : str4;
        num2 = (i & 64) != 0 ? null : num2;
        str5 = (i & 128) != 0 ? null : str5;
        num3 = (i & 1024) != 0 ? null : num3;
        this.a = str;
        this.b = route;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = num2;
        this.h = str5;
        this.i = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw30)) {
            return false;
        }
        kw30 kw30Var = (kw30) obj;
        return jl40.l(this.a, kw30Var.a) && jl40.l(this.b, kw30Var.b) && jl40.l(this.c, kw30Var.c) && jl40.l(this.d, kw30Var.d) && jl40.l(this.e, kw30Var.e) && jl40.l(this.f, kw30Var.f) && jl40.l(this.g, kw30Var.g) && jl40.l(this.h, kw30Var.h) && jl40.l(this.i, kw30Var.i);
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
        Integer num2 = this.g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 29791;
        Integer num3 = this.i;
        return hashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Scooter(routeUri=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", startingAddress=");
        g8e.D(sb, this.c, ", destinationAddress=", this.d, ", freeReservationMinutes=");
        tse0.w(this.e, ", price=", this.f, ", chargeLevel=", sb);
        tse0.w(this.g, ", reservationIconTag=", this.h, ", parkingIconTag=null, departureTime=null, scootersAmount=", sb);
        return oo31.j(sb, this.i, Extension.C_BRAKE);
    }

    public kw30() {
        this(null, null, null, null, null, null, null, null, null, 2047);
    }
}
