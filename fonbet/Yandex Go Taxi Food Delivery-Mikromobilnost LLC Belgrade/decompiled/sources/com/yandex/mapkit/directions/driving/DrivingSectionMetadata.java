package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.IntegerHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class DrivingSectionMetadata implements Serializable {
    private Annotation annotation;
    private boolean annotation__is_initialized;
    private int legIndex;
    private boolean legIndex__is_initialized;
    private NativeObject nativeObject;
    private AnnotationSchemeID schemeId;
    private boolean schemeId__is_initialized;
    private List<Integer> viaPointPositions;
    private boolean viaPointPositions__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;

    public DrivingSectionMetadata(int i, Weight weight, Annotation annotation, AnnotationSchemeID annotationSchemeID, List<Integer> list) {
        this.legIndex__is_initialized = false;
        this.weight__is_initialized = false;
        this.annotation__is_initialized = false;
        this.schemeId__is_initialized = false;
        this.viaPointPositions__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (annotation == null) {
            ny61.g("Required field \"annotation\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"viaPointPositions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, weight, annotation, annotationSchemeID, list);
        this.legIndex = i;
        this.legIndex__is_initialized = true;
        this.weight = weight;
        this.weight__is_initialized = true;
        this.annotation = annotation;
        this.annotation__is_initialized = true;
        this.schemeId = annotationSchemeID;
        this.schemeId__is_initialized = true;
        this.viaPointPositions = list;
        this.viaPointPositions__is_initialized = true;
    }

    private native Annotation getAnnotation__Native();

    private native int getLegIndex__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::SectionMetadata";
    }

    private native AnnotationSchemeID getSchemeId__Native();

    private native List<Integer> getViaPointPositions__Native();

    private native Weight getWeight__Native();

    private native NativeObject init(int i, Weight weight, Annotation annotation, AnnotationSchemeID annotationSchemeID, List<Integer> list);

    private native NativeObject initPublic(int i, Weight weight, Annotation annotation, List<Integer> list);

    public synchronized Annotation getAnnotation() {
        try {
            if (!this.annotation__is_initialized) {
                this.annotation = getAnnotation__Native();
                this.annotation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotation;
    }

    public synchronized int getLegIndex() {
        try {
            if (!this.legIndex__is_initialized) {
                this.legIndex = getLegIndex__Native();
                this.legIndex__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.legIndex;
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

    public synchronized List<Integer> getViaPointPositions() {
        try {
            if (!this.viaPointPositions__is_initialized) {
                this.viaPointPositions = getViaPointPositions__Native();
                this.viaPointPositions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.viaPointPositions;
    }

    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLegIndex());
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getAnnotation(), false, (Class<Archive>) Annotation.class);
            archive.add((Archive) getSchemeId(), true, (Class<Archive>) AnnotationSchemeID.class);
            archive.add((List) getViaPointPositions(), false, (ArchivingHandler) new IntegerHandler());
            return;
        }
        this.legIndex = archive.add(this.legIndex);
        this.legIndex__is_initialized = true;
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.annotation = (Annotation) archive.add((Archive) this.annotation, false, (Class<Archive>) Annotation.class);
        this.annotation__is_initialized = true;
        this.schemeId = (AnnotationSchemeID) archive.add((Archive) this.schemeId, true, (Class<Archive>) AnnotationSchemeID.class);
        this.schemeId__is_initialized = true;
        List<Integer> add = archive.add((List) this.viaPointPositions, false, (ArchivingHandler) new IntegerHandler());
        this.viaPointPositions = add;
        this.viaPointPositions__is_initialized = true;
        this.nativeObject = init(this.legIndex, this.weight, this.annotation, this.schemeId, add);
    }

    public DrivingSectionMetadata() {
        this.legIndex__is_initialized = false;
        this.weight__is_initialized = false;
        this.annotation__is_initialized = false;
        this.schemeId__is_initialized = false;
        this.viaPointPositions__is_initialized = false;
    }

    private DrivingSectionMetadata(NativeObject nativeObject) {
        this.legIndex__is_initialized = false;
        this.weight__is_initialized = false;
        this.annotation__is_initialized = false;
        this.schemeId__is_initialized = false;
        this.viaPointPositions__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public DrivingSectionMetadata(int i, Weight weight, Annotation annotation, List<Integer> list) {
        this.legIndex__is_initialized = false;
        this.weight__is_initialized = false;
        this.annotation__is_initialized = false;
        this.schemeId__is_initialized = false;
        this.viaPointPositions__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (annotation == null) {
            ny61.g("Required field \"annotation\" cannot be null");
            throw null;
        }
        if (list != null) {
            this.nativeObject = initPublic(i, weight, annotation, list);
            this.legIndex = i;
            this.legIndex__is_initialized = true;
            this.weight = weight;
            this.weight__is_initialized = true;
            this.annotation = annotation;
            this.annotation__is_initialized = true;
            this.viaPointPositions = list;
            this.viaPointPositions__is_initialized = true;
            return;
        }
        ny61.g("Required field \"viaPointPositions\" cannot be null");
        throw null;
    }
}
