package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RawHdGeometryPart implements Serializable {
    private Polyline hdSubGeometry;
    private boolean hdSubGeometry__is_initialized;
    private NativeObject nativeObject;
    private Subpolyline sdSubpolyline;
    private boolean sdSubpolyline__is_initialized;

    public RawHdGeometryPart(Subpolyline subpolyline, Polyline polyline) {
        this.sdSubpolyline__is_initialized = false;
        this.hdSubGeometry__is_initialized = false;
        if (subpolyline == null) {
            ny61.g("Required field \"sdSubpolyline\" cannot be null");
            throw null;
        }
        if (polyline == null) {
            ny61.g("Required field \"hdSubGeometry\" cannot be null");
            throw null;
        }
        this.nativeObject = init(subpolyline, polyline);
        this.sdSubpolyline = subpolyline;
        this.sdSubpolyline__is_initialized = true;
        this.hdSubGeometry = polyline;
        this.hdSubGeometry__is_initialized = true;
    }

    private native Polyline getHdSubGeometry__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawHdGeometryPart";
    }

    private native Subpolyline getSdSubpolyline__Native();

    private native NativeObject init(Subpolyline subpolyline, Polyline polyline);

    public synchronized Polyline getHdSubGeometry() {
        try {
            if (!this.hdSubGeometry__is_initialized) {
                this.hdSubGeometry = getHdSubGeometry__Native();
                this.hdSubGeometry__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hdSubGeometry;
    }

    public synchronized Subpolyline getSdSubpolyline() {
        try {
            if (!this.sdSubpolyline__is_initialized) {
                this.sdSubpolyline = getSdSubpolyline__Native();
                this.sdSubpolyline__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sdSubpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getSdSubpolyline(), false, (Class<Archive>) Subpolyline.class);
            archive.add((Archive) getHdSubGeometry(), false, (Class<Archive>) Polyline.class);
            return;
        }
        this.sdSubpolyline = (Subpolyline) archive.add((Archive) this.sdSubpolyline, false, (Class<Archive>) Subpolyline.class);
        this.sdSubpolyline__is_initialized = true;
        Polyline polyline = (Polyline) archive.add((Archive) this.hdSubGeometry, false, (Class<Archive>) Polyline.class);
        this.hdSubGeometry = polyline;
        this.hdSubGeometry__is_initialized = true;
        this.nativeObject = init(this.sdSubpolyline, polyline);
    }

    public RawHdGeometryPart() {
        this.sdSubpolyline__is_initialized = false;
        this.hdSubGeometry__is_initialized = false;
    }

    private RawHdGeometryPart(NativeObject nativeObject) {
        this.sdSubpolyline__is_initialized = false;
        this.hdSubGeometry__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
