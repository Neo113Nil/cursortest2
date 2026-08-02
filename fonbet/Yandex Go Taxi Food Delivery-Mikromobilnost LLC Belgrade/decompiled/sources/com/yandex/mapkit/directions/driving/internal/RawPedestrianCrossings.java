package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawPedestrianCrossings implements Serializable {
    private NativeObject nativeObject;
    private List<RawPedestrianCrossing> pedestrianCrossings;
    private boolean pedestrianCrossings__is_initialized;

    public RawPedestrianCrossings(List<RawPedestrianCrossing> list) {
        this.pedestrianCrossings__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"pedestrianCrossings\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.pedestrianCrossings = list;
        this.pedestrianCrossings__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawPedestrianCrossings";
    }

    private native List<RawPedestrianCrossing> getPedestrianCrossings__Native();

    private native NativeObject init(List<RawPedestrianCrossing> list);

    public synchronized List<RawPedestrianCrossing> getPedestrianCrossings() {
        try {
            if (!this.pedestrianCrossings__is_initialized) {
                this.pedestrianCrossings = getPedestrianCrossings__Native();
                this.pedestrianCrossings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.pedestrianCrossings;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawPedestrianCrossing.class, archive, getPedestrianCrossings(), false);
            return;
        }
        List<RawPedestrianCrossing> e = nzs.e(RawPedestrianCrossing.class, archive, this.pedestrianCrossings, false);
        this.pedestrianCrossings = e;
        this.pedestrianCrossings__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawPedestrianCrossings() {
        this.pedestrianCrossings__is_initialized = false;
    }

    private RawPedestrianCrossings(NativeObject nativeObject) {
        this.pedestrianCrossings__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
