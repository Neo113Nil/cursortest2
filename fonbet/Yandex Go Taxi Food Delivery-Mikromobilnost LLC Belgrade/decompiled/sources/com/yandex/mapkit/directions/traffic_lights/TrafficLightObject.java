package com.yandex.mapkit.directions.traffic_lights;

import com.yandex.mapkit.Attribution;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class TrafficLightObject implements Serializable {
    private String localizedName;
    private boolean localizedName__is_initialized;
    private NativeObject nativeObject;
    private Attribution provider;
    private boolean provider__is_initialized;

    public TrafficLightObject(String str, Attribution attribution) {
        this.localizedName__is_initialized = false;
        this.provider__is_initialized = false;
        this.nativeObject = init(str, attribution);
        this.localizedName = str;
        this.localizedName__is_initialized = true;
        this.provider = attribution;
        this.provider__is_initialized = true;
    }

    private native String getLocalizedName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::traffic_lights::TrafficLightObject";
    }

    private native Attribution getProvider__Native();

    private native NativeObject init(String str, Attribution attribution);

    public synchronized String getLocalizedName() {
        try {
            if (!this.localizedName__is_initialized) {
                this.localizedName = getLocalizedName__Native();
                this.localizedName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.localizedName;
    }

    public synchronized Attribution getProvider() {
        try {
            if (!this.provider__is_initialized) {
                this.provider = getProvider__Native();
                this.provider__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.provider;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLocalizedName(), true);
            archive.add((Archive) getProvider(), true, (Class<Archive>) Attribution.class);
            return;
        }
        this.localizedName = archive.add(this.localizedName, true);
        this.localizedName__is_initialized = true;
        Attribution attribution = (Attribution) archive.add((Archive) this.provider, true, (Class<Archive>) Attribution.class);
        this.provider = attribution;
        this.provider__is_initialized = true;
        this.nativeObject = init(this.localizedName, attribution);
    }

    public TrafficLightObject() {
        this.localizedName__is_initialized = false;
        this.provider__is_initialized = false;
    }

    private TrafficLightObject(NativeObject nativeObject) {
        this.localizedName__is_initialized = false;
        this.provider__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
