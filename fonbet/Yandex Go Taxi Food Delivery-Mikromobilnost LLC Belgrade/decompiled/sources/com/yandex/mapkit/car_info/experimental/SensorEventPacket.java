package com.yandex.mapkit.car_info.experimental;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SensorEventPacket implements Serializable {
    private NativeObject nativeObject;
    private long sendTimestampMicroseconds;
    private boolean sendTimestampMicroseconds__is_initialized;
    private List<SensorEvent> sensorEvents;
    private boolean sensorEvents__is_initialized;

    public SensorEventPacket(long j, List<SensorEvent> list) {
        this.sendTimestampMicroseconds__is_initialized = false;
        this.sensorEvents__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"sensorEvents\" cannot be null");
            throw null;
        }
        this.nativeObject = init(j, list);
        this.sendTimestampMicroseconds = j;
        this.sendTimestampMicroseconds__is_initialized = true;
        this.sensorEvents = list;
        this.sensorEvents__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::car_info::experimental::SensorEventPacket";
    }

    private native long getSendTimestampMicroseconds__Native();

    private native List<SensorEvent> getSensorEvents__Native();

    private native NativeObject init(long j, List<SensorEvent> list);

    public synchronized long getSendTimestampMicroseconds() {
        try {
            if (!this.sendTimestampMicroseconds__is_initialized) {
                this.sendTimestampMicroseconds = getSendTimestampMicroseconds__Native();
                this.sendTimestampMicroseconds__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sendTimestampMicroseconds;
    }

    public synchronized List<SensorEvent> getSensorEvents() {
        try {
            if (!this.sensorEvents__is_initialized) {
                this.sensorEvents = getSensorEvents__Native();
                this.sensorEvents__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sensorEvents;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getSendTimestampMicroseconds());
            nzs.m(SensorEvent.class, archive, getSensorEvents(), false);
            return;
        }
        this.sendTimestampMicroseconds = archive.add(this.sendTimestampMicroseconds);
        this.sendTimestampMicroseconds__is_initialized = true;
        List<SensorEvent> e = nzs.e(SensorEvent.class, archive, this.sensorEvents, false);
        this.sensorEvents = e;
        this.sensorEvents__is_initialized = true;
        this.nativeObject = init(this.sendTimestampMicroseconds, e);
    }

    public SensorEventPacket() {
        this.sendTimestampMicroseconds__is_initialized = false;
        this.sensorEvents__is_initialized = false;
    }

    private SensorEventPacket(NativeObject nativeObject) {
        this.sendTimestampMicroseconds__is_initialized = false;
        this.sensorEvents__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
