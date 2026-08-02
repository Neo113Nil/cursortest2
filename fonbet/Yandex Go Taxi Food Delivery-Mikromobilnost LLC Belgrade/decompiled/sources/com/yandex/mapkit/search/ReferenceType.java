package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ReferenceType implements Serializable {
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private String scope;
    private boolean scope__is_initialized;

    public ReferenceType(String str, String str2) {
        this.id__is_initialized = false;
        this.scope__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"scope\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2);
        this.id = str;
        this.id__is_initialized = true;
        this.scope = str2;
        this.scope__is_initialized = true;
    }

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ReferenceType";
    }

    private native String getScope__Native();

    private native NativeObject init(String str, String str2);

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

    public synchronized String getScope() {
        try {
            if (!this.scope__is_initialized) {
                this.scope = getScope__Native();
                this.scope__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.scope;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getScope(), false);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        String add = archive.add(this.scope, false);
        this.scope = add;
        this.scope__is_initialized = true;
        this.nativeObject = init(this.id, add);
    }

    public ReferenceType() {
        this.id__is_initialized = false;
        this.scope__is_initialized = false;
    }

    private ReferenceType(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.scope__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
