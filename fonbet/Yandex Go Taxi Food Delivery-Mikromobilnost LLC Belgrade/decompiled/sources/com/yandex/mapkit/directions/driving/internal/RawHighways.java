package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.Highway;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawHighways implements Serializable {
    private List<Highway> highway;
    private boolean highway__is_initialized;
    private NativeObject nativeObject;

    public RawHighways(List<Highway> list) {
        this.highway__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"highway\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.highway = list;
        this.highway__is_initialized = true;
    }

    private native List<Highway> getHighway__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawHighways";
    }

    private native NativeObject init(List<Highway> list);

    public synchronized List<Highway> getHighway() {
        try {
            if (!this.highway__is_initialized) {
                this.highway = getHighway__Native();
                this.highway__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.highway;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Highway.class, archive, getHighway(), false);
            return;
        }
        List<Highway> e = nzs.e(Highway.class, archive, this.highway, false);
        this.highway = e;
        this.highway__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawHighways() {
        this.highway__is_initialized = false;
    }

    private RawHighways(NativeObject nativeObject) {
        this.highway__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
