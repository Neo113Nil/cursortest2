package com.yandex.mapkit.navigation.automotive.layer.internal;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.layer.BalloonView;
import com.yandex.mapkit.navigation.automotive.layer.RouteView;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class RouteViewBinding implements RouteView {
    private final NativeObject nativeObject;

    public RouteViewBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.RouteView
    public native List<BalloonView> getBalloonViews();

    @Override // com.yandex.mapkit.navigation.automotive.layer.RouteView
    public native DrivingRoute getRoute();

    @Override // com.yandex.mapkit.navigation.automotive.layer.RouteView
    public native boolean isValid();
}
