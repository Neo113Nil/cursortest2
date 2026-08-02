package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class MassTransit1xObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<Stop> stops;
    private boolean stops__is_initialized;

    public MassTransit1xObjectMetadata(List<Stop> list) {
        this.stops__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"stops\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.stops = list;
        this.stops__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::MassTransit1xObjectMetadata";
    }

    private native List<Stop> getStops__Native();

    private native NativeObject init(List<Stop> list);

    public synchronized List<Stop> getStops() {
        try {
            if (!this.stops__is_initialized) {
                this.stops = getStops__Native();
                this.stops__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stops;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Stop.class, archive, getStops(), false);
            return;
        }
        List<Stop> e = nzs.e(Stop.class, archive, this.stops, false);
        this.stops = e;
        this.stops__is_initialized = true;
        this.nativeObject = init(e);
    }

    public MassTransit1xObjectMetadata() {
        this.stops__is_initialized = false;
    }

    private MassTransit1xObjectMetadata(NativeObject nativeObject) {
        this.stops__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
