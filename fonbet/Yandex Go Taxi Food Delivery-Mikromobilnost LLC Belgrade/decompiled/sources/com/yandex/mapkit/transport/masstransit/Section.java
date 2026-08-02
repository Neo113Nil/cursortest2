package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Section implements Serializable {
    private Subpolyline geometry;
    private boolean geometry__is_initialized;
    private SectionMetadata metadata;
    private boolean metadata__is_initialized;
    private NativeObject nativeObject;
    private List<Subpolyline> rideLegs;
    private boolean rideLegs__is_initialized;
    private List<RouteStop> stops;
    private boolean stops__is_initialized;

    public Section(SectionMetadata sectionMetadata, Subpolyline subpolyline, List<RouteStop> list, List<Subpolyline> list2) {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        this.stops__is_initialized = false;
        this.rideLegs__is_initialized = false;
        if (sectionMetadata == null) {
            ny61.g("Required field \"metadata\" cannot be null");
            throw null;
        }
        if (subpolyline == null) {
            ny61.g("Required field \"geometry\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"stops\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"rideLegs\" cannot be null");
            throw null;
        }
        this.nativeObject = init(sectionMetadata, subpolyline, list, list2);
        this.metadata = sectionMetadata;
        this.metadata__is_initialized = true;
        this.geometry = subpolyline;
        this.geometry__is_initialized = true;
        this.stops = list;
        this.stops__is_initialized = true;
        this.rideLegs = list2;
        this.rideLegs__is_initialized = true;
    }

    private native Subpolyline getGeometry__Native();

    private native SectionMetadata getMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Section";
    }

    private native List<Subpolyline> getRideLegs__Native();

    private native List<RouteStop> getStops__Native();

    private native NativeObject init(SectionMetadata sectionMetadata, Subpolyline subpolyline, List<RouteStop> list, List<Subpolyline> list2);

    public synchronized Subpolyline getGeometry() {
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

    public synchronized SectionMetadata getMetadata() {
        try {
            if (!this.metadata__is_initialized) {
                this.metadata = getMetadata__Native();
                this.metadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.metadata;
    }

    public synchronized List<Subpolyline> getRideLegs() {
        try {
            if (!this.rideLegs__is_initialized) {
                this.rideLegs = getRideLegs__Native();
                this.rideLegs__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.rideLegs;
    }

    public synchronized List<RouteStop> getStops() {
        try {
            if (!this.stops__is_initialized) {
                this.stops = getStops__Native();
                this.stops__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stops;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMetadata(), false, (Class<Archive>) SectionMetadata.class);
            archive.add((Archive) getGeometry(), false, (Class<Archive>) Subpolyline.class);
            archive.add((List) getStops(), false, (ArchivingHandler) new ClassHandler(RouteStop.class));
            nzs.m(Subpolyline.class, archive, getRideLegs(), false);
            return;
        }
        this.metadata = (SectionMetadata) archive.add((Archive) this.metadata, false, (Class<Archive>) SectionMetadata.class);
        this.metadata__is_initialized = true;
        this.geometry = (Subpolyline) archive.add((Archive) this.geometry, false, (Class<Archive>) Subpolyline.class);
        this.geometry__is_initialized = true;
        this.stops = nzs.e(RouteStop.class, archive, this.stops, false);
        this.stops__is_initialized = true;
        List<Subpolyline> e = nzs.e(Subpolyline.class, archive, this.rideLegs, false);
        this.rideLegs = e;
        this.rideLegs__is_initialized = true;
        this.nativeObject = init(this.metadata, this.geometry, this.stops, e);
    }

    public Section() {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        this.stops__is_initialized = false;
        this.rideLegs__is_initialized = false;
    }

    private Section(NativeObject nativeObject) {
        this.metadata__is_initialized = false;
        this.geometry__is_initialized = false;
        this.stops__is_initialized = false;
        this.rideLegs__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
