package com.yandex.mapkit.road_events;

import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TimePeriod implements Serializable {
    private Time begin;
    private Time end;

    public TimePeriod(Time time, Time time2) {
        if (time == null) {
            ny61.g("Required field \"begin\" cannot be null");
            throw null;
        }
        this.begin = time;
        this.end = time2;
    }

    public Time getBegin() {
        return this.begin;
    }

    public Time getEnd() {
        return this.end;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.begin = (Time) archive.add((Archive) this.begin, false, (Class<Archive>) Time.class);
        this.end = (Time) archive.add((Archive) this.end, true, (Class<Archive>) Time.class);
    }

    public TimePeriod() {
    }
}
