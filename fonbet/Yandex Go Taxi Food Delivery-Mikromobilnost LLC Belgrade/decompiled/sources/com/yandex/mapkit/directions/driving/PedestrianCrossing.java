package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PedestrianCrossing implements Serializable {
    private PolylinePosition position;

    public PedestrianCrossing(PolylinePosition polylinePosition) {
        if (polylinePosition != null) {
            this.position = polylinePosition;
        } else {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
    }

    public PolylinePosition getPosition() {
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
    }

    public PedestrianCrossing() {
    }
}
