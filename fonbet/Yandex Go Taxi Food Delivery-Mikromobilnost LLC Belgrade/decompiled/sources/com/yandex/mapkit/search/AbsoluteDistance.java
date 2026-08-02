package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class AbsoluteDistance implements Serializable {
    private TravelInfo driving;
    private boolean driving__is_initialized;
    private NativeObject nativeObject;
    private TransitInfo transit;
    private boolean transit__is_initialized;
    private TravelInfo walking;
    private boolean walking__is_initialized;

    public AbsoluteDistance(TravelInfo travelInfo, TravelInfo travelInfo2, TransitInfo transitInfo) {
        this.driving__is_initialized = false;
        this.walking__is_initialized = false;
        this.transit__is_initialized = false;
        this.nativeObject = init(travelInfo, travelInfo2, transitInfo);
        this.driving = travelInfo;
        this.driving__is_initialized = true;
        this.walking = travelInfo2;
        this.walking__is_initialized = true;
        this.transit = transitInfo;
        this.transit__is_initialized = true;
    }

    private native TravelInfo getDriving__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::AbsoluteDistance";
    }

    private native TransitInfo getTransit__Native();

    private native TravelInfo getWalking__Native();

    private native NativeObject init(TravelInfo travelInfo, TravelInfo travelInfo2, TransitInfo transitInfo);

    public synchronized TravelInfo getDriving() {
        try {
            if (!this.driving__is_initialized) {
                this.driving = getDriving__Native();
                this.driving__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.driving;
    }

    public synchronized TransitInfo getTransit() {
        try {
            if (!this.transit__is_initialized) {
                this.transit = getTransit__Native();
                this.transit__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transit;
    }

    public synchronized TravelInfo getWalking() {
        try {
            if (!this.walking__is_initialized) {
                this.walking = getWalking__Native();
                this.walking__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.walking;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getDriving(), true, (Class<Archive>) TravelInfo.class);
            archive.add((Archive) getWalking(), true, (Class<Archive>) TravelInfo.class);
            archive.add((Archive) getTransit(), true, (Class<Archive>) TransitInfo.class);
            return;
        }
        this.driving = (TravelInfo) archive.add((Archive) this.driving, true, (Class<Archive>) TravelInfo.class);
        this.driving__is_initialized = true;
        this.walking = (TravelInfo) archive.add((Archive) this.walking, true, (Class<Archive>) TravelInfo.class);
        this.walking__is_initialized = true;
        TransitInfo transitInfo = (TransitInfo) archive.add((Archive) this.transit, true, (Class<Archive>) TransitInfo.class);
        this.transit = transitInfo;
        this.transit__is_initialized = true;
        this.nativeObject = init(this.driving, this.walking, transitInfo);
    }

    public AbsoluteDistance() {
        this.driving__is_initialized = false;
        this.walking__is_initialized = false;
        this.transit__is_initialized = false;
    }

    private AbsoluteDistance(NativeObject nativeObject) {
        this.driving__is_initialized = false;
        this.walking__is_initialized = false;
        this.transit__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
