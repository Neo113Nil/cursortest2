package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.ZoneCrossing;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawZoneCrossings implements Serializable {
    private NativeObject nativeObject;
    private List<ZoneCrossing> zoneCrossing;
    private boolean zoneCrossing__is_initialized;

    public RawZoneCrossings(List<ZoneCrossing> list) {
        this.zoneCrossing__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"zoneCrossing\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.zoneCrossing = list;
        this.zoneCrossing__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawZoneCrossings";
    }

    private native List<ZoneCrossing> getZoneCrossing__Native();

    private native NativeObject init(List<ZoneCrossing> list);

    public synchronized List<ZoneCrossing> getZoneCrossing() {
        try {
            if (!this.zoneCrossing__is_initialized) {
                this.zoneCrossing = getZoneCrossing__Native();
                this.zoneCrossing__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zoneCrossing;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(ZoneCrossing.class, archive, getZoneCrossing(), false);
            return;
        }
        List<ZoneCrossing> e = nzs.e(ZoneCrossing.class, archive, this.zoneCrossing, false);
        this.zoneCrossing = e;
        this.zoneCrossing__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawZoneCrossings() {
        this.zoneCrossing__is_initialized = false;
    }

    private RawZoneCrossings(NativeObject nativeObject) {
        this.zoneCrossing__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
