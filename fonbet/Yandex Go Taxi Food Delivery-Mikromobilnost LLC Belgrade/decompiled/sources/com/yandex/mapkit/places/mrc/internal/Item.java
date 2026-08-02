package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Item implements Serializable {
    private String photoId;
    private PolylinePosition position;

    public Item(PolylinePosition polylinePosition, String str) {
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.position = polylinePosition;
        this.photoId = str;
    }

    public String getPhotoId() {
        return this.photoId;
    }

    public PolylinePosition getPosition() {
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.photoId = archive.add(this.photoId, true);
    }

    public Item() {
    }
}
