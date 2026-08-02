package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TransitOptions implements Serializable {
    private int avoid;
    private TimeOptions timeOptions;

    public TransitOptions(int i, TimeOptions timeOptions) {
        this.avoid = FilterVehicleTypes.NONE.value;
        if (timeOptions == null) {
            ny61.g("Required field \"timeOptions\" cannot be null");
            throw null;
        }
        this.avoid = i;
        this.timeOptions = timeOptions;
    }

    public int getAvoid() {
        return this.avoid;
    }

    public TimeOptions getTimeOptions() {
        return this.timeOptions;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.avoid = archive.add(Integer.valueOf(this.avoid), false).intValue();
        this.timeOptions = (TimeOptions) archive.add((Archive) this.timeOptions, false, (Class<Archive>) TimeOptions.class);
    }

    public TransitOptions() {
        this.avoid = FilterVehicleTypes.NONE.value;
    }
}
