package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class FordCrossing implements Serializable {
    private Subpolyline position;

    public FordCrossing(Subpolyline subpolyline) {
        if (subpolyline != null) {
            this.position = subpolyline;
        } else {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
    }

    public Subpolyline getPosition() {
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
    }

    public FordCrossing() {
    }
}
