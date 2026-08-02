package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RawTransportStop implements Serializable {
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;
    private Stop stop;
    private boolean stop__is_initialized;

    public RawTransportStop(Stop stop, PolylinePosition polylinePosition) {
        this.stop__is_initialized = false;
        this.position__is_initialized = false;
        if (stop == null) {
            ny61.g("Required field \"stop\" cannot be null");
            throw null;
        }
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(stop, polylinePosition);
        this.stop = stop;
        this.stop__is_initialized = true;
        this.position = polylinePosition;
        this.position__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::internal::RawTransportStop";
    }

    private native PolylinePosition getPosition__Native();

    private native Stop getStop__Native();

    private native NativeObject init(Stop stop, PolylinePosition polylinePosition);

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

    public synchronized Stop getStop() {
        try {
            if (!this.stop__is_initialized) {
                this.stop = getStop__Native();
                this.stop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stop;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getStop(), false, (Class<Archive>) Stop.class);
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            return;
        }
        this.stop = (Stop) archive.add((Archive) this.stop, false, (Class<Archive>) Stop.class);
        this.stop__is_initialized = true;
        PolylinePosition polylinePosition = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position = polylinePosition;
        this.position__is_initialized = true;
        this.nativeObject = init(this.stop, polylinePosition);
    }

    public RawTransportStop() {
        this.stop__is_initialized = false;
        this.position__is_initialized = false;
    }

    private RawTransportStop(NativeObject nativeObject) {
        this.stop__is_initialized = false;
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
