package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class CollectionResultMetadata implements BaseMetadata, Serializable {
    private Collection collection;
    private boolean collection__is_initialized;
    private NativeObject nativeObject;
    private PartnerLinks partnerLinks;
    private boolean partnerLinks__is_initialized;
    private RelatedCollections relatedCollections;
    private boolean relatedCollections__is_initialized;

    public CollectionResultMetadata(Collection collection, RelatedCollections relatedCollections, PartnerLinks partnerLinks) {
        this.collection__is_initialized = false;
        this.relatedCollections__is_initialized = false;
        this.partnerLinks__is_initialized = false;
        if (collection == null) {
            ny61.g("Required field \"collection\" cannot be null");
            throw null;
        }
        this.nativeObject = init(collection, relatedCollections, partnerLinks);
        this.collection = collection;
        this.collection__is_initialized = true;
        this.relatedCollections = relatedCollections;
        this.relatedCollections__is_initialized = true;
        this.partnerLinks = partnerLinks;
        this.partnerLinks__is_initialized = true;
    }

    private native Collection getCollection__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CollectionResultMetadata";
    }

    private native PartnerLinks getPartnerLinks__Native();

    private native RelatedCollections getRelatedCollections__Native();

    private native NativeObject init(Collection collection, RelatedCollections relatedCollections, PartnerLinks partnerLinks);

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

    public synchronized PartnerLinks getPartnerLinks() {
        try {
            if (!this.partnerLinks__is_initialized) {
                this.partnerLinks = getPartnerLinks__Native();
                this.partnerLinks__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.partnerLinks;
    }

    public synchronized RelatedCollections getRelatedCollections() {
        try {
            if (!this.relatedCollections__is_initialized) {
                this.relatedCollections = getRelatedCollections__Native();
                this.relatedCollections__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.relatedCollections;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getCollection(), false, (Class<Archive>) Collection.class);
            archive.add((Archive) getRelatedCollections(), true, (Class<Archive>) RelatedCollections.class);
            archive.add((Archive) getPartnerLinks(), true, (Class<Archive>) PartnerLinks.class);
            return;
        }
        this.collection = (Collection) archive.add((Archive) this.collection, false, (Class<Archive>) Collection.class);
        this.collection__is_initialized = true;
        this.relatedCollections = (RelatedCollections) archive.add((Archive) this.relatedCollections, true, (Class<Archive>) RelatedCollections.class);
        this.relatedCollections__is_initialized = true;
        PartnerLinks partnerLinks = (PartnerLinks) archive.add((Archive) this.partnerLinks, true, (Class<Archive>) PartnerLinks.class);
        this.partnerLinks = partnerLinks;
        this.partnerLinks__is_initialized = true;
        this.nativeObject = init(this.collection, this.relatedCollections, partnerLinks);
    }

    public CollectionResultMetadata() {
        this.collection__is_initialized = false;
        this.relatedCollections__is_initialized = false;
        this.partnerLinks__is_initialized = false;
    }

    private CollectionResultMetadata(NativeObject nativeObject) {
        this.collection__is_initialized = false;
        this.relatedCollections__is_initialized = false;
        this.partnerLinks__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
