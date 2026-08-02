package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawRestrictedEntries implements Serializable {
    private NativeObject nativeObject;
    private List<RawRestrictedEntry> restrictedEntries;
    private boolean restrictedEntries__is_initialized;

    public RawRestrictedEntries(List<RawRestrictedEntry> list) {
        this.restrictedEntries__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"restrictedEntries\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.restrictedEntries = list;
        this.restrictedEntries__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawRestrictedEntries";
    }

    private native List<RawRestrictedEntry> getRestrictedEntries__Native();

    private native NativeObject init(List<RawRestrictedEntry> list);

    public synchronized List<RawRestrictedEntry> getRestrictedEntries() {
        try {
            if (!this.restrictedEntries__is_initialized) {
                this.restrictedEntries = getRestrictedEntries__Native();
                this.restrictedEntries__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.restrictedEntries;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawRestrictedEntry.class, archive, getRestrictedEntries(), false);
            return;
        }
        List<RawRestrictedEntry> e = nzs.e(RawRestrictedEntry.class, archive, this.restrictedEntries, false);
        this.restrictedEntries = e;
        this.restrictedEntries__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawRestrictedEntries() {
        this.restrictedEntries__is_initialized = false;
    }

    private RawRestrictedEntries(NativeObject nativeObject) {
        this.restrictedEntries__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
