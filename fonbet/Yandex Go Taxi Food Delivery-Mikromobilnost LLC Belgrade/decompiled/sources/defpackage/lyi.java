package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.SearchType;
import com.yandex.runtime.image.ImageProvider;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes7.dex */
public abstract class lyi {
    public static BoundingBox a(Map map) {
        return new BoundingBox(g((Map) map.get("southWest")), g((Map) map.get("northEast")));
    }

    public static CameraPosition b(Map map) {
        return new CameraPosition(g((Map) map.get("target")), (float) ((Double) map.get("zoom")).doubleValue(), (float) ((Double) map.get("azimuth")).doubleValue(), (float) ((Double) map.get("tilt")).doubleValue());
    }

    public static IconStyle c(Map map) {
        PointF pointF;
        RotationType rotationType;
        Object obj = map.get("anchor");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            Object obj2 = map2.get("dx");
            Double d = obj2 instanceof Double ? (Double) obj2 : null;
            Object obj3 = map2.get("dy");
            Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
            pointF = (d == null || d2 == null) ? null : new PointF((float) d.doubleValue(), (float) d2.doubleValue());
        } else {
            pointF = null;
        }
        Object obj4 = map.get("flat");
        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        Object obj5 = map.get("rotationType");
        Integer num = obj5 instanceof Integer ? (Integer) obj5 : null;
        if (num != null) {
            int intValue = num.intValue();
            rotationType = intValue != 0 ? intValue != 1 ? RotationType.NO_ROTATION : RotationType.ROTATE : RotationType.NO_ROTATION;
        } else {
            rotationType = null;
        }
        Object obj6 = map.get("scale");
        Double d3 = obj6 instanceof Double ? (Double) obj6 : null;
        Float valueOf = d3 != null ? Float.valueOf((float) d3.doubleValue()) : null;
        Object obj7 = map.get("visible");
        Boolean bool2 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
        Object obj8 = map.get("zIndex");
        Double d4 = obj8 instanceof Double ? (Double) obj8 : null;
        return new IconStyle(pointF, rotationType, d4 != null ? Float.valueOf((float) d4.doubleValue()) : null, bool, bool2, valueOf, null);
    }

    public static b4c0 d(Map map, hdu hduVar) {
        Object obj = map.get("position");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        Point g = g(map2);
        ImageProvider e = e((Map) map.get("placemarkIcon"), hduVar);
        Object obj2 = map.get("iconStyle");
        Map map3 = obj2 instanceof Map ? (Map) obj2 : null;
        return new b4c0(g, e, map3 != null ? c(map3) : null);
    }

    public static ImageProvider e(Map map, hdu hduVar) {
        String str = (String) map.get("type");
        int hashCode = str.hashCode();
        if (hashCode != -2078898639) {
            if (hashCode != -1396204209) {
                if (hashCode == 93121264 && str.equals("asset")) {
                    return ImageProvider.fromAsset((Context) hduVar.b, ((psr) ((gym) hduVar.a).a).c((String) map.get("assetPath")), ((Boolean) map.get("cacheable")).booleanValue());
                }
            } else if (str.equals("base64")) {
                Object obj = map.get("id");
                return new f9v(obj instanceof String ? (String) obj : null, ((Boolean) map.get("cacheable")).booleanValue(), (String) map.get("icon"));
            }
        } else if (str.equals("byteArray")) {
            Object obj2 = map.get("id");
            return new f9v(obj2 instanceof String ? (String) obj2 : null, ((Boolean) map.get("cacheable")).booleanValue(), (byte[]) map.get(Constants.KEY_DATA));
        }
        qir.p(oyr.p("type: ", str, " is not supported"));
        return null;
    }

    public static j4c0 f(Map map, hdu hduVar) {
        Map map2 = (Map) map.get("placemarks");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map2.size()));
        Iterator it = map2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ImageProvider e = e((Map) map.get("placemarkIcon"), hduVar);
                Object obj = map.get("iconStyle");
                Map map3 = obj instanceof Map ? (Map) obj : null;
                return new j4c0(linkedHashMap, e, map3 != null ? c(map3) : null);
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Map map4 = value instanceof Map ? (Map) value : null;
            if (map4 == null) {
                ny61.g("Required value was null.");
                return null;
            }
            linkedHashMap.put(key, g(map4));
        }
    }

    public static Point g(Map map) {
        Object obj = map.get("lat");
        Double d = obj instanceof Double ? (Double) obj : null;
        Object obj2 = map.get("lon");
        Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
        if (d == null) {
            ny61.g("Required value was null.");
            return null;
        }
        if (d2 != null) {
            return new Point(d.doubleValue(), d2.doubleValue());
        }
        ny61.g("Required value was null.");
        return null;
    }

    public static ArrayList h(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((Map) it.next()));
        }
        return arrayList;
    }

    public static Polygon i(Map map) {
        LinearRing linearRing = new LinearRing(h((List) map.get("outerRing")));
        List list = (List) map.get("innerRings");
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new LinearRing(h((List) it.next())));
        }
        return new Polygon(linearRing, arrayList);
    }

    public static ArrayList j(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map map2 : (List) map.get(CRLDistributionPointsExtension.POINTS)) {
            double doubleValue = ((Double) map2.get("lat")).doubleValue();
            double doubleValue2 = ((Double) map2.get("lon")).doubleValue();
            arrayList.add(new RequestPoint(new Point(doubleValue, doubleValue2), RequestPointType.valueOf(((String) map2.get("type")).toUpperCase(Locale.ROOT)), (String) map2.get("point_context"), (String) map2.get("driving_arrival_point_id"), (String) map2.get("indoor_level_id")));
        }
        return arrayList;
    }

    public static ScreenRect k(Map map) {
        Map map2 = (Map) map.get("topLeft");
        ScreenPoint screenPoint = new ScreenPoint((float) ((Double) map2.get(RemoteBioParameters.X)).doubleValue(), (float) ((Double) map2.get(RemoteBioParameters.Y)).doubleValue());
        Map map3 = (Map) map.get("bottomRight");
        return new ScreenRect(screenPoint, new ScreenPoint((float) ((Double) map3.get(RemoteBioParameters.X)).doubleValue(), (float) ((Double) map3.get(RemoteBioParameters.Y)).doubleValue()));
    }

    public static SearchOptions l(Map map) {
        Integer num = (Integer) map.get("resultPageSize");
        Object obj = map.get("userPosition");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        return new SearchOptions(SearchType.NONE.value, null, num, ((Integer) map.get("snippet")).intValue(), EmptyList.a, map2 != null ? g(map2) : null, null, null, null, false, null, false, null, null, null, null, null);
    }

    public static VehicleOptions m(Map map) {
        VehicleType valueOf = VehicleType.valueOf(((String) map.get("vehicleType")).toUpperCase(Locale.ROOT));
        Double d = (Double) map.get("weight");
        Float valueOf2 = d != null ? Float.valueOf((float) d.doubleValue()) : null;
        Double d2 = (Double) map.get("axleWeight");
        Float valueOf3 = d2 != null ? Float.valueOf((float) d2.doubleValue()) : null;
        Double d3 = (Double) map.get("maxWeight");
        Float valueOf4 = d3 != null ? Float.valueOf((float) d3.doubleValue()) : null;
        Double d4 = (Double) map.get("height");
        Float valueOf5 = d4 != null ? Float.valueOf((float) d4.doubleValue()) : null;
        Double d5 = (Double) map.get("width");
        Float valueOf6 = d5 != null ? Float.valueOf((float) d5.doubleValue()) : null;
        Double d6 = (Double) map.get("length");
        Float valueOf7 = d6 != null ? Float.valueOf((float) d6.doubleValue()) : null;
        Double d7 = (Double) map.get("payload");
        return new VehicleOptions(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, d7 != null ? Float.valueOf((float) d7.doubleValue()) : null, (Integer) map.get("ecoClass"), (Boolean) map.get("hasTrailer"), (Boolean) map.get("buswayPermitted"));
    }
}
