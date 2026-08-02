package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawAnnotationSchemes implements Serializable {
    private NativeObject nativeObject;
    private List<RawAnnotationScheme> schemes;
    private boolean schemes__is_initialized;

    public RawAnnotationSchemes(List<RawAnnotationScheme> list) {
        this.schemes__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"schemes\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.schemes = list;
        this.schemes__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawAnnotationSchemes";
    }

    private native List<RawAnnotationScheme> getSchemes__Native();

    private native NativeObject init(List<RawAnnotationScheme> list);

    public synchronized List<RawAnnotationScheme> getSchemes() {
        try {
            if (!this.schemes__is_initialized) {
                this.schemes = getSchemes__Native();
                this.schemes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.schemes;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawAnnotationScheme.class, archive, getSchemes(), false);
            return;
        }
        List<RawAnnotationScheme> e = nzs.e(RawAnnotationScheme.class, archive, this.schemes, false);
        this.schemes = e;
        this.schemes__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawAnnotationSchemes() {
        this.schemes__is_initialized = false;
    }

    private RawAnnotationSchemes(NativeObject nativeObject) {
        this.schemes__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
