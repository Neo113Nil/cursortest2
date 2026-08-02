package com.yandex.mapkit.places.mrc.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Annotation implements Serializable {
    private List<HistoricalConnection> historicalConnections;
    private boolean historicalConnections__is_initialized;
    private String layer;
    private boolean layer__is_initialized;
    private NativeObject nativeObject;
    private List<SpatialConnection> spatialConnections;
    private boolean spatialConnections__is_initialized;

    public Annotation(String str, List<SpatialConnection> list, List<HistoricalConnection> list2) {
        this.layer__is_initialized = false;
        this.spatialConnections__is_initialized = false;
        this.historicalConnections__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"spatialConnections\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"historicalConnections\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list, list2);
        this.layer = str;
        this.layer__is_initialized = true;
        this.spatialConnections = list;
        this.spatialConnections__is_initialized = true;
        this.historicalConnections = list2;
        this.historicalConnections__is_initialized = true;
    }

    private native List<HistoricalConnection> getHistoricalConnections__Native();

    private native String getLayer__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::mrc::internal::Annotation";
    }

    private native List<SpatialConnection> getSpatialConnections__Native();

    private native NativeObject init(String str, List<SpatialConnection> list, List<HistoricalConnection> list2);

    public synchronized List<HistoricalConnection> getHistoricalConnections() {
        try {
            if (!this.historicalConnections__is_initialized) {
                this.historicalConnections = getHistoricalConnections__Native();
                this.historicalConnections__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.historicalConnections;
    }

    public synchronized String getLayer() {
        try {
            if (!this.layer__is_initialized) {
                this.layer = getLayer__Native();
                this.layer__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.layer;
    }

    public synchronized List<SpatialConnection> getSpatialConnections() {
        try {
            if (!this.spatialConnections__is_initialized) {
                this.spatialConnections = getSpatialConnections__Native();
                this.spatialConnections__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.spatialConnections;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLayer(), true);
            archive.add((List) getSpatialConnections(), false, (ArchivingHandler) new ClassHandler(SpatialConnection.class));
            nzs.m(HistoricalConnection.class, archive, getHistoricalConnections(), false);
            return;
        }
        this.layer = archive.add(this.layer, true);
        this.layer__is_initialized = true;
        this.spatialConnections = nzs.e(SpatialConnection.class, archive, this.spatialConnections, false);
        this.spatialConnections__is_initialized = true;
        List<HistoricalConnection> e = nzs.e(HistoricalConnection.class, archive, this.historicalConnections, false);
        this.historicalConnections = e;
        this.historicalConnections__is_initialized = true;
        this.nativeObject = init(this.layer, this.spatialConnections, e);
    }

    public Annotation() {
        this.layer__is_initialized = false;
        this.spatialConnections__is_initialized = false;
        this.historicalConnections__is_initialized = false;
    }

    private Annotation(NativeObject nativeObject) {
        this.layer__is_initialized = false;
        this.spatialConnections__is_initialized = false;
        this.historicalConnections__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
