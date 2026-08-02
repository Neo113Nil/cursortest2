package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawJams implements Serializable {
    private NativeObject nativeObject;
    private List<JamSegment> segments;
    private boolean segments__is_initialized;

    public RawJams(List<JamSegment> list) {
        this.segments__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"segments\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.segments = list;
        this.segments__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawJams";
    }

    private native List<JamSegment> getSegments__Native();

    private native NativeObject init(List<JamSegment> list);

    public synchronized List<JamSegment> getSegments() {
        try {
            if (!this.segments__is_initialized) {
                this.segments = getSegments__Native();
                this.segments__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.segments;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(JamSegment.class, archive, getSegments(), false);
            return;
        }
        List<JamSegment> e = nzs.e(JamSegment.class, archive, this.segments, false);
        this.segments = e;
        this.segments__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawJams() {
        this.segments__is_initialized = false;
    }

    private RawJams(NativeObject nativeObject) {
        this.segments__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
