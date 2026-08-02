package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ManoeuvreBalloon implements Serializable {
    private ManoeuvreBalloonDetails details;
    private boolean details__is_initialized;
    private LocalizedValue distance;
    private boolean distance__is_initialized;
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;

    public ManoeuvreBalloon(ManoeuvreBalloonDetails manoeuvreBalloonDetails, LocalizedValue localizedValue, PolylinePosition polylinePosition) {
        this.details__is_initialized = false;
        this.distance__is_initialized = false;
        this.position__is_initialized = false;
        if (manoeuvreBalloonDetails == null) {
            ny61.g("Required field \"details\" cannot be null");
            throw null;
        }
        if (localizedValue == null) {
            ny61.g("Required field \"distance\" cannot be null");
            throw null;
        }
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(manoeuvreBalloonDetails, localizedValue, polylinePosition);
        this.details = manoeuvreBalloonDetails;
        this.details__is_initialized = true;
        this.distance = localizedValue;
        this.distance__is_initialized = true;
        this.position = polylinePosition;
        this.position__is_initialized = true;
    }

    private native ManoeuvreBalloonDetails getDetails__Native();

    private native LocalizedValue getDistance__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::layer::balloons::ManoeuvreBalloon";
    }

    private native PolylinePosition getPosition__Native();

    private native NativeObject init(ManoeuvreBalloonDetails manoeuvreBalloonDetails, LocalizedValue localizedValue, PolylinePosition polylinePosition);

    public synchronized ManoeuvreBalloonDetails getDetails() {
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

    public synchronized LocalizedValue getDistance() {
        try {
            if (!this.distance__is_initialized) {
                this.distance = getDistance__Native();
                this.distance__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.distance;
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
            archive.add((Archive) getDetails(), false, (Class<Archive>) ManoeuvreBalloonDetails.class);
            archive.add((Archive) getDistance(), false, (Class<Archive>) LocalizedValue.class);
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            return;
        }
        this.details = (ManoeuvreBalloonDetails) archive.add((Archive) this.details, false, (Class<Archive>) ManoeuvreBalloonDetails.class);
        this.details__is_initialized = true;
        this.distance = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
        this.distance__is_initialized = true;
        PolylinePosition polylinePosition = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position = polylinePosition;
        this.position__is_initialized = true;
        this.nativeObject = init(this.details, this.distance, polylinePosition);
    }

    public ManoeuvreBalloon() {
        this.details__is_initialized = false;
        this.distance__is_initialized = false;
        this.position__is_initialized = false;
    }

    private ManoeuvreBalloon(NativeObject nativeObject) {
        this.details__is_initialized = false;
        this.distance__is_initialized = false;
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
