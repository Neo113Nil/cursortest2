package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SuggestGroup implements Serializable {
    private List<SuggestItem> items;
    private boolean items__is_initialized;
    private Kind kind;
    private boolean kind__is_initialized;
    private NativeObject nativeObject;

    public enum Kind {
        UNKNOWN,
        PERSONAL,
        SEARCH,
        TRANSPORT,
        CHAINS,
        PUBLIC_TRANSPORT_STOP,
        PLACES,
        BUSINESS
    }

    public SuggestGroup(Kind kind, List<SuggestItem> list) {
        this.kind__is_initialized = false;
        this.items__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"items\" cannot be null");
            throw null;
        }
        this.nativeObject = init(kind, list);
        this.kind = kind;
        this.kind__is_initialized = true;
        this.items = list;
        this.items__is_initialized = true;
    }

    private native List<SuggestItem> getItems__Native();

    private native Kind getKind__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SuggestGroup";
    }

    private native NativeObject init(Kind kind, List<SuggestItem> list);

    public synchronized List<SuggestItem> getItems() {
        try {
            if (!this.items__is_initialized) {
                this.items = getItems__Native();
                this.items__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.items;
    }

    public synchronized Kind getKind() {
        try {
            if (!this.kind__is_initialized) {
                this.kind = getKind__Native();
                this.kind__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.kind;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getKind(), true, (Class<Archive>) Kind.class);
            nzs.m(SuggestItem.class, archive, getItems(), false);
            return;
        }
        this.kind = (Kind) archive.add((Archive) this.kind, true, (Class<Archive>) Kind.class);
        this.kind__is_initialized = true;
        List<SuggestItem> e = nzs.e(SuggestItem.class, archive, this.items, false);
        this.items = e;
        this.items__is_initialized = true;
        this.nativeObject = init(this.kind, e);
    }

    public SuggestGroup() {
        this.kind__is_initialized = false;
        this.items__is_initialized = false;
    }

    private SuggestGroup(NativeObject nativeObject) {
        this.kind__is_initialized = false;
        this.items__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
