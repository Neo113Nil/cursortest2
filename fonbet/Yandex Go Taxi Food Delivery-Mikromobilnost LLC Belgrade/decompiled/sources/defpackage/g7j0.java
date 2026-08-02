package defpackage;

import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class g7j0 {
    public final bbl0 a;
    public final kb5 b;
    public final boolean c;
    public final RouteStatsMode d;
    public final boolean e;

    public g7j0(kb5 kb5Var, bbl0 bbl0Var, RouteStatsMode routeStatsMode, boolean z, boolean z2) {
        this.a = bbl0Var;
        this.b = kb5Var;
        this.c = z;
        this.d = routeStatsMode;
        this.e = z2;
    }

    public static g7j0 a(g7j0 g7j0Var, bbl0 bbl0Var) {
        kb5 kb5Var = g7j0Var.b;
        boolean z = g7j0Var.c;
        RouteStatsMode routeStatsMode = g7j0Var.d;
        boolean z2 = g7j0Var.e;
        g7j0Var.getClass();
        return new g7j0(kb5Var, bbl0Var, routeStatsMode, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7j0)) {
            return false;
        }
        g7j0 g7j0Var = (g7j0) obj;
        return this.a.equals(g7j0Var.a) && jl40.l(this.b, g7j0Var.b) && this.c == g7j0Var.c && this.d == g7j0Var.d && this.e == g7j0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestInfo(data=");
        sb.append(this.a);
        sb.append(", tariffInfo=");
        sb.append(this.b);
        sb.append(", tariffTemporarilyDisabled=");
        sb.append(this.c);
        sb.append(", mode=");
        sb.append(this.d);
        sb.append(", includesDeliveryIntervals=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
