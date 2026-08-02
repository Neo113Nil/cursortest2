package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RailwayOptions implements Serializable {
    private String boardingPlatform;
    private boolean boardingPlatform__is_initialized;
    private String boardingTrack;
    private boolean boardingTrack__is_initialized;
    private NativeObject nativeObject;
    private boolean uncertain;
    private boolean uncertain__is_initialized;

    public RailwayOptions(String str, String str2, boolean z) {
        this.boardingTrack__is_initialized = false;
        this.boardingPlatform__is_initialized = false;
        this.uncertain__is_initialized = false;
        this.nativeObject = init(str, str2, z);
        this.boardingTrack = str;
        this.boardingTrack__is_initialized = true;
        this.boardingPlatform = str2;
        this.boardingPlatform__is_initialized = true;
        this.uncertain = z;
        this.uncertain__is_initialized = true;
    }

    private native String getBoardingPlatform__Native();

    private native String getBoardingTrack__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RailwayOptions";
    }

    private native boolean getUncertain__Native();

    private native NativeObject init(String str, String str2, boolean z);

    public synchronized String getBoardingPlatform() {
        try {
            if (!this.boardingPlatform__is_initialized) {
                this.boardingPlatform = getBoardingPlatform__Native();
                this.boardingPlatform__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.boardingPlatform;
    }

    public synchronized String getBoardingTrack() {
        try {
            if (!this.boardingTrack__is_initialized) {
                this.boardingTrack = getBoardingTrack__Native();
                this.boardingTrack__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.boardingTrack;
    }

    public synchronized boolean getUncertain() {
        try {
            if (!this.uncertain__is_initialized) {
                this.uncertain = getUncertain__Native();
                this.uncertain__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.uncertain;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getBoardingTrack(), true);
            archive.add(getBoardingPlatform(), true);
            archive.add(getUncertain());
            return;
        }
        this.boardingTrack = archive.add(this.boardingTrack, true);
        this.boardingTrack__is_initialized = true;
        this.boardingPlatform = archive.add(this.boardingPlatform, true);
        this.boardingPlatform__is_initialized = true;
        boolean add = archive.add(this.uncertain);
        this.uncertain = add;
        this.uncertain__is_initialized = true;
        this.nativeObject = init(this.boardingTrack, this.boardingPlatform, add);
    }

    public RailwayOptions() {
        this.boardingTrack__is_initialized = false;
        this.boardingPlatform__is_initialized = false;
        this.uncertain__is_initialized = false;
    }

    private RailwayOptions(NativeObject nativeObject) {
        this.boardingTrack__is_initialized = false;
        this.boardingPlatform__is_initialized = false;
        this.uncertain__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
