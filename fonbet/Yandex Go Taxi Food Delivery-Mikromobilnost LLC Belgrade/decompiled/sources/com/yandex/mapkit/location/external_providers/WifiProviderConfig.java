package com.yandex.mapkit.location.external_providers;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class WifiProviderConfig implements Serializable {
    private long activeScanInterval;
    private long minInterval;

    public WifiProviderConfig() {
        this.activeScanInterval = 1000L;
        this.minInterval = 1000L;
    }

    public long getActiveScanInterval() {
        return this.activeScanInterval;
    }

    public long getMinInterval() {
        return this.minInterval;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.activeScanInterval = archive.add(this.activeScanInterval);
        this.minInterval = archive.add(this.minInterval);
    }

    public WifiProviderConfig(long j, long j2) {
        this.activeScanInterval = j;
        this.minInterval = j2;
    }
}
