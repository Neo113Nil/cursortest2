package com.yandex.mapkit.navigation.transport.layer.internal;

import com.yandex.mapkit.navigation.transport.layer.RouteView;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes7.dex */
public class RouteViewBinding implements RouteView {
    private final NativeObject nativeObject;

    public RouteViewBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteView
    public native List<BalloonView> getBalloons();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteView
    public native Route getRoute();

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteView
    public native boolean isValid();
}
