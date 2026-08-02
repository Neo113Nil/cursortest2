package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RailwayCrossing implements Serializable {
    private PolylinePosition position;
    private RailwayCrossingType type;

    public RailwayCrossing(RailwayCrossingType railwayCrossingType, PolylinePosition polylinePosition) {
        if (railwayCrossingType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.type = railwayCrossingType;
        this.position = polylinePosition;
    }

    public PolylinePosition getPosition() {
        return this.position;
    }

    public RailwayCrossingType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (RailwayCrossingType) archive.add((Archive) this.type, false, (Class<Archive>) RailwayCrossingType.class);
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
    }

    public RailwayCrossing() {
    }
}
