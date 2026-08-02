package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Stairs implements Serializable {
    private StairsDirection direction;
    private boolean hasRamp;

    public Stairs(StairsDirection stairsDirection, boolean z) {
        if (stairsDirection == null) {
            ny61.g("Required field \"direction\" cannot be null");
            throw null;
        }
        this.direction = stairsDirection;
        this.hasRamp = z;
    }

    public StairsDirection getDirection() {
        return this.direction;
    }

    public boolean getHasRamp() {
        return this.hasRamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.direction = (StairsDirection) archive.add((Archive) this.direction, false, (Class<Archive>) StairsDirection.class);
        this.hasRamp = archive.add(this.hasRamp);
    }

    public Stairs() {
    }
}
