package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.map.Rect;
import com.yandex.mapkit.map.RotationType;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class po00 {
    public final kzo a;
    public final MapObjectCollection b;
    public final bq00 c = new bq00();
    public final LinkedHashSet d = new LinkedHashSet();

    public po00(i4n i4nVar, kzo kzoVar) {
        this.a = kzoVar;
        this.b = (MapObjectCollection) i4nVar.h;
        ((m2v) kzoVar.w).G(new uhx(6, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IconStyle a(wrr wrrVar, IconStyle iconStyle) {
        Rect rect;
        PointF pointF;
        RotationType rotationType;
        Float f;
        Float zIndex;
        Boolean bool;
        Boolean flat;
        float floatValue;
        Rect rect2;
        Double d;
        Integer num;
        List list;
        Boolean bool2;
        Double d2;
        Double d3;
        Float valueOf = (wrrVar == null || (d3 = (Double) wrrVar.c) == null) ? null : Float.valueOf((float) d3.doubleValue());
        Float valueOf2 = (wrrVar == null || (d2 = (Double) wrrVar.w) == null) ? null : Float.valueOf((float) d2.doubleValue());
        PointF pointF2 = (valueOf == null || valueOf2 == null) ? null : new PointF(valueOf.floatValue(), valueOf2.floatValue());
        RotationType rotationType2 = (wrrVar == null || (bool2 = (Boolean) wrrVar.x) == null) ? null : bool2.booleanValue() ? RotationType.ROTATE : RotationType.NO_ROTATION;
        if (wrrVar != null && (list = (List) wrrVar.b) != null) {
            if (list.size() != 2) {
                list = null;
            }
            if (list != null) {
                rect = new Rect((PointF) list.get(0), (PointF) list.get(1));
                if (pointF2 == null) {
                    if (iconStyle != null) {
                        pointF2 = iconStyle.getAnchor();
                    } else {
                        pointF = null;
                        if (rotationType2 == null) {
                            if (iconStyle != null) {
                                rotationType2 = iconStyle.getRotationType();
                            } else {
                                rotationType = null;
                                if (wrrVar == null && (num = (Integer) wrrVar.z) != null) {
                                    zIndex = Float.valueOf(num.intValue());
                                } else {
                                    if (iconStyle != null) {
                                        f = null;
                                        if (wrrVar != null || (flat = (Boolean) wrrVar.y) == null) {
                                            if (iconStyle != null) {
                                                bool = null;
                                                Boolean bool3 = Boolean.TRUE;
                                                if (wrrVar != null || (d = (Double) wrrVar.A) == null) {
                                                    Float scale = iconStyle == null ? iconStyle.getScale() : null;
                                                    floatValue = scale == null ? scale.floatValue() : 1.0f;
                                                } else {
                                                    floatValue = (float) d.doubleValue();
                                                }
                                                Float valueOf3 = Float.valueOf(floatValue);
                                                if (rect != null) {
                                                    rect2 = iconStyle != null ? iconStyle.getTappableArea() : null;
                                                } else {
                                                    rect2 = rect;
                                                }
                                                return new IconStyle(pointF, rotationType, f, bool, bool3, valueOf3, rect2);
                                            }
                                            flat = iconStyle.getFlat();
                                        }
                                        bool = flat;
                                        Boolean bool32 = Boolean.TRUE;
                                        if (wrrVar != null) {
                                        }
                                        if (iconStyle == null) {
                                        }
                                        if (scale == null) {
                                        }
                                        Float valueOf32 = Float.valueOf(floatValue);
                                        if (rect != null) {
                                        }
                                        return new IconStyle(pointF, rotationType, f, bool, bool32, valueOf32, rect2);
                                    }
                                    zIndex = iconStyle.getZIndex();
                                }
                                f = zIndex;
                                if (wrrVar != null) {
                                }
                                if (iconStyle != null) {
                                }
                            }
                        }
                        rotationType = rotationType2;
                        if (wrrVar == null) {
                        }
                        if (iconStyle != null) {
                        }
                    }
                }
                pointF = pointF2;
                if (rotationType2 == null) {
                }
                rotationType = rotationType2;
                if (wrrVar == null) {
                }
                if (iconStyle != null) {
                }
            }
        }
        rect = null;
        if (pointF2 == null) {
        }
        pointF = pointF2;
        if (rotationType2 == null) {
        }
        rotationType = rotationType2;
        if (wrrVar == null) {
        }
        if (iconStyle != null) {
        }
    }

    public static IconStyle b(IconStyle iconStyle, float f) {
        PointF anchor = iconStyle.getAnchor();
        RotationType rotationType = iconStyle.getRotationType();
        Float zIndex = iconStyle.getZIndex();
        Boolean flat = iconStyle.getFlat();
        Boolean bool = Boolean.TRUE;
        Float scale = iconStyle.getScale();
        return new IconStyle(anchor, rotationType, zIndex, flat, bool, Float.valueOf((scale != null ? scale.floatValue() : 1.0f) * f), iconStyle.getTappableArea());
    }

    public static void f(PolygonMapObject polygonMapObject, en00 en00Var) {
        h(polygonMapObject, en00Var);
        List list = en00Var.i;
        ArrayList arrayList = null;
        LinearRing linearRing = list != null ? new LinearRing((List<Point>) list) : null;
        List list2 = en00Var.j;
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new LinearRing((List<Point>) it.next()));
            }
        }
        if (linearRing != null) {
            List list4 = arrayList;
            if (arrayList == null) {
                list4 = EmptyList.a;
            }
            polygonMapObject.setGeometry(new Polygon(linearRing, list4));
        }
        Integer num = en00Var.m;
        if (num != null) {
            polygonMapObject.setFillColor(num.intValue());
        }
        Integer num2 = en00Var.n;
        if (num2 != null) {
            polygonMapObject.setStrokeColor(num2.intValue());
        }
        Double d = en00Var.o;
        if (d != null) {
            polygonMapObject.setStrokeWidth((float) d.doubleValue());
        }
        if (en00Var.f != null) {
            polygonMapObject.setZIndex(r6.intValue());
        }
    }

    public static void g(PolylineMapObject polylineMapObject, en00 en00Var) {
        h(polylineMapObject, en00Var);
        List list = en00Var.h;
        if (list != null) {
            polylineMapObject.setGeometry(new Polyline((List<Point>) list));
        }
        Integer num = en00Var.n;
        if (num != null) {
            polylineMapObject.setStrokeColor(num.intValue());
        }
        Double d = en00Var.o;
        if (d != null) {
            polylineMapObject.setStrokeWidth((float) d.doubleValue());
        }
        if (en00Var.f != null) {
            polylineMapObject.setZIndex(r3.intValue());
        }
    }

    public static void h(MapObject mapObject, en00 en00Var) {
        boolean booleanValue;
        Boolean bool = en00Var.d;
        if (bool == null || (booleanValue = bool.booleanValue()) == mapObject.isVisible()) {
            return;
        }
        if (jl40.l(en00Var.e, Boolean.TRUE)) {
            mapObject.setVisible(booleanValue, new Animation(Animation.Type.SMOOTH, 0.25f), new ak00(2));
        } else {
            mapObject.setVisible(booleanValue);
        }
    }

    public final MapObjectCollection c(String str) {
        if (jl40.l(str, "root")) {
            return this.b;
        }
        jv00 d = this.c.d(str);
        MapObject mapObject = d != null ? d.b : null;
        MapObjectCollection mapObjectCollection = mapObject instanceof MapObjectCollection ? (MapObjectCollection) mapObject : null;
        String concat = "no parent for ".concat(str);
        if (mapObjectCollection != null) {
            return mapObjectCollection;
        }
        l0b1.h(new IllegalArgumentException(concat));
        return null;
    }

    public final void d(String str) {
        LinkedHashSet linkedHashSet = this.d;
        if (linkedHashSet.contains(str)) {
            return;
        }
        linkedHashSet.add(str);
        this.a.u("map/map_objects", b.h(new Pair("type", "load_icon"), new Pair(Constants.KEY_DATA, str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(en00 en00Var) {
        String str = en00Var.a;
        bq00 bq00Var = this.c;
        jv00 d = bq00Var.d(str);
        if (d == null) {
            return;
        }
        String str2 = d.a;
        MapObject mapObject = d.b;
        PlacemarkMapObject placemarkMapObject = mapObject instanceof PlacemarkMapObject ? (PlacemarkMapObject) mapObject : null;
        if (placemarkMapObject == null) {
            return;
        }
        h(placemarkMapObject, en00Var);
        String str3 = d.e;
        String str4 = d.g;
        IconStyle iconStyle = d.d;
        IconStyle iconStyle2 = d.f;
        String str5 = en00Var.q;
        String str6 = en00Var.r;
        IconStyle a = a(en00Var.s, iconStyle);
        IconStyle a2 = a(en00Var.t, iconStyle2);
        String str7 = d.h;
        List<PointF> list = en00Var.k;
        if (list != null) {
            placemarkMapObject.setScaleFunction(list);
        }
        Point point = en00Var.g;
        if (point != null) {
            placemarkMapObject.setGeometry(point);
        }
        if (en00Var.f != null) {
            placemarkMapObject.setZIndex(r15.intValue());
        }
        Double d2 = en00Var.l;
        if (d2 != null) {
            placemarkMapObject.setDirection((float) d2.doubleValue());
        }
        String str8 = str5 == null ? str3 : str5;
        String str9 = str6 == null ? str4 : str6;
        if (str8 != null) {
            nav c = bq00Var.c(str8);
            if (c != null) {
                String str10 = c.a;
                if (!jl40.l(str7, str10) || !egz.D(iconStyle, a)) {
                    placemarkMapObject.setIcon(c.b, b(a, c.c));
                    d.h = str10;
                }
                d.d = a;
                d.f = a2;
                if (str5 != null && !str5.equals(str3)) {
                    if (str3 != null) {
                        bq00Var.b(str3, str2);
                    }
                    bq00Var.a(str5, str2);
                    d.e = str5;
                }
                if (str6 != null || str6.equals(str4)) {
                }
                if (str4 != null) {
                    bq00Var.b(str4, str2);
                }
                bq00Var.a(str6, str2);
                d.g = str6;
                return;
            }
            d(str8);
        }
        if (str9 != null) {
            nav c2 = bq00Var.c(str9);
            if (c2 == null) {
                d(str9);
            } else {
                String str11 = c2.a;
                if (!jl40.l(str7, str11) || !egz.D(iconStyle2, a2)) {
                    placemarkMapObject.setIcon(c2.b, b(a2, c2.c));
                    d.h = str11;
                }
            }
        }
        d.d = a;
        d.f = a2;
        if (str5 != null) {
            if (str3 != null) {
            }
            bq00Var.a(str5, str2);
            d.e = str5;
        }
        if (str6 != null) {
        }
    }
}
