package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RelatedAdvertsObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<PlaceInfo> placesOnCard;
    private boolean placesOnCard__is_initialized;
    private List<PlaceInfo> placesOnMap;
    private boolean placesOnMap__is_initialized;

    public RelatedAdvertsObjectMetadata(List<PlaceInfo> list, List<PlaceInfo> list2) {
        this.placesOnMap__is_initialized = false;
        this.placesOnCard__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"placesOnMap\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"placesOnCard\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.placesOnMap = list;
        this.placesOnMap__is_initialized = true;
        this.placesOnCard = list2;
        this.placesOnCard__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::RelatedAdvertsObjectMetadata";
    }

    private native List<PlaceInfo> getPlacesOnCard__Native();

    private native List<PlaceInfo> getPlacesOnMap__Native();

    private native NativeObject init(List<PlaceInfo> list, List<PlaceInfo> list2);

    public synchronized List<PlaceInfo> getPlacesOnCard() {
        try {
            if (!this.placesOnCard__is_initialized) {
                this.placesOnCard = getPlacesOnCard__Native();
                this.placesOnCard__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.placesOnCard;
    }

    public synchronized List<PlaceInfo> getPlacesOnMap() {
        try {
            if (!this.placesOnMap__is_initialized) {
                this.placesOnMap = getPlacesOnMap__Native();
                this.placesOnMap__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.placesOnMap;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getPlacesOnMap(), false, (ArchivingHandler) new ClassHandler(PlaceInfo.class));
            nzs.m(PlaceInfo.class, archive, getPlacesOnCard(), false);
            return;
        }
        this.placesOnMap = nzs.e(PlaceInfo.class, archive, this.placesOnMap, false);
        this.placesOnMap__is_initialized = true;
        List<PlaceInfo> e = nzs.e(PlaceInfo.class, archive, this.placesOnCard, false);
        this.placesOnCard = e;
        this.placesOnCard__is_initialized = true;
        this.nativeObject = init(this.placesOnMap, e);
    }

    public RelatedAdvertsObjectMetadata() {
        this.placesOnMap__is_initialized = false;
        this.placesOnCard__is_initialized = false;
    }

    private RelatedAdvertsObjectMetadata(NativeObject nativeObject) {
        this.placesOnMap__is_initialized = false;
        this.placesOnCard__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
