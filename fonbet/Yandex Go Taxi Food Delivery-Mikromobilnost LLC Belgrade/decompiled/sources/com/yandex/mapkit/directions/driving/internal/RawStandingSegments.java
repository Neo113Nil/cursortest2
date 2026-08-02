package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.StandingSegment;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawStandingSegments implements Serializable {
    private NativeObject nativeObject;
    private List<StandingSegment> standingSegments;
    private boolean standingSegments__is_initialized;

    public RawStandingSegments(List<StandingSegment> list) {
        this.standingSegments__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"standingSegments\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.standingSegments = list;
        this.standingSegments__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawStandingSegments";
    }

    private native List<StandingSegment> getStandingSegments__Native();

    private native NativeObject init(List<StandingSegment> list);

    public synchronized List<StandingSegment> getStandingSegments() {
        try {
            if (!this.standingSegments__is_initialized) {
                this.standingSegments = getStandingSegments__Native();
                this.standingSegments__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.standingSegments;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(StandingSegment.class, archive, getStandingSegments(), false);
            return;
        }
        List<StandingSegment> e = nzs.e(StandingSegment.class, archive, this.standingSegments, false);
        this.standingSegments = e;
        this.standingSegments__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawStandingSegments() {
        this.standingSegments__is_initialized = false;
    }

    private RawStandingSegments(NativeObject nativeObject) {
        this.standingSegments__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
