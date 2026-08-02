package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lw30 implements nw30 {
    public final String a;
    public final Route b;
    public final String c;
    public final String d;

    public lw30(String str, Route route, String str2, String str3) {
        this.a = str;
        this.b = route;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw30)) {
            return false;
        }
        lw30 lw30Var = (lw30) obj;
        return jl40.l(this.a, lw30Var.a) && jl40.l(this.b, lw30Var.b) && jl40.l(this.c, lw30Var.c) && jl40.l(this.d, lw30Var.d);
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
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiTransport(routeUri=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", tariffClass=");
        return g8e.r(sb, this.c, ", offerId=", this.d, Extension.C_BRAKE);
    }

    public lw30() {
        this("", null, null, null);
    }
}
