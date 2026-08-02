package com.yandex.mapkit.personalized_poi;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class PersonalizedPoiMetadata implements BaseMetadata, Serializable {
    private DynamicPoiMetadata dynamicPoiMetadata;
    private boolean dynamicPoiMetadata__is_initialized;
    private NativeObject nativeObject;

    public PersonalizedPoiMetadata(DynamicPoiMetadata dynamicPoiMetadata) {
        this.dynamicPoiMetadata__is_initialized = false;
        this.nativeObject = init(dynamicPoiMetadata);
        this.dynamicPoiMetadata = dynamicPoiMetadata;
        this.dynamicPoiMetadata__is_initialized = true;
    }

    private native DynamicPoiMetadata getDynamicPoiMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::PersonalizedPoiMetadata";
    }

    private native NativeObject init(DynamicPoiMetadata dynamicPoiMetadata);

    public synchronized DynamicPoiMetadata getDynamicPoiMetadata() {
        try {
            if (!this.dynamicPoiMetadata__is_initialized) {
                this.dynamicPoiMetadata = getDynamicPoiMetadata__Native();
                this.dynamicPoiMetadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.dynamicPoiMetadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getDynamicPoiMetadata(), true, (Class<Archive>) DynamicPoiMetadata.class);
            return;
        }
        DynamicPoiMetadata dynamicPoiMetadata = (DynamicPoiMetadata) archive.add((Archive) this.dynamicPoiMetadata, true, (Class<Archive>) DynamicPoiMetadata.class);
        this.dynamicPoiMetadata = dynamicPoiMetadata;
        this.dynamicPoiMetadata__is_initialized = true;
        this.nativeObject = init(dynamicPoiMetadata);
    }

    public PersonalizedPoiMetadata() {
        this.dynamicPoiMetadata__is_initialized = false;
    }

    private PersonalizedPoiMetadata(NativeObject nativeObject) {
        this.dynamicPoiMetadata__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
