package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Counter implements Serializable {
    private NativeObject nativeObject;
    private String type;
    private boolean type__is_initialized;
    private String url;
    private boolean url__is_initialized;

    public Counter(String str, String str2) {
        this.type__is_initialized = false;
        this.url__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"url\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2);
        this.type = str;
        this.type__is_initialized = true;
        this.url = str2;
        this.url__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Counter";
    }

    private native String getType__Native();

    private native String getUrl__Native();

    private native NativeObject init(String str, String str2);

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

    public synchronized String getUrl() {
        try {
            if (!this.url__is_initialized) {
                this.url = getUrl__Native();
                this.url__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.url;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getType(), false);
            archive.add(getUrl(), false);
            return;
        }
        this.type = archive.add(this.type, false);
        this.type__is_initialized = true;
        String add = archive.add(this.url, false);
        this.url = add;
        this.url__is_initialized = true;
        this.nativeObject = init(this.type, add);
    }

    public Counter() {
        this.type__is_initialized = false;
        this.url__is_initialized = false;
    }

    private Counter(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.url__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
