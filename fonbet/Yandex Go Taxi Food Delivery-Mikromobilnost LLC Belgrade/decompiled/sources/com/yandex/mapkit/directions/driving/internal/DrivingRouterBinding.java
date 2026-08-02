package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.directions.driving.RouteSerializer;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class DrivingRouterBinding implements DrivingRouter {
    private final NativeObject nativeObject;

    public DrivingRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native DrivingSession matchRoute(Polyline polyline, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native DrivingSession requestAlternativesForRoute(DrivingRoute drivingRoute, PolylinePosition polylinePosition, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native DrivingSession requestParkingRoutes(Point point, Point point2, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native DrivingSession requestRoutes(List<RequestPoint> list, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native DrivingSummarySession requestRoutesArrivalSummary(List<RequestPoint> list, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native DrivingSummarySession requestRoutesSummary(List<RequestPoint> list, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native DrivingSession resolveUri(String str, DrivingOptions drivingOptions, VehicleOptions vehicleOptions, DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    public native RouteSerializer routeSerializer();
}
