package com.yandex.runtime.sensors.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes8.dex */
public class GnssMeasurementsEvent implements Serializable {
    private GnssClock clock;
    private boolean clock__is_initialized;
    private List<GnssMeasurement> measurements;
    private boolean measurements__is_initialized;
    private NativeObject nativeObject;

    public GnssMeasurementsEvent(GnssClock gnssClock, List<GnssMeasurement> list) {
        this.clock__is_initialized = false;
        this.measurements__is_initialized = false;
        if (gnssClock == null) {
            ny61.g("Required field \"clock\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"measurements\" cannot be null");
            throw null;
        }
        this.nativeObject = init(gnssClock, list);
        this.clock = gnssClock;
        this.clock__is_initialized = true;
        this.measurements = list;
        this.measurements__is_initialized = true;
    }

    private native GnssClock getClock__Native();

    private native List<GnssMeasurement> getMeasurements__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::sensors::internal::GnssMeasurementsEvent";
    }

    private native NativeObject init(GnssClock gnssClock, List<GnssMeasurement> list);

    public synchronized GnssClock getClock() {
        try {
            if (!this.clock__is_initialized) {
                this.clock = getClock__Native();
                this.clock__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.clock;
    }

    public synchronized List<GnssMeasurement> getMeasurements() {
        try {
            if (!this.measurements__is_initialized) {
                this.measurements = getMeasurements__Native();
                this.measurements__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.measurements;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getClock(), false, (Class<Archive>) GnssClock.class);
            nzs.m(GnssMeasurement.class, archive, getMeasurements(), false);
            return;
        }
        this.clock = (GnssClock) archive.add((Archive) this.clock, false, (Class<Archive>) GnssClock.class);
        this.clock__is_initialized = true;
        List<GnssMeasurement> e = nzs.e(GnssMeasurement.class, archive, this.measurements, false);
        this.measurements = e;
        this.measurements__is_initialized = true;
        this.nativeObject = init(this.clock, e);
    }

    public GnssMeasurementsEvent() {
        this.clock__is_initialized = false;
        this.measurements__is_initialized = false;
    }

    private GnssMeasurementsEvent(NativeObject nativeObject) {
        this.clock__is_initialized = false;
        this.measurements__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
