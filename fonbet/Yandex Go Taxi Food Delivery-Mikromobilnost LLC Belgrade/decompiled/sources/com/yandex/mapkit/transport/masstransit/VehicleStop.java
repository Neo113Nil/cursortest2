package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Time;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class VehicleStop implements Serializable {
    private Estimation estimation;
    private boolean estimation__is_initialized;
    private NativeObject nativeObject;
    private Stop stop;
    private boolean stop__is_initialized;

    public VehicleStop(Stop stop, Estimation estimation) {
        this.stop__is_initialized = false;
        this.estimation__is_initialized = false;
        if (stop == null) {
            ny61.g("Required field \"stop\" cannot be null");
            throw null;
        }
        this.nativeObject = init(stop, estimation);
        this.stop = stop;
        this.stop__is_initialized = true;
        this.estimation = estimation;
        this.estimation__is_initialized = true;
    }

    private native Estimation getEstimation__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::VehicleStop";
    }

    private native Stop getStop__Native();

    private native NativeObject init(Stop stop, Estimation estimation);

    public synchronized Estimation getEstimation() {
        try {
            if (!this.estimation__is_initialized) {
                this.estimation = getEstimation__Native();
                this.estimation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.estimation;
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
            archive.add((Archive) getEstimation(), true, (Class<Archive>) Estimation.class);
            return;
        }
        this.stop = (Stop) archive.add((Archive) this.stop, false, (Class<Archive>) Stop.class);
        this.stop__is_initialized = true;
        Estimation estimation = (Estimation) archive.add((Archive) this.estimation, true, (Class<Archive>) Estimation.class);
        this.estimation = estimation;
        this.estimation__is_initialized = true;
        this.nativeObject = init(this.stop, estimation);
    }

    public static class Estimation implements Serializable {
        private Time arrivalTime;
        private boolean arrivalTime__is_initialized;
        private NativeObject nativeObject;

        public Estimation(Time time) {
            this.arrivalTime__is_initialized = false;
            this.nativeObject = init(time);
            this.arrivalTime = time;
            this.arrivalTime__is_initialized = true;
        }

        private native Time getArrivalTime__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::VehicleStop::Estimation";
        }

        private native NativeObject init(Time time);

        public synchronized Time getArrivalTime() {
            try {
                if (!this.arrivalTime__is_initialized) {
                    this.arrivalTime = getArrivalTime__Native();
                    this.arrivalTime__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.arrivalTime;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add((Archive) getArrivalTime(), true, (Class<Archive>) Time.class);
                return;
            }
            Time time = (Time) archive.add((Archive) this.arrivalTime, true, (Class<Archive>) Time.class);
            this.arrivalTime = time;
            this.arrivalTime__is_initialized = true;
            this.nativeObject = init(time);
        }

        public Estimation() {
            this.arrivalTime__is_initialized = false;
        }

        private Estimation(NativeObject nativeObject) {
            this.arrivalTime__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public VehicleStop() {
        this.stop__is_initialized = false;
        this.estimation__is_initialized = false;
    }

    private VehicleStop(NativeObject nativeObject) {
        this.stop__is_initialized = false;
        this.estimation__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
