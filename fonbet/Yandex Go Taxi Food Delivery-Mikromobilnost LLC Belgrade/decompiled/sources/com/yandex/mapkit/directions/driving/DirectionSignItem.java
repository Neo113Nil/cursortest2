package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class DirectionSignItem implements Serializable {
    private DirectionSignExit exit;
    private DirectionSignIcon icon;
    private DirectionSignRoad road;
    private DirectionSignToponym toponym;

    public static DirectionSignItem fromExit(DirectionSignExit directionSignExit) {
        if (directionSignExit == null) {
            ny61.g("Variant value \"exit\" cannot be null");
            return null;
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.exit = directionSignExit;
        return directionSignItem;
    }

    public static DirectionSignItem fromIcon(DirectionSignIcon directionSignIcon) {
        if (directionSignIcon == null) {
            ny61.g("Variant value \"icon\" cannot be null");
            return null;
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.icon = directionSignIcon;
        return directionSignItem;
    }

    public static DirectionSignItem fromRoad(DirectionSignRoad directionSignRoad) {
        if (directionSignRoad == null) {
            ny61.g("Variant value \"road\" cannot be null");
            return null;
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.road = directionSignRoad;
        return directionSignItem;
    }

    public static DirectionSignItem fromToponym(DirectionSignToponym directionSignToponym) {
        if (directionSignToponym == null) {
            ny61.g("Variant value \"toponym\" cannot be null");
            return null;
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.toponym = directionSignToponym;
        return directionSignItem;
    }

    public DirectionSignExit getExit() {
        return this.exit;
    }

    public DirectionSignIcon getIcon() {
        return this.icon;
    }

    public DirectionSignRoad getRoad() {
        return this.road;
    }

    public DirectionSignToponym getToponym() {
        return this.toponym;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.toponym = (DirectionSignToponym) archive.add((Archive) this.toponym, true, (Class<Archive>) DirectionSignToponym.class);
        this.road = (DirectionSignRoad) archive.add((Archive) this.road, true, (Class<Archive>) DirectionSignRoad.class);
        this.exit = (DirectionSignExit) archive.add((Archive) this.exit, true, (Class<Archive>) DirectionSignExit.class);
        this.icon = (DirectionSignIcon) archive.add((Archive) this.icon, true, (Class<Archive>) DirectionSignIcon.class);
    }
}
