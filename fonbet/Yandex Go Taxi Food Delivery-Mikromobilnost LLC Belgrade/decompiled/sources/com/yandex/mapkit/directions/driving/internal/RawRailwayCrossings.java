package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawRailwayCrossings implements Serializable {
    private NativeObject nativeObject;
    private List<RawRailwayCrossing> railwayCrossings;
    private boolean railwayCrossings__is_initialized;

    public RawRailwayCrossings(List<RawRailwayCrossing> list) {
        this.railwayCrossings__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"railwayCrossings\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.railwayCrossings = list;
        this.railwayCrossings__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawRailwayCrossings";
    }

    private native List<RawRailwayCrossing> getRailwayCrossings__Native();

    private native NativeObject init(List<RawRailwayCrossing> list);

    public synchronized List<RawRailwayCrossing> getRailwayCrossings() {
        try {
            if (!this.railwayCrossings__is_initialized) {
                this.railwayCrossings = getRailwayCrossings__Native();
                this.railwayCrossings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.railwayCrossings;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawRailwayCrossing.class, archive, getRailwayCrossings(), false);
            return;
        }
        List<RawRailwayCrossing> e = nzs.e(RawRailwayCrossing.class, archive, this.railwayCrossings, false);
        this.railwayCrossings = e;
        this.railwayCrossings__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawRailwayCrossings() {
        this.railwayCrossings__is_initialized = false;
    }

    private RawRailwayCrossings(NativeObject nativeObject) {
        this.railwayCrossings__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
