package com.yandex.mapkit.directions.driving;

/* loaded from: classes15.dex */
public interface RouteSerializer {
    DrivingRoute load(byte[] bArr);

    byte[] save(DrivingRoute drivingRoute);
}
