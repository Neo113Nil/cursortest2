package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.mapkit.transport.masstransit.TaxiMasstransitRouter;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class TaxiMasstransitRouterBinding implements TaxiMasstransitRouter {
    private final NativeObject nativeObject;

    public TaxiMasstransitRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.TaxiMasstransitRouter
    public native Session requestRoutes(List<RequestPoint> list, int i, FitnessOptions fitnessOptions, Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.TaxiMasstransitRouter
    public native SummarySession requestRoutesSummary(List<RequestPoint> list, int i, FitnessOptions fitnessOptions, SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.masstransit.TaxiMasstransitRouter
    public native Session resolveUri(String str, Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.TaxiMasstransitRouter
    public native MasstransitRouteSerializer routeSerializer();
}
