package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawRuggedRoads implements Serializable {
    private NativeObject nativeObject;
    private List<RawRuggedRoad> ruggedRoads;
    private boolean ruggedRoads__is_initialized;

    public RawRuggedRoads(List<RawRuggedRoad> list) {
        this.ruggedRoads__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"ruggedRoads\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.ruggedRoads = list;
        this.ruggedRoads__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawRuggedRoads";
    }

    private native List<RawRuggedRoad> getRuggedRoads__Native();

    private native NativeObject init(List<RawRuggedRoad> list);

    public synchronized List<RawRuggedRoad> getRuggedRoads() {
        try {
            if (!this.ruggedRoads__is_initialized) {
                this.ruggedRoads = getRuggedRoads__Native();
                this.ruggedRoads__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ruggedRoads;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawRuggedRoad.class, archive, getRuggedRoads(), false);
            return;
        }
        List<RawRuggedRoad> e = nzs.e(RawRuggedRoad.class, archive, this.ruggedRoads, false);
        this.ruggedRoads = e;
        this.ruggedRoads__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawRuggedRoads() {
        this.ruggedRoads__is_initialized = false;
    }

    private RawRuggedRoads(NativeObject nativeObject) {
        this.ruggedRoads__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
