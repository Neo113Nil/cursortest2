package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawSpeedLimits implements Serializable {
    private NativeObject nativeObject;
    private List<RawSpeedLimit> speedLimits;
    private boolean speedLimits__is_initialized;

    public RawSpeedLimits(List<RawSpeedLimit> list) {
        this.speedLimits__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"speedLimits\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.speedLimits = list;
        this.speedLimits__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawSpeedLimits";
    }

    private native List<RawSpeedLimit> getSpeedLimits__Native();

    private native NativeObject init(List<RawSpeedLimit> list);

    public synchronized List<RawSpeedLimit> getSpeedLimits() {
        try {
            if (!this.speedLimits__is_initialized) {
                this.speedLimits = getSpeedLimits__Native();
                this.speedLimits__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.speedLimits;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawSpeedLimit.class, archive, getSpeedLimits(), false);
            return;
        }
        List<RawSpeedLimit> e = nzs.e(RawSpeedLimit.class, archive, this.speedLimits, false);
        this.speedLimits = e;
        this.speedLimits__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawSpeedLimits() {
        this.speedLimits__is_initialized = false;
    }

    private RawSpeedLimits(NativeObject nativeObject) {
        this.speedLimits__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
