package com.yandex.mapkit.places.mrc;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class HistoricalPhoto implements Serializable {
    private String photoId;
    private long timestamp;

    public HistoricalPhoto(String str, long j) {
        if (str == null) {
            ny61.g("Required field \"photoId\" cannot be null");
            throw null;
        }
        this.photoId = str;
        this.timestamp = j;
    }

    public String getPhotoId() {
        return this.photoId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.photoId = archive.add(this.photoId, false);
        this.timestamp = archive.add(this.timestamp);
    }

    public HistoricalPhoto() {
    }
}
