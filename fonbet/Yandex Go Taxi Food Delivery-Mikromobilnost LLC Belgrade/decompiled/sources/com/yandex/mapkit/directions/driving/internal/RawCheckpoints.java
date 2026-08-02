package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawCheckpoints implements Serializable {
    private List<RawCheckpoint> checkpoints;
    private boolean checkpoints__is_initialized;
    private NativeObject nativeObject;

    public RawCheckpoints(List<RawCheckpoint> list) {
        this.checkpoints__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"checkpoints\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.checkpoints = list;
        this.checkpoints__is_initialized = true;
    }

    private native List<RawCheckpoint> getCheckpoints__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawCheckpoints";
    }

    private native NativeObject init(List<RawCheckpoint> list);

    public synchronized List<RawCheckpoint> getCheckpoints() {
        try {
            if (!this.checkpoints__is_initialized) {
                this.checkpoints = getCheckpoints__Native();
                this.checkpoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.checkpoints;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawCheckpoint.class, archive, getCheckpoints(), false);
            return;
        }
        List<RawCheckpoint> e = nzs.e(RawCheckpoint.class, archive, this.checkpoints, false);
        this.checkpoints = e;
        this.checkpoints__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawCheckpoints() {
        this.checkpoints__is_initialized = false;
    }

    private RawCheckpoints(NativeObject nativeObject) {
        this.checkpoints__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
