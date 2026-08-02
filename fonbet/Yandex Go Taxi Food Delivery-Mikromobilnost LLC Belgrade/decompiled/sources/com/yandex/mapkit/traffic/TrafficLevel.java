package com.yandex.mapkit.traffic;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public class TrafficLevel implements Serializable {
    private TrafficColor color;
    private int level;

    public TrafficLevel(TrafficColor trafficColor, int i) {
        if (trafficColor == null) {
            ny61.g("Required field \"color\" cannot be null");
            throw null;
        }
        this.color = trafficColor;
        this.level = i;
    }

    public TrafficColor getColor() {
        return this.color;
    }

    public int getLevel() {
        return this.level;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.color = (TrafficColor) archive.add((Archive) this.color, false, (Class<Archive>) TrafficColor.class);
        this.level = archive.add(this.level);
    }

    public TrafficLevel() {
    }
}
