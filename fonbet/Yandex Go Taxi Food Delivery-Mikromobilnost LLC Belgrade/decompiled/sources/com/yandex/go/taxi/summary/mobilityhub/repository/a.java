package com.yandex.go.taxi.summary.mobilityhub.repository;

import com.yandex.go.taxi.summary.mobilityhub.model.TransportErrorReason;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.geometry.Point;
import defpackage.hpi0;
import defpackage.m811;
import defpackage.n811;
import defpackage.ny61;
import defpackage.ow30;
import defpackage.scc;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes14.dex */
public final class a {
    public final ow30 a;
    public final com.yandex.go.route.interactor.b b;
    public final hpi0 c;

    public a(ow30 ow30Var, com.yandex.go.route.interactor.b bVar, hpi0 hpi0Var) {
        this.a = ow30Var;
        this.b = bVar;
        this.c = hpi0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        if (r6 != r9) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Point point, Point point2, ContinuationImpl continuationImpl) {
        TransportRouteInteractor$requestRoutesInternal$1 transportRouteInteractor$requestRoutesInternal$1;
        int i;
        RequestPoint o;
        RequestPoint o2;
        Object c;
        ow30 ow30Var = aVar.a;
        try {
            if (continuationImpl instanceof TransportRouteInteractor$requestRoutesInternal$1) {
                transportRouteInteractor$requestRoutesInternal$1 = (TransportRouteInteractor$requestRoutesInternal$1) continuationImpl;
                int i2 = transportRouteInteractor$requestRoutesInternal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    transportRouteInteractor$requestRoutesInternal$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = transportRouteInteractor$requestRoutesInternal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = transportRouteInteractor$requestRoutesInternal$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        transportRouteInteractor$requestRoutesInternal$1.L$0 = point;
                        transportRouteInteractor$requestRoutesInternal$1.L$1 = point2;
                        transportRouteInteractor$requestRoutesInternal$1.label = 1;
                        if (((ru.yandex.taxi.masstransit.datasource.routing.b) ow30Var).b(transportRouteInteractor$requestRoutesInternal$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            c = ((Result) obj).getValue();
                            return Result.a(c) == null ? new n811((List) c) : new m811(TransportErrorReason.LoadingError);
                        }
                        point2 = (Point) transportRouteInteractor$requestRoutesInternal$1.L$1;
                        point = (Point) transportRouteInteractor$requestRoutesInternal$1.L$0;
                        kotlin.b.b(obj);
                    }
                    RequestPointType requestPointType = RequestPointType.WAYPOINT;
                    o = k.o(point, requestPointType, null);
                    if (o == null && (o2 = k.o(point2, requestPointType, null)) != null) {
                        List g = scc.g(o, o2);
                        transportRouteInteractor$requestRoutesInternal$1.L$0 = null;
                        transportRouteInteractor$requestRoutesInternal$1.L$1 = null;
                        transportRouteInteractor$requestRoutesInternal$1.L$2 = null;
                        transportRouteInteractor$requestRoutesInternal$1.L$3 = null;
                        transportRouteInteractor$requestRoutesInternal$1.L$4 = null;
                        transportRouteInteractor$requestRoutesInternal$1.label = 2;
                        c = ((ru.yandex.taxi.masstransit.datasource.routing.b) ow30Var).c(g, transportRouteInteractor$requestRoutesInternal$1);
                    }
                    return new m811(TransportErrorReason.LoadingError);
                }
            }
            if (i != 0) {
            }
            RequestPointType requestPointType2 = RequestPointType.WAYPOINT;
            o = k.o(point, requestPointType2, null);
            if (o == null) {
                return new m811(TransportErrorReason.LoadingError);
            }
            List g2 = scc.g(o, o2);
            transportRouteInteractor$requestRoutesInternal$1.L$0 = null;
            transportRouteInteractor$requestRoutesInternal$1.L$1 = null;
            transportRouteInteractor$requestRoutesInternal$1.L$2 = null;
            transportRouteInteractor$requestRoutesInternal$1.L$3 = null;
            transportRouteInteractor$requestRoutesInternal$1.L$4 = null;
            transportRouteInteractor$requestRoutesInternal$1.label = 2;
            c = ((ru.yandex.taxi.masstransit.datasource.routing.b) ow30Var).c(g2, transportRouteInteractor$requestRoutesInternal$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return new m811(TransportErrorReason.LoadingError);
        }
        transportRouteInteractor$requestRoutesInternal$1 = new TransportRouteInteractor$requestRoutesInternal$1(aVar, continuationImpl);
        Object obj2 = transportRouteInteractor$requestRoutesInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRouteInteractor$requestRoutesInternal$1.label;
    }

    public final g b() {
        return e.X(new m0(this.b.k(), com.yandex.go.coroutines.b.d(this.c.d, new TransportRouteInteractor$stateFlow$$inlined$start$1(zy11.a, null)), new TransportRouteInteractor$stateFlow$1(3, null)), new TransportRouteInteractor$stateFlow$$inlined$flatMapLatest$1(null, this));
    }
}
