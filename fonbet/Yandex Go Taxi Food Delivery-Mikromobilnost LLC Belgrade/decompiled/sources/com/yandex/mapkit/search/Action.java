package com.yandex.mapkit.search;

import com.yandex.runtime.KeyValuePair;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Action implements Serializable {
    private NativeObject nativeObject;
    private List<KeyValuePair> properties;
    private boolean properties__is_initialized;
    private String type;
    private boolean type__is_initialized;

    public Action(String str, List<KeyValuePair> list) {
        this.type__is_initialized = false;
        this.properties__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"properties\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.type = str;
        this.type__is_initialized = true;
        this.properties = list;
        this.properties__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Action";
    }

    private native List<KeyValuePair> getProperties__Native();

    private native String getType__Native();

    private native NativeObject init(String str, List<KeyValuePair> list);

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
            archive.add(getType(), false);
            nzs.m(KeyValuePair.class, archive, getProperties(), false);
            return;
        }
        this.type = archive.add(this.type, false);
        this.type__is_initialized = true;
        List<KeyValuePair> e = nzs.e(KeyValuePair.class, archive, this.properties, false);
        this.properties = e;
        this.properties__is_initialized = true;
        this.nativeObject = init(this.type, e);
    }

    public Action() {
        this.type__is_initialized = false;
        this.properties__is_initialized = false;
    }

    private Action(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.properties__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
