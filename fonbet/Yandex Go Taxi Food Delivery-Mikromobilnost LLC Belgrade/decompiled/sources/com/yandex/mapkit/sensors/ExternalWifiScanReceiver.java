package com.yandex.mapkit.sensors;

/* loaded from: classes15.dex */
public interface ExternalWifiScanReceiver {
    boolean isValid();

    void send(WifiPointInfo wifiPointInfo);
}
