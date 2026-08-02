package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RestrictedEntriesContainer implements Serializable {
    private List<RestrictedEntry> entries;
    private boolean entries__is_initialized;
    private NativeObject nativeObject;

    public RestrictedEntriesContainer(List<RestrictedEntry> list) {
        this.entries__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"entries\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.entries = list;
        this.entries__is_initialized = true;
    }

    private native List<RestrictedEntry> getEntries__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RestrictedEntriesContainer";
    }

    private native NativeObject init(List<RestrictedEntry> list);

    public synchronized List<RestrictedEntry> getEntries() {
        try {
            if (!this.entries__is_initialized) {
                this.entries = getEntries__Native();
                this.entries__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.entries;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RestrictedEntry.class, archive, getEntries(), false);
            return;
        }
        List<RestrictedEntry> e = nzs.e(RestrictedEntry.class, archive, this.entries, false);
        this.entries = e;
        this.entries__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RestrictedEntriesContainer() {
        this.entries__is_initialized = false;
    }

    private RestrictedEntriesContainer(NativeObject nativeObject) {
        this.entries__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
