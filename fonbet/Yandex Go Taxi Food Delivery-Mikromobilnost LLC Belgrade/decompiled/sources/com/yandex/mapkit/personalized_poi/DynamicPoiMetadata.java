package com.yandex.mapkit.personalized_poi;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class DynamicPoiMetadata implements Serializable {
    private Boolean isCommon;
    private boolean isCommon__is_initialized;
    private NativeObject nativeObject;
    private String provider;
    private boolean provider__is_initialized;

    public DynamicPoiMetadata(Boolean bool, String str) {
        this.isCommon__is_initialized = false;
        this.provider__is_initialized = false;
        this.nativeObject = init(bool, str);
        this.isCommon = bool;
        this.isCommon__is_initialized = true;
        this.provider = str;
        this.provider__is_initialized = true;
    }

    private native Boolean getIsCommon__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::DynamicPoiMetadata";
    }

    private native String getProvider__Native();

    private native NativeObject init(Boolean bool, String str);

    public synchronized Boolean getIsCommon() {
        try {
            if (!this.isCommon__is_initialized) {
                this.isCommon = getIsCommon__Native();
                this.isCommon__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isCommon;
    }

    public synchronized String getProvider() {
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
            archive.add(getIsCommon(), true);
            archive.add(getProvider(), true);
            return;
        }
        this.isCommon = archive.add(this.isCommon, true);
        this.isCommon__is_initialized = true;
        String add = archive.add(this.provider, true);
        this.provider = add;
        this.provider__is_initialized = true;
        this.nativeObject = init(this.isCommon, add);
    }

    public DynamicPoiMetadata() {
        this.isCommon__is_initialized = false;
        this.provider__is_initialized = false;
    }

    private DynamicPoiMetadata(NativeObject nativeObject) {
        this.isCommon__is_initialized = false;
        this.provider__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
