package com.yandex.mapkit.navigation.transport;

import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ArrivalTime implements Serializable {
    private Time time;
    private Type type;

    public enum Type {
        ESTIMATED,
        SCHEDULED,
        PERIODICAL
    }

    public ArrivalTime(Type type, Time time) {
        if (type == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (time == null) {
            ny61.g("Required field \"time\" cannot be null");
            throw null;
        }
        this.type = type;
        this.time = time;
    }

    public Time getTime() {
        return this.time;
    }

    public Type getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (Type) archive.add((Archive) this.type, false, (Class<Archive>) Type.class);
        this.time = (Time) archive.add((Archive) this.time, false, (Class<Archive>) Time.class);
    }

    public ArrivalTime() {
    }
}
