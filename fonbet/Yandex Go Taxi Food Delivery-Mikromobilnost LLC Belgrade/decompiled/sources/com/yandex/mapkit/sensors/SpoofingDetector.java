package com.yandex.mapkit.sensors;

/* loaded from: classes15.dex */
public interface SpoofingDetector {
    boolean isSpoofingDetected();

    void resume();

    void subscribe(SpoofingDetectorListener spoofingDetectorListener);

    void suspend();

    void unsubscribe(SpoofingDetectorListener spoofingDetectorListener);
}
