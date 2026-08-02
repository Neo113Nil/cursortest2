package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RelatedPlacesObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<PlaceInfo> similarPlaces;
    private boolean similarPlaces__is_initialized;

    public RelatedPlacesObjectMetadata(List<PlaceInfo> list) {
        this.similarPlaces__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"similarPlaces\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.similarPlaces = list;
        this.similarPlaces__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::RelatedPlacesObjectMetadata";
    }

    private native List<PlaceInfo> getSimilarPlaces__Native();

    private native NativeObject init(List<PlaceInfo> list);

    public synchronized List<PlaceInfo> getSimilarPlaces() {
        try {
            if (!this.similarPlaces__is_initialized) {
                this.similarPlaces = getSimilarPlaces__Native();
                this.similarPlaces__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.similarPlaces;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(PlaceInfo.class, archive, getSimilarPlaces(), false);
            return;
        }
        List<PlaceInfo> e = nzs.e(PlaceInfo.class, archive, this.similarPlaces, false);
        this.similarPlaces = e;
        this.similarPlaces__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RelatedPlacesObjectMetadata() {
        this.similarPlaces__is_initialized = false;
    }

    private RelatedPlacesObjectMetadata(NativeObject nativeObject) {
        this.similarPlaces__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
