package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class DrivingSection implements Serializable {
    private Subpolyline geometry;
    private boolean geometry__is_initialized;
    private DrivingSectionMetadata metadata;
    private boolean metadata__is_initialized;
    private NativeObject nativeObject;

    public DrivingSection(DrivingSectionMetadata drivingSectionMetadata, Subpolyline subpolyline) {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        if (drivingSectionMetadata == null) {
            ny61.g("Required field \"metadata\" cannot be null");
            throw null;
        }
        if (subpolyline == null) {
            ny61.g("Required field \"geometry\" cannot be null");
            throw null;
        }
        this.nativeObject = init(drivingSectionMetadata, subpolyline);
        this.metadata = drivingSectionMetadata;
        this.metadata__is_initialized = true;
        this.geometry = subpolyline;
        this.geometry__is_initialized = true;
    }

    private native Subpolyline getGeometry__Native();

    private native DrivingSectionMetadata getMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::Section";
    }

    private native NativeObject init(DrivingSectionMetadata drivingSectionMetadata, Subpolyline subpolyline);

    public synchronized Subpolyline getGeometry() {
        try {
            if (!this.geometry__is_initialized) {
                this.geometry = getGeometry__Native();
                this.geometry__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.geometry;
    }

    public synchronized DrivingSectionMetadata getMetadata() {
        try {
            if (!this.metadata__is_initialized) {
                this.metadata = getMetadata__Native();
                this.metadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.metadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMetadata(), false, (Class<Archive>) DrivingSectionMetadata.class);
            archive.add((Archive) getGeometry(), false, (Class<Archive>) Subpolyline.class);
            return;
        }
        this.metadata = (DrivingSectionMetadata) archive.add((Archive) this.metadata, false, (Class<Archive>) DrivingSectionMetadata.class);
        this.metadata__is_initialized = true;
        Subpolyline subpolyline = (Subpolyline) archive.add((Archive) this.geometry, false, (Class<Archive>) Subpolyline.class);
        this.geometry = subpolyline;
        this.geometry__is_initialized = true;
        this.nativeObject = init(this.metadata, subpolyline);
    }

    public DrivingSection() {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
    }

    private DrivingSection(NativeObject nativeObject) {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
