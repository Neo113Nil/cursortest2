package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RawInPoorConditionRoad implements Serializable {
    private int dummy;

    public RawInPoorConditionRoad(int i) {
        this.dummy = i;
    }

    public int getDummy() {
        return this.dummy;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.dummy = archive.add(this.dummy);
    }

    public RawInPoorConditionRoad() {
    }
}
