package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Weight implements Serializable {
    private LocalizedValue distance;
    private LocalizedValue time;

    public Weight(LocalizedValue localizedValue, LocalizedValue localizedValue2) {
        if (localizedValue == null) {
            ny61.g("Required field \"time\" cannot be null");
            throw null;
        }
        if (localizedValue2 == null) {
            ny61.g("Required field \"distance\" cannot be null");
            throw null;
        }
        this.time = localizedValue;
        this.distance = localizedValue2;
    }

    public LocalizedValue getDistance() {
        return this.distance;
    }

    public LocalizedValue getTime() {
        return this.time;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.time = (LocalizedValue) archive.add((Archive) this.time, false, (Class<Archive>) LocalizedValue.class);
        this.distance = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
    }

    public Weight() {
    }
}
