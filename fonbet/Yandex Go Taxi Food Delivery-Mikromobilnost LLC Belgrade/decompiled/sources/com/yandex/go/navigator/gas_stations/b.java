package com.yandex.go.navigator.gas_stations;

import com.yandex.go.coroutines.g;
import com.yandex.go.navigator.gas_stations.experiment.c;
import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.go.navigator.repository.f;
import com.yandex.go.navigator.utils.LineSide;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.Session;
import defpackage.ah00;
import defpackage.bwa1;
import defpackage.dnr;
import defpackage.el00;
import defpackage.g6u;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.jcb1;
import defpackage.lws;
import defpackage.mdh;
import defpackage.nws;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pws;
import defpackage.qb60;
import defpackage.qws;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sws;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tus;
import defpackage.tyw;
import defpackage.u6v;
import defpackage.uyj;
import defpackage.v6v;
import defpackage.vff;
import defpackage.w511;
import defpackage.zts;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes12.dex */
public final class b {
    public final ah00 a;
    public final com.yandex.go.navigator.search.a b;
    public final tt2 c;
    public final c d;
    public final com.yandex.go.navigator.gas_stations.repositories.c e;
    public final vff f;
    public final tus g;
    public final sws h;
    public final qb60 i;
    public final f j;
    public final tyw k;
    public final el00 l;
    public int n;
    public zts p;
    public final Projection q;
    public Session r;
    public final g m = new g();
    public final hbp0 o = new hbp0(new dnr(21, this), b.class.getName(), null, 4);

