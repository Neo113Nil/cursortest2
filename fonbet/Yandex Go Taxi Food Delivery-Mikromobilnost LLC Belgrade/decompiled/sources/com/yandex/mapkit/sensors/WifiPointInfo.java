package com.yandex.mapkit.sensors;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class WifiPointInfo implements Serializable {
    private String bssid;
    private Integer signalStrengthDbm;
    private String ssid;
    private long timestamp;

    public WifiPointInfo(String str, String str2, Integer num, long j) {
        if (str == null) {
            ny61.g("Required field \"bssid\" cannot be null");
            throw null;
        }
        this.bssid = str;
        this.ssid = str2;
        this.signalStrengthDbm = num;
        this.timestamp = j;
    }

    public String getBssid() {
        return this.bssid;
    }

    public Integer getSignalStrengthDbm() {
        return this.signalStrengthDbm;
    }

    public String getSsid() {
        return this.ssid;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.bssid = archive.add(this.bssid, false);
        this.ssid = archive.add(this.ssid, true);
        this.signalStrengthDbm = archive.add(this.signalStrengthDbm, true);
        this.timestamp = archive.add(this.timestamp);
    }

    public WifiPointInfo() {
    }
}
