package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PhotoLink implements Serializable {
    private NativeObject nativeObject;
    private String type;
    private boolean type__is_initialized;
    private String uri;
    private boolean uri__is_initialized;

    public PhotoLink(String str, String str2) {
        this.type__is_initialized = false;
        this.uri__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"uri\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2);
        this.type = str;
        this.type__is_initialized = true;
        this.uri = str2;
        this.uri__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::PhotoLink";
    }

    private native String getType__Native();

    private native String getUri__Native();

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

    public synchronized String getUri() {
        try {
            if (!this.uri__is_initialized) {
                this.uri = getUri__Native();
                this.uri__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.uri;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getType(), false);
            archive.add(getUri(), false);
            return;
        }
        this.type = archive.add(this.type, false);
        this.type__is_initialized = true;
        String add = archive.add(this.uri, false);
        this.uri = add;
        this.uri__is_initialized = true;
        this.nativeObject = init(this.type, add);
    }

    public PhotoLink() {
        this.type__is_initialized = false;
        this.uri__is_initialized = false;
    }

    private PhotoLink(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.uri__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
