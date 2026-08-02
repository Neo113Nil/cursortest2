package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.taxi_feedback.TaxiFeedbackStateRepository;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import defpackage.a3l0;
import defpackage.atd0;
import defpackage.bvf0;
import defpackage.es40;
import defpackage.ka11;
import defpackage.mt40;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pt40;
import defpackage.qt40;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tw30;
import defpackage.uu40;
import defpackage.v1l0;
import defpackage.wr40;
import defpackage.xdf;
import defpackage.yu40;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class s {
    public final com.yandex.go.multimodal_route.repositories.a a;
    public final com.yandex.go.multimodal_route.mappers.a b;
    public final TaxiFeedbackStateRepository c;
    public final com.yandex.go.multimodal_route.interactors.d d;
    public final ru.yandex.taxi.widget.c e;
    public final ru.yandex.taxi.masstransit.detailedroute.ui.f f;
    public final uu40 g;
    public final atd0 h;
    public final qt40 i;
    public final com.yandex.go.multimodal_route.ui.detailed_card.g j;
    public final com.yandex.go.multimodal_route.ui.error.a k;
    public final yu40 l;
    public final com.yandex.go.route.interactor.b m;
    public final wr40 n;
    public final mt40 o;
    public final tw30 p;
    public final a3l0 q;
    public final es40 r;
    public final xdf s;
    public final HashMap t = new HashMap();
    public boolean u;

    public s(com.yandex.go.multimodal_route.repositories.a aVar, com.yandex.go.multimodal_route.mappers.a aVar2, TaxiFeedbackStateRepository taxiFeedbackStateRepository, com.yandex.go.multimodal_route.interactors.d dVar, ru.yandex.taxi.widget.c cVar, ru.yandex.taxi.masstransit.detailedroute.ui.f fVar, uu40 uu40Var, atd0 atd0Var, qt40 qt40Var, com.yandex.go.multimodal_route.ui.detailed_card.g gVar, com.yandex.go.multimodal_route.ui.error.a aVar3, yu40 yu40Var, com.yandex.go.route.interactor.b bVar, wr40 wr40Var, mt40 mt40Var, tw30 tw30Var, a3l0 a3l0Var, es40 es40Var, xdf xdfVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = taxiFeedbackStateRepository;
        this.d = dVar;
        this.e = cVar;
        this.f = fVar;
        this.g = uu40Var;
        this.h = atd0Var;
        this.i = qt40Var;
        this.j = gVar;
        this.k = aVar3;
        this.l = yu40Var;
        this.m = bVar;
        this.n = wr40Var;
        this.o = mt40Var;
        this.p = tw30Var;
        this.q = a3l0Var;
        this.r = es40Var;
        this.s = xdfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x016b, code lost:
    
        if (r15 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
    
        if (r0 == r6) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0134 -> B:62:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0156 -> B:56:0x015a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, List list, String str, Long l, Address address, ContinuationImpl continuationImpl) {
        TransportTrackingCardUiStateInteractor$createRouteData$1 transportTrackingCardUiStateInteractor$createRouteData$1;
        int i;
        TransportTrackingCardUiStateInteractor$createRouteData$1 transportTrackingCardUiStateInteractor$createRouteData$12;
        Iterator it;
        Address address2;
        TimeOptions timeOptions;
        String str2;
        Pair pair;
        String str3;
        Route route;
        TransportTrackingCardUiStateInteractor$createRouteData$1 transportTrackingCardUiStateInteractor$createRouteData$13;
        Address address3;
        Route route2;
        Object c;
        Address address4;
        String str4;
        Route route3;
        String str5;
        Address address5;
        TimeOptions timeOptions2;
        Iterator it2;
        String str6;
        Object obj;
        Route route4;
        Object c2;
        Route route5;
        Route route6;
        String str7;
        Route route7;
        Subpolyline geometry;
        Polyline subpolyline;
        List<Point> points;
        Point point;
        Section section;
        Subpolyline geometry2;
        Polyline subpolyline2;
        List<Point> points2;
        Point point2;
        tw30 tw30Var = sVar.p;
        if (continuationImpl instanceof TransportTrackingCardUiStateInteractor$createRouteData$1) {
            transportTrackingCardUiStateInteractor$createRouteData$1 = (TransportTrackingCardUiStateInteractor$createRouteData$1) continuationImpl;
            int i2 = transportTrackingCardUiStateInteractor$createRouteData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiStateInteractor$createRouteData$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportTrackingCardUiStateInteractor$createRouteData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiStateInteractor$createRouteData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TimeOptions timeOptions3 = l != null ? new TimeOptions(new Long(l.longValue()), null) : null;
                    transportTrackingCardUiStateInteractor$createRouteData$12 = transportTrackingCardUiStateInteractor$createRouteData$1;
                    it = list.iterator();
                    address2 = address;
                    timeOptions = timeOptions3;
                    str2 = str;
                    if (it.hasNext()) {
                        String str8 = (String) it.next();
                        uu40 uu40Var = sVar.g;
                        transportTrackingCardUiStateInteractor$createRouteData$12.L$0 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$12.L$1 = str2;
                        transportTrackingCardUiStateInteractor$createRouteData$12.L$2 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$12.L$3 = address2;
                        transportTrackingCardUiStateInteractor$createRouteData$12.L$4 = timeOptions;
                        transportTrackingCardUiStateInteractor$createRouteData$12.L$5 = it;
                        transportTrackingCardUiStateInteractor$createRouteData$12.L$6 = str8;
                        transportTrackingCardUiStateInteractor$createRouteData$12.label = 1;
                        Object b = ((com.yandex.go.multimodal_route.interactors.c) uu40Var).b(str8, transportTrackingCardUiStateInteractor$createRouteData$12);
                        if (b != coroutineSingletons) {
                            str5 = str2;
                            obj = b;
                            address5 = address2;
                            transportTrackingCardUiStateInteractor$createRouteData$1 = transportTrackingCardUiStateInteractor$createRouteData$12;
                            it2 = it;
                            timeOptions2 = timeOptions;
                            str6 = str8;
                            if (obj instanceof Result.Failure) {
                            }
                            route4 = (Route) obj;
                            if (route4 == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    pair = null;
                    Address address6 = address2;
                    transportTrackingCardUiStateInteractor$createRouteData$1 = transportTrackingCardUiStateInteractor$createRouteData$12;
                    if (pair == null) {
                        return null;
                    }
                    str3 = (String) pair.getFirst();
                    route = (Route) pair.getSecond();
                    if (str2 == null) {
                        transportTrackingCardUiStateInteractor$createRouteData$13 = transportTrackingCardUiStateInteractor$createRouteData$1;
                        address3 = address6;
                        route2 = null;
                        if (route2 == null) {
                        }
                        route5 = route2;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$0 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$1 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$2 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$3 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$4 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$5 = str3;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$6 = route;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$7 = route5;
                        transportTrackingCardUiStateInteractor$createRouteData$13.label = 4;
                        Section section2 = (Section) kotlin.collections.a.R(route.getSections());
                        if (section2 != null) {
                        }
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    transportTrackingCardUiStateInteractor$createRouteData$1.L$0 = null;
                    transportTrackingCardUiStateInteractor$createRouteData$1.L$1 = null;
                    transportTrackingCardUiStateInteractor$createRouteData$1.L$2 = null;
                    transportTrackingCardUiStateInteractor$createRouteData$1.L$3 = address6;
                    transportTrackingCardUiStateInteractor$createRouteData$1.L$4 = null;
                    transportTrackingCardUiStateInteractor$createRouteData$1.L$5 = str3;
                    transportTrackingCardUiStateInteractor$createRouteData$1.L$6 = route;
                    transportTrackingCardUiStateInteractor$createRouteData$1.label = 3;
                    c = ((ru.yandex.taxi.masstransit.datasource.routing.c) tw30Var).c(str2, timeOptions, transportTrackingCardUiStateInteractor$createRouteData$1);
                    if (c != coroutineSingletons) {
                        address4 = address6;
                        str4 = str3;
                        route3 = route;
                        if (c instanceof Result.Failure) {
                        }
                        route2 = (Route) c;
                        Address address7 = address4;
                        transportTrackingCardUiStateInteractor$createRouteData$13 = transportTrackingCardUiStateInteractor$createRouteData$1;
                        address3 = address7;
                        route = route3;
                        str3 = str4;
                        if (route2 == null) {
                        }
                        route5 = route2;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$0 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$1 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$2 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$3 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$4 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$5 = str3;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$6 = route;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$7 = route5;
                        transportTrackingCardUiStateInteractor$createRouteData$13.label = 4;
                        Section section22 = (Section) kotlin.collections.a.R(route.getSections());
                        if (section22 != null) {
                        }
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    str6 = (String) transportTrackingCardUiStateInteractor$createRouteData$1.L$6;
                    it2 = (Iterator) transportTrackingCardUiStateInteractor$createRouteData$1.L$5;
                    timeOptions2 = (TimeOptions) transportTrackingCardUiStateInteractor$createRouteData$1.L$4;
                    address5 = (Address) transportTrackingCardUiStateInteractor$createRouteData$1.L$3;
                    str5 = (String) transportTrackingCardUiStateInteractor$createRouteData$1.L$1;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                    if (obj instanceof Result.Failure) {
                        obj = null;
                    }
                    route4 = (Route) obj;
                    if (route4 == null) {
                        pair = new Pair(str6, route4);
                        timeOptions = timeOptions2;
                        str2 = str5;
                        it = it2;
                        transportTrackingCardUiStateInteractor$createRouteData$12 = transportTrackingCardUiStateInteractor$createRouteData$1;
                        address2 = address5;
                    } else {
                        transportTrackingCardUiStateInteractor$createRouteData$1.L$0 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$1.L$1 = str5;
                        transportTrackingCardUiStateInteractor$createRouteData$1.L$2 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$1.L$3 = address5;
                        transportTrackingCardUiStateInteractor$createRouteData$1.L$4 = timeOptions2;
                        transportTrackingCardUiStateInteractor$createRouteData$1.L$5 = it2;
                        transportTrackingCardUiStateInteractor$createRouteData$1.L$6 = str6;
                        transportTrackingCardUiStateInteractor$createRouteData$1.label = 2;
                        c2 = ((ru.yandex.taxi.masstransit.datasource.routing.c) tw30Var).c(str6, timeOptions2, transportTrackingCardUiStateInteractor$createRouteData$1);
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            route6 = (Route) transportTrackingCardUiStateInteractor$createRouteData$1.L$7;
                            route7 = (Route) transportTrackingCardUiStateInteractor$createRouteData$1.L$6;
                            str7 = (String) transportTrackingCardUiStateInteractor$createRouteData$1.L$5;
                            kotlin.b.b(obj2);
                            v1l0 v1l0Var = new v1l0(route7, route6, (List) obj2);
                            sVar.t.put(str7, v1l0Var);
                            return v1l0Var;
                        }
                        route3 = (Route) transportTrackingCardUiStateInteractor$createRouteData$1.L$6;
                        str4 = (String) transportTrackingCardUiStateInteractor$createRouteData$1.L$5;
                        address4 = (Address) transportTrackingCardUiStateInteractor$createRouteData$1.L$3;
                        kotlin.b.b(obj2);
                        c = ((Result) obj2).getValue();
                        if (c instanceof Result.Failure) {
                            c = null;
                        }
                        route2 = (Route) c;
                        Address address72 = address4;
                        transportTrackingCardUiStateInteractor$createRouteData$13 = transportTrackingCardUiStateInteractor$createRouteData$1;
                        address3 = address72;
                        route = route3;
                        str3 = str4;
                        if (route2 == null) {
                            sVar.i.getClass();
                            route2 = new pt40(route);
                            if (((ArrayList) route2.getSections()).isEmpty()) {
                                route2 = null;
                            }
                            if (route2 == null) {
                                route5 = route;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$0 = null;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$1 = null;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$2 = null;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$3 = null;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$4 = null;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$5 = str3;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$6 = route;
                                transportTrackingCardUiStateInteractor$createRouteData$13.L$7 = route5;
                                transportTrackingCardUiStateInteractor$createRouteData$13.label = 4;
                                Section section222 = (Section) kotlin.collections.a.R(route.getSections());
                                obj2 = (section222 != null || (geometry = section222.getGeometry()) == null || (subpolyline = SubpolylineHelper.subpolyline(route.getGeometry(), geometry)) == null || (points = subpolyline.getPoints()) == null || (point = (Point) kotlin.collections.a.R(points)) == null || (section = (Section) kotlin.collections.a.b0(route.getSections())) == null || (geometry2 = section.getGeometry()) == null || (subpolyline2 = SubpolylineHelper.subpolyline(route.getGeometry(), geometry2)) == null || (points2 = subpolyline2.getPoints()) == null || (point2 = (Point) kotlin.collections.a.b0(points2)) == null) ? EmptyList.a : bvf0.n(new TransportTrackingCardUiStateInteractor$buildAddresses$2(sVar, point, address3, point2, null), transportTrackingCardUiStateInteractor$createRouteData$13);
                                if (obj2 != coroutineSingletons) {
                                    route6 = route5;
                                    str7 = str3;
                                    route7 = route;
                                    v1l0 v1l0Var2 = new v1l0(route7, route6, (List) obj2);
                                    sVar.t.put(str7, v1l0Var2);
                                    return v1l0Var2;
                                }
                                return coroutineSingletons;
                            }
                        }
                        route5 = route2;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$0 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$1 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$2 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$3 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$4 = null;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$5 = str3;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$6 = route;
                        transportTrackingCardUiStateInteractor$createRouteData$13.L$7 = route5;
                        transportTrackingCardUiStateInteractor$createRouteData$13.label = 4;
                        Section section2222 = (Section) kotlin.collections.a.R(route.getSections());
                        if (section2222 != null) {
                        }
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    str6 = (String) transportTrackingCardUiStateInteractor$createRouteData$1.L$6;
                    it2 = (Iterator) transportTrackingCardUiStateInteractor$createRouteData$1.L$5;
                    timeOptions2 = (TimeOptions) transportTrackingCardUiStateInteractor$createRouteData$1.L$4;
                    address5 = (Address) transportTrackingCardUiStateInteractor$createRouteData$1.L$3;
                    str5 = (String) transportTrackingCardUiStateInteractor$createRouteData$1.L$1;
                    kotlin.b.b(obj2);
                    c2 = ((Result) obj2).getValue();
                    if (c2 instanceof Result.Failure) {
                        c2 = null;
                    }
                    Route route8 = (Route) c2;
                    pair = route8 != null ? new Pair(str6, route8) : null;
                    timeOptions = timeOptions2;
                    str2 = str5;
                    it = it2;
                    transportTrackingCardUiStateInteractor$createRouteData$12 = transportTrackingCardUiStateInteractor$createRouteData$1;
                    address2 = address5;
                }
            }
        }
        transportTrackingCardUiStateInteractor$createRouteData$1 = new TransportTrackingCardUiStateInteractor$createRouteData$1(sVar, continuationImpl);
        Object obj22 = transportTrackingCardUiStateInteractor$createRouteData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiStateInteractor$createRouteData$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tpr b(o2y0 o2y0Var, String str, String str2) {
        String str3;
        Address address;
        TaxiOrder b;
        if (str == null) {
            if (o2y0Var == null) {
                str3 = null;
                address = (Address) ((Map) this.n.c.getValue()).get(str3);
                com.yandex.go.route.interactor.b bVar = this.m;
                if (address != null) {
                    bVar.l(address);
                }
                bVar.g();
                String str4 = str3;
                return com.yandex.go.coroutines.b.d(new n(kotlinx.coroutines.flow.e.X(new rol0(new TransportTrackingCardUiStateInteractor$uiState$2(this, str3, o2y0Var, (o2y0Var != null || (b = o2y0Var.b()) == null) ? true : b.G(), address, null)), new TransportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1(null, o2y0Var, this, address, str4, str2)), str4, this), new TransportTrackingCardUiStateInteractor$uiState$$inlined$start$1(ka11.a, null));
            }
            str = this.l.b(o2y0Var.b().a, o2y0Var.b().b.b);
        }
        str3 = str;
        address = (Address) ((Map) this.n.c.getValue()).get(str3);
        com.yandex.go.route.interactor.b bVar2 = this.m;
        if (address != null) {
        }
        bVar2.g();
        String str42 = str3;
        return com.yandex.go.coroutines.b.d(new n(kotlinx.coroutines.flow.e.X(new rol0(new TransportTrackingCardUiStateInteractor$uiState$2(this, str3, o2y0Var, (o2y0Var != null || (b = o2y0Var.b()) == null) ? true : b.G(), address, null)), new TransportTrackingCardUiStateInteractor$uiState$$inlined$flatMapLatest$1(null, o2y0Var, this, address, str42, str2)), str42, this), new TransportTrackingCardUiStateInteractor$uiState$$inlined$start$1(ka11.a, null));
    }
}
