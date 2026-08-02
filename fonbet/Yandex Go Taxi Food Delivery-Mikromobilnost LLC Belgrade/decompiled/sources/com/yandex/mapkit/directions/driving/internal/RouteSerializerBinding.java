package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.RouteSerializer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class RouteSerializerBinding implements RouteSerializer {
    private final NativeObject nativeObject;

    public RouteSerializerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.RouteSerializer
    public native DrivingRoute load(byte[] bArr);

    @Override // com.yandex.mapkit.directions.driving.RouteSerializer
    public native byte[] save(DrivingRoute drivingRoute);
}
