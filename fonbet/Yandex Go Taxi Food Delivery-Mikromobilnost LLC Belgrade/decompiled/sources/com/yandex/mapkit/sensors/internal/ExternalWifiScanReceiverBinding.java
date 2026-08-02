package com.yandex.mapkit.sensors.internal;

import com.yandex.mapkit.sensors.ExternalWifiScanReceiver;
import com.yandex.mapkit.sensors.WifiPointInfo;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ExternalWifiScanReceiverBinding implements ExternalWifiScanReceiver {
    private final NativeObject nativeObject;

    public ExternalWifiScanReceiverBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.sensors.ExternalWifiScanReceiver
    public native boolean isValid();

    @Override // com.yandex.mapkit.sensors.ExternalWifiScanReceiver
    public native void send(WifiPointInfo wifiPointInfo);
}
