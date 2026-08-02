package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public abstract class aqb1 {
    public static final int a(MtTransportType mtTransportType) {
        switch (jj40.a[mtTransportType.ordinal()]) {
            case 1:
            case 3:
            case 16:
                return kyh0.mt_stops_bus_stop_description;
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 12:
            case 19:
            case 20:
            case 21:
            case 23:
                return kyh0.mt_stop_default_name;
            case 5:
                return kyh0.mt_stops_tramway_stop_description;
            case 9:
                return kyh0.mt_stops_underground_stop_description;
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                return kyh0.mt_stops_railway_stop_description;
            case 17:
            case 18:
                return kyh0.mt_stops_water_stop_description;
            case 22:
                return kyh0.mt_stops_trolleybus_stop_description;
            default:
                w511.b();
                return 0;
        }
    }

    public static final int b(MtTransportType mtTransportType) {
        switch (jj40.a[mtTransportType.ordinal()]) {
            case 1:
                return kyh0.mt_routes_bus;
            case 2:
                return kyh0.mt_routes_metrobus;
            case 3:
                return kyh0.mt_routes_minibus;
            case 4:
                return kyh0.mt_routes_dolmus;
            case 5:
                return kyh0.mt_routes_tramway;
            case 6:
                return kyh0.mt_routes_historic_tramway;
            case 7:
                return kyh0.mt_routes_rapid_tramway;
            case 8:
                return kyh0.mt_routes_dubai_tramway;
            case 9:
                return kyh0.mt_routes_underground;
            case 10:
                return kyh0.mt_routes_railway;
            case 11:
            case 12:
            case 13:
            case 14:
                return kyh0.mt_routes_suburban;
            case 15:
                return kyh0.mt_routes_aeroexpress;
            case 16:
                return kyh0.mt_routes_aeroexpress;
            case 17:
                return kyh0.mt_routes_water;
            case 18:
                return kyh0.mt_routes_ferry;
            case 19:
                return kyh0.mt_routes_funicular;
            case 20:
                return kyh0.mt_routes_cabel;
            case 21:
                return kyh0.mt_routes_aero;
            case 22:
                return kyh0.mt_routes_trolleybus;
            case 23:
                return 0;
            default:
                w511.b();
                return 0;
        }
    }

    public static final boolean c(MtTransportType mtTransportType) {
        return j73.f0(new MtTransportType[]{MtTransportType.SUBURBAN, MtTransportType.SUBURBAN_EXPRESS, MtTransportType.MCD, MtTransportType.SBAHN}).contains(mtTransportType);
    }

    public static final void d(x22 x22Var, String str, Map map) {
        x22Var.reportEvent("contact_book", gw00.e(new Pair(str, map)));
    }

    public static final void e(x22 x22Var, String str, int i, long j) {
        d(x22Var, "native_count", b.i(new Pair("uuid", str), new Pair("count", Integer.valueOf(i)), new Pair("version", Long.valueOf(j))));
    }
}
