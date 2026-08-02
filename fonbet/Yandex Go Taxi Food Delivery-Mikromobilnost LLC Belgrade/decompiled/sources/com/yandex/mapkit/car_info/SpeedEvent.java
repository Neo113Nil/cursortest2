package com.yandex.mapkit.car_info;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class SpeedEvent implements Serializable {
    private SpeedValue display;
    private SpeedValue raw;

    public SpeedEvent(SpeedValue speedValue, SpeedValue speedValue2) {
        this.display = speedValue;
        this.raw = speedValue2;
    }

    public SpeedValue getDisplay() {
        return this.display;
    }

    public SpeedValue getRaw() {
        return this.raw;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.display = (SpeedValue) archive.add((Archive) this.display, true, (Class<Archive>) SpeedValue.class);
        this.raw = (SpeedValue) archive.add((Archive) this.raw, true, (Class<Archive>) SpeedValue.class);
    }

    public SpeedEvent() {
    }
}
