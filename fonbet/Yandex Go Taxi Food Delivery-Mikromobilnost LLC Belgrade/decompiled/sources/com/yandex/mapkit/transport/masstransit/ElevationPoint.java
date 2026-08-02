package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ElevationPoint implements Serializable {
    private boolean confident;
    private float elevation;

    public ElevationPoint(float f) {
        this.confident = true;
        this.elevation = f;
    }

    public boolean getConfident() {
        return this.confident;
    }

    public float getElevation() {
        return this.elevation;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.elevation = archive.add(this.elevation);
        this.confident = archive.add(this.confident);
    }

    public ElevationPoint() {
        this.confident = true;
    }

    public ElevationPoint(float f, boolean z) {
        this.elevation = f;
        this.confident = z;
    }
}
