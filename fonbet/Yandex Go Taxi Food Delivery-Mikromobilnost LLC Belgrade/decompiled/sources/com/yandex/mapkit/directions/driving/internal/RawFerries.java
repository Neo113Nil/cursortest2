package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.Ferry;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawFerries implements Serializable {
    private List<Ferry> ferries;
    private boolean ferries__is_initialized;
    private NativeObject nativeObject;

    public RawFerries(List<Ferry> list) {
        this.ferries__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"ferries\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.ferries = list;
        this.ferries__is_initialized = true;
    }

    private native List<Ferry> getFerries__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawFerries";
    }

    private native NativeObject init(List<Ferry> list);

    public synchronized List<Ferry> getFerries() {
        try {
            if (!this.ferries__is_initialized) {
                this.ferries = getFerries__Native();
                this.ferries__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ferries;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Ferry.class, archive, getFerries(), false);
            return;
        }
        List<Ferry> e = nzs.e(Ferry.class, archive, this.ferries, false);
        this.ferries = e;
        this.ferries__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawFerries() {
        this.ferries__is_initialized = false;
    }

    private RawFerries(NativeObject nativeObject) {
        this.ferries__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
