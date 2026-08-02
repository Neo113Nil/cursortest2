package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RelatedCollections implements Serializable {
    private List<Collection> collections;
    private boolean collections__is_initialized;
    private NativeObject nativeObject;

    public RelatedCollections(List<Collection> list) {
        this.collections__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"collections\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.collections = list;
        this.collections__is_initialized = true;
    }

    private native List<Collection> getCollections__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::RelatedCollections";
    }

    private native NativeObject init(List<Collection> list);

    public synchronized List<Collection> getCollections() {
        try {
            if (!this.collections__is_initialized) {
                this.collections = getCollections__Native();
                this.collections__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.collections;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Collection.class, archive, getCollections(), false);
            return;
        }
        List<Collection> e = nzs.e(Collection.class, archive, this.collections, false);
        this.collections = e;
        this.collections__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RelatedCollections() {
        this.collections__is_initialized = false;
    }

    private RelatedCollections(NativeObject nativeObject) {
        this.collections__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
