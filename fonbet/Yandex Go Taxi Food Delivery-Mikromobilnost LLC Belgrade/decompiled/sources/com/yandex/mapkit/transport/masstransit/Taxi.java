package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Taxi implements Serializable {
    private List<JamSegment> jamSegments;
    private boolean jamSegments__is_initialized;
    private NativeObject nativeObject;

    public Taxi(List<JamSegment> list) {
        this.jamSegments__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"jamSegments\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.jamSegments = list;
        this.jamSegments__is_initialized = true;
    }

    private native List<JamSegment> getJamSegments__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Taxi";
    }

    private native NativeObject init(List<JamSegment> list);

    public synchronized List<JamSegment> getJamSegments() {
        try {
            if (!this.jamSegments__is_initialized) {
                this.jamSegments = getJamSegments__Native();
                this.jamSegments__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.jamSegments;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(JamSegment.class, archive, getJamSegments(), false);
            return;
        }
        List<JamSegment> e = nzs.e(JamSegment.class, archive, this.jamSegments, false);
        this.jamSegments = e;
        this.jamSegments__is_initialized = true;
        this.nativeObject = init(e);
    }

    public Taxi() {
        this.jamSegments__is_initialized = false;
    }

    private Taxi(NativeObject nativeObject) {
        this.jamSegments__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
