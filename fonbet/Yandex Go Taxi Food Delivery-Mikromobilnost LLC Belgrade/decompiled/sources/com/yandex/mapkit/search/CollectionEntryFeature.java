package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class CollectionEntryFeature implements Serializable {
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private String type;
    private boolean type__is_initialized;
    private String value;
    private boolean value__is_initialized;

    public CollectionEntryFeature(String str, String str2, String str3) {
        this.type__is_initialized = false;
        this.name__is_initialized = false;
        this.value__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3);
        this.type = str;
        this.type__is_initialized = true;
        this.name = str2;
        this.name__is_initialized = true;
        this.value = str3;
        this.value__is_initialized = true;
    }

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CollectionEntryFeature";
    }

    private native String getType__Native();

    private native String getValue__Native();

    private native NativeObject init(String str, String str2, String str3);

    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.name;
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

    public synchronized String getValue() {
        try {
            if (!this.value__is_initialized) {
                this.value = getValue__Native();
                this.value__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getType(), false);
            archive.add(getName(), true);
            archive.add(getValue(), true);
            return;
        }
        this.type = archive.add(this.type, false);
        this.type__is_initialized = true;
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        String add = archive.add(this.value, true);
        this.value = add;
        this.value__is_initialized = true;
        this.nativeObject = init(this.type, this.name, add);
    }

    public CollectionEntryFeature() {
        this.type__is_initialized = false;
        this.name__is_initialized = false;
        this.value__is_initialized = false;
    }

    private CollectionEntryFeature(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.name__is_initialized = false;
        this.value__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
