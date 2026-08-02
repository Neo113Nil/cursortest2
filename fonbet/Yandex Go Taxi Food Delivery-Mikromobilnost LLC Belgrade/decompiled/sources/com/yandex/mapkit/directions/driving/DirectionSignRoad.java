package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class DirectionSignRoad implements Serializable {
    private String name;
    private DirectionSignStyle style;

    public DirectionSignRoad(String str, DirectionSignStyle directionSignStyle) {
        if (str == null) {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
        if (directionSignStyle == null) {
            ny61.g("Required field \"style\" cannot be null");
            throw null;
        }
        this.name = str;
        this.style = directionSignStyle;
    }

    public String getName() {
        return this.name;
    }

    public DirectionSignStyle getStyle() {
        return this.style;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
        this.style = (DirectionSignStyle) archive.add((Archive) this.style, false, (Class<Archive>) DirectionSignStyle.class);
    }

    public DirectionSignRoad() {
    }
}
