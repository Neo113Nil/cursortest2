package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import java.util.List;

/* loaded from: classes15.dex */
public interface TaxiMasstransitRouter {
    Session requestRoutes(List<RequestPoint> list, int i, FitnessOptions fitnessOptions, Session.RouteListener routeListener);

    SummarySession requestRoutesSummary(List<RequestPoint> list, int i, FitnessOptions fitnessOptions, SummarySession.SummaryListener summaryListener);

    Session resolveUri(String str, Session.RouteListener routeListener);

    MasstransitRouteSerializer routeSerializer();
}
