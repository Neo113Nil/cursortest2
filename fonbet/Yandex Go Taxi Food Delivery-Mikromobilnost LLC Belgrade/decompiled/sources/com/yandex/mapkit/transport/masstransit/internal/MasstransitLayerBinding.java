package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.transport.masstransit.MasstransitLayer;
import com.yandex.mapkit.transport.masstransit.MasstransitLayerListener;
import com.yandex.mapkit.transport.masstransit.MasstransitVehicleTapListener;
import com.yandex.mapkit.transport.masstransit.VehicleData;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class MasstransitLayerBinding implements MasstransitLayer {
    protected Subscription<MasstransitLayerListener> masstransitLayerListenerSubscription = new Subscription<MasstransitLayerListener>(this) { // from class: com.yandex.mapkit.transport.masstransit.internal.MasstransitLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(MasstransitLayerListener masstransitLayerListener) {
            return MasstransitLayerBinding.createMasstransitLayerListener(masstransitLayerListener);
        }
    };
    protected Subscription<MasstransitVehicleTapListener> masstransitVehicleTapListenerSubscription = new Subscription<MasstransitVehicleTapListener>(this) { // from class: com.yandex.mapkit.transport.masstransit.internal.MasstransitLayerBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(MasstransitVehicleTapListener masstransitVehicleTapListener) {
            return MasstransitLayerBinding.createMasstransitVehicleTapListener(masstransitVehicleTapListener);
        }
    };
    private final NativeObject nativeObject;

    public MasstransitLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createMasstransitLayerListener(MasstransitLayerListener masstransitLayerListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createMasstransitVehicleTapListener(MasstransitVehicleTapListener masstransitVehicleTapListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void addLineFilter(String str);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void addListener(MasstransitLayerListener masstransitLayerListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void addTypeFilter(String str);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void clearLineFilter();

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void clearTypeFilter();

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native VehicleData getVehicleData(PlacemarkMapObject placemarkMapObject);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native MapObjectCollection getVehicleObjects();

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native boolean isVehiclesVisible();

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void removeListener(MasstransitLayerListener masstransitLayerListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void setVehicleTapListener(MasstransitVehicleTapListener masstransitVehicleTapListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitLayer
    public native void setVehiclesVisible(boolean z);
}
