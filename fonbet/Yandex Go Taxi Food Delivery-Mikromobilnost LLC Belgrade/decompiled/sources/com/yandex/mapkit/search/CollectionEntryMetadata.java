package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class CollectionEntryMetadata implements BaseMetadata, Serializable {
    private String annotation;
    private boolean annotation__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private List<CollectionEntryFeature> features;
    private boolean features__is_initialized;
    private List<Image> images;
    private boolean images__is_initialized;
    private List<CollectionEntryLink> links;
    private boolean links__is_initialized;
    private NativeObject nativeObject;
    private List<String> tags;
    private boolean tags__is_initialized;
    private String title;
    private boolean title__is_initialized;

    public CollectionEntryMetadata(String str, String str2, String str3, List<Image> list, List<CollectionEntryLink> list2, List<CollectionEntryFeature> list3, List<String> list4) {
        this.title__is_initialized = false;
        this.annotation__is_initialized = false;
        this.description__is_initialized = false;
        this.images__is_initialized = false;
        this.links__is_initialized = false;
        this.features__is_initialized = false;
        this.tags__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"images\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"links\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"features\" cannot be null");
            throw null;
        }
        if (list4 == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, list, list2, list3, list4);
        this.title = str;
        this.title__is_initialized = true;
        this.annotation = str2;
        this.annotation__is_initialized = true;
        this.description = str3;
        this.description__is_initialized = true;
        this.images = list;
        this.images__is_initialized = true;
        this.links = list2;
        this.links__is_initialized = true;
        this.features = list3;
        this.features__is_initialized = true;
        this.tags = list4;
        this.tags__is_initialized = true;
    }

    private native String getAnnotation__Native();

    private native String getDescription__Native();

    private native List<CollectionEntryFeature> getFeatures__Native();

    private native List<Image> getImages__Native();

    private native List<CollectionEntryLink> getLinks__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CollectionEntryMetadata";
    }

    private native List<String> getTags__Native();

    private native String getTitle__Native();

    private native NativeObject init(String str, String str2, String str3, List<Image> list, List<CollectionEntryLink> list2, List<CollectionEntryFeature> list3, List<String> list4);

    public synchronized String getAnnotation() {
        try {
            if (!this.annotation__is_initialized) {
                this.annotation = getAnnotation__Native();
                this.annotation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotation;
    }

    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.description;
    }

    public synchronized List<CollectionEntryFeature> getFeatures() {
        try {
            if (!this.features__is_initialized) {
                this.features = getFeatures__Native();
                this.features__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.features;
    }

    public synchronized List<Image> getImages() {
        try {
            if (!this.images__is_initialized) {
                this.images = getImages__Native();
                this.images__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.images;
    }

    public synchronized List<CollectionEntryLink> getLinks() {
        try {
            if (!this.links__is_initialized) {
                this.links = getLinks__Native();
                this.links__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.links;
    }

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

    public synchronized String getTitle() {
        try {
            if (!this.title__is_initialized) {
                this.title = getTitle__Native();
                this.title__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.title;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTitle(), true);
            archive.add(getAnnotation(), true);
            archive.add(getDescription(), true);
            archive.add((List) getImages(), false, (ArchivingHandler) new ClassHandler(Image.class));
            archive.add((List) getLinks(), false, (ArchivingHandler) new ClassHandler(CollectionEntryLink.class));
            archive.add((List) getFeatures(), false, (ArchivingHandler) new ClassHandler(CollectionEntryFeature.class));
            nzs.l(archive, getTags(), false);
            return;
        }
        this.title = archive.add(this.title, true);
        this.title__is_initialized = true;
        this.annotation = archive.add(this.annotation, true);
        this.annotation__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.images = nzs.e(Image.class, archive, this.images, false);
        this.images__is_initialized = true;
        this.links = nzs.e(CollectionEntryLink.class, archive, this.links, false);
        this.links__is_initialized = true;
        this.features = nzs.e(CollectionEntryFeature.class, archive, this.features, false);
        this.features__is_initialized = true;
        List<String> o = nnm.o(archive, this.tags, false);
        this.tags = o;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.title, this.annotation, this.description, this.images, this.links, this.features, o);
    }

    public CollectionEntryMetadata() {
        this.title__is_initialized = false;
        this.annotation__is_initialized = false;
        this.description__is_initialized = false;
        this.images__is_initialized = false;
        this.links__is_initialized = false;
        this.features__is_initialized = false;
        this.tags__is_initialized = false;
    }

    private CollectionEntryMetadata(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.annotation__is_initialized = false;
        this.description__is_initialized = false;
        this.images__is_initialized = false;
        this.links__is_initialized = false;
        this.features__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
