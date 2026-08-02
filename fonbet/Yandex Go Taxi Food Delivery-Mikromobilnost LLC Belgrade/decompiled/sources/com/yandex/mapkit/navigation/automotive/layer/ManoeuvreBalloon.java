package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.mapkit.directions.driving.DirectionSign;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ManoeuvreBalloon implements Serializable {
    private DirectionSign directionSign;
    private boolean directionSign__is_initialized;
    private Manoeuvre manoeuvre;
    private boolean manoeuvre__is_initialized;
    private NativeObject nativeObject;

    public ManoeuvreBalloon(Manoeuvre manoeuvre, DirectionSign directionSign) {
        this.manoeuvre__is_initialized = false;
        this.directionSign__is_initialized = false;
        if (manoeuvre == null) {
            ny61.g("Required field \"manoeuvre\" cannot be null");
            throw null;
        }
        this.nativeObject = init(manoeuvre, directionSign);
        this.manoeuvre = manoeuvre;
        this.manoeuvre__is_initialized = true;
        this.directionSign = directionSign;
        this.directionSign__is_initialized = true;
    }

    private native DirectionSign getDirectionSign__Native();

    private native Manoeuvre getManoeuvre__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::automotive::layer::ManoeuvreBalloon";
    }

    private native NativeObject init(Manoeuvre manoeuvre, DirectionSign directionSign);

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

    public synchronized Manoeuvre getManoeuvre() {
        try {
            if (!this.manoeuvre__is_initialized) {
                this.manoeuvre = getManoeuvre__Native();
                this.manoeuvre__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.manoeuvre;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getManoeuvre(), false, (Class<Archive>) Manoeuvre.class);
            archive.add((Archive) getDirectionSign(), true, (Class<Archive>) DirectionSign.class);
            return;
        }
        this.manoeuvre = (Manoeuvre) archive.add((Archive) this.manoeuvre, false, (Class<Archive>) Manoeuvre.class);
        this.manoeuvre__is_initialized = true;
        DirectionSign directionSign = (DirectionSign) archive.add((Archive) this.directionSign, true, (Class<Archive>) DirectionSign.class);
        this.directionSign = directionSign;
        this.directionSign__is_initialized = true;
        this.nativeObject = init(this.manoeuvre, directionSign);
    }

    public ManoeuvreBalloon() {
        this.manoeuvre__is_initialized = false;
        this.directionSign__is_initialized = false;
    }

    private ManoeuvreBalloon(NativeObject nativeObject) {
        this.manoeuvre__is_initialized = false;
        this.directionSign__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
