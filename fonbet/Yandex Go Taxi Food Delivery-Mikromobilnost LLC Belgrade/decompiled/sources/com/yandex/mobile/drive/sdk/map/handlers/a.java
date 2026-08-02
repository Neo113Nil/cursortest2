package com.yandex.mobile.drive.sdk.map.handlers;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapType;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.OffscreenMapWindow;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mobile.drive.sdk.map.handlers.a;
import defpackage.ag00;
import defpackage.b0w;
import defpackage.bb51;
import defpackage.bgt;
import defpackage.bvf0;
import defpackage.ce5;
import defpackage.d2r0;
import defpackage.e2r0;
import defpackage.ee5;
import defpackage.efp0;
import defpackage.en00;
import defpackage.es7;
import defpackage.f2r0;
import defpackage.fib1;
import defpackage.fob1;
import defpackage.gr00;
import defpackage.i4n;
import defpackage.iez;
import defpackage.ike;
import defpackage.jib1;
import defpackage.jl40;
import defpackage.k200;
import defpackage.kgp0;
import defpackage.kht;
import defpackage.ko00;
import defpackage.kzo;
import defpackage.l0b1;
import defpackage.l4r0;
import defpackage.lbp0;
import defpackage.lo00;
import defpackage.m2v;
import defpackage.mo00;
import defpackage.mwi0;
import defpackage.n4r0;
import defpackage.ngu0;
import defpackage.nwi0;
import defpackage.ny61;
import defpackage.po00;
import defpackage.ps00;
import defpackage.qo00;
import defpackage.rm00;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.u1u0;
import defpackage.u621;
import defpackage.vs11;
import defpackage.w511;
import defpackage.wm00;
import defpackage.wrr;
import defpackage.xl00;
import defpackage.z2r0;
import defpackage.zo00;
import defpackage.zvi;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes15.dex */
public final class a implements lbp0 {
    public final i4n a;
    public final tls b;
    public final kzo c;
    public final OffscreenMapWindow d;
    public final com.yandex.mobile.drive.sdk.map.tools.a e;
    public CarparksLayer g;
    public final ike f = bvf0.b();
    public final b0w h = new b0w(1, this);

