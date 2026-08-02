package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.WayPoint;
import com.yandex.mapkit.uri.UriObjectMetadata;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes12.dex */
public class RouteBinding implements Route {
    private final NativeObject nativeObject;

    public RouteBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native double distanceBetweenPolylinePositions(PolylinePosition polylinePosition, PolylinePosition polylinePosition2);

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native RouteMetadata getMetadata();

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native List<Section> getSections();

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native UriObjectMetadata getUriMetadata();

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native List<WayPoint> getWayPoints();

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native GraphLevel graphLevelAt(PolylinePosition polylinePosition);

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public native double timeBetweenPolylinePositions(PolylinePosition polylinePosition, PolylinePosition polylinePosition2);
}
