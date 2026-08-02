package defpackage;

import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsEntryPointSource;
import ru.yandex.taxi.masstransit.trains.search.StationSearchOpenReason;

/* loaded from: classes6.dex */
public final class og40 {
    public final xf40 a;

    public og40(xf40 xf40Var) {
        this.a = xf40Var;
    }

    public static oh40 a(nh40 nh40Var, StationSearchOpenReason stationSearchOpenReason, TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource) {
        kh40 kh40Var;
        kh40 kh40Var2;
        kh40 kh40Var3;
        kh40 kh40Var4;
        String str = null;
        String str2 = (nh40Var == null || (kh40Var4 = nh40Var.a) == null) ? null : kh40Var4.a;
        String str3 = (nh40Var == null || (kh40Var3 = nh40Var.a) == null) ? null : kh40Var3.b;
        String str4 = (nh40Var == null || (kh40Var2 = nh40Var.b) == null) ? null : kh40Var2.a;
        if (nh40Var != null && (kh40Var = nh40Var.b) != null) {
            str = kh40Var.b;
        }
        return new oh40(str2, str3, str4, str, stationSearchOpenReason, transportRouteAnalytics$RouteOptionsEntryPointSource);
    }
}
