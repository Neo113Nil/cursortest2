package com.yandex.mobile.drive.sdk.map;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.Address;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.RoutePointMetadata;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Snippet;
import com.yandex.mapkit.search.ToponymObjectMetadata;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ba20;
import defpackage.ca20;
import defpackage.da20;
import defpackage.i3y;
import defpackage.ike;
import defpackage.klb1;
import defpackage.pn0;
import defpackage.tje;
import defpackage.x920;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class a implements ca20 {
    public final ike a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new pn0(11));
    public final SearchOptions c = new SearchOptions().setSnippets(Snippet.ROUTE_POINT.value);

    public a(ike ikeVar) {
        this.a = ikeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final HashMap a(a aVar, GeoObjectCollection.Item item) {
        Address address;
        String name;
        Point point;
        aVar.getClass();
        GeoObject obj = item.getObj();
        if (obj != null) {
            if (((BaseMetadata) obj.getMetadataContainer().getItem(ToponymObjectMetadata.class)) != null) {
                ToponymObjectMetadata toponymObjectMetadata = (ToponymObjectMetadata) ((BaseMetadata) obj.getMetadataContainer().getItem(ToponymObjectMetadata.class));
                if (toponymObjectMetadata != null) {
                    address = toponymObjectMetadata.getAddress();
                    if (address != null || (name = address.getFormattedAddress()) == null) {
                        name = ((BaseMetadata) obj.getMetadataContainer().getItem(ToponymObjectMetadata.class)) == null ? obj.getName() : obj.getDescriptionText();
                    }
                    RoutePointMetadata routePointMetadata = (RoutePointMetadata) ((BaseMetadata) obj.getMetadataContainer().getItem(RoutePointMetadata.class));
                    String routePointContext = routePointMetadata == null ? routePointMetadata.getRoutePointContext() : null;
                    Geometry geometry = (Geometry) kotlin.collections.a.R(obj.getGeometry());
                    point = geometry == null ? geometry.getPoint() : null;
                    if (point != null) {
                        String name2 = obj.getName();
                        Pair pair = new Pair("title", name2);
                        if (name == null) {
                            name = name2;
                        }
                        return kotlin.collections.b.h(pair, new Pair("subtitle", name), new Pair("context", routePointContext), new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude())));
                    }
                }
                address = null;
                if (address != null) {
                }
                if (((BaseMetadata) obj.getMetadataContainer().getItem(ToponymObjectMetadata.class)) == null) {
                }
                RoutePointMetadata routePointMetadata2 = (RoutePointMetadata) ((BaseMetadata) obj.getMetadataContainer().getItem(RoutePointMetadata.class));
                if (routePointMetadata2 == null) {
                }
                Geometry geometry2 = (Geometry) kotlin.collections.a.R(obj.getGeometry());
                if (geometry2 == null) {
                }
                if (point != null) {
                }
            } else {
                BusinessObjectMetadata businessObjectMetadata = (BusinessObjectMetadata) ((BaseMetadata) obj.getMetadataContainer().getItem(BusinessObjectMetadata.class));
                if (businessObjectMetadata != null) {
                    address = businessObjectMetadata.getAddress();
                    if (address != null) {
                    }
                    if (((BaseMetadata) obj.getMetadataContainer().getItem(ToponymObjectMetadata.class)) == null) {
                    }
                    RoutePointMetadata routePointMetadata22 = (RoutePointMetadata) ((BaseMetadata) obj.getMetadataContainer().getItem(RoutePointMetadata.class));
                    if (routePointMetadata22 == null) {
                    }
                    Geometry geometry22 = (Geometry) kotlin.collections.a.R(obj.getGeometry());
                    if (geometry22 == null) {
                    }
                    if (point != null) {
                    }
                }
                address = null;
                if (address != null) {
                }
                if (((BaseMetadata) obj.getMetadataContainer().getItem(ToponymObjectMetadata.class)) == null) {
                }
                RoutePointMetadata routePointMetadata222 = (RoutePointMetadata) ((BaseMetadata) obj.getMetadataContainer().getItem(RoutePointMetadata.class));
                if (routePointMetadata222 == null) {
                }
                Geometry geometry222 = (Geometry) kotlin.collections.a.R(obj.getGeometry());
                if (geometry222 == null) {
                }
                if (point != null) {
                }
            }
        }
        return null;
    }

    public static Point b(Map map) {
        Object obj = map.get("lat");
        Object obj2 = map.get("lon");
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return new Point(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
        }
        return null;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ike ikeVar = this.a;
            if (hashCode == 168796460) {
                if (str.equals("searchAddress")) {
                    Integer d = klb1.d(x920Var, "zoom");
                    Map map = obj instanceof Map ? (Map) obj : null;
                    Point b = map != null ? b(map) : null;
                    if (b == null) {
                        ((ba20) da20Var).error("invalid_input", null, null);
                        return;
                    } else {
                        tje.N(ikeVar, null, null, new AddressHandler$onMethodCall$2(this, b, d, da20Var, null), 3);
                        return;
                    }
                }
                return;
            }
            if (hashCode == 865726568) {
                if (str.equals("resolveAddress")) {
                    String str2 = (String) klb1.a(x920Var, LaunchBrowserActivity.KEY_URI);
                    if (str2 == null) {
                        ((ba20) da20Var).error("invalid_input", null, null);
                        return;
                    } else {
                        tje.N(ikeVar, null, null, new AddressHandler$onMethodCall$3(this, str2, da20Var, null), 3);
                        return;
                    }
                }
                return;
            }
            if (hashCode == 1782652749 && str.equals("getAddressSuggests")) {
                String str3 = (String) klb1.a(x920Var, "text");
                Map map2 = obj instanceof Map ? (Map) obj : null;
                Point b2 = map2 != null ? b(map2) : null;
                if (b2 == null || str3 == null) {
                    ((ba20) da20Var).error("invalid_input", null, null);
                } else {
                    tje.N(ikeVar, null, null, new AddressHandler$onMethodCall$1(this, b2, str3, da20Var, null), 3);
                }
            }
        }
    }
}
