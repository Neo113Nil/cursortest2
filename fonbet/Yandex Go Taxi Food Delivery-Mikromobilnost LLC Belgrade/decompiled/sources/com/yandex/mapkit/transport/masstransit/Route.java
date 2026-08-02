package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.uri.UriObjectMetadata;
import java.util.List;

/* loaded from: classes12.dex */
public interface Route {
    double distanceBetweenPolylinePositions(PolylinePosition polylinePosition, PolylinePosition polylinePosition2);

    Polyline getGeometry();

    RouteMetadata getMetadata();

    List<Section> getSections();

    UriObjectMetadata getUriMetadata();

    List<WayPoint> getWayPoints();

    GraphLevel graphLevelAt(PolylinePosition polylinePosition);

    double timeBetweenPolylinePositions(PolylinePosition polylinePosition, PolylinePosition polylinePosition2);
}
