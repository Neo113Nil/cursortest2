package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RelativeDistance implements Serializable {
    private TravelInfo driving;
    private boolean driving__is_initialized;
    private NativeObject nativeObject;
    private TravelInfo walking;
    private boolean walking__is_initialized;

    public RelativeDistance(TravelInfo travelInfo, TravelInfo travelInfo2) {
        this.driving__is_initialized = false;
        this.walking__is_initialized = false;
        this.nativeObject = init(travelInfo, travelInfo2);
        this.driving = travelInfo;
        this.driving__is_initialized = true;
        this.walking = travelInfo2;
        this.walking__is_initialized = true;
    }

    private native TravelInfo getDriving__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::RelativeDistance";
    }

    private native TravelInfo getWalking__Native();

    private native NativeObject init(TravelInfo travelInfo, TravelInfo travelInfo2);

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
            return;
        }
        this.driving = (TravelInfo) archive.add((Archive) this.driving, true, (Class<Archive>) TravelInfo.class);
        this.driving__is_initialized = true;
        TravelInfo travelInfo = (TravelInfo) archive.add((Archive) this.walking, true, (Class<Archive>) TravelInfo.class);
        this.walking = travelInfo;
        this.walking__is_initialized = true;
        this.nativeObject = init(this.driving, travelInfo);
    }

    public RelativeDistance() {
        this.driving__is_initialized = false;
        this.walking__is_initialized = false;
    }

    private RelativeDistance(NativeObject nativeObject) {
        this.driving__is_initialized = false;
        this.walking__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
