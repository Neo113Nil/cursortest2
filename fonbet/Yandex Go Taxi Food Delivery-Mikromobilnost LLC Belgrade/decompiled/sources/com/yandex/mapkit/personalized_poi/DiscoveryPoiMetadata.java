package com.yandex.mapkit.personalized_poi;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class DiscoveryPoiMetadata implements BaseMetadata, Serializable {
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;

    public DiscoveryPoiMetadata(String str) {
        this.id__is_initialized = false;
        this.nativeObject = init(str);
        this.id = str;
        this.id__is_initialized = true;
    }

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::DiscoveryPoiMetadata";
    }

    private native NativeObject init(String str);

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), true);
            return;
        }
        String add = archive.add(this.id, true);
        this.id = add;
        this.id__is_initialized = true;
        this.nativeObject = init(add);
    }

    public DiscoveryPoiMetadata() {
        this.id__is_initialized = false;
    }

    private DiscoveryPoiMetadata(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
