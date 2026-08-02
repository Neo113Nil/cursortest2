package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class MasstransitGetOffBalloon implements Serializable {
    private Long arrivalTime;
    private boolean arrivalTime__is_initialized;
    private String exitName;
    private boolean exitName__is_initialized;
    private NativeObject nativeObject;
    private String stopName;
    private boolean stopName__is_initialized;

    public MasstransitGetOffBalloon(String str, String str2, Long l) {
        this.stopName__is_initialized = false;
        this.exitName__is_initialized = false;
        this.arrivalTime__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"stopName\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, l);
        this.stopName = str;
        this.stopName__is_initialized = true;
        this.exitName = str2;
        this.exitName__is_initialized = true;
        this.arrivalTime = l;
        this.arrivalTime__is_initialized = true;
    }

    private native Long getArrivalTime__Native();

    private native String getExitName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::layer::balloons::MasstransitGetOffBalloon";
    }

    private native String getStopName__Native();

    private native NativeObject init(String str, String str2, Long l);

    public synchronized Long getArrivalTime() {
        try {
            if (!this.arrivalTime__is_initialized) {
                this.arrivalTime = getArrivalTime__Native();
                this.arrivalTime__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.arrivalTime;
    }

    public synchronized String getExitName() {
        try {
            if (!this.exitName__is_initialized) {
                this.exitName = getExitName__Native();
                this.exitName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.exitName;
    }

    public synchronized String getStopName() {
        try {
            if (!this.stopName__is_initialized) {
                this.stopName = getStopName__Native();
                this.stopName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stopName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getStopName(), false);
            archive.add(getExitName(), true);
            archive.add(getArrivalTime(), true);
            return;
        }
        this.stopName = archive.add(this.stopName, false);
        this.stopName__is_initialized = true;
        this.exitName = archive.add(this.exitName, true);
        this.exitName__is_initialized = true;
        Long add = archive.add(this.arrivalTime, true);
        this.arrivalTime = add;
        this.arrivalTime__is_initialized = true;
        this.nativeObject = init(this.stopName, this.exitName, add);
    }

    public MasstransitGetOffBalloon() {
        this.stopName__is_initialized = false;
        this.exitName__is_initialized = false;
        this.arrivalTime__is_initialized = false;
    }

    private MasstransitGetOffBalloon(NativeObject nativeObject) {
        this.stopName__is_initialized = false;
        this.exitName__is_initialized = false;
        this.arrivalTime__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
