package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.runtime.KeyValuePair;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Creative implements Serializable {
    private String id;
    private boolean id__is_initialized;
    private List<Image> images;
    private boolean images__is_initialized;
    private NativeObject nativeObject;
    private List<KeyValuePair> properties;
    private boolean properties__is_initialized;
    private String type;
    private boolean type__is_initialized;

    public Creative(String str, String str2, List<Image> list, List<KeyValuePair> list2) {
        this.id__is_initialized = false;
        this.type__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"images\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"properties\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, list, list2);
        this.id = str;
        this.id__is_initialized = true;
        this.type = str2;
        this.type__is_initialized = true;
        this.images = list;
        this.images__is_initialized = true;
        this.properties = list2;
        this.properties__is_initialized = true;
    }

    private native String getId__Native();

    private native List<Image> getImages__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Creative";
    }

    private native List<KeyValuePair> getProperties__Native();

    private native String getType__Native();

    private native NativeObject init(String str, String str2, List<Image> list, List<KeyValuePair> list2);

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
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

    public synchronized List<KeyValuePair> getProperties() {
        try {
            if (!this.properties__is_initialized) {
                this.properties = getProperties__Native();
                this.properties__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.properties;
    }

    public synchronized String getType() {
        try {
            if (!this.type__is_initialized) {
                this.type = getType__Native();
                this.type__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getType(), false);
            archive.add((List) getImages(), false, (ArchivingHandler) new ClassHandler(Image.class));
            nzs.m(KeyValuePair.class, archive, getProperties(), false);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.type = archive.add(this.type, false);
        this.type__is_initialized = true;
        this.images = nzs.e(Image.class, archive, this.images, false);
        this.images__is_initialized = true;
        List<KeyValuePair> e = nzs.e(KeyValuePair.class, archive, this.properties, false);
        this.properties = e;
        this.properties__is_initialized = true;
        this.nativeObject = init(this.id, this.type, this.images, e);
    }

    public Creative() {
        this.id__is_initialized = false;
        this.type__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
    }

    private Creative(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.type__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
