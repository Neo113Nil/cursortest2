package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RawRuggedRoad implements Serializable {
    private RawInPoorConditionRoad inPoorCondition;
    private Subpolyline position;
    private RawUnpavedRoad unpaved;

    public RawRuggedRoad(Subpolyline subpolyline, RawUnpavedRoad rawUnpavedRoad, RawInPoorConditionRoad rawInPoorConditionRoad) {
        if (subpolyline == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.position = subpolyline;
        this.unpaved = rawUnpavedRoad;
        this.inPoorCondition = rawInPoorConditionRoad;
    }

    public RawInPoorConditionRoad getInPoorCondition() {
        return this.inPoorCondition;
    }

    public Subpolyline getPosition() {
        return this.position;
    }

    public RawUnpavedRoad getUnpaved() {
        return this.unpaved;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
        this.unpaved = (RawUnpavedRoad) archive.add((Archive) this.unpaved, true, (Class<Archive>) RawUnpavedRoad.class);
        this.inPoorCondition = (RawInPoorConditionRoad) archive.add((Archive) this.inPoorCondition, true, (Class<Archive>) RawInPoorConditionRoad.class);
    }

    public RawRuggedRoad() {
    }
}
