package com.yandex.mapkit.directions.carparks.internal;

import com.yandex.mapkit.directions.carparks.CarparksNearbyLayer;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class CarparksNearbyLayerBinding implements CarparksNearbyLayer {
    private final NativeObject nativeObject;

    public CarparksNearbyLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.carparks.CarparksNearbyLayer
    public native void hide();

    @Override // com.yandex.mapkit.directions.carparks.CarparksNearbyLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.directions.carparks.CarparksNearbyLayer
    public native boolean isVisible();

    @Override // com.yandex.mapkit.directions.carparks.CarparksNearbyLayer
    public native void resetCarparksStyles();

    @Override // com.yandex.mapkit.directions.carparks.CarparksNearbyLayer
    public native boolean setCarparksStyle(int i, String str);

    @Override // com.yandex.mapkit.directions.carparks.CarparksNearbyLayer
    public native boolean setCarparksStyle(String str);

    @Override // com.yandex.mapkit.directions.carparks.CarparksNearbyLayer
    public native void show(Point point, double d);
}
