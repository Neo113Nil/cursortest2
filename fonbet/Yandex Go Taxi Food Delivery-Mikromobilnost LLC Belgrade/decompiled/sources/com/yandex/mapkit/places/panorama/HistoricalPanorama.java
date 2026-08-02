package com.yandex.mapkit.places.panorama;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class HistoricalPanorama implements Serializable {
    private String name;
    private String panoramaId;
    private long timestamp;

    public HistoricalPanorama(String str, String str2, long j) {
        if (str == null) {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"panoramaId\" cannot be null");
            throw null;
        }
        this.name = str;
        this.panoramaId = str2;
        this.timestamp = j;
    }

    public String getName() {
        return this.name;
    }

    public String getPanoramaId() {
        return this.panoramaId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
        this.panoramaId = archive.add(this.panoramaId, false);
        this.timestamp = archive.add(this.timestamp);
    }

    public HistoricalPanorama() {
    }
}
