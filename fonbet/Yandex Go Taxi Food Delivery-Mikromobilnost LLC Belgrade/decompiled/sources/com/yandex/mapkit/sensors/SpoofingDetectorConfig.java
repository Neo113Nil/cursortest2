package com.yandex.mapkit.sensors;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public final class SpoofingDetectorConfig implements Serializable {
    private Double confidenceThreshold;

    public SpoofingDetectorConfig() {
        this.confidenceThreshold = null;
    }

    public Double getConfidenceThreshold() {
        return this.confidenceThreshold;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.confidenceThreshold = archive.add(this.confidenceThreshold, true);
    }

    public SpoofingDetectorConfig setConfidenceThreshold(Double d) {
        this.confidenceThreshold = d;
        return this;
    }

    public SpoofingDetectorConfig(Double d) {
        this.confidenceThreshold = d;
    }
}
