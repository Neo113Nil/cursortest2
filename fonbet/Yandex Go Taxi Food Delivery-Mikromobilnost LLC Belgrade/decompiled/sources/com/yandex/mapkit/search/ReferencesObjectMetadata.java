package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class ReferencesObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<ReferenceType> references;
    private boolean references__is_initialized;

    public ReferencesObjectMetadata(List<ReferenceType> list) {
        this.references__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"references\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.references = list;
        this.references__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ReferencesObjectMetadata";
    }

    private native List<ReferenceType> getReferences__Native();

    private native NativeObject init(List<ReferenceType> list);

    public synchronized List<ReferenceType> getReferences() {
        try {
            if (!this.references__is_initialized) {
                this.references = getReferences__Native();
                this.references__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.references;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(ReferenceType.class, archive, getReferences(), false);
            return;
        }
        List<ReferenceType> e = nzs.e(ReferenceType.class, archive, this.references, false);
        this.references = e;
        this.references__is_initialized = true;
        this.nativeObject = init(e);
    }

    public ReferencesObjectMetadata() {
        this.references__is_initialized = false;
    }

    private ReferencesObjectMetadata(NativeObject nativeObject) {
        this.references__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
