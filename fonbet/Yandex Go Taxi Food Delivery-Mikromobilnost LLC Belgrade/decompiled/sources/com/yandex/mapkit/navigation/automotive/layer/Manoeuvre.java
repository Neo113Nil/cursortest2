package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.Action;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Manoeuvre implements Serializable {
    private Action action;
    private LocalizedValue distance;
    private String nextRoadName;

    public Manoeuvre(Action action, LocalizedValue localizedValue, String str) {
        if (action == null) {
            ny61.g("Required field \"action\" cannot be null");
            throw null;
        }
        if (localizedValue == null) {
            ny61.g("Required field \"distance\" cannot be null");
            throw null;
        }
        this.action = action;
        this.distance = localizedValue;
        this.nextRoadName = str;
    }

    public Action getAction() {
        return this.action;
    }

    public LocalizedValue getDistance() {
        return this.distance;
    }

    public String getNextRoadName() {
        return this.nextRoadName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.action = (Action) archive.add((Archive) this.action, false, (Class<Archive>) Action.class);
        this.distance = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
        this.nextRoadName = archive.add(this.nextRoadName, true);
    }

    public Manoeuvre() {
    }
}
