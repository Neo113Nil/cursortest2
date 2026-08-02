package com.yandex.mobile.drive.map.geocoder;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import defpackage.a0l0;
import defpackage.ba20;
import defpackage.bvf0;
import defpackage.ca20;
import defpackage.da20;
import defpackage.dvw;
import defpackage.ea20;
import defpackage.gib1;
import defpackage.grt;
import defpackage.hrt;
import defpackage.i3y;
import defpackage.ike;
import defpackage.irt;
import defpackage.j1;
import defpackage.j18;
import defpackage.jl40;
import defpackage.jrt;
import defpackage.ny61;
import defpackage.qxz;
import defpackage.scc;
import defpackage.si3;
import defpackage.ssr;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tsr;
import defpackage.x920;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class a implements tsr, ca20 {
    public ea20 a;
    public ike b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new qxz(10));

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        if (r2 == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ce, code lost:
    
        if (r2 == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(a aVar, x920 x920Var, ContinuationImpl continuationImpl) {
        MapGeocoderGoPlugin$getRoute$1 mapGeocoderGoPlugin$getRoute$1;
        int i;
        a0l0 a0l0Var;
        List<Point> points;
        Polyline polyline;
        aVar.getClass();
        if (continuationImpl instanceof MapGeocoderGoPlugin$getRoute$1) {
            mapGeocoderGoPlugin$getRoute$1 = (MapGeocoderGoPlugin$getRoute$1) continuationImpl;
            int i2 = mapGeocoderGoPlugin$getRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapGeocoderGoPlugin$getRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapGeocoderGoPlugin$getRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapGeocoderGoPlugin$getRoute$1.label;
                if (i != 0) {
                    b.b(obj);
                    Point b = gib1.b(x920Var, "start");
                    Point b2 = gib1.b(x920Var, "finish");
                    if (b != null && b2 != null) {
                        String str = (String) x920Var.a("means");
                        Number number = (Number) x920Var.a("azimuth");
                        Double d = number != null ? new Double(number.doubleValue()) : null;
                        boolean l = jl40.l(str, "pedestrian");
                        i3y i3yVar = aVar.c;
                        if (l) {
                            jrt jrtVar = (jrt) i3yVar.getValue();
                            mapGeocoderGoPlugin$getRoute$1.L$0 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$1 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$2 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$3 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$4 = null;
                            mapGeocoderGoPlugin$getRoute$1.label = 1;
                            jrtVar.getClass();
                            j18 j18Var = new j18(1, dvw.b(mapGeocoderGoPlugin$getRoute$1));
                            j18Var.u();
                            PedestrianRouter pedestrianRouter = (PedestrianRouter) jrtVar.b.getValue();
                            List g = scc.g(b, b2);
                            ArrayList arrayList = new ArrayList(tcc.n(g, 10));
                            Iterator it = g.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new RequestPoint((Point) it.next(), RequestPointType.WAYPOINT, null, null, null));
                            }
                            j18Var.w(new irt(pedestrianRouter.requestRoutes(arrayList, new TimeOptions(), new RouteOptions(new FitnessOptions(), false), new hrt(new si3(j18Var, 8))), 0));
                            obj = j18Var.s();
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        } else {
                            jrt jrtVar2 = (jrt) i3yVar.getValue();
                            List g2 = scc.g(b, b2);
                            mapGeocoderGoPlugin$getRoute$1.L$0 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$1 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$2 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$3 = null;
                            mapGeocoderGoPlugin$getRoute$1.L$4 = null;
                            mapGeocoderGoPlugin$getRoute$1.label = 2;
                            jrtVar2.getClass();
                            DrivingOptions drivingOptions = new DrivingOptions(d, new Integer(1), null, null, null, null, EmptyList.a);
                            j18 j18Var2 = new j18(1, dvw.b(mapGeocoderGoPlugin$getRoute$1));
                            j18Var2.u();
                            DrivingRouter drivingRouter = (DrivingRouter) jrtVar2.a.getValue();
                            List list = g2;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new RequestPoint((Point) it2.next(), RequestPointType.WAYPOINT, null, null, null));
                            }
                            j18Var2.w(new j1(12, drivingRouter.requestRoutes(arrayList2, drivingOptions, new VehicleOptions(), new grt(new si3(j18Var2, 7)))));
                            obj = j18Var2.s();
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (i == 1) {
                    b.b(obj);
                    a0l0Var = (a0l0) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a0l0Var = (a0l0) kotlin.collections.a.R((List) obj);
                }
                points = (a0l0Var != null || (polyline = a0l0Var.a) == null) ? null : polyline.getPoints();
                if (points != null) {
                    List<Point> list2 = points;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                    for (Point point : list2) {
                        arrayList3.add(kotlin.collections.b.h(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude()))));
                    }
                    return kotlin.collections.b.h(new Pair("route", arrayList3), new Pair(RemoteBioParameters.TIME, a0l0Var.b));
                }
                return null;
            }
        }
        mapGeocoderGoPlugin$getRoute$1 = new MapGeocoderGoPlugin$getRoute$1(aVar, continuationImpl);
        Object obj2 = mapGeocoderGoPlugin$getRoute$1.result;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapGeocoderGoPlugin$getRoute$1.label;
        if (i != 0) {
        }
        if (a0l0Var != null) {
        }
        if (points != null) {
        }
        return null;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.b = bvf0.b();
        ea20 ea20Var = new ea20(ssrVar.c, "map_geocoder_go");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        ike ikeVar = this.b;
        if (ikeVar == null) {
            ikeVar = null;
        }
        bvf0.j(ikeVar, null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        if (!jl40.l(x920Var.a, "getRoute")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        ike ikeVar = this.b;
        if (ikeVar == null) {
            ikeVar = null;
        }
        tje.N(ikeVar, null, null, new MapGeocoderGoPlugin$onMethodCall$1(da20Var, this, x920Var, null), 3);
    }
}
