package com.yandex.mapkit.location.external_providers;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class OutdoorProviderConfig implements Serializable {
    private long checkZoneInterval;

    public OutdoorProviderConfig() {
        this.checkZoneInterval = 5000L;
    }

    public long getCheckZoneInterval() {
        return this.checkZoneInterval;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.checkZoneInterval = archive.add(this.checkZoneInterval);
    }

    public OutdoorProviderConfig(long j) {
        this.checkZoneInterval = j;
    }
}
