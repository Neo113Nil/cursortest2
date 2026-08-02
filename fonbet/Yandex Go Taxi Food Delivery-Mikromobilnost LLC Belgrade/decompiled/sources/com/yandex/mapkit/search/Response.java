package com.yandex.mapkit.search;

import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Response implements Serializable {
    private GeoObjectCollection collection;
    private boolean collection__is_initialized;
    private boolean isOffline;
    private boolean isOffline__is_initialized;
    private SearchMetadata metadata;
    private boolean metadata__is_initialized;
    private NativeObject nativeObject;

    public Response(SearchMetadata searchMetadata, GeoObjectCollection geoObjectCollection, boolean z) {
        this.metadata__is_initialized = false;
        this.collection__is_initialized = false;
        this.isOffline__is_initialized = false;
        if (searchMetadata == null) {
            ny61.g("Required field \"metadata\" cannot be null");
            throw null;
        }
        if (geoObjectCollection == null) {
            ny61.g("Required field \"collection\" cannot be null");
            throw null;
        }
        this.nativeObject = init(searchMetadata, geoObjectCollection, z);
        this.metadata = searchMetadata;
        this.metadata__is_initialized = true;
        this.collection = geoObjectCollection;
        this.collection__is_initialized = true;
        this.isOffline = z;
        this.isOffline__is_initialized = true;
    }

    private native GeoObjectCollection getCollection__Native();

    private native boolean getIsOffline__Native();

    private native SearchMetadata getMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Response";
    }

    private native NativeObject init(SearchMetadata searchMetadata, GeoObjectCollection geoObjectCollection, boolean z);

    public synchronized GeoObjectCollection getCollection() {
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

    public synchronized boolean getIsOffline() {
        try {
            if (!this.isOffline__is_initialized) {
                this.isOffline = getIsOffline__Native();
                this.isOffline__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isOffline;
    }

    public synchronized SearchMetadata getMetadata() {
        try {
            if (!this.metadata__is_initialized) {
                this.metadata = getMetadata__Native();
                this.metadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.metadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMetadata(), false, (Class<Archive>) SearchMetadata.class);
            archive.add((Archive) getCollection(), false, (Class<Archive>) GeoObjectCollection.class);
            archive.add(getIsOffline());
            return;
        }
        this.metadata = (SearchMetadata) archive.add((Archive) this.metadata, false, (Class<Archive>) SearchMetadata.class);
        this.metadata__is_initialized = true;
        this.collection = (GeoObjectCollection) archive.add((Archive) this.collection, false, (Class<Archive>) GeoObjectCollection.class);
        this.collection__is_initialized = true;
        boolean add = archive.add(this.isOffline);
        this.isOffline = add;
        this.isOffline__is_initialized = true;
        this.nativeObject = init(this.metadata, this.collection, add);
    }

    public Response() {
        this.metadata__is_initialized = false;
        this.collection__is_initialized = false;
        this.isOffline__is_initialized = false;
    }

    private Response(NativeObject nativeObject) {
        this.metadata__is_initialized = false;
        this.collection__is_initialized = false;
        this.isOffline__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
