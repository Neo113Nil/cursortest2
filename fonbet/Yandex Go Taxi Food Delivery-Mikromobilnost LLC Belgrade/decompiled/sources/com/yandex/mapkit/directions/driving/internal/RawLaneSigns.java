package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawLaneSigns implements Serializable {
    private List<RawLaneSign> laneSigns;
    private boolean laneSigns__is_initialized;
    private NativeObject nativeObject;

    public RawLaneSigns(List<RawLaneSign> list) {
        this.laneSigns__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"laneSigns\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.laneSigns = list;
        this.laneSigns__is_initialized = true;
    }

    private native List<RawLaneSign> getLaneSigns__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawLaneSigns";
    }

    private native NativeObject init(List<RawLaneSign> list);

    public synchronized List<RawLaneSign> getLaneSigns() {
        try {
            if (!this.laneSigns__is_initialized) {
                this.laneSigns = getLaneSigns__Native();
                this.laneSigns__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.laneSigns;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawLaneSign.class, archive, getLaneSigns(), false);
            return;
        }
        List<RawLaneSign> e = nzs.e(RawLaneSign.class, archive, this.laneSigns, false);
        this.laneSigns = e;
        this.laneSigns__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawLaneSigns() {
        this.laneSigns__is_initialized = false;
    }

    private RawLaneSigns(NativeObject nativeObject) {
        this.laneSigns__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
