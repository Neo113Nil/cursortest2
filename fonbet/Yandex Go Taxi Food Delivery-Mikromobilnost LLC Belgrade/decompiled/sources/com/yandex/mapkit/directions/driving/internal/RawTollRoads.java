package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.TollRoad;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawTollRoads implements Serializable {
    private NativeObject nativeObject;
    private List<TollRoad> tollRoads;
    private boolean tollRoads__is_initialized;

    public RawTollRoads(List<TollRoad> list) {
        this.tollRoads__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"tollRoads\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.tollRoads = list;
        this.tollRoads__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawTollRoads";
    }

    private native List<TollRoad> getTollRoads__Native();

    private native NativeObject init(List<TollRoad> list);

    public synchronized List<TollRoad> getTollRoads() {
        try {
            if (!this.tollRoads__is_initialized) {
                this.tollRoads = getTollRoads__Native();
                this.tollRoads__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tollRoads;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(TollRoad.class, archive, getTollRoads(), false);
            return;
        }
        List<TollRoad> e = nzs.e(TollRoad.class, archive, this.tollRoads, false);
        this.tollRoads = e;
        this.tollRoads__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawTollRoads() {
        this.tollRoads__is_initialized = false;
    }

    private RawTollRoads(NativeObject nativeObject) {
        this.tollRoads__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
