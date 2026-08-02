package com.yandex.mapkit.places.toponym_photo;

import com.yandex.mapkit.GeoPhoto;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PhotoDescription implements Serializable {
    private String description;
    private boolean description__is_initialized;
    private GeoPhoto geoPhoto;
    private boolean geoPhoto__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;

    public PhotoDescription(String str, GeoPhoto geoPhoto, String str2) {
        this.id__is_initialized = false;
        this.geoPhoto__is_initialized = false;
        this.description__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, geoPhoto, str2);
        this.id = str;
        this.id__is_initialized = true;
        this.geoPhoto = geoPhoto;
        this.geoPhoto__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
    }

    private native String getDescription__Native();

    private native GeoPhoto getGeoPhoto__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::toponym_photo::PhotoDescription";
    }

    private native NativeObject init(String str, GeoPhoto geoPhoto, String str2);

    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.description;
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
            archive.add(getDescription(), true);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.geoPhoto = (GeoPhoto) archive.add((Archive) this.geoPhoto, true, (Class<Archive>) GeoPhoto.class);
        this.geoPhoto__is_initialized = true;
        String add = archive.add(this.description, true);
        this.description = add;
        this.description__is_initialized = true;
        this.nativeObject = init(this.id, this.geoPhoto, add);
    }

    public PhotoDescription() {
        this.id__is_initialized = false;
        this.geoPhoto__is_initialized = false;
        this.description__is_initialized = false;
    }

    private PhotoDescription(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.geoPhoto__is_initialized = false;
        this.description__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
