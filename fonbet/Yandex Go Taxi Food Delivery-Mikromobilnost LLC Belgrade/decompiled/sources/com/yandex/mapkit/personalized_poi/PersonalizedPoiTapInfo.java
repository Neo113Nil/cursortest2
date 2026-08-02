package com.yandex.mapkit.personalized_poi;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PersonalizedPoiTapInfo implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private String placeholder;
    private boolean placeholder__is_initialized;

    public PersonalizedPoiTapInfo(String str) {
        this.placeholder__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"placeholder\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str);
        this.placeholder = str;
        this.placeholder__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::PersonalizedPoiTapInfo";
    }

    private native String getPlaceholder__Native();

    private native NativeObject init(String str);

    public synchronized String getPlaceholder() {
        try {
            if (!this.placeholder__is_initialized) {
                this.placeholder = getPlaceholder__Native();
                this.placeholder__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.placeholder;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPlaceholder(), false);
            return;
        }
        String add = archive.add(this.placeholder, false);
        this.placeholder = add;
        this.placeholder__is_initialized = true;
        this.nativeObject = init(add);
    }

    public PersonalizedPoiTapInfo() {
        this.placeholder__is_initialized = false;
    }

    private PersonalizedPoiTapInfo(NativeObject nativeObject) {
        this.placeholder__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