    public b(ah00 ah00Var, com.yandex.go.navigator.search.a aVar, tt2 tt2Var, c cVar, com.yandex.go.navigator.gas_stations.repositories.c cVar2, vff vffVar, tus tusVar, sws swsVar, qb60 qb60Var, f fVar, tyw tywVar, el00 el00Var) {
        MapWindow mapWindow;
        Map map;
        this.a = ah00Var;
        this.b = aVar;
        this.c = tt2Var;
        this.d = cVar;
        this.e = cVar2;
        this.f = vffVar;
        this.g = tusVar;
        this.h = swsVar;
        this.i = qb60Var;
        this.j = fVar;
        this.k = tywVar;
        this.l = el00Var;
        Projection projection = null;
        TaxiMapView h = ((gh00) ah00Var).h();
        if (h != null && (mapWindow = h.getMapWindow()) != null && (map = mapWindow.getMap()) != null) {
            projection = map.projection();
        }
        this.q = projection;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ContinuationImpl continuationImpl) {
        GasStationsSearchManager$getSearchQuery$1 gasStationsSearchManager$getSearchQuery$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof GasStationsSearchManager$getSearchQuery$1) {
            gasStationsSearchManager$getSearchQuery$1 = (GasStationsSearchManager$getSearchQuery$1) continuationImpl;
            int i2 = gasStationsSearchManager$getSearchQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsSearchManager$getSearchQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsSearchManager$getSearchQuery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsSearchManager$getSearchQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gasStationsSearchManager$getSearchQuery$1.label = 1;
                    obj = bVar.p;
                    if (obj == null) {
                        bVar.c.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new GasStationsSearchManager$getConfig$2(bVar, null), gasStationsSearchManager$getSearchQuery$1);
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((zts) obj).a;
            }
        }
        gasStationsSearchManager$getSearchQuery$1 = new GasStationsSearchManager$getSearchQuery$1(bVar, continuationImpl);
        Object obj2 = gasStationsSearchManager$getSearchQuery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsSearchManager$getSearchQuery$1.label;
        if (i != 0) {
        }
        return ((zts) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x012f -> B:10:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b2 -> B:14:0x014d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(b bVar, ArrayList arrayList, int i, ContinuationImpl continuationImpl) {
        GasStationsSearchManager$handleGasStationsOnRoute$1 gasStationsSearchManager$handleGasStationsOnRoute$1;
        int i2;
        Polyline geometry;
        List<Point> points;
        GasStationsSearchManager$handleGasStationsOnRoute$1 gasStationsSearchManager$handleGasStationsOnRoute$12;
        Collection arrayList2;
        Iterator it;
        int i3;
        List<Point> list;
        Pair pair;
        LocalizedValue distance;
        Point e;
        b bVar2 = bVar;
        bVar2.getClass();
        if (continuationImpl instanceof GasStationsSearchManager$handleGasStationsOnRoute$1) {
            gasStationsSearchManager$handleGasStationsOnRoute$1 = (GasStationsSearchManager$handleGasStationsOnRoute$1) continuationImpl;
            int i4 = gasStationsSearchManager$handleGasStationsOnRoute$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gasStationsSearchManager$handleGasStationsOnRoute$1.label = i4 - Integer.MIN_VALUE;
                Object obj = gasStationsSearchManager$handleGasStationsOnRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = gasStationsSearchManager$handleGasStationsOnRoute$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    DrivingRoute a = bVar2.f.a();
                    if (a == null || (geometry = a.getGeometry()) == null || (points = geometry.getPoints()) == null) {
                        return EmptyList.a;
                    }
                    gasStationsSearchManager$handleGasStationsOnRoute$12 = gasStationsSearchManager$handleGasStationsOnRoute$1;
                    arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    i3 = i;
                    list = points;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = gasStationsSearchManager$handleGasStationsOnRoute$1.I$1;
                    i3 = gasStationsSearchManager$handleGasStationsOnRoute$1.I$0;
                    GeoObject geoObject = (GeoObject) gasStationsSearchManager$handleGasStationsOnRoute$1.L$9;
                    it = (Iterator) gasStationsSearchManager$handleGasStationsOnRoute$1.L$6;
                    arrayList2 = (Collection) gasStationsSearchManager$handleGasStationsOnRoute$1.L$4;
                    List<Point> list2 = (List) gasStationsSearchManager$handleGasStationsOnRoute$1.L$1;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        gasStationsSearchManager$handleGasStationsOnRoute$12 = gasStationsSearchManager$handleGasStationsOnRoute$1;
                        pair = null;
                    } else {
                        pair = new Pair(geoObject, new Integer(i5));
                        gasStationsSearchManager$handleGasStationsOnRoute$12 = gasStationsSearchManager$handleGasStationsOnRoute$1;
                    }
                    list = list2;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                    bVar2 = bVar;
                    if (!it.hasNext()) {
                        List x0 = kotlin.collections.a.x0((List) arrayList2, new nws());
                        ArrayList arrayList3 = new ArrayList(tcc.n(x0, 10));
                        Iterator it2 = x0.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((GeoObject) ((Pair) it2.next()).getFirst());
                        }
                        return arrayList3;
                    }
                    GeoObject geoObject2 = (GeoObject) it.next();
                    BusinessObjectMetadata b = jcb1.b(geoObject2);
                    if (b == null || (distance = b.getDistance()) == null || distance.getValue() >= 1000.0d || (e = bwa1.e(geoObject2)) == null) {
                        pair = null;
                        if (pair != null) {
                        }
                        bVar2 = bVar;
                        if (!it.hasNext()) {
                        }
                    } else {
                        int i6 = 0;
                        float f = Float.MAX_VALUE;
                        int i7 = 0;
                        for (Object obj2 : list) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                scc.m();
                                throw null;
                            }
                            Point point = (Point) obj2;
                            float j = ru.yandex.taxi.map.utils.a.j(new zzs(e.getLatitude(), e.getLongitude(), 0, null, null, 28), new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28));
                            if (j < f) {
                                f = j;
                                i6 = i7;
                            }
                            i7 = i8;
                        }
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$0 = null;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$1 = list;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$2 = null;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$3 = null;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$4 = arrayList2;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$5 = null;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$6 = it;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$7 = null;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$8 = null;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$9 = geoObject2;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.L$10 = null;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.I$0 = i3;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.I$1 = i6;
                        gasStationsSearchManager$handleGasStationsOnRoute$12.label = 1;
                        i5 = i6;
                        obj = bVar2.d(e, list, i5, i3, gasStationsSearchManager$handleGasStationsOnRoute$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        list2 = list;
                        gasStationsSearchManager$handleGasStationsOnRoute$1 = gasStationsSearchManager$handleGasStationsOnRoute$12;
                        geoObject = geoObject2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        list = list2;
                        if (pair != null) {
                        }
                        bVar2 = bVar;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        gasStationsSearchManager$handleGasStationsOnRoute$1 = new GasStationsSearchManager$handleGasStationsOnRoute$1(bVar2, continuationImpl);
        Object obj3 = gasStationsSearchManager$handleGasStationsOnRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = gasStationsSearchManager$handleGasStationsOnRoute$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, GasStationSearchType gasStationSearchType, ContinuationImpl continuationImpl) {
        GasStationsSearchManager$appendResponse$1 gasStationsSearchManager$appendResponse$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        List list2;
        tt2 tt2Var;
        GasStationSearchType gasStationSearchType2;
        GasStationSearchType gasStationSearchType3;
        int i2;
        if (continuationImpl instanceof GasStationsSearchManager$appendResponse$1) {
            gasStationsSearchManager$appendResponse$1 = (GasStationsSearchManager$appendResponse$1) continuationImpl;
            int i3 = gasStationsSearchManager$appendResponse$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gasStationsSearchManager$appendResponse$1.label = i3 - Integer.MIN_VALUE;
                GasStationsSearchManager$appendResponse$1 gasStationsSearchManager$appendResponse$12 = gasStationsSearchManager$appendResponse$1;
                obj = gasStationsSearchManager$appendResponse$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsSearchManager$appendResponse$12.label;
                tt2 tt2Var2 = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.r = null;
                    this.n = 0;
                    this.m.b();
                    tt2Var2.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    GasStationsSearchManager$appendResponse$currentSegmentIndex$1 gasStationsSearchManager$appendResponse$currentSegmentIndex$1 = new GasStationsSearchManager$appendResponse$currentSegmentIndex$1(this, null);
                    gasStationsSearchManager$appendResponse$12.L$0 = list;
                    gasStationsSearchManager$appendResponse$12.L$1 = gasStationSearchType;
                    gasStationsSearchManager$appendResponse$12.label = 1;
                    obj = tje.k0(g6uVar, gasStationsSearchManager$appendResponse$currentSegmentIndex$1, gasStationsSearchManager$appendResponse$12);
                    if (obj != coroutineSingletons) {
                        list2 = list;
                        tt2Var = tt2Var2;
                        gasStationSearchType2 = gasStationSearchType;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gasStationSearchType3 = (GasStationSearchType) gasStationsSearchManager$appendResponse$12.L$1;
                    kotlin.b.b(obj);
                    List list3 = (List) obj;
                    i2 = lws.a[gasStationSearchType3.ordinal()];
                    com.yandex.go.navigator.gas_stations.repositories.c cVar = this.e;
                    if (i2 != 1) {
                        this.i.l(Boolean.FALSE);
                        cVar.b.l(list3);
                        GeoObject geoObject = (GeoObject) kotlin.collections.a.R(list3);
                        if (geoObject != null) {
                            com.yandex.go.navigator.gas_stations.analytics.a aVar = cVar.a;
                            BusinessObjectMetadata b = jcb1.b(geoObject);
                            aVar.k(b != null ? b.getOid() : null);
                            cVar.g.l(geoObject);
                        }
                    } else {
                        if (i2 != 2) {
                            w511.b();
                            return null;
                        }
                        cVar.d.l(list3);
                    }
                    this.h.a(new pws(!list3.isEmpty() ? new u6v(gasStationSearchType3) : v6v.a));
                    return zy11.a;
                }
                GasStationSearchType gasStationSearchType4 = (GasStationSearchType) gasStationsSearchManager$appendResponse$12.L$1;
                List list4 = (List) gasStationsSearchManager$appendResponse$12.L$0;
                kotlin.b.b(obj);
                gasStationSearchType2 = gasStationSearchType4;
                list2 = list4;
                tt2Var = tt2Var2;
                int intValue = ((Number) obj).intValue();
                tt2Var.getClass();
                sjh sjhVar2 = uyj.a;
                GasStationsSearchManager$appendResponse$gasStations$1 gasStationsSearchManager$appendResponse$gasStations$1 = new GasStationsSearchManager$appendResponse$gasStations$1(list2, gasStationSearchType2, this, intValue, null);
                gasStationsSearchManager$appendResponse$12.L$0 = null;
                gasStationsSearchManager$appendResponse$12.L$1 = gasStationSearchType2;
                gasStationsSearchManager$appendResponse$12.I$0 = intValue;
                gasStationsSearchManager$appendResponse$12.label = 2;
                obj = tje.k0(sjhVar2, gasStationsSearchManager$appendResponse$gasStations$1, gasStationsSearchManager$appendResponse$12);
                if (obj != coroutineSingletons) {
                    gasStationSearchType3 = gasStationSearchType2;
                    List list32 = (List) obj;
                    i2 = lws.a[gasStationSearchType3.ordinal()];
                    com.yandex.go.navigator.gas_stations.repositories.c cVar2 = this.e;
                    if (i2 != 1) {
                    }
                    this.h.a(new pws(!list32.isEmpty() ? new u6v(gasStationSearchType3) : v6v.a));
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        gasStationsSearchManager$appendResponse$1 = new GasStationsSearchManager$appendResponse$1(this, continuationImpl);
        GasStationsSearchManager$appendResponse$1 gasStationsSearchManager$appendResponse$122 = gasStationsSearchManager$appendResponse$1;
        obj = gasStationsSearchManager$appendResponse$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsSearchManager$appendResponse$122.label;
        tt2 tt2Var22 = this.c;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj).intValue();
        tt2Var.getClass();
        sjh sjhVar22 = uyj.a;
        GasStationsSearchManager$appendResponse$gasStations$1 gasStationsSearchManager$appendResponse$gasStations$12 = new GasStationsSearchManager$appendResponse$gasStations$1(list2, gasStationSearchType2, this, intValue2, null);
        gasStationsSearchManager$appendResponse$122.L$0 = null;
        gasStationsSearchManager$appendResponse$122.L$1 = gasStationSearchType2;
        gasStationsSearchManager$appendResponse$122.I$0 = intValue2;
        gasStationsSearchManager$appendResponse$122.label = 2;
        obj = tje.k0(sjhVar22, gasStationsSearchManager$appendResponse$gasStations$12, gasStationsSearchManager$appendResponse$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Point point, List list, int i, int i2, ContinuationImpl continuationImpl) {
        GasStationsSearchManager$isInSameDirection$1 gasStationsSearchManager$isInSameDirection$1;
        int i3;
        Object obj;
        Point point2;
        Point point3;
        Point point4;
        zts ztsVar;
        Projection projection;
        LineSide lineSide;
        boolean z;
        if (continuationImpl instanceof GasStationsSearchManager$isInSameDirection$1) {
            gasStationsSearchManager$isInSameDirection$1 = (GasStationsSearchManager$isInSameDirection$1) continuationImpl;
            int i4 = gasStationsSearchManager$isInSameDirection$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gasStationsSearchManager$isInSameDirection$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = gasStationsSearchManager$isInSameDirection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = gasStationsSearchManager$isInSameDirection$1.label;
                boolean z2 = false;
                if (i3 != 0) {
                    kotlin.b.b(obj2);
                    int i5 = i - 1;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    Point point5 = (Point) list.get(i5);
                    int i6 = i + 1;
                    int size = list.size() - 1;
                    if (i6 > size) {
                        i6 = size;
                    }
                    Point point6 = (Point) list.get(i6);
                    gasStationsSearchManager$isInSameDirection$1.L$0 = point;
                    gasStationsSearchManager$isInSameDirection$1.L$1 = null;
                    gasStationsSearchManager$isInSameDirection$1.L$2 = point5;
                    gasStationsSearchManager$isInSameDirection$1.L$3 = point6;
                    gasStationsSearchManager$isInSameDirection$1.I$0 = i;
                    gasStationsSearchManager$isInSameDirection$1.I$1 = i2;
                    gasStationsSearchManager$isInSameDirection$1.label = 1;
                    zts ztsVar2 = this.p;
                    if (ztsVar2 == null) {
                        this.c.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new GasStationsSearchManager$getConfig$2(this, null), gasStationsSearchManager$isInSameDirection$1);
                    } else {
                        obj = ztsVar2;
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Object obj3 = obj;
                    point2 = point;
                    point3 = point6;
                    point4 = point5;
                    obj2 = obj3;
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = gasStationsSearchManager$isInSameDirection$1.I$1;
                    i = gasStationsSearchManager$isInSameDirection$1.I$0;
                    point3 = (Point) gasStationsSearchManager$isInSameDirection$1.L$3;
                    point4 = (Point) gasStationsSearchManager$isInSameDirection$1.L$2;
                    point2 = (Point) gasStationsSearchManager$isInSameDirection$1.L$0;
                    kotlin.b.b(obj2);
                }
                ztsVar = (zts) obj2;
                if (ztsVar.d != LineSide.All && (projection = this.q) != null) {
                    int j = (int) ((gh00) this.a).j();
                    XYPoint worldToXY = projection.worldToXY(point4, j);
                    XYPoint worldToXY2 = projection.worldToXY(point3, j);
                    XYPoint worldToXY3 = projection.worldToXY(point2, j);
                    double y = ((worldToXY2.getY() - worldToXY.getY()) * (worldToXY3.getX() - worldToXY.getX())) - ((worldToXY2.getX() - worldToXY.getX()) * (worldToXY3.getY() - worldToXY.getY()));
                    lineSide = y <= 0.0d ? LineSide.Left : y < 0.0d ? LineSide.Right : LineSide.OnLine;
                    if (lineSide != LineSide.OnLine && lineSide != ztsVar.d) {
                        z = false;
                        if (i >= i2 && z) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
                z = true;
                if (i >= i2) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        gasStationsSearchManager$isInSameDirection$1 = new GasStationsSearchManager$isInSameDirection$1(this, continuationImpl);
        Object obj22 = gasStationsSearchManager$isInSameDirection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = gasStationsSearchManager$isInSameDirection$1.label;
        boolean z22 = false;
        if (i3 != 0) {
        }
        ztsVar = (zts) obj22;
        if (ztsVar.d != LineSide.All) {
            int j2 = (int) ((gh00) this.a).j();
            XYPoint worldToXY4 = projection.worldToXY(point4, j2);
            XYPoint worldToXY22 = projection.worldToXY(point3, j2);
            XYPoint worldToXY32 = projection.worldToXY(point2, j2);
            double y2 = ((worldToXY22.getY() - worldToXY4.getY()) * (worldToXY32.getX() - worldToXY4.getX())) - ((worldToXY22.getX() - worldToXY4.getX()) * (worldToXY32.getY() - worldToXY4.getY()));
            if (y2 <= 0.0d) {
            }
            if (lineSide != LineSide.OnLine) {
                z = false;
                if (i >= i2) {
                }
                return Boolean.valueOf(z22);
            }
        }
        z = true;
        if (i >= i2) {
        }
        return Boolean.valueOf(z22);
    }

    public final void e() {
        GasStationSearchType a = this.g.a();
        int i = this.n;
        sws swsVar = this.h;
        if (i > 3) {
            swsVar.a(new pws(new u6v(a)));
            this.n = 0;
            return;
        }
        Session session = this.r;
        hbp0 hbp0Var = this.o;
        if (session != null) {
            tse c = hbp0Var.c();
            this.c.getClass();
            sjh sjhVar = uyj.a;
            tje.N(c, o400.a, null, new GasStationsSearchManager$refreshLastSearch$1$1(session, this, a, null), 2);
            return;
        }
        int i2 = lws.a[a.ordinal()];
        qws qwsVar = qws.a;
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return;
            } else {
                swsVar.a(qwsVar);
                tje.N(hbp0Var.c(), null, null, new GasStationsSearchManager$searchByVisibleRegion$1(this, null), 3);
                return;
            }
        }
        DrivingRoute a2 = this.f.a();
        if (a2 == null) {
            swsVar.a(new pws(new u6v(GasStationSearchType.ON_ROUTE)));
        } else {
            swsVar.a(qwsVar);
            tje.N(hbp0Var.c(), null, null, new GasStationsSearchManager$searchByRoute$1(this, a2, null), 3);
        }
    }
}
