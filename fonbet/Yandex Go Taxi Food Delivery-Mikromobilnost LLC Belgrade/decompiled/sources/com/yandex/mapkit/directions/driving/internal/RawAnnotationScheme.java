package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.AnnotationSchemeID;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RawAnnotationScheme implements Serializable {
    private int count;
    private boolean count__is_initialized;
    private NativeObject nativeObject;
    private AnnotationSchemeID schemeId;
    private boolean schemeId__is_initialized;

    public RawAnnotationScheme(int i, AnnotationSchemeID annotationSchemeID) {
        this.count__is_initialized = false;
        this.schemeId__is_initialized = false;
        if (annotationSchemeID == null) {
            ny61.g("Required field \"schemeId\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, annotationSchemeID);
        this.count = i;
        this.count__is_initialized = true;
        this.schemeId = annotationSchemeID;
        this.schemeId__is_initialized = true;
    }

    private native int getCount__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawAnnotationScheme";
    }

    private native AnnotationSchemeID getSchemeId__Native();

    private native NativeObject init(int i, AnnotationSchemeID annotationSchemeID);

    public synchronized int getCount() {
        try {
            if (!this.count__is_initialized) {
                this.count = getCount__Native();
                this.count__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.count;
    }

    public synchronized AnnotationSchemeID getSchemeId() {
        try {
            if (!this.schemeId__is_initialized) {
                this.schemeId = getSchemeId__Native();
                this.schemeId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.schemeId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCount());
            archive.add((Archive) getSchemeId(), false, (Class<Archive>) AnnotationSchemeID.class);
            return;
        }
        this.count = archive.add(this.count);
        this.count__is_initialized = true;
        AnnotationSchemeID annotationSchemeID = (AnnotationSchemeID) archive.add((Archive) this.schemeId, false, (Class<Archive>) AnnotationSchemeID.class);
        this.schemeId = annotationSchemeID;
        this.schemeId__is_initialized = true;
        this.nativeObject = init(this.count, annotationSchemeID);
    }

    public RawAnnotationScheme() {
        this.count__is_initialized = false;
        this.schemeId__is_initialized = false;
    }

    private RawAnnotationScheme(NativeObject nativeObject) {
        this.count__is_initialized = false;
        this.schemeId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
