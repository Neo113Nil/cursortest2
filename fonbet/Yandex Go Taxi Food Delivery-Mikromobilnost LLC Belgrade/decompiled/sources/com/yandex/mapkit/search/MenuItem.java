package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.runtime.KeyValuePair;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class MenuItem implements Serializable {
    private List<Image> images;
    private boolean images__is_initialized;
    private String logId;
    private boolean logId__is_initialized;
    private NativeObject nativeObject;
    private List<KeyValuePair> properties;
    private boolean properties__is_initialized;
    private String searchQuery;
    private boolean searchQuery__is_initialized;
    private String subtitle;
    private boolean subtitle__is_initialized;
    private String title;
    private boolean title__is_initialized;
    private List<String> types;
    private boolean types__is_initialized;

    public MenuItem(String str, String str2, String str3, List<String> list, String str4, List<Image> list2, List<KeyValuePair> list3) {
        this.title__is_initialized = false;
        this.subtitle__is_initialized = false;
        this.searchQuery__is_initialized = false;
        this.types__is_initialized = false;
        this.logId__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"types\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"images\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"properties\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, list, str4, list2, list3);
        this.title = str;
        this.title__is_initialized = true;
        this.subtitle = str2;
        this.subtitle__is_initialized = true;
        this.searchQuery = str3;
        this.searchQuery__is_initialized = true;
        this.types = list;
        this.types__is_initialized = true;
        this.logId = str4;
        this.logId__is_initialized = true;
        this.images = list2;
        this.images__is_initialized = true;
        this.properties = list3;
        this.properties__is_initialized = true;
    }

    private native List<Image> getImages__Native();

    private native String getLogId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::MenuItem";
    }

    private native List<KeyValuePair> getProperties__Native();

    private native String getSearchQuery__Native();

    private native String getSubtitle__Native();

    private native String getTitle__Native();

    private native List<String> getTypes__Native();

    private native NativeObject init(String str, String str2, String str3, List<String> list, String str4, List<Image> list2, List<KeyValuePair> list3);

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

    public synchronized String getLogId() {
        try {
            if (!this.logId__is_initialized) {
                this.logId = getLogId__Native();
                this.logId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.logId;
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

    public synchronized String getSearchQuery() {
        try {
            if (!this.searchQuery__is_initialized) {
                this.searchQuery = getSearchQuery__Native();
                this.searchQuery__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.searchQuery;
    }

    public synchronized String getSubtitle() {
        try {
            if (!this.subtitle__is_initialized) {
                this.subtitle = getSubtitle__Native();
                this.subtitle__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.subtitle;
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

    public synchronized List<String> getTypes() {
        try {
            if (!this.types__is_initialized) {
                this.types = getTypes__Native();
                this.types__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.types;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTitle(), true);
            archive.add(getSubtitle(), true);
            archive.add(getSearchQuery(), true);
            archive.add((List) getTypes(), false, (ArchivingHandler) new StringHandler());
            archive.add(getLogId(), true);
            archive.add((List) getImages(), false, (ArchivingHandler) new ClassHandler(Image.class));
            nzs.m(KeyValuePair.class, archive, getProperties(), false);
            return;
        }
        this.title = archive.add(this.title, true);
        this.title__is_initialized = true;
        this.subtitle = archive.add(this.subtitle, true);
        this.subtitle__is_initialized = true;
        this.searchQuery = archive.add(this.searchQuery, true);
        this.searchQuery__is_initialized = true;
        this.types = nnm.o(archive, this.types, false);
        this.types__is_initialized = true;
        this.logId = archive.add(this.logId, true);
        this.logId__is_initialized = true;
        this.images = nzs.e(Image.class, archive, this.images, false);
        this.images__is_initialized = true;
        List<KeyValuePair> e = nzs.e(KeyValuePair.class, archive, this.properties, false);
        this.properties = e;
        this.properties__is_initialized = true;
        this.nativeObject = init(this.title, this.subtitle, this.searchQuery, this.types, this.logId, this.images, e);
    }

    public MenuItem() {
        this.title__is_initialized = false;
        this.subtitle__is_initialized = false;
        this.searchQuery__is_initialized = false;
        this.types__is_initialized = false;
        this.logId__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
    }

    private MenuItem(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.subtitle__is_initialized = false;
        this.searchQuery__is_initialized = false;
        this.types__is_initialized = false;
        this.logId__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
