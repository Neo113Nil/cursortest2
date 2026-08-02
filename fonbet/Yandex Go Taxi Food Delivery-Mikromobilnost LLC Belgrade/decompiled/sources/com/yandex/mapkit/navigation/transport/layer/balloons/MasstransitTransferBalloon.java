package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class MasstransitTransferBalloon implements Serializable {
    private MasstransitGetOffBalloon getOff;
    private boolean getOff__is_initialized;
    private MasstransitGetOnBalloon getOn;
    private boolean getOn__is_initialized;
    private NativeObject nativeObject;

    public MasstransitTransferBalloon(MasstransitGetOffBalloon masstransitGetOffBalloon, MasstransitGetOnBalloon masstransitGetOnBalloon) {
        this.getOff__is_initialized = false;
        this.getOn__is_initialized = false;
        if (masstransitGetOffBalloon == null) {
            ny61.g("Required field \"getOff\" cannot be null");
            throw null;
        }
        if (masstransitGetOnBalloon == null) {
            ny61.g("Required field \"getOn\" cannot be null");
            throw null;
        }
        this.nativeObject = init(masstransitGetOffBalloon, masstransitGetOnBalloon);
        this.getOff = masstransitGetOffBalloon;
        this.getOff__is_initialized = true;
        this.getOn = masstransitGetOnBalloon;
        this.getOn__is_initialized = true;
    }

    private native MasstransitGetOffBalloon getGetOff__Native();

    private native MasstransitGetOnBalloon getGetOn__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::layer::balloons::MasstransitTransferBalloon";
    }

    private native NativeObject init(MasstransitGetOffBalloon masstransitGetOffBalloon, MasstransitGetOnBalloon masstransitGetOnBalloon);

    public synchronized MasstransitGetOffBalloon getGetOff() {
        try {
            if (!this.getOff__is_initialized) {
                this.getOff = getGetOff__Native();
                this.getOff__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getOff;
    }

    public synchronized MasstransitGetOnBalloon getGetOn() {
        try {
            if (!this.getOn__is_initialized) {
                this.getOn = getGetOn__Native();
                this.getOn__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getOn;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getGetOff(), false, (Class<Archive>) MasstransitGetOffBalloon.class);
            archive.add((Archive) getGetOn(), false, (Class<Archive>) MasstransitGetOnBalloon.class);
            return;
        }
        this.getOff = (MasstransitGetOffBalloon) archive.add((Archive) this.getOff, false, (Class<Archive>) MasstransitGetOffBalloon.class);
        this.getOff__is_initialized = true;
        MasstransitGetOnBalloon masstransitGetOnBalloon = (MasstransitGetOnBalloon) archive.add((Archive) this.getOn, false, (Class<Archive>) MasstransitGetOnBalloon.class);
        this.getOn = masstransitGetOnBalloon;
        this.getOn__is_initialized = true;
        this.nativeObject = init(this.getOff, masstransitGetOnBalloon);
    }

    public MasstransitTransferBalloon() {
        this.getOff__is_initialized = false;
        this.getOn__is_initialized = false;
    }

    private MasstransitTransferBalloon(NativeObject nativeObject) {
        this.getOff__is_initialized = false;
        this.getOn__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
