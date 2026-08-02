package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class IndoorConnectorManoeuvre implements Serializable {
    private IndoorConnectorManoeuvreType type;
    private String upcomingLevelName;

    public IndoorConnectorManoeuvre(IndoorConnectorManoeuvreType indoorConnectorManoeuvreType, String str) {
        if (indoorConnectorManoeuvreType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        this.type = indoorConnectorManoeuvreType;
        this.upcomingLevelName = str;
    }

    public IndoorConnectorManoeuvreType getType() {
        return this.type;
    }

    public String getUpcomingLevelName() {
        return this.upcomingLevelName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (IndoorConnectorManoeuvreType) archive.add((Archive) this.type, false, (Class<Archive>) IndoorConnectorManoeuvreType.class);
        this.upcomingLevelName = archive.add(this.upcomingLevelName, true);
    }

    public IndoorConnectorManoeuvre() {
    }
}
