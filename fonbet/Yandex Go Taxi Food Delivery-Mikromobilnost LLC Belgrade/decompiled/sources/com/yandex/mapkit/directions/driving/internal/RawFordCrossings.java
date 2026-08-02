package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.FordCrossing;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawFordCrossings implements Serializable {
    private List<FordCrossing> fordCrossings;
    private boolean fordCrossings__is_initialized;
    private NativeObject nativeObject;

    public RawFordCrossings(List<FordCrossing> list) {
        this.fordCrossings__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"fordCrossings\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.fordCrossings = list;
        this.fordCrossings__is_initialized = true;
    }

    private native List<FordCrossing> getFordCrossings__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawFordCrossings";
    }

    private native NativeObject init(List<FordCrossing> list);

    public synchronized List<FordCrossing> getFordCrossings() {
        try {
            if (!this.fordCrossings__is_initialized) {
                this.fordCrossings = getFordCrossings__Native();
                this.fordCrossings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.fordCrossings;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(FordCrossing.class, archive, getFordCrossings(), false);
            return;
        }
        List<FordCrossing> e = nzs.e(FordCrossing.class, archive, this.fordCrossings, false);
        this.fordCrossings = e;
        this.fordCrossings__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawFordCrossings() {
        this.fordCrossings__is_initialized = false;
    }

    private RawFordCrossings(NativeObject nativeObject) {
        this.fordCrossings__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
