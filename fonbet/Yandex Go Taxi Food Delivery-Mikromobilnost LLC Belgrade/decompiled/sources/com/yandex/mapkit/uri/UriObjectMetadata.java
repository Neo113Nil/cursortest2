package com.yandex.mapkit.uri;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class UriObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<Uri> uris;
    private boolean uris__is_initialized;

    public UriObjectMetadata(List<Uri> list) {
        this.uris__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"uris\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.uris = list;
        this.uris__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::uri::UriObjectMetadata";
    }

    private native List<Uri> getUris__Native();

    private native NativeObject init(List<Uri> list);

    public synchronized List<Uri> getUris() {
        try {
            if (!this.uris__is_initialized) {
                this.uris = getUris__Native();
                this.uris__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.uris;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Uri.class, archive, getUris(), false);
            return;
        }
        List<Uri> e = nzs.e(Uri.class, archive, this.uris, false);
        this.uris = e;
        this.uris__is_initialized = true;
        this.nativeObject = init(e);
    }

    public UriObjectMetadata() {
        this.uris__is_initialized = false;
    }

    private UriObjectMetadata(NativeObject nativeObject) {
        this.uris__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
