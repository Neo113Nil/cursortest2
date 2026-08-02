package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RuggedRoad implements Serializable {
    private boolean inPoorCondition;
    private Subpolyline position;
    private boolean unpaved;

    public RuggedRoad(Subpolyline subpolyline, boolean z, boolean z2) {
        if (subpolyline == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.position = subpolyline;
        this.unpaved = z;
        this.inPoorCondition = z2;
    }

    public boolean getInPoorCondition() {
        return this.inPoorCondition;
    }

    public Subpolyline getPosition() {
        return this.position;
    }

    public boolean getUnpaved() {
        return this.unpaved;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
        this.unpaved = archive.add(this.unpaved);
        this.inPoorCondition = archive.add(this.inPoorCondition);
    }

    public RuggedRoad() {
    }
}
