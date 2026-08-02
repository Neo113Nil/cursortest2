package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;

/* loaded from: classes6.dex */
public final class ng30 {
    public final Route a;
    public final List b;
    public final Screen c;
    public final MtDetailedRouteAnalyticSource d;
    public final Route e;
    public final tpr f;
    public final List g;
    public final lm30 h;
    public final MtDetailedRouteAnalyticType i;
    public final String j;
    public final boolean k;

    public ng30(Route route, List list, Screen screen, MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource, List list2, MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType, int i) {
        this(route, list, screen, mtDetailedRouteAnalyticSource, null, new g92(2, null), (i & 64) != 0 ? EmptyList.a : list2, null, mtDetailedRouteAnalyticType, null, true);
    }

    public ng30(Route route, List list, Screen screen, MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource, Route route2, tpr tprVar, List list2, lm30 lm30Var, MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType, String str, boolean z) {
        this.a = route;
        this.b = list;
        this.c = screen;
        this.d = mtDetailedRouteAnalyticSource;
        this.e = route2;
        this.f = tprVar;
        this.g = list2;
        this.h = lm30Var;
        this.i = mtDetailedRouteAnalyticType;
        this.j = str;
        this.k = z;
    }
}
