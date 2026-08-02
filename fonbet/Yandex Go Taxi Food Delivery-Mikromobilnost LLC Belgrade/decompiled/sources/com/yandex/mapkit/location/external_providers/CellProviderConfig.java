package com.yandex.mapkit.location.external_providers;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class CellProviderConfig implements Serializable {
    private long interval;

    public CellProviderConfig() {
        this.interval = 8000L;
    }

    public long getInterval() {
        return this.interval;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.interval = archive.add(this.interval);
    }

    public CellProviderConfig(long j) {
        this.interval = j;
    }
}
