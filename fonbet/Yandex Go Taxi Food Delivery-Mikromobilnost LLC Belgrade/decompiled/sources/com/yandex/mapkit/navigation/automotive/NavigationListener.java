package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes7.dex */
public interface NavigationListener {
    void onAlternativesRequested(DrivingRoute drivingRoute);

    void onMatchRouteResolvingRequested();

    void onParkingRoutesRequested();

    void onResetRoutes();

    void onRoutesBuilt();

    void onRoutesRequestError(Error error);

    void onRoutesRequested(List<RequestPoint> list);

    void onUriResolvingRequested(String str);
}
