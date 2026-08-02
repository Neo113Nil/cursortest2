package com.yandex.go.taxi.order.net.xiva;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import defpackage.a3y0;
import defpackage.bay0;
import defpackage.h001;
import defpackage.hst;
import defpackage.j201;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k201;
import defpackage.l201;
import defpackage.ny61;
import defpackage.o201;
import defpackage.p201;
import defpackage.p721;
import defpackage.q201;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.net.tracker.models.TrackPoint$Remote$Source;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public l(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WebSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1 webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1;
        int i;
        l201 j201Var;
        zzs zzsVar;
        Double d;
        o201 o201Var;
        if (continuation instanceof WebSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1) {
            webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1 = (WebSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p721 p721Var = (p721) obj;
                    String str2 = p721Var.a;
                    TaxiRouteResponse.DriverInfo driverInfo = p721Var.b;
                    n nVar = this.b;
                    boolean l = jl40.l(str2, nVar.a);
                    a3y0 a3y0Var = nVar.h;
                    if (l) {
                        a3y0Var.getClass();
                        a3y0.h(new String[]{"remoteDataFlow"});
                        hst hstVar = jst.e;
                        nVar.c.getClass();
                        p201 b = bay0.b(driverInfo);
                        UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry updatePositionWebSocketMessageMapper$UpdatePositionGeometry = p721Var.c;
                        if (updatePositionWebSocketMessageMapper$UpdatePositionGeometry == null) {
                            j201Var = new j201(str, 3);
                        } else {
                            TaxiRouteResponse.DriverRouteGeometryPolyline driverRouteGeometryPolyline = updatePositionWebSocketMessageMapper$UpdatePositionGeometry.b;
                            List a = bay0.a(driverRouteGeometryPolyline.b, driverRouteGeometryPolyline.a);
                            boolean isEmpty = a.isEmpty();
                            String str3 = updatePositionWebSocketMessageMapper$UpdatePositionGeometry.a;
                            if (isEmpty) {
                                if (str3 == null) {
                                    str3 = "no_polyline_unique_id";
                                }
                                j201Var = new j201(str3, 2);
                            } else {
                                if (str3 == null) {
                                    str3 = "";
                                }
                                j201Var = new k201(str3, a);
                            }
                        }
                        List list = EmptyList.a;
                        if (driverInfo != null && (zzsVar = driverInfo.c) != null && (d = driverInfo.b) != null) {
                            double doubleValue = d.doubleValue();
                            Date date = driverInfo.e;
                            if (date != null) {
                                list = Collections.singletonList(new h001(zzsVar, doubleValue, date, Long.valueOf(nVar.g.d()), TrackPoint$Remote$Source.WEBSOCKET));
                            }
                        }
                        o201Var = new o201(b, q201.c, list, j201Var, false, 0L, null);
                    } else {
                        a3y0Var.getClass();
                        a3y0.h(new String[]{"remoteDataFlow"});
                        hst hstVar2 = jst.e;
                        o201Var = null;
                    }
                    if (o201Var != null) {
                        webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(o201Var, webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1 = new WebSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webSocketTrackerDataSource$remoteDataFlow$$inlined$mapNotNull$1$2$1.label;
        String str4 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