    public a(i4n i4nVar, zvi zviVar, kzo kzoVar, OffscreenMapWindow offscreenMapWindow, com.yandex.mobile.drive.sdk.map.tools.a aVar) {
        this.a = i4nVar;
        this.b = zviVar;
        this.c = kzoVar;
        this.d = offscreenMapWindow;
        this.e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x03d8, code lost:
    
        if (r13 == r1) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, gr00 gr00Var, ContinuationImpl continuationImpl) {
        MapFlutterHandler$bind$handleMapRequest$1 mapFlutterHandler$bind$handleMapRequest$1;
        int i;
        Bitmap captureScreenshot;
        ScreenPoint screenPoint;
        if (continuationImpl instanceof MapFlutterHandler$bind$handleMapRequest$1) {
            mapFlutterHandler$bind$handleMapRequest$1 = (MapFlutterHandler$bind$handleMapRequest$1) continuationImpl;
            int i2 = mapFlutterHandler$bind$handleMapRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapFlutterHandler$bind$handleMapRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapFlutterHandler$bind$handleMapRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapFlutterHandler$bind$handleMapRequest$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return zy11Var;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                        }
                    }
                    b.b(obj);
                    return obj;
                }
                b.b(obj);
                if (gr00Var instanceof es7) {
                    i4n i4nVar = aVar.a;
                    es7 es7Var = (es7) gr00Var;
                    BoundingBox boundingBox = new BoundingBox(es7Var.a, es7Var.b);
                    boolean z = es7Var.c;
                    com.yandex.mobile.drive.sdk.map.b bVar = (com.yandex.mobile.drive.sdk.map.b) i4nVar.i;
                    bVar.getClass();
                    Float valueOf = Float.valueOf(0.0f);
                    Geometry fromBoundingBox = Geometry.fromBoundingBox(boundingBox);
                    Map map = bVar.c;
                    CameraPosition cameraPosition = z ? map.cameraPosition(fromBoundingBox, null, valueOf, valueOf) : map.cameraPosition(fromBoundingBox);
                    return kotlin.collections.b.h(new Pair("lat", new Double(cameraPosition.getTarget().getLatitude())), new Pair("lon", new Double(cameraPosition.getTarget().getLongitude())), new Pair("zoom", new Float(cameraPosition.getZoom())), new Pair("azimuth", new Float(cameraPosition.getAzimuth())), new Pair("tilt", new Float(cameraPosition.getTilt())));
                }
                if (gr00Var instanceof d2r0) {
                    MapFlutterHandler$bind$handleMapRequest$4 mapFlutterHandler$bind$handleMapRequest$4 = new MapFlutterHandler$bind$handleMapRequest$4(aVar, gr00Var, null);
                    mapFlutterHandler$bind$handleMapRequest$1.L$0 = null;
                    mapFlutterHandler$bind$handleMapRequest$1.L$1 = null;
                    mapFlutterHandler$bind$handleMapRequest$1.label = 1;
                    Object w = kotlinx.coroutines.a.w(1000L, mapFlutterHandler$bind$handleMapRequest$4, mapFlutterHandler$bind$handleMapRequest$1);
                    if (w != coroutineSingletons) {
                        return w;
                    }
                } else {
                    if (gr00Var instanceof bb51) {
                        float f = vs11.a;
                        ArrayList<Point> arrayList = ((bb51) gr00Var).a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Point point : arrayList) {
                            i4n i4nVar2 = aVar.a;
                            if (Math.abs(point.getLatitude()) > Double.MAX_VALUE || Math.abs(point.getLongitude()) > Double.MAX_VALUE) {
                                l0b1.h(new AssertionError("non-finite point", null));
                                screenPoint = null;
                            } else {
                                screenPoint = ((MapWindow) i4nVar2.c).worldToScreen(point);
                            }
                            HashMap h = screenPoint != null ? kotlin.collections.b.h(new Pair(RemoteBioParameters.X, new Float(screenPoint.getX() / f)), new Pair(RemoteBioParameters.Y, new Float(screenPoint.getY() / f))) : null;
                            if (h != null) {
                                arrayList2.add(h);
                            }
                        }
                        return kotlin.collections.b.h(new Pair(CRLDistributionPointsExtension.POINTS, arrayList2));
                    }
                    if (gr00Var instanceof efp0) {
                        float f2 = vs11.a;
                        ArrayList<ScreenPoint> arrayList3 = ((efp0) gr00Var).a;
                        ArrayList arrayList4 = new ArrayList();
                        for (ScreenPoint screenPoint2 : arrayList3) {
                            Point screenToWorld = ((MapWindow) aVar.a.c).screenToWorld(new ScreenPoint(screenPoint2.getX() * f2, screenPoint2.getY() * f2));
                            HashMap j = screenToWorld != null ? fib1.j(screenToWorld) : null;
                            if (j != null) {
                                arrayList4.add(j);
                            }
                        }
                        return kotlin.collections.b.h(new Pair(CRLDistributionPointsExtension.POINTS, arrayList4));
                    }
                    if (gr00Var instanceof bgt) {
                        VisibleRegion visibleRegion = ((MapWindow) aVar.a.c).getMap().getVisibleRegion();
                        return kotlin.collections.b.h(new Pair("topLeft", fib1.i(visibleRegion.getTopLeft())), new Pair("topRight", fib1.i(visibleRegion.getTopRight())), new Pair("bottomLeft", fib1.i(visibleRegion.getBottomLeft())), new Pair("bottomRight", fib1.i(visibleRegion.getBottomRight())));
                    }
                    if (!(gr00Var instanceof z2r0)) {
                        if (gr00Var instanceof l4r0) {
                            com.yandex.mobile.drive.sdk.map.tools.a aVar2 = aVar.e;
                            if (aVar2 != null) {
                                Map map2 = ((MapWindow) aVar.a.c).getMap();
                                String str = ((l4r0) gr00Var).a;
                                IdentityHashMap identityHashMap = aVar2.f;
                                Object obj2 = identityHashMap.get(map2);
                                if (obj2 == null) {
                                    obj2 = new ps00(map2);
                                    identityHashMap.put(map2, obj2);
                                }
                                ps00 ps00Var = (ps00) obj2;
                                if (!jl40.l(ps00Var.b, str)) {
                                    kotlinx.coroutines.a.g(aVar2.d.a, null);
                                    ps00Var.a.setMapStyle(42, str);
                                    ps00Var.b = str;
                                    return zy11Var;
                                }
                                return zy11Var;
                            }
                            return null;
                        }
                        if (gr00Var instanceof n4r0) {
                            i4n i4nVar3 = aVar.a;
                            MapType mapType = ((n4r0) gr00Var).a.equals("satellite") ? MapType.SATELLITE : MapType.VECTOR_MAP;
                            if (((MapType) i4nVar3.f) != mapType) {
                                i4nVar3.f = mapType;
                                ((MapWindow) i4nVar3.c).getMap().setMapType(mapType);
                                return zy11Var;
                            }
                        } else {
                            if (gr00Var instanceof e2r0) {
                                i4n i4nVar4 = aVar.a;
                                boolean z2 = ((e2r0) gr00Var).a;
                                Map map3 = ((com.yandex.mobile.drive.sdk.map.b) i4nVar4.i).c;
                                map3.setZoomGesturesEnabled(z2);
                                map3.setFastTapEnabled(z2);
                                return zy11Var;
                            }
                            int i3 = 27;
                            if (gr00Var instanceof f2r0) {
                                boolean z3 = ((f2r0) gr00Var).a;
                                CarparksLayer carparksLayer = aVar.g;
                                if (z3) {
                                    tls tlsVar = aVar.b;
                                    if (tlsVar == null) {
                                        tlsVar = new iez(i3);
                                    }
                                    if (carparksLayer == null) {
                                        carparksLayer = (CarparksLayer) tlsVar.invoke((MapWindow) aVar.a.c);
                                        aVar.g = carparksLayer;
                                    }
                                    carparksLayer.setVisible(true);
                                    return zy11Var;
                                }
                                if (carparksLayer != null) {
                                    carparksLayer.setVisible(false);
                                }
                            } else {
                                if (gr00Var instanceof u621) {
                                    String str2 = ((u621) gr00Var).a;
                                    tls tlsVar2 = aVar.b;
                                    if (tlsVar2 == null) {
                                        tlsVar2 = new iez(i3);
                                    }
                                    CarparksLayer carparksLayer2 = aVar.g;
                                    if (carparksLayer2 == null) {
                                        carparksLayer2 = (CarparksLayer) tlsVar2.invoke((MapWindow) aVar.a.c);
                                        aVar.g = carparksLayer2;
                                    }
                                    return Boolean.valueOf(carparksLayer2.setCarparksStyle(str2));
                                }
                                if (jl40.l(gr00Var, ag00.a)) {
                                    ((MapWindow) aVar.a.c).getMap().getMapObjects().clear();
                                    ((MapObjectCollection) aVar.a.h).clear();
                                    return zy11Var;
                                }
                                if (!(gr00Var instanceof xl00)) {
                                    if (!jl40.l(gr00Var, kgp0.a)) {
                                        if (jl40.l(gr00Var, u1u0.a)) {
                                            ((MapWindow) aVar.a.c).startPerformanceMetricsCapture();
                                            return zy11Var;
                                        }
                                        if (jl40.l(gr00Var, ngu0.a)) {
                                            return ((MapWindow) aVar.a.c).stopPerformanceMetricsCapture();
                                        }
                                        w511.b();
                                        return null;
                                    }
                                    OffscreenMapWindow offscreenMapWindow = aVar.d;
                                    if (offscreenMapWindow != null && (captureScreenshot = offscreenMapWindow.captureScreenshot()) != null) {
                                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                        mapFlutterHandler$bind$handleMapRequest$1.L$0 = null;
                                        mapFlutterHandler$bind$handleMapRequest$1.L$1 = null;
                                        mapFlutterHandler$bind$handleMapRequest$1.label = 4;
                                        obj = com.yandex.mobile.drive.extensions.a.a(captureScreenshot, compressFormat, 60, mapFlutterHandler$bind$handleMapRequest$1);
                                    }
                                    return null;
                                }
                                long j2 = ((xl00) gr00Var).a;
                                MapFlutterHandler$bind$handleMapRequest$10 mapFlutterHandler$bind$handleMapRequest$10 = new MapFlutterHandler$bind$handleMapRequest$10(aVar, null);
                                mapFlutterHandler$bind$handleMapRequest$1.L$0 = null;
                                mapFlutterHandler$bind$handleMapRequest$1.L$1 = null;
                                mapFlutterHandler$bind$handleMapRequest$1.label = 3;
                                Object w2 = kotlinx.coroutines.a.w(j2, mapFlutterHandler$bind$handleMapRequest$10, mapFlutterHandler$bind$handleMapRequest$1);
                                if (w2 != coroutineSingletons) {
                                    return w2;
                                }
                            }
                        }
                        return zy11Var;
                    }
                    i4n i4nVar5 = aVar.a;
                    z2r0 z2r0Var = (z2r0) gr00Var;
                    float f3 = z2r0Var.a;
                    float f4 = z2r0Var.b;
                    float f5 = z2r0Var.c;
                    float f6 = z2r0Var.d;
                    com.yandex.mobile.drive.sdk.map.b bVar2 = (com.yandex.mobile.drive.sdk.map.b) i4nVar5.i;
                    RectF rectF = bVar2.f;
                    if (rectF.left != f3 || rectF.top != f4 || rectF.right != f5 || rectF.bottom != f6) {
                        rectF.set(f3, f4, f5, f6);
                        bVar2.b(true);
                    }
                    i4n i4nVar6 = aVar.a;
                    mapFlutterHandler$bind$handleMapRequest$1.L$0 = null;
                    mapFlutterHandler$bind$handleMapRequest$1.L$1 = null;
                    mapFlutterHandler$bind$handleMapRequest$1.label = 2;
                    Object a = ((com.yandex.mobile.drive.sdk.map.b) i4nVar6.i).a(mapFlutterHandler$bind$handleMapRequest$1);
                    if (a != coroutineSingletons) {
                        a = zy11Var;
                    }
                    if (a != coroutineSingletons) {
                        return zy11Var;
                    }
                }
                return coroutineSingletons;
                return (byte[]) obj;
            }
        }
        mapFlutterHandler$bind$handleMapRequest$1 = new MapFlutterHandler$bind$handleMapRequest$1(continuationImpl);
        Object obj3 = mapFlutterHandler$bind$handleMapRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapFlutterHandler$bind$handleMapRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
        return (byte[]) obj3;
    }

    @Override // defpackage.lbp0
    public final mwi0 a() {
        i4n i4nVar = this.a;
        MapWindow mapWindow = (MapWindow) i4nVar.c;
        final nwi0 nwi0Var = new nwi0();
        com.yandex.mobile.drive.sdk.map.tools.a aVar = this.e;
        if (aVar != null) {
            aVar.a(mapWindow.getMap());
        }
        tje.N(this.f, null, null, new MapFlutterHandler$bind$1(this, null), 3);
        mapWindow.getMap().addInputListener(this.h);
        kht khtVar = new kht(1, this);
        ArrayList arrayList = nwi0Var.a;
        arrayList.add(khtVar);
        final kzo kzoVar = this.c;
        final po00 po00Var = new po00(i4nVar, kzoVar);
        final MapFlutterHandler$bind$3 mapFlutterHandler$bind$3 = new MapFlutterHandler$bind$3(this, null);
        final k200 k200Var = new k200(6, po00Var);
        ((m2v) kzoVar.c).G(new ee5() { // from class: com.yandex.mobile.drive.sdk.map.c
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:158:0x0261  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x0264 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:195:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:198:0x02f5  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x0395  */
            /* JADX WARN: Removed duplicated region for block: B:209:0x039f  */
            @Override // defpackage.ee5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(Object obj, ce5 ce5Var) {
                Object obj2;
                en00 en00Var;
                Object obj3;
                String str;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                String str2;
                PointF pointF;
                HashMap hashMap = obj instanceof HashMap ? (HashMap) obj : null;
                if (hashMap != null) {
                    Object obj4 = hashMap.get(Constants.KEY_DATA);
                    if (!(obj4 instanceof HashMap)) {
                        obj4 = null;
                    }
                    HashMap hashMap2 = (HashMap) obj4;
                    if (hashMap2 != null) {
                        Object obj5 = hashMap2.get("id");
                        if (!(obj5 != null ? obj5 instanceof String : true)) {
                            obj5 = null;
                        }
                        String str3 = (String) obj5;
                        if (str3 != null) {
                            Object obj6 = hashMap2.get("parent_id");
                            if (!(obj6 != null ? obj6 instanceof String : true)) {
                                obj6 = null;
                            }
                            String str4 = (String) obj6;
                            Object obj7 = hashMap2.get("type");
                            if (!(obj7 != null ? obj7 instanceof String : true)) {
                                obj7 = null;
                            }
                            String str5 = (String) obj7;
                            Object obj8 = hashMap2.get("visible");
                            if (!(obj8 != null ? obj8 instanceof Boolean : true)) {
                                obj8 = null;
                            }
                            Boolean bool = (Boolean) obj8;
                            Object obj9 = hashMap2.get("visibility_animated");
                            if (!(obj9 != null ? obj9 instanceof Boolean : true)) {
                                obj9 = null;
                            }
                            Boolean bool2 = (Boolean) obj9;
                            Object obj10 = hashMap2.get("z_index");
                            if (!(obj10 != null ? obj10 instanceof Number : true)) {
                                obj10 = null;
                            }
                            Number number = (Number) obj10;
                            Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
                            Object obj11 = hashMap2.get("geometry");
                            if (!(obj11 instanceof HashMap)) {
                                obj11 = null;
                            }
                            HashMap hashMap3 = (HashMap) obj11;
                            Point f = hashMap3 != null ? jib1.f(hashMap3) : null;
                            Object obj12 = hashMap2.get(CRLDistributionPointsExtension.POINTS);
                            if (!(obj12 instanceof List)) {
                                obj12 = null;
                            }
                            List list = (List) obj12;
                            if (list != null) {
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    Point f2 = jib1.f((HashMap) it.next());
                                    if (f2 != null) {
                                        arrayList6.add(f2);
                                    }
                                }
                                arrayList2 = arrayList6;
                            } else {
                                arrayList2 = null;
                            }
                            Object obj13 = hashMap2.get("outer");
                            if (!(obj13 instanceof List)) {
                                obj13 = null;
                            }
                            List list2 = (List) obj13;
                            if (list2 != null) {
                                ArrayList arrayList7 = new ArrayList();
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    Point f3 = jib1.f((HashMap) it2.next());
                                    if (f3 != null) {
                                        arrayList7.add(f3);
                                    }
                                }
                                arrayList3 = arrayList7;
                            } else {
                                arrayList3 = null;
                            }
                            Object obj14 = hashMap2.get("inner");
                            if (!(obj14 instanceof List)) {
                                obj14 = null;
                            }
                            List list3 = (List) obj14;
                            if (list3 != null) {
                                List list4 = list3;
                                ArrayList arrayList8 = new ArrayList(tcc.n(list4, 10));
                                Iterator it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    List list5 = (List) it3.next();
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        Iterator it5 = it3;
                                        Point f4 = jib1.f((HashMap) it4.next());
                                        if (f4 != null) {
                                            arrayList9.add(f4);
                                        }
                                        it3 = it5;
                                    }
                                    arrayList8.add(arrayList9);
                                }
                                arrayList4 = arrayList8;
                            } else {
                                arrayList4 = null;
                            }
                            Object obj15 = hashMap2.get("direction");
                            if (!(obj15 != null ? obj15 instanceof Number : true)) {
                                obj15 = null;
                            }
                            Number number2 = (Number) obj15;
                            Double valueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
                            Object obj16 = hashMap2.get("fill_color");
                            if (!(obj16 != null ? obj16 instanceof String : true)) {
                                obj16 = null;
                            }
                            String str6 = (String) obj16;
                            Integer e = str6 != null ? fob1.e(str6) : null;
                            Object obj17 = hashMap2.get("stroke_color");
                            if (!(obj17 != null ? obj17 instanceof String : true)) {
                                obj17 = null;
                            }
                            String str7 = (String) obj17;
                            Integer e2 = str7 != null ? fob1.e(str7) : null;
                            Object obj18 = hashMap2.get("stroke_width");
                            if (!(obj18 != null ? obj18 instanceof Number : true)) {
                                obj18 = null;
                            }
                            Number number3 = (Number) obj18;
                            Double valueOf3 = number3 != null ? Double.valueOf(number3.doubleValue()) : null;
                            Object obj19 = hashMap2.get("scale_function");
                            if (!(obj19 instanceof List)) {
                                obj19 = null;
                            }
                            List list6 = (List) obj19;
                            if (list6 != null) {
                                ArrayList arrayList10 = new ArrayList();
                                Iterator it6 = list6.iterator();
                                while (it6.hasNext()) {
                                    HashMap hashMap4 = (HashMap) it6.next();
                                    Object obj20 = hashMap4.get(RemoteBioParameters.X);
                                    Iterator it7 = it6;
                                    if (!(obj20 instanceof Double)) {
                                        obj20 = null;
                                    }
                                    Double d = (Double) obj20;
                                    String str8 = str3;
                                    if (d != null) {
                                        float doubleValue = (float) d.doubleValue();
                                        Object obj21 = hashMap4.get(RemoteBioParameters.Y);
                                        if (!(obj21 instanceof Double)) {
                                            obj21 = null;
                                        }
                                        Double d2 = (Double) obj21;
                                        str2 = str4;
                                        if (d2 != null) {
                                            pointF = new PointF(doubleValue, (float) d2.doubleValue());
                                            if (pointF == null) {
                                                arrayList10.add(pointF);
                                            }
                                            str3 = str8;
                                            it6 = it7;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                    }
                                    pointF = null;
                                    if (pointF == null) {
                                    }
                                    str3 = str8;
                                    it6 = it7;
                                    str4 = str2;
                                }
                                arrayList5 = arrayList10;
                            } else {
                                arrayList5 = null;
                            }
                            String str9 = str3;
                            String str10 = str4;
                            Object obj22 = hashMap2.get("ids");
                            if (!(obj22 instanceof List)) {
                                obj22 = null;
                            }
                            List list7 = (List) obj22;
                            Object obj23 = hashMap2.get("icon_id");
                            if (!(obj23 != null ? obj23 instanceof String : true)) {
                                obj23 = null;
                            }
                            String str11 = (String) obj23;
                            Object obj24 = hashMap2.get("default_icon_id");
                            if (!(obj24 != null ? obj24 instanceof String : true)) {
                                obj24 = null;
                            }
                            String str12 = (String) obj24;
                            Object obj25 = hashMap2.get("icon_style");
                            if (!(obj25 instanceof HashMap)) {
                                obj25 = null;
                            }
                            HashMap hashMap5 = (HashMap) obj25;
                            wrr e3 = hashMap5 != null ? jib1.e(hashMap5) : null;
                            Object obj26 = hashMap2.get("default_icon_style");
                            if (!(obj26 instanceof HashMap)) {
                                obj26 = null;
                            }
                            HashMap hashMap6 = (HashMap) obj26;
                            en00Var = new en00(str9, str10, str5, bool, bool2, valueOf, f, arrayList2, arrayList3, arrayList4, arrayList5, valueOf2, e, e2, valueOf3, list7, str11, str12, e3, hashMap6 != null ? jib1.e(hashMap6) : null);
                            obj3 = hashMap.get("type");
                            if (!(obj3 instanceof String)) {
                                obj3 = null;
                            }
                            str = (String) obj3;
                            if (str != null) {
                                switch (str.hashCode()) {
                                    case -354379613:
                                        if (str.equals("map_object_removed") && en00Var != null) {
                                            obj2 = new mo00(en00Var.a);
                                            break;
                                        }
                                        break;
                                    case 32629142:
                                        if (str.equals("map_object_tap_listener_remove") && en00Var != null) {
                                            obj2 = new lo00(en00Var.a);
                                            break;
                                        }
                                        break;
                                    case 681305057:
                                        if (str.equals("map_object_remove") && en00Var != null) {
                                            String str13 = en00Var.a;
                                            String str14 = en00Var.b;
                                            if (str14 != null) {
                                                obj2 = new ko00(str13, str14);
                                                break;
                                            }
                                        }
                                        break;
                                    case 777069606:
                                        if (str.equals("map_object_update") && en00Var != null) {
                                            obj2 = new zo00(en00Var.a, en00Var);
                                            break;
                                        }
                                        break;
                                    case 839609168:
                                        if (str.equals("map_object_clear") && en00Var != null) {
                                            obj2 = new wm00(en00Var.a);
                                            break;
                                        }
                                        break;
                                    case 1766232676:
                                        if (str.equals("map_object_add") && en00Var != null) {
                                            String str15 = en00Var.a;
                                            String str16 = en00Var.b;
                                            if (str16 != null) {
                                                obj2 = new rm00(str15, str16, en00Var);
                                                break;
                                            }
                                        }
                                        break;
                                    case 2142223504:
                                        if (str.equals("map_object_tap_listener_set") && en00Var != null) {
                                            obj2 = new qo00(en00Var.a);
                                            break;
                                        }
                                        break;
                                }
                                if (obj2 != null) {
                                    tje.N((ike) kzoVar.x, null, null, new MapMessenger$setHandlers$1$1(hashMap, ce5Var, mapFlutterHandler$bind$3, null), 3);
                                    return;
                                } else {
                                    k200.this.invoke(obj2);
                                    ce5Var.a(null);
                                    return;
                                }
                            }
                        }
                    }
                    en00Var = null;
                    obj3 = hashMap.get("type");
                    if (!(obj3 instanceof String)) {
                    }
                    str = (String) obj3;
                    if (str != null) {
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
            }
        });
        arrayList.add(new kht(2, kzoVar));
        return new mwi0() { // from class: oi00
            @Override // defpackage.mwi0
            public final void remove() {
                nwi0.this.remove();
                a aVar2 = this;
                com.yandex.mobile.drive.sdk.map.tools.a aVar3 = aVar2.e;
                if (aVar3 != null) {
                    Map map = ((MapWindow) aVar2.a.c).getMap();
                    IdentityHashMap identityHashMap = aVar3.f;
                    identityHashMap.remove(map);
                    if (identityHashMap.isEmpty()) {
                        pzt0 pzt0Var = aVar3.c;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        aVar3.c = null;
                    }
                }
                kotlinx.coroutines.a.g(aVar2.f.a, null);
                po00 po00Var2 = po00Var;
                bq00 bq00Var = po00Var2.c;
                bq00Var.a.clear();
                bq00Var.b.clear();
                bq00Var.c.clear();
                po00Var2.d.clear();
                ((m2v) po00Var2.a.w).G(null);
            }
        };
    }
}
