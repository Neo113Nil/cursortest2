package com.yandex.mapkit.transport.taxi.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.taxi.RideInfoSession;
import com.yandex.mapkit.transport.taxi.TaxiManager;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class TaxiManagerBinding implements TaxiManager {
    private final NativeObject nativeObject;

    public TaxiManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.taxi.TaxiManager
    public native RideInfoSession requestRideInfo(Point point, Point point2, RideInfoSession.RideInfoListener rideInfoListener);
}
