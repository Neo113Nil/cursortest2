package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class AdvertMenuItem implements Serializable {
    private String logId;
    private boolean logId__is_initialized;
    private NativeObject nativeObject;
    private Integer position;
    private boolean position__is_initialized;
    private String searchQuery;
    private boolean searchQuery__is_initialized;
    private String style;
    private boolean style__is_initialized;
    private String title;
    private boolean title__is_initialized;

    public AdvertMenuItem(String str, String str2, String str3, Integer num, String str4) {
        this.title__is_initialized = false;
        this.searchQuery__is_initialized = false;
        this.style__is_initialized = false;
        this.position__is_initialized = false;
        this.logId__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"title\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"searchQuery\" cannot be null");
            throw null;
        }
        if (str3 == null) {
            ny61.g("Required field \"style\" cannot be null");
            throw null;
        }
        if (str4 == null) {
            ny61.g("Required field \"logId\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, num, str4);
        this.title = str;
        this.title__is_initialized = true;
        this.searchQuery = str2;
        this.searchQuery__is_initialized = true;
        this.style = str3;
        this.style__is_initialized = true;
        this.position = num;
        this.position__is_initialized = true;
        this.logId = str4;
        this.logId__is_initialized = true;
    }

    private native String getLogId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::AdvertMenuItem";
    }

    private native Integer getPosition__Native();

    private native String getSearchQuery__Native();

    private native String getStyle__Native();

    private native String getTitle__Native();

    private native NativeObject init(String str, String str2, String str3, Integer num, String str4);

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

    public synchronized Integer getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.position;
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

    public synchronized String getStyle() {
        try {
            if (!this.style__is_initialized) {
                this.style = getStyle__Native();
                this.style__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.style;
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
            archive.add(getTitle(), false);
            archive.add(getSearchQuery(), false);
            archive.add(getStyle(), false);
            archive.add(getPosition(), true);
            archive.add(getLogId(), false);
            return;
        }
        this.title = archive.add(this.title, false);
        this.title__is_initialized = true;
        this.searchQuery = archive.add(this.searchQuery, false);
        this.searchQuery__is_initialized = true;
        this.style = archive.add(this.style, false);
        this.style__is_initialized = true;
        this.position = archive.add(this.position, true);
        this.position__is_initialized = true;
        String add = archive.add(this.logId, false);
        this.logId = add;
        this.logId__is_initialized = true;
        this.nativeObject = init(this.title, this.searchQuery, this.style, this.position, add);
    }

    public AdvertMenuItem() {
        this.title__is_initialized = false;
        this.searchQuery__is_initialized = false;
        this.style__is_initialized = false;
        this.position__is_initialized = false;
        this.logId__is_initialized = false;
    }

    private AdvertMenuItem(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.searchQuery__is_initialized = false;
        this.style__is_initialized = false;
        this.position__is_initialized = false;
        this.logId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
