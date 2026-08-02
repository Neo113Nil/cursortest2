package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawRestrictedTurns implements Serializable {
    private NativeObject nativeObject;
    private List<RawRestrictedTurn> restrictedTurns;
    private boolean restrictedTurns__is_initialized;

    public RawRestrictedTurns(List<RawRestrictedTurn> list) {
        this.restrictedTurns__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"restrictedTurns\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.restrictedTurns = list;
        this.restrictedTurns__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawRestrictedTurns";
    }

    private native List<RawRestrictedTurn> getRestrictedTurns__Native();

    private native NativeObject init(List<RawRestrictedTurn> list);

    public synchronized List<RawRestrictedTurn> getRestrictedTurns() {
        try {
            if (!this.restrictedTurns__is_initialized) {
                this.restrictedTurns = getRestrictedTurns__Native();
                this.restrictedTurns__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.restrictedTurns;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawRestrictedTurn.class, archive, getRestrictedTurns(), false);
            return;
        }
        List<RawRestrictedTurn> e = nzs.e(RawRestrictedTurn.class, archive, this.restrictedTurns, false);
        this.restrictedTurns = e;
        this.restrictedTurns__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawRestrictedTurns() {
        this.restrictedTurns__is_initialized = false;
    }

    private RawRestrictedTurns(NativeObject nativeObject) {
        this.restrictedTurns__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
