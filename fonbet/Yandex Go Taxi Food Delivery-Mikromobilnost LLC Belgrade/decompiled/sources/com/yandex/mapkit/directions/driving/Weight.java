package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Weight implements Serializable {
    private LocalizedValue distance;
    private LocalizedValue time;
    private LocalizedValue timeWithTraffic;

    public Weight(LocalizedValue localizedValue, LocalizedValue localizedValue2, LocalizedValue localizedValue3) {
        if (localizedValue == null) {
            ny61.g("Required field \"time\" cannot be null");
            throw null;
        }
        if (localizedValue2 == null) {
            ny61.g("Required field \"timeWithTraffic\" cannot be null");
            throw null;
        }
        if (localizedValue3 == null) {
            ny61.g("Required field \"distance\" cannot be null");
            throw null;
        }
        this.time = localizedValue;
        this.timeWithTraffic = localizedValue2;
        this.distance = localizedValue3;
    }

    public LocalizedValue getDistance() {
        return this.distance;
    }

    public LocalizedValue getTime() {
        return this.time;
    }

    public LocalizedValue getTimeWithTraffic() {
        return this.timeWithTraffic;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.time = (LocalizedValue) archive.add((Archive) this.time, false, (Class<Archive>) LocalizedValue.class);
        this.timeWithTraffic = (LocalizedValue) archive.add((Archive) this.timeWithTraffic, false, (Class<Archive>) LocalizedValue.class);
        this.distance = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
    }

    public Weight() {
    }
}
