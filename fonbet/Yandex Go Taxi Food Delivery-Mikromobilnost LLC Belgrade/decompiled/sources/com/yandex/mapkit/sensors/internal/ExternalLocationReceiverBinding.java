package com.yandex.mapkit.sensors.internal;

import com.yandex.mapkit.sensors.ExternalLocation;
import com.yandex.mapkit.sensors.ExternalLocationReceiver;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ExternalLocationReceiverBinding implements ExternalLocationReceiver {
    private final NativeObject nativeObject;

    public ExternalLocationReceiverBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.sensors.ExternalLocationReceiver
    public native boolean isValid();

    @Override // com.yandex.mapkit.sensors.ExternalLocationReceiver
    public native void send(ExternalLocation externalLocation);
}
