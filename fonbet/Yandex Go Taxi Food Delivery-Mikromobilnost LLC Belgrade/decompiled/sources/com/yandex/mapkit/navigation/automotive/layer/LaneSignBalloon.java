package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.mapkit.directions.driving.DirectionSign;
import com.yandex.mapkit.directions.driving.LaneSign;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class LaneSignBalloon implements Serializable {
    private DirectionSign directionSign;
    private boolean directionSign__is_initialized;
    private LaneSign laneSign;
    private boolean laneSign__is_initialized;
    private NativeObject nativeObject;

    public LaneSignBalloon(LaneSign laneSign, DirectionSign directionSign) {
        this.laneSign__is_initialized = false;
        this.directionSign__is_initialized = false;
        if (laneSign == null) {
            ny61.g("Required field \"laneSign\" cannot be null");
            throw null;
        }
        this.nativeObject = init(laneSign, directionSign);
        this.laneSign = laneSign;
        this.laneSign__is_initialized = true;
        this.directionSign = directionSign;
        this.directionSign__is_initialized = true;
    }

    private native DirectionSign getDirectionSign__Native();

    private native LaneSign getLaneSign__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::automotive::layer::LaneSignBalloon";
    }

    private native NativeObject init(LaneSign laneSign, DirectionSign directionSign);

    public synchronized DirectionSign getDirectionSign() {
        try {
            if (!this.directionSign__is_initialized) {
                this.directionSign = getDirectionSign__Native();
                this.directionSign__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.directionSign;
    }

    public synchronized LaneSign getLaneSign() {
        try {
            if (!this.laneSign__is_initialized) {
                this.laneSign = getLaneSign__Native();
                this.laneSign__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.laneSign;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLaneSign(), false, (Class<Archive>) LaneSign.class);
            archive.add((Archive) getDirectionSign(), true, (Class<Archive>) DirectionSign.class);
            return;
        }
        this.laneSign = (LaneSign) archive.add((Archive) this.laneSign, false, (Class<Archive>) LaneSign.class);
        this.laneSign__is_initialized = true;
        DirectionSign directionSign = (DirectionSign) archive.add((Archive) this.directionSign, true, (Class<Archive>) DirectionSign.class);
        this.directionSign = directionSign;
        this.directionSign__is_initialized = true;
        this.nativeObject = init(this.laneSign, directionSign);
    }

    public LaneSignBalloon() {
        this.laneSign__is_initialized = false;
        this.directionSign__is_initialized = false;
    }

    private LaneSignBalloon(NativeObject nativeObject) {
        this.laneSign__is_initialized = false;
        this.directionSign__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
