package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.styling.ArrowStyle;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.TrafficTypeID;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.mapkit.transport.masstransit.TransportType;
import java.util.List;

/* loaded from: classes7.dex */
public interface RouteViewStyleProvider {
    void provideFitnessPolylineStyle(ConstructionMask constructionMask, TrafficTypeID trafficTypeID, boolean z, boolean z2, LevelSelection levelSelection, RouteLineStyle routeLineStyle);

    void provideManoeuvreStyle(boolean z, boolean z2, ArrowStyle arrowStyle);

    void provideRouteStyle(boolean z, boolean z2, RouteStyle routeStyle);

    void provideTransferPolylineStyle(boolean z, boolean z2, RouteLineStyle routeLineStyle);

    void provideTransportPolylineStyle(List<TransportContour> list, List<TransportType> list2, Line.Style style, boolean z, boolean z2, boolean z3, RouteLineStyle routeLineStyle);

    void provideTransportStopStyle(float f, boolean z, PlacemarkStyle placemarkStyle);
}
