package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SpeedLimits implements Serializable {
    private LocalizedValue expressway;
    private LocalizedValue rural;
    private LocalizedValue urban;

    public SpeedLimits(LocalizedValue localizedValue, LocalizedValue localizedValue2, LocalizedValue localizedValue3) {
        if (localizedValue == null) {
            ny61.g("Required field \"urban\" cannot be null");
            throw null;
        }
        if (localizedValue2 == null) {
            ny61.g("Required field \"rural\" cannot be null");
            throw null;
        }
        if (localizedValue3 == null) {
            ny61.g("Required field \"expressway\" cannot be null");
            throw null;
        }
        this.urban = localizedValue;
        this.rural = localizedValue2;
        this.expressway = localizedValue3;
    }

    public LocalizedValue getExpressway() {
        return this.expressway;
    }

    public LocalizedValue getRural() {
        return this.rural;
    }

    public LocalizedValue getUrban() {
        return this.urban;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.urban = (LocalizedValue) archive.add((Archive) this.urban, false, (Class<Archive>) LocalizedValue.class);
        this.rural = (LocalizedValue) archive.add((Archive) this.rural, false, (Class<Archive>) LocalizedValue.class);
        this.expressway = (LocalizedValue) archive.add((Archive) this.expressway, false, (Class<Archive>) LocalizedValue.class);
    }

    public SpeedLimits() {
    }
}
