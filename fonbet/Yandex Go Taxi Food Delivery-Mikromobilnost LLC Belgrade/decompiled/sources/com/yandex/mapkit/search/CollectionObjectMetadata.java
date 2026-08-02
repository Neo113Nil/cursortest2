package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class CollectionObjectMetadata implements BaseMetadata, Serializable {
    private Collection collection;
    private boolean collection__is_initialized;
    private NativeObject nativeObject;

    public CollectionObjectMetadata(Collection collection) {
        this.collection__is_initialized = false;
        if (collection == null) {
            ny61.g("Required field \"collection\" cannot be null");
            throw null;
        }
        this.nativeObject = init(collection);
        this.collection = collection;
        this.collection__is_initialized = true;
    }

    private native Collection getCollection__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CollectionObjectMetadata";
    }

    private native NativeObject init(Collection collection);

    public synchronized Collection getCollection() {
        try {
            if (!this.collection__is_initialized) {
                this.collection = getCollection__Native();
                this.collection__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.collection;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getCollection(), false, (Class<Archive>) Collection.class);
            return;
        }
        Collection collection = (Collection) archive.add((Archive) this.collection, false, (Class<Archive>) Collection.class);
        this.collection = collection;
        this.collection__is_initialized = true;
        this.nativeObject = init(collection);
    }

    public CollectionObjectMetadata() {
        this.collection__is_initialized = false;
    }

    private CollectionObjectMetadata(NativeObject nativeObject) {
        this.collection__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
