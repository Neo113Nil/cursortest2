package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ManeuverStyle implements Serializable {
    private ArrowManeuverStyle arrow;

    public ManeuverStyle(ArrowManeuverStyle arrowManeuverStyle) {
        if (arrowManeuverStyle != null) {
            this.arrow = arrowManeuverStyle;
        } else {
            ny61.g("Required field \"arrow\" cannot be null");
            throw null;
        }
    }

    public ArrowManeuverStyle getArrow() {
        return this.arrow;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.arrow = (ArrowManeuverStyle) archive.add((Archive) this.arrow, false, (Class<Archive>) ArrowManeuverStyle.class);
    }

    public ManeuverStyle() {
    }
}
