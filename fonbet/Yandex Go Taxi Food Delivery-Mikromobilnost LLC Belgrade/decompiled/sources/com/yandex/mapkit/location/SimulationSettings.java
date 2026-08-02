package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SimulationSettings implements Serializable {
    private Polyline geometry;
    private boolean geometry__is_initialized;
    private LocationSettings locationSettings;
    private boolean locationSettings__is_initialized;
    private NativeObject nativeObject;

    public SimulationSettings(Polyline polyline, LocationSettings locationSettings) {
        this.geometry__is_initialized = false;
        this.locationSettings__is_initialized = false;
        if (polyline == null) {
            ny61.g("Required field \"geometry\" cannot be null");
            throw null;
        }
        if (locationSettings == null) {
            ny61.g("Required field \"locationSettings\" cannot be null");
            throw null;
        }
        this.nativeObject = init(polyline, locationSettings);
        this.geometry = polyline;
        this.geometry__is_initialized = true;
        this.locationSettings = locationSettings;
        this.locationSettings__is_initialized = true;
    }

    private native Polyline getGeometry__Native();

    private native LocationSettings getLocationSettings__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::SimulationSettings";
    }

    private native NativeObject init(Polyline polyline, LocationSettings locationSettings);

    public synchronized Polyline getGeometry() {
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

    public synchronized LocationSettings getLocationSettings() {
        try {
            if (!this.locationSettings__is_initialized) {
                this.locationSettings = getLocationSettings__Native();
                this.locationSettings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.locationSettings;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getGeometry(), false, (Class<Archive>) Polyline.class);
            archive.add((Archive) getLocationSettings(), false, (Class<Archive>) LocationSettings.class);
            return;
        }
        this.geometry = (Polyline) archive.add((Archive) this.geometry, false, (Class<Archive>) Polyline.class);
        this.geometry__is_initialized = true;
        LocationSettings locationSettings = (LocationSettings) archive.add((Archive) this.locationSettings, false, (Class<Archive>) LocationSettings.class);
        this.locationSettings = locationSettings;
        this.locationSettings__is_initialized = true;
        this.nativeObject = init(this.geometry, locationSettings);
    }

    public SimulationSettings() {
        this.geometry__is_initialized = false;
        this.locationSettings__is_initialized = false;
    }

    private SimulationSettings(NativeObject nativeObject) {
        this.geometry__is_initialized = false;
        this.locationSettings__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
