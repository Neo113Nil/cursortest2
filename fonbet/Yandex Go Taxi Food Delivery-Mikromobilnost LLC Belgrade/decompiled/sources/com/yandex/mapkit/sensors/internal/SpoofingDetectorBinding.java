package com.yandex.mapkit.sensors.internal;

import com.yandex.mapkit.sensors.SpoofingDetector;
import com.yandex.mapkit.sensors.SpoofingDetectorListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class SpoofingDetectorBinding implements SpoofingDetector {
    private final NativeObject nativeObject;
    protected Subscription<SpoofingDetectorListener> spoofingDetectorListenerSubscription = new Subscription<SpoofingDetectorListener>(this) { // from class: com.yandex.mapkit.sensors.internal.SpoofingDetectorBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(SpoofingDetectorListener spoofingDetectorListener) {
            return SpoofingDetectorBinding.createSpoofingDetectorListener(spoofingDetectorListener);
        }
    };

    public SpoofingDetectorBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createSpoofingDetectorListener(SpoofingDetectorListener spoofingDetectorListener);

    @Override // com.yandex.mapkit.sensors.SpoofingDetector
    public native boolean isSpoofingDetected();

    @Override // com.yandex.mapkit.sensors.SpoofingDetector
    public native void resume();

    @Override // com.yandex.mapkit.sensors.SpoofingDetector
    public native void subscribe(SpoofingDetectorListener spoofingDetectorListener);

    @Override // com.yandex.mapkit.sensors.SpoofingDetector
    public native void suspend();

    @Override // com.yandex.mapkit.sensors.SpoofingDetector
    public native void unsubscribe(SpoofingDetectorListener spoofingDetectorListener);
}
