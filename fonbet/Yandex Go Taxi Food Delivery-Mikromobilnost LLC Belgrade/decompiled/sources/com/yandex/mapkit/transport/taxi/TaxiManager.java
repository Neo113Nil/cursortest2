package com.yandex.mapkit.transport.taxi;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.taxi.RideInfoSession;

/* loaded from: classes15.dex */
public interface TaxiManager {
    RideInfoSession requestRideInfo(Point point, Point point2, RideInfoSession.RideInfoListener rideInfoListener);
}
