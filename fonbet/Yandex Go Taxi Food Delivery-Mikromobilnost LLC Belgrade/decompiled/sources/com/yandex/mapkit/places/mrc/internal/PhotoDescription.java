package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.GeoPhoto;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PhotoDescription implements Serializable {
    private Annotation annotation;
    private boolean annotation__is_initialized;
    private GeoPhoto geoPhoto;
    private boolean geoPhoto__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;

    public PhotoDescription(String str, GeoPhoto geoPhoto, Annotation annotation) {
        this.id__is_initialized = false;
        this.geoPhoto__is_initialized = false;
        this.annotation__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, geoPhoto, annotation);
        this.id = str;
        this.id__is_initialized = true;
        this.geoPhoto = geoPhoto;
        this.geoPhoto__is_initialized = true;
        this.annotation = annotation;
        this.annotation__is_initialized = true;
    }

    private native Annotation getAnnotation__Native();

    private native GeoPhoto getGeoPhoto__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::mrc::internal::PhotoDescription";
    }

    private native NativeObject init(String str, GeoPhoto geoPhoto, Annotation annotation);

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

    public synchronized GeoPhoto getGeoPhoto() {
        try {
            if (!this.geoPhoto__is_initialized) {
                this.geoPhoto = getGeoPhoto__Native();
                this.geoPhoto__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.geoPhoto;
    }

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add((Archive) getGeoPhoto(), true, (Class<Archive>) GeoPhoto.class);
            archive.add((Archive) getAnnotation(), true, (Class<Archive>) Annotation.class);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.geoPhoto = (GeoPhoto) archive.add((Archive) this.geoPhoto, true, (Class<Archive>) GeoPhoto.class);
        this.geoPhoto__is_initialized = true;
        Annotation annotation = (Annotation) archive.add((Archive) this.annotation, true, (Class<Archive>) Annotation.class);
        this.annotation = annotation;
        this.annotation__is_initialized = true;
        this.nativeObject = init(this.id, this.geoPhoto, annotation);
    }

    public PhotoDescription() {
        this.id__is_initialized = false;
        this.geoPhoto__is_initialized = false;
        this.annotation__is_initialized = false;
    }

    private PhotoDescription(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.geoPhoto__is_initialized = false;
        this.annotation__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
