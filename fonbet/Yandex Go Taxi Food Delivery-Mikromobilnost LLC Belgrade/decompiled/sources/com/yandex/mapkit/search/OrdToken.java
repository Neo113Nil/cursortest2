package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class OrdToken implements Serializable {
    private NativeObject nativeObject;
    private String token;
    private boolean token__is_initialized;

    public OrdToken(String str) {
        this.token__is_initialized = false;
        this.nativeObject = init(str);
        this.token = str;
        this.token__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::OrdToken";
    }

    private native String getToken__Native();

    private native NativeObject init(String str);

    public synchronized String getToken() {
        try {
            if (!this.token__is_initialized) {
                this.token = getToken__Native();
                this.token__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.token;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getToken(), true);
            return;
        }
        String add = archive.add(this.token, true);
        this.token = add;
        this.token__is_initialized = true;
        this.nativeObject = init(add);
    }

    public OrdToken() {
        this.token__is_initialized = false;
    }

    private OrdToken(NativeObject nativeObject) {
        this.token__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
