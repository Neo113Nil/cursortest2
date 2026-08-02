package com.yandex.mapkit.map;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class GeoObjectTags implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<String> tags;
    private boolean tags__is_initialized;

    public GeoObjectTags(List<String> list) {
        this.tags__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.tags = list;
        this.tags__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::map::GeoObjectTags";
    }

    private native List<String> getTags__Native();

    private native NativeObject init(List<String> list);

    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tags;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.l(archive, getTags(), false);
            return;
        }
        List<String> o = nnm.o(archive, this.tags, false);
        this.tags = o;
        this.tags__is_initialized = true;
        this.nativeObject = init(o);
    }

    public GeoObjectTags() {
        this.tags__is_initialized = false;
    }

    private GeoObjectTags(NativeObject nativeObject) {
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
