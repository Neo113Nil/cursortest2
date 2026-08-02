package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.bicycle.Session;
import com.yandex.mapkit.transport.bicycle.SummarySession;
import java.util.List;

@Deprecated
/* loaded from: classes15.dex */
public interface BicycleRouter {
    Session requestRoutes(List<RequestPoint> list, VehicleType vehicleType, Session.RouteListener routeListener);

    SummarySession requestRoutesSummary(List<RequestPoint> list, VehicleType vehicleType, SummarySession.SummaryListener summaryListener);

    Session resolveUri(String str, Session.RouteListener routeListener);
}
