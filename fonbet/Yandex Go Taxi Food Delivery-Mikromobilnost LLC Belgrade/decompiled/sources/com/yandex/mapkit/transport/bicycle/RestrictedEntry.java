package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RestrictedEntry implements Serializable {
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;

    public RestrictedEntry(PolylinePosition polylinePosition) {
        this.position__is_initialized = false;
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(polylinePosition);
        this.position = polylinePosition;
        this.position__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::bicycle::RestrictedEntry";
    }

    private native PolylinePosition getPosition__Native();

    private native NativeObject init(PolylinePosition polylinePosition);

    public synchronized PolylinePosition getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            return;
        }
        PolylinePosition polylinePosition = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position = polylinePosition;
        this.position__is_initialized = true;
        this.nativeObject = init(polylinePosition);
    }

    public RestrictedEntry() {
        this.position__is_initialized = false;
    }

    private RestrictedEntry(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
