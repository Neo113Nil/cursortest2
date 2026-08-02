package com.yandex.mapkit.search;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TravelInfo implements Serializable {
    private LocalizedValue distance;
    private boolean distance__is_initialized;
    private LocalizedValue duration;
    private boolean duration__is_initialized;
    private NativeObject nativeObject;

    public TravelInfo(LocalizedValue localizedValue, LocalizedValue localizedValue2) {
        this.duration__is_initialized = false;
        this.distance__is_initialized = false;
        if (localizedValue == null) {
            ny61.g("Required field \"duration\" cannot be null");
            throw null;
        }
        if (localizedValue2 == null) {
            ny61.g("Required field \"distance\" cannot be null");
            throw null;
        }
        this.nativeObject = init(localizedValue, localizedValue2);
        this.duration = localizedValue;
        this.duration__is_initialized = true;
        this.distance = localizedValue2;
        this.distance__is_initialized = true;
    }

    private native LocalizedValue getDistance__Native();

    private native LocalizedValue getDuration__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::TravelInfo";
    }

    private native NativeObject init(LocalizedValue localizedValue, LocalizedValue localizedValue2);

    public synchronized LocalizedValue getDistance() {
        try {
            if (!this.distance__is_initialized) {
                this.distance = getDistance__Native();
                this.distance__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.distance;
    }

    public synchronized LocalizedValue getDuration() {
        try {
            if (!this.duration__is_initialized) {
                this.duration = getDuration__Native();
                this.duration__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.duration;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getDuration(), false, (Class<Archive>) LocalizedValue.class);
            archive.add((Archive) getDistance(), false, (Class<Archive>) LocalizedValue.class);
            return;
        }
        this.duration = (LocalizedValue) archive.add((Archive) this.duration, false, (Class<Archive>) LocalizedValue.class);
        this.duration__is_initialized = true;
        LocalizedValue localizedValue = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
        this.distance = localizedValue;
        this.distance__is_initialized = true;
        this.nativeObject = init(this.duration, localizedValue);
    }

    public TravelInfo() {
        this.duration__is_initialized = false;
        this.distance__is_initialized = false;
    }

    private TravelInfo(NativeObject nativeObject) {
        this.duration__is_initialized = false;
        this.distance__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
