package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class PanoramasObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<Panorama> panoramas;
    private boolean panoramas__is_initialized;

    public PanoramasObjectMetadata(List<Panorama> list) {
        this.panoramas__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"panoramas\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.panoramas = list;
        this.panoramas__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::PanoramasObjectMetadata";
    }

    private native List<Panorama> getPanoramas__Native();

    private native NativeObject init(List<Panorama> list);

    public synchronized List<Panorama> getPanoramas() {
        try {
            if (!this.panoramas__is_initialized) {
                this.panoramas = getPanoramas__Native();
                this.panoramas__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.panoramas;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Panorama.class, archive, getPanoramas(), false);
            return;
        }
        List<Panorama> e = nzs.e(Panorama.class, archive, this.panoramas, false);
        this.panoramas = e;
        this.panoramas__is_initialized = true;
        this.nativeObject = init(e);
    }

    public PanoramasObjectMetadata() {
        this.panoramas__is_initialized = false;
    }

    private PanoramasObjectMetadata(NativeObject nativeObject) {
        this.panoramas__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
