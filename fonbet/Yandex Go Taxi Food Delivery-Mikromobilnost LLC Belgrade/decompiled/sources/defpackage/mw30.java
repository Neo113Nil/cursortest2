package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class mw30 implements nw30 {
    public final String a;
    public final Route b;

    public mw30(String str, Route route) {
        this.a = str;
        this.b = route;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw30)) {
            return false;
        }
        mw30 mw30Var = (mw30) obj;
        return jl40.l(this.a, mw30Var.a) && jl40.l(this.b, mw30Var.b);
    }

    @Override // defpackage.nw30
    public final Route getRoute() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Route route = this.b;
        return hashCode + (route == null ? 0 : route.hashCode());
    }

    public final String toString() {
        return "Transport(routeUri=" + this.a + ", route=" + this.b + Extension.C_BRAKE;
    }

    public mw30() {
        this("", null);
    }
}
