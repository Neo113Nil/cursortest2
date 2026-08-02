package com.yandex.mapkit.navigation.transport.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.transport.Annotator;
import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.GuidanceListener;
import com.yandex.mapkit.navigation.transport.GuidanceMode;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes7.dex */
public class GuidanceBinding implements Guidance {
    protected Subscription<GuidanceListener> guidanceListenerSubscription = new Subscription<GuidanceListener>(this) { // from class: com.yandex.mapkit.navigation.transport.internal.GuidanceBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(GuidanceListener guidanceListener) {
            return GuidanceBinding.createGuidanceListener(guidanceListener);
        }
    };
    private final NativeObject nativeObject;

    public GuidanceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createGuidanceListener(GuidanceListener guidanceListener);

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native void addListener(GuidanceListener guidanceListener);

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native void disableAutoRerouting();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native void enableAutoRerouting();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native Annotator getAnnotator();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native Double getCourse();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native Route getCurrentRoute();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native GuidanceMode getGuidanceMode();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native RequestPoint getLastReachedRequestPoint();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native Location getLocation();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native Double getRemainingDistance();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native PolylinePosition getRoutePosition();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native Double getTimeToFinish();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native boolean isValid();

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native void removeListener(GuidanceListener guidanceListener);

    @Override // com.yandex.mapkit.navigation.transport.Guidance
    public native boolean setTransportThread(int i, String str);
}
