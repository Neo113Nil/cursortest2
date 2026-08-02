package com.yandex.mapkit.location.internal;

import com.yandex.mapkit.location.LocationSequenceQuality;
import com.yandex.mapkit.location.LocationSequenceQualitySession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class LocationSequenceQualitySessionBinding implements LocationSequenceQualitySession {
    private final NativeObject nativeObject;

    public LocationSequenceQualitySessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.location.LocationSequenceQualitySession
    public native void cancel();

    @Override // com.yandex.mapkit.location.LocationSequenceQualitySession
    public native LocationSequenceQuality getCurrentQuality();

    @Override // com.yandex.mapkit.location.LocationSequenceQualitySession
    public native void resume();

    @Override // com.yandex.mapkit.location.LocationSequenceQualitySession
    public native void suspend();
}
