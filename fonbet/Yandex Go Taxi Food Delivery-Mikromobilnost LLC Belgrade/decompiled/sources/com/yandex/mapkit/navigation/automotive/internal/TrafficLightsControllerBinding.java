package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.automotive.TrafficLightsController;
import com.yandex.mapkit.navigation.automotive.TrafficLightsControllerListener;
import com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class TrafficLightsControllerBinding implements TrafficLightsController {
    private final NativeObject nativeObject;
    protected Subscription<TrafficLightsControllerListener> trafficLightsControllerListenerSubscription = new Subscription<TrafficLightsControllerListener>(this) { // from class: com.yandex.mapkit.navigation.automotive.internal.TrafficLightsControllerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(TrafficLightsControllerListener trafficLightsControllerListener) {
            return TrafficLightsControllerBinding.createTrafficLightsControllerListener(trafficLightsControllerListener);
        }
    };

    public TrafficLightsControllerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createTrafficLightsControllerListener(TrafficLightsControllerListener trafficLightsControllerListener);

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native void addListener(TrafficLightsControllerListener trafficLightsControllerListener);

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native List<UpcomingTrafficLightWithSignal> getTrafficLightsWithSignal();

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native void removeListener(TrafficLightsControllerListener trafficLightsControllerListener);

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native void resume();

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native void setMaxNumberOfUpcomingTrafficLights(int i);

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native void setRoute(DrivingRoute drivingRoute);

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native void setRoutePosition(PolylinePosition polylinePosition);

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsController
    public native void suspend();
}
