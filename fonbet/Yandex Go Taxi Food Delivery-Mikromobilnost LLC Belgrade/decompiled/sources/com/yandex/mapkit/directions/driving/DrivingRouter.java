package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* loaded from: classes15.dex */
public interface DrivingRouter {
    DrivingSession matchRoute(Polyline polyline, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    DrivingSession requestAlternativesForRoute(DrivingRoute drivingRoute, PolylinePosition polylinePosition, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    DrivingSession requestParkingRoutes(Point point, Point point2, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    DrivingSession requestRoutes(List<RequestPoint> list, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    DrivingSummarySession requestRoutesArrivalSummary(List<RequestPoint> list, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);

    DrivingSummarySession requestRoutesSummary(List<RequestPoint> list, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);

    DrivingSession resolveUri(String str, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    RouteSerializer routeSerializer();
}
