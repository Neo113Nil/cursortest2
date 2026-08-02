package defpackage;

import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.runtime.image.ImageProvider;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class fp00 extends k45 {
    public final ini0 b;
    public final eu00 c;
    public final hdu w;
    public final List x;
    public final t7c y;

    public fp00(ssr ssrVar, ini0 ini0Var, eu00 eu00Var, hdu hduVar, List list, t7c t7cVar) {
        super(ssrVar, "map_objects_collection");
        this.b = ini0Var;
        this.c = eu00Var;
        this.w = hduVar;
        this.x = list;
        this.y = t7cVar;
    }

    public final MapObjectCollection b(String str) {
        return str.length() == 0 ? ((au00) this.c.a).getMapWindow().getMap().getMapObjects() : (MapObjectCollection) this.b.c(str, ReferenceType.MAP_OBJECTS_COLLECTION);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            String str2 = "lon";
            hdu hduVar = this.w;
            ini0 ini0Var = this.b;
            Object obj2 = "fillColor";
            Double d = null;
            switch (hashCode) {
                case -1603783230:
                    if (str.equals("addCircles")) {
                        Map map = (Map) obj;
                        MapObjectCollection b = b((String) map.get("layerId"));
                        for (Map.Entry entry : ((Map) map.get(Constants.KEY_DATA)).entrySet()) {
                            String str3 = (String) entry.getKey();
                            Map map2 = (Map) entry.getValue();
                            Map map3 = (Map) map2.get("geometry");
                            Circle circle = new Circle(lyi.g((Map) map3.get("center")), (float) ((Double) map3.get("radius")).doubleValue());
                            int b2 = dob1.b((String) map2.get("strokeColor"));
                            float doubleValue = (float) ((Double) map2.get("strokeWidth")).doubleValue();
                            int b3 = dob1.b((String) map2.get(obj2));
                            CircleMapObject addCircle = b.addCircle(circle);
                            addCircle.setStrokeColor(b2);
                            addCircle.setStrokeWidth(doubleValue);
                            addCircle.setFillColor(b3);
                            ini0Var.b(str3, ReferenceType.MAP_OBJECT, addCircle);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -854558288:
                    if (str.equals("setVisible")) {
                        Map map4 = (Map) obj;
                        String str4 = (String) map4.get("layerId");
                        boolean booleanValue = ((Boolean) map4.get(Constants.KEY_DATA)).booleanValue();
                        MapObjectCollection b4 = b(str4);
                        if (!b4.isValid()) {
                            b4 = null;
                        }
                        if (b4 == null) {
                            ((ba20) da20Var).error("error", oyr.p("MapObjectCollection ", str4, " is not valid"), null);
                            return;
                        } else {
                            b4.setVisible(booleanValue);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    }
                    break;
                case -508151876:
                    if (str.equals("removeMapObjects")) {
                        Map map5 = (Map) obj;
                        MapObjectCollection b5 = b((String) map5.get("layerId"));
                        List list = (List) map5.get(Constants.KEY_DATA);
                        Iterator it = this.x.iterator();
                        while (it.hasNext()) {
                            ((j070) it.next()).getClass();
                        }
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            MapObject mapObject = (MapObject) ini0Var.e((String) it2.next(), ReferenceType.MAP_OBJECT);
                            if (mapObject != null && mapObject.isValid()) {
                                try {
                                    b5.remove(mapObject);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -412484038:
                    if (str.equals("addPolygons")) {
                        Map map6 = (Map) obj;
                        MapObjectCollection b6 = b((String) map6.get("layerId"));
                        for (Map.Entry entry2 : ((Map) map6.get(Constants.KEY_DATA)).entrySet()) {
                            String str5 = (String) entry2.getKey();
                            Map map7 = (Map) entry2.getValue();
                            PolygonMapObject addPolygon = b6.addPolygon(lyi.i((Map) map7.get("geometry")));
                            Object obj3 = obj2;
                            String str6 = (String) map7.get(obj3);
                            if (str6 != null) {
                                addPolygon.setFillColor(dob1.b(str6));
                            }
                            String str7 = (String) map7.get("strokeColor");
                            if (str7 != null) {
                                addPolygon.setStrokeColor(dob1.b(str7));
                            }
                            Double d2 = (Double) map7.get("strokeWidth");
                            if (d2 != null) {
                                addPolygon.setStrokeWidth((float) d2.doubleValue());
                            }
                            ini0Var.b(str5, ReferenceType.MAP_OBJECT, addPolygon);
                            obj2 = obj3;
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -233552352:
                    if (str.equals("addPlacemarks")) {
                        Map map8 = (Map) obj;
                        MapObjectCollection b7 = b((String) map8.get("layerId"));
                        for (Map.Entry entry3 : ((Map) map8.get(Constants.KEY_DATA)).entrySet()) {
                            String str8 = (String) entry3.getKey();
                            b4c0 d3 = lyi.d((Map) entry3.getValue(), hduVar);
                            PlacemarkMapObject addPlacemark = b7.addPlacemark();
                            addPlacemark.setGeometry(d3.a);
                            ImageProvider imageProvider = d3.b;
                            IconStyle iconStyle = d3.c;
                            if (iconStyle == null) {
                                iconStyle = new IconStyle();
                            }
                            addPlacemark.setIcon(imageProvider, iconStyle);
                            ini0Var.b(str8, ReferenceType.MAP_OBJECT, addPlacemark);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 94746189:
                    if (str.equals("clear")) {
                        String str9 = (String) ((Map) obj).get("layerId");
                        MapObjectCollection b8 = b(str9);
                        if (!b8.isValid()) {
                            b8 = null;
                        }
                        if (b8 == null) {
                            ((ba20) da20Var).error("error", oyr.p("MapObjectCollection ", str9, " is not valid"), null);
                            return;
                        } else {
                            b8.clear();
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    }
                    break;
                case 102335250:
                    if (str.equals("addPolylines")) {
                        Map map9 = (Map) obj;
                        MapObjectCollection b9 = b((String) map9.get("layerId"));
                        for (Map.Entry entry4 : ((Map) map9.get(Constants.KEY_DATA)).entrySet()) {
                            String str10 = (String) entry4.getKey();
                            Map map10 = (Map) entry4.getValue();
                            List list2 = (List) ((Map) map10.get("geometry")).get(CRLDistributionPointsExtension.POINTS);
                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                Map map11 = (Map) it3.next();
                                Object obj4 = map11.get("lat");
                                Double d4 = obj4 instanceof Double ? (Double) obj4 : d;
                                Object obj5 = map11.get(str2);
                                Double d5 = obj5 instanceof Double ? (Double) obj5 : d;
                                if (d4 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                if (d5 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                arrayList.add(new Point(d4.doubleValue(), d5.doubleValue()));
                                str10 = str10;
                                it3 = it3;
                                str2 = str2;
                                d = null;
                            }
                            String str11 = str10;
                            String str12 = str2;
                            PolylineMapObject addPolyline = b9.addPolyline(new Polyline(arrayList));
                            String str13 = (String) map10.get("strokeColor");
                            if (str13 != null) {
                                addPolyline.setStrokeColor(dob1.b(str13));
                            }
                            Double d6 = (Double) map10.get("strokeWidth");
                            if (d6 != null) {
                                addPolyline.setStrokeWidth((float) d6.doubleValue());
                            }
                            Double d7 = (Double) map10.get("dashLength");
                            if (d7 != null) {
                                addPolyline.setDashLength((float) d7.doubleValue());
                            }
                            Double d8 = (Double) map10.get("gapLength");
                            if (d8 != null) {
                                addPolyline.setGapLength((float) d8.doubleValue());
                            }
                            ini0Var.b(str11, ReferenceType.MAP_OBJECT, addPolyline);
                            str2 = str12;
                            d = null;
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 124915431:
                    if (str.equals("addEmptyPolylines")) {
                        Map map12 = (Map) obj;
                        MapObjectCollection b10 = b((String) map12.get("layerId"));
                        Iterator it4 = ((List) map12.get(Constants.KEY_DATA)).iterator();
                        while (it4.hasNext()) {
                            ini0Var.b((String) it4.next(), ReferenceType.MAP_OBJECT, b10.addPolyline());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 466433259:
                    if (str.equals("addEmptyPlacemarks")) {
                        Map map13 = (Map) obj;
                        MapObjectCollection b11 = b((String) map13.get("layerId"));
                        for (Map.Entry entry5 : ((Map) map13.get(Constants.KEY_DATA)).entrySet()) {
                            String str14 = (String) entry5.getKey();
                            Map map14 = (Map) entry5.getValue();
                            Object obj6 = map14.get("lat");
                            Double d9 = obj6 instanceof Double ? (Double) obj6 : null;
                            Object obj7 = map14.get("lon");
                            Double d10 = obj7 instanceof Double ? (Double) obj7 : null;
                            if (d9 == null) {
                                ny61.g("Required value was null.");
                                return;
                            } else {
                                if (d10 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                Point point = new Point(d9.doubleValue(), d10.doubleValue());
                                PlacemarkMapObject addPlacemark2 = b11.addPlacemark();
                                addPlacemark2.setGeometry(point);
                                ini0Var.b(str14, ReferenceType.MAP_OBJECT, addPlacemark2);
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 883753562:
                    if (str.equals("addPlacemarksByPoints")) {
                        Map map15 = (Map) obj;
                        MapObjectCollection b12 = b((String) map15.get("layerId"));
                        j4c0 f = lyi.f((Map) map15.get(Constants.KEY_DATA), hduVar);
                        LinkedHashMap linkedHashMap = f.a;
                        List<Point> J0 = a.J0(linkedHashMap.values());
                        List J02 = a.J0(linkedHashMap.keySet());
                        ImageProvider imageProvider2 = f.b;
                        IconStyle iconStyle2 = f.c;
                        if (iconStyle2 == null) {
                            iconStyle2 = new IconStyle();
                        }
                        int i = 0;
                        for (Object obj8 : b12.addPlacemarks(J0, imageProvider2, iconStyle2)) {
                            int i2 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            ini0Var.b((String) J02.get(i), ReferenceType.MAP_OBJECT, (PlacemarkMapObject) obj8);
                            i = i2;
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        ini0Var.e((String) obj, ReferenceType.MAP_OBJECTS_COLLECTION);
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1844875984:
                    if (str.equals("addClusterizedMapObjectCollection")) {
                        Map map16 = obj instanceof Map ? (Map) obj : null;
                        Object obj9 = map16 != null ? map16.get("layerId") : null;
                        String str15 = obj9 instanceof String ? (String) obj9 : null;
                        Object obj10 = map16 != null ? map16.get("collectionId") : null;
                        String str16 = obj10 instanceof String ? (String) obj10 : null;
                        if (str15 == null || str16 == null) {
                            ((ba20) da20Var).error("error", "addClusterizedMapObjectCollection: layerId and collectionId required", null);
                            return;
                        }
                        MapObjectCollection b13 = b(str15);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        z7c z7cVar = new z7c(str16, this.y, ini0Var, linkedHashMap2);
                        ClusterizedPlacemarkCollection addClusterizedPlacemarkCollection = b13.addClusterizedPlacemarkCollection(z7cVar);
                        ep00 ep00Var = new ep00(this, str16);
                        addClusterizedPlacemarkCollection.addTapListener(ep00Var);
                        ini0Var.b(str16, ReferenceType.CLUSTERIZED_PLACEMARK_COLLECTION, new r8c(addClusterizedPlacemarkCollection, linkedHashMap2, z7cVar, ep00Var));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
