package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class StopScheduleMetadata implements BaseMetadata, Serializable {
    private Alert alert;
    private boolean alert__is_initialized;
    private List<LineAtStop> linesAtStop;
    private boolean linesAtStop__is_initialized;
    private NativeObject nativeObject;
    private Stop stop;
    private boolean stop__is_initialized;

    public StopScheduleMetadata(Stop stop, List<LineAtStop> list, Alert alert) {
        this.stop__is_initialized = false;
        this.linesAtStop__is_initialized = false;
        this.alert__is_initialized = false;
        if (stop == null) {
            ny61.g("Required field \"stop\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"linesAtStop\" cannot be null");
            throw null;
        }
        this.nativeObject = init(stop, list, alert);
        this.stop = stop;
        this.stop__is_initialized = true;
        this.linesAtStop = list;
        this.linesAtStop__is_initialized = true;
        this.alert = alert;
        this.alert__is_initialized = true;
    }

    private native Alert getAlert__Native();

    private native List<LineAtStop> getLinesAtStop__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::StopScheduleMetadata";
    }

    private native Stop getStop__Native();

    private native NativeObject init(Stop stop, List<LineAtStop> list, Alert alert);

    public synchronized Alert getAlert() {
        try {
            if (!this.alert__is_initialized) {
                this.alert = getAlert__Native();
                this.alert__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.alert;
    }

    public synchronized List<LineAtStop> getLinesAtStop() {
        try {
            if (!this.linesAtStop__is_initialized) {
                this.linesAtStop = getLinesAtStop__Native();
                this.linesAtStop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.linesAtStop;
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
            archive.add((List) getLinesAtStop(), false, (ArchivingHandler) new ClassHandler(LineAtStop.class));
            archive.add((Archive) getAlert(), true, (Class<Archive>) Alert.class);
            return;
        }
        this.stop = (Stop) archive.add((Archive) this.stop, false, (Class<Archive>) Stop.class);
        this.stop__is_initialized = true;
        this.linesAtStop = nzs.e(LineAtStop.class, archive, this.linesAtStop, false);
        this.linesAtStop__is_initialized = true;
        Alert alert = (Alert) archive.add((Archive) this.alert, true, (Class<Archive>) Alert.class);
        this.alert = alert;
        this.alert__is_initialized = true;
        this.nativeObject = init(this.stop, this.linesAtStop, alert);
    }

    public StopScheduleMetadata() {
        this.stop__is_initialized = false;
        this.linesAtStop__is_initialized = false;
        this.alert__is_initialized = false;
    }

    private StopScheduleMetadata(NativeObject nativeObject) {
        this.stop__is_initialized = false;
        this.linesAtStop__is_initialized = false;
        this.alert__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
