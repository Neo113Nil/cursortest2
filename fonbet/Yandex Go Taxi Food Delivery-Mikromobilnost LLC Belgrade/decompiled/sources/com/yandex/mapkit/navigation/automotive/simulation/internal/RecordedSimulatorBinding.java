package com.yandex.mapkit.navigation.automotive.simulation.internal;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.location.internal.LocationManagerBinding;
import com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator;
import com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulatorListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class RecordedSimulatorBinding extends LocationManagerBinding implements RecordedSimulator {
    protected Subscription<RecordedSimulatorListener> recordedSimulatorListenerSubscription;

    public RecordedSimulatorBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.recordedSimulatorListenerSubscription = new Subscription<RecordedSimulatorListener>(this) { // from class: com.yandex.mapkit.navigation.automotive.simulation.internal.RecordedSimulatorBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(RecordedSimulatorListener recordedSimulatorListener) {
                return RecordedSimulatorBinding.createRecordedSimulatorListener(recordedSimulatorListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRecordedSimulatorListener(RecordedSimulatorListener recordedSimulatorListener);

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native int getClockRate();

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native Location getLocation();

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native DrivingRoute getRoute();

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native RecordedSimulator.RouteChangeReason getRouteChangeReason();

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native String getRouteUri();

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native long getTimestamp();

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native boolean isActive();

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native void setClockRate(int i);

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native void setTimestamp(long j);

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native void subscribeForSimulatorEvents(RecordedSimulatorListener recordedSimulatorListener);

    @Override // com.yandex.mapkit.navigation.automotive.simulation.RecordedSimulator
    public native void unsubscribeFromSimulatorEvents(RecordedSimulatorListener recordedSimulatorListener);
}
