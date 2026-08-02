package com.yandex.mapkit.navigation.transport;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class UpcomingManoeuvre implements Serializable {
    private ManoeuvreDetails details;
    private boolean details__is_initialized;
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;

    public UpcomingManoeuvre(ManoeuvreDetails manoeuvreDetails, PolylinePosition polylinePosition) {
        this.details__is_initialized = false;
        this.position__is_initialized = false;
        if (manoeuvreDetails == null) {
            ny61.g("Required field \"details\" cannot be null");
            throw null;
        }
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(manoeuvreDetails, polylinePosition);
        this.details = manoeuvreDetails;
        this.details__is_initialized = true;
        this.position = polylinePosition;
        this.position__is_initialized = true;
    }

    private native ManoeuvreDetails getDetails__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::UpcomingManoeuvre";
    }

    private native PolylinePosition getPosition__Native();

    private native NativeObject init(ManoeuvreDetails manoeuvreDetails, PolylinePosition polylinePosition);

    public synchronized ManoeuvreDetails getDetails() {
        try {
            if (!this.details__is_initialized) {
                this.details = getDetails__Native();
                this.details__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.details;
    }

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
            archive.add((Archive) getDetails(), false, (Class<Archive>) ManoeuvreDetails.class);
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            return;
        }
        this.details = (ManoeuvreDetails) archive.add((Archive) this.details, false, (Class<Archive>) ManoeuvreDetails.class);
        this.details__is_initialized = true;
        PolylinePosition polylinePosition = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position = polylinePosition;
        this.position__is_initialized = true;
        this.nativeObject = init(this.details, polylinePosition);
    }

    public UpcomingManoeuvre() {
        this.details__is_initialized = false;
        this.position__is_initialized = false;
    }

    private UpcomingManoeuvre(NativeObject nativeObject) {
        this.details__is_initialized = false;
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
