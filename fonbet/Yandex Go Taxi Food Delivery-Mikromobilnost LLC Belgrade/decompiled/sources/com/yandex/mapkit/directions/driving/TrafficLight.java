package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TrafficLight implements Serializable {
    private String id;
    private PolylinePosition position;

    public TrafficLight(PolylinePosition polylinePosition, String str) {
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.position = polylinePosition;
        this.id = str;
    }

    public String getId() {
        return this.id;
    }

    public PolylinePosition getPosition() {
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.id = archive.add(this.id, true);
    }

    public TrafficLight() {
    }

    public TrafficLight(PolylinePosition polylinePosition) {
        if (polylinePosition != null) {
            this.position = polylinePosition;
        } else {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
    }
}
