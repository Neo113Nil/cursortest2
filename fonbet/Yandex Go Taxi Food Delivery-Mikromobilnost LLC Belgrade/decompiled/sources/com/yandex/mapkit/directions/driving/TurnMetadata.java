package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class TurnMetadata implements Serializable {
    private int turnNumber;

    public TurnMetadata(int i) {
        this.turnNumber = i;
    }

    public int getTurnNumber() {
        return this.turnNumber;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.turnNumber = archive.add(this.turnNumber);
    }

    public TurnMetadata() {
    }
}
