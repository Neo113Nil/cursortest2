package defpackage;

import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayerFactory;
import com.yandex.mapkit.navigation.transport.layer.RouteView;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.RequestPointStyleData;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.TransportRouteViewStyleData;
import ru.yandextaxi.flutter_yandex_mapkit.styles.transport.UserLocationIconStyleData;

/* loaded from: classes7.dex */
public final class m311 extends k45 {
    public an8 A;
    public final ssr b;
    public final ini0 c;
    public final f311 w;
    public final h311 x;
    public final eu00 y;
    public final f4u z;

    public m311(ssr ssrVar, ini0 ini0Var, f311 f311Var, h311 h311Var, eu00 eu00Var, f4u f4uVar) {
        super(ssrVar, "transport_navigation_layer");
        this.b = ssrVar;
        this.c = ini0Var;
        this.w = f311Var;
        this.x = h311Var;
        this.y = eu00Var;
        this.z = f4uVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        TransportRouteViewStyleData transportRouteViewStyleData;
        RequestPointStyleData requestPointStyleData;
        UserLocationIconStyleData userLocationIconStyleData;
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ini0 ini0Var = this.c;
            h311 h311Var = this.x;
            switch (hashCode) {
                case -2140167331:
                    if (str.equals("selectRequestPoint")) {
                        ((NavigationLayer) h311Var.a).selectRequestPoint(((Integer) obj).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -2063376773:
                    if (str.equals("getRoutesSource")) {
                        ((ba20) da20Var).success(((NavigationLayer) h311Var.a).getRoutesSource().name().toLowerCase(Locale.ROOT));
                        return;
                    }
                    break;
                case -1580334043:
                    if (str.equals("setIsRequestPointVisible")) {
                        ((NavigationLayer) h311Var.a).setShowRequestPoints(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -75062501:
                    if (str.equals("getView")) {
                        RouteView view = ((NavigationLayer) h311Var.a).getView((Route) ini0Var.c((String) obj, ReferenceType.TRANSPORT_ROUTE));
                        ((ba20) da20Var).success(view != null ? ini0Var.a(ReferenceType.TRANSPORT_ROUTE_VIEW, view) : null);
                        return;
                    }
                    break;
                case -57267306:
                    if (str.equals("refreshStyle")) {
                        ((NavigationLayer) h311Var.a).refreshStyle();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 3237136:
                    if (str.equals("init")) {
                        this.A = new an8(this.b);
                        NavigationLayer createNavigationLayer = NavigationLayerFactory.createNavigationLayer(((au00) this.y.a).getMapWindow(), this.A, (Navigation) this.w.a);
                        h311Var.a = createNavigationLayer;
                        this.z.a = createNavigationLayer.getCamera();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 203311789:
                    if (str.equals("selectRoute")) {
                        String str2 = (String) obj;
                        if (str2 != null) {
                            ((NavigationLayer) h311Var.a).selectRoute((RouteView) ini0Var.c(str2, ReferenceType.TRANSPORT_ROUTE_VIEW));
                        } else {
                            ((NavigationLayer) h311Var.a).selectRoute(null);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 326628536:
                    if (str.equals("getSelectedRoute")) {
                        RouteView selectedRoute = ((NavigationLayer) h311Var.a).selectedRoute();
                        if (selectedRoute == null) {
                            ((ba20) da20Var).success(null);
                            return;
                        } else {
                            ((ba20) da20Var).success(ini0Var.a(ReferenceType.TRANSPORT_ROUTE_VIEW, selectedRoute));
                            return;
                        }
                    }
                    break;
                case 534770078:
                    if (str.equals("deselectRequestPoint")) {
                        ((NavigationLayer) h311Var.a).deselectRequestPoint();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 601145390:
                    if (str.equals("removeFromMap")) {
                        ((NavigationLayer) h311Var.a).removeFromMap();
                        h311Var.a = null;
                        this.A = null;
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 737408709:
                    if (str.equals("setRouteViewStyle")) {
                        Map map = (Map) obj;
                        if (map != null) {
                            u3u u3uVar = (u3u) w3u.a.getValue();
                            Object a = u3uVar.a(u3uVar.k(map), TransportRouteViewStyleData.class);
                            if (a == null) {
                                ((ba20) da20Var).error("object_not_parsed", g8e.o("Could not parse ", qoi0.a(TransportRouteViewStyleData.class).d()), oyr.p("Something went wrong with ", qoi0.a(TransportRouteViewStyleData.class).d(), " parsing"));
                                a = null;
                            }
                            transportRouteViewStyleData = (TransportRouteViewStyleData) a;
                            if (transportRouteViewStyleData == null) {
                                return;
                            }
                        } else {
                            transportRouteViewStyleData = null;
                        }
                        an8 an8Var = this.A;
                        if (an8Var != null) {
                            ((ukf) an8Var.b).b = transportRouteViewStyleData;
                        }
                        ((NavigationLayer) h311Var.a).refreshStyle();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 770882112:
                    if (str.equals("getRoutes")) {
                        List<RouteView> routes = ((NavigationLayer) h311Var.a).getRoutes();
                        ArrayList arrayList = new ArrayList(tcc.n(routes, 10));
                        Iterator<T> it = routes.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ini0Var.a(ReferenceType.TRANSPORT_ROUTE_VIEW, (RouteView) it.next()));
                        }
                        ((ba20) da20Var).success(arrayList);
                        return;
                    }
                    break;
                case 1342111285:
                    if (str.equals("setRequestPointIconStyle")) {
                        Map map2 = (Map) obj;
                        if (map2 != null) {
                            u3u u3uVar2 = (u3u) w3u.a.getValue();
                            Object a2 = u3uVar2.a(u3uVar2.k(map2), RequestPointStyleData.class);
                            if (a2 == null) {
                                ((ba20) da20Var).error("object_not_parsed", g8e.o("Could not parse ", qoi0.a(RequestPointStyleData.class).d()), oyr.p("Something went wrong with ", qoi0.a(RequestPointStyleData.class).d(), " parsing"));
                                a2 = null;
                            }
                            requestPointStyleData = (RequestPointStyleData) a2;
                            if (requestPointStyleData == null) {
                                return;
                            }
                        } else {
                            requestPointStyleData = null;
                        }
                        an8 an8Var2 = this.A;
                        if (an8Var2 != null) {
                            ((p1b) an8Var2.x).b = requestPointStyleData;
                        }
                        ((NavigationLayer) h311Var.a).refreshStyle();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1408678070:
                    if (str.equals("setUserLocationIconStyle")) {
                        Map map3 = (Map) obj;
                        if (map3 != null) {
                            u3u u3uVar3 = (u3u) w3u.a.getValue();
                            Object a3 = u3uVar3.a(u3uVar3.k(map3), UserLocationIconStyleData.class);
                            if (a3 == null) {
                                ((ba20) da20Var).error("object_not_parsed", g8e.o("Could not parse ", qoi0.a(UserLocationIconStyleData.class).d()), oyr.p("Something went wrong with ", qoi0.a(UserLocationIconStyleData.class).d(), " parsing"));
                                a3 = null;
                            }
                            userLocationIconStyleData = (UserLocationIconStyleData) a3;
                            if (userLocationIconStyleData == null) {
                                return;
                            }
                        } else {
                            userLocationIconStyleData = null;
                        }
                        an8 an8Var3 = this.A;
                        if (an8Var3 != null) {
                            ((vbb) an8Var3.w).b = userLocationIconStyleData;
                        }
                        ((NavigationLayer) h311Var.a).refreshStyle();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
