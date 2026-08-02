package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawSpeedBumps implements Serializable {
    private NativeObject nativeObject;
    private List<RawSpeedBump> speedBumps;
    private boolean speedBumps__is_initialized;

    public RawSpeedBumps(List<RawSpeedBump> list) {
        this.speedBumps__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"speedBumps\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.speedBumps = list;
        this.speedBumps__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawSpeedBumps";
    }

    private native List<RawSpeedBump> getSpeedBumps__Native();

    private native NativeObject init(List<RawSpeedBump> list);

    public synchronized List<RawSpeedBump> getSpeedBumps() {
        try {
            if (!this.speedBumps__is_initialized) {
                this.speedBumps = getSpeedBumps__Native();
                this.speedBumps__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.speedBumps;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawSpeedBump.class, archive, getSpeedBumps(), false);
            return;
        }
        List<RawSpeedBump> e = nzs.e(RawSpeedBump.class, archive, this.speedBumps, false);
        this.speedBumps = e;
        this.speedBumps__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawSpeedBumps() {
        this.speedBumps__is_initialized = false;
    }

    private RawSpeedBumps(NativeObject nativeObject) {
        this.speedBumps__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
