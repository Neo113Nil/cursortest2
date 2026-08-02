package com.yandex.mapkit.personalized_poi;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class PersonalizedPoiExtraMetadata implements BaseMetadata, Serializable {
    private List<PersonalizedPoiExtraMetadataEntry> data;
    private boolean data__is_initialized;
    private NativeObject nativeObject;

    public PersonalizedPoiExtraMetadata(List<PersonalizedPoiExtraMetadataEntry> list) {
        this.data__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"data\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.data = list;
        this.data__is_initialized = true;
    }

    private native List<PersonalizedPoiExtraMetadataEntry> getData__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::PersonalizedPoiExtraMetadata";
    }

    private native NativeObject init(List<PersonalizedPoiExtraMetadataEntry> list);

    public synchronized List<PersonalizedPoiExtraMetadataEntry> getData() {
        try {
            if (!this.data__is_initialized) {
                this.data = getData__Native();
                this.data__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(PersonalizedPoiExtraMetadataEntry.class, archive, getData(), false);
            return;
        }
        List<PersonalizedPoiExtraMetadataEntry> e = nzs.e(PersonalizedPoiExtraMetadataEntry.class, archive, this.data, false);
        this.data = e;
        this.data__is_initialized = true;
        this.nativeObject = init(e);
    }

    public PersonalizedPoiExtraMetadata() {
        this.data__is_initialized = false;
    }

    private PersonalizedPoiExtraMetadata(NativeObject nativeObject) {
        this.data__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
