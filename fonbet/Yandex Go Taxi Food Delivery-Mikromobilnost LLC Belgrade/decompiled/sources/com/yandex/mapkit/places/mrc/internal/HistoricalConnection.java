package com.yandex.mapkit.places.mrc.internal;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class HistoricalConnection implements Serializable {
    private String photoId;
    private Long takenAt;

    public HistoricalConnection(String str, Long l) {
        if (str == null) {
            ny61.g("Required field \"photoId\" cannot be null");
            throw null;
        }
        this.photoId = str;
        this.takenAt = l;
    }

    public String getPhotoId() {
        return this.photoId;
    }

    public Long getTakenAt() {
        return this.takenAt;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.photoId = archive.add(this.photoId, false);
        this.takenAt = archive.add(this.takenAt, true);
    }

    public HistoricalConnection() {
    }
}
