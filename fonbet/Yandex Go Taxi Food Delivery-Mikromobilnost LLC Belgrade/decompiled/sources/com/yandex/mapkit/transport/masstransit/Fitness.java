package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.PolylineZlevels;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Fitness implements Serializable {
    private List<Annotation> annotations;
    private boolean annotations__is_initialized;
    private List<ConstructionSegment> constructions;
    private boolean constructions__is_initialized;
    private ElevationData elevationData;
    private boolean elevationData__is_initialized;
    private List<IndoorSegment> indoorSegments;
    private boolean indoorSegments__is_initialized;
    private NativeObject nativeObject;
    private List<RestrictedEntry> restrictedEntries;
    private boolean restrictedEntries__is_initialized;
    private List<TrafficTypeSegment> trafficTypes;
    private boolean trafficTypes__is_initialized;
    private FitnessType type;
    private boolean type__is_initialized;
    private List<PolylinePosition> viaPoints;
    private boolean viaPoints__is_initialized;
    private PolylineZlevels zlevels;
    private boolean zlevels__is_initialized;

    public Fitness(FitnessType fitnessType, List<ConstructionSegment> list, List<RestrictedEntry> list2, List<PolylinePosition> list3, List<Annotation> list4, List<TrafficTypeSegment> list5, ElevationData elevationData, List<IndoorSegment> list6, PolylineZlevels polylineZlevels) {
        this.type__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.viaPoints__is_initialized = false;
        this.annotations__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.elevationData__is_initialized = false;
        this.indoorSegments__is_initialized = false;
        this.zlevels__is_initialized = false;
        if (fitnessType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"constructions\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"restrictedEntries\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"viaPoints\" cannot be null");
            throw null;
        }
        if (list4 == null) {
            ny61.g("Required field \"annotations\" cannot be null");
            throw null;
        }
        if (list5 == null) {
            ny61.g("Required field \"trafficTypes\" cannot be null");
            throw null;
        }
        if (list6 == null) {
            ny61.g("Required field \"indoorSegments\" cannot be null");
            throw null;
        }
        this.nativeObject = init(fitnessType, list, list2, list3, list4, list5, elevationData, list6, polylineZlevels);
        this.type = fitnessType;
        this.type__is_initialized = true;
        this.constructions = list;
        this.constructions__is_initialized = true;
        this.restrictedEntries = list2;
        this.restrictedEntries__is_initialized = true;
        this.viaPoints = list3;
        this.viaPoints__is_initialized = true;
        this.annotations = list4;
        this.annotations__is_initialized = true;
        this.trafficTypes = list5;
        this.trafficTypes__is_initialized = true;
        this.elevationData = elevationData;
        this.elevationData__is_initialized = true;
        this.indoorSegments = list6;
        this.indoorSegments__is_initialized = true;
        this.zlevels = polylineZlevels;
        this.zlevels__is_initialized = true;
    }

    private native List<Annotation> getAnnotations__Native();

    private native List<ConstructionSegment> getConstructions__Native();

    private native ElevationData getElevationData__Native();

    private native List<IndoorSegment> getIndoorSegments__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Fitness";
    }

    private native List<RestrictedEntry> getRestrictedEntries__Native();

    private native List<TrafficTypeSegment> getTrafficTypes__Native();

    private native FitnessType getType__Native();

    private native List<PolylinePosition> getViaPoints__Native();

    private native PolylineZlevels getZlevels__Native();

    private native NativeObject init(FitnessType fitnessType, List<ConstructionSegment> list, List<RestrictedEntry> list2, List<PolylinePosition> list3, List<Annotation> list4, List<TrafficTypeSegment> list5, ElevationData elevationData, List<IndoorSegment> list6, PolylineZlevels polylineZlevels);

    private native NativeObject initPublic(FitnessType fitnessType, List<ConstructionSegment> list, List<RestrictedEntry> list2, List<PolylinePosition> list3, List<Annotation> list4, List<TrafficTypeSegment> list5, ElevationData elevationData, List<IndoorSegment> list6);

    public synchronized List<Annotation> getAnnotations() {
        try {
            if (!this.annotations__is_initialized) {
                this.annotations = getAnnotations__Native();
                this.annotations__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotations;
    }

    public synchronized List<ConstructionSegment> getConstructions() {
        try {
            if (!this.constructions__is_initialized) {
                this.constructions = getConstructions__Native();
                this.constructions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.constructions;
    }

    public synchronized ElevationData getElevationData() {
        try {
            if (!this.elevationData__is_initialized) {
                this.elevationData = getElevationData__Native();
                this.elevationData__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.elevationData;
    }

    public synchronized List<IndoorSegment> getIndoorSegments() {
        try {
            if (!this.indoorSegments__is_initialized) {
                this.indoorSegments = getIndoorSegments__Native();
                this.indoorSegments__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.indoorSegments;
    }

    public synchronized List<RestrictedEntry> getRestrictedEntries() {
        try {
            if (!this.restrictedEntries__is_initialized) {
                this.restrictedEntries = getRestrictedEntries__Native();
                this.restrictedEntries__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.restrictedEntries;
    }

    public synchronized List<TrafficTypeSegment> getTrafficTypes() {
        try {
            if (!this.trafficTypes__is_initialized) {
                this.trafficTypes = getTrafficTypes__Native();
                this.trafficTypes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.trafficTypes;
    }

    public synchronized FitnessType getType() {
        try {
            if (!this.type__is_initialized) {
                this.type = getType__Native();
                this.type__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.type;
    }

    public synchronized List<PolylinePosition> getViaPoints() {
        try {
            if (!this.viaPoints__is_initialized) {
                this.viaPoints = getViaPoints__Native();
                this.viaPoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.viaPoints;
    }

    public synchronized PolylineZlevels getZlevels() {
        try {
            if (!this.zlevels__is_initialized) {
                this.zlevels = getZlevels__Native();
                this.zlevels__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zlevels;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getType(), false, (Class<Archive>) FitnessType.class);
            archive.add((List) getConstructions(), false, (ArchivingHandler) new ClassHandler(ConstructionSegment.class));
            archive.add((List) getRestrictedEntries(), false, (ArchivingHandler) new ClassHandler(RestrictedEntry.class));
            archive.add((List) getViaPoints(), false, (ArchivingHandler) new ClassHandler(PolylinePosition.class));
            archive.add((List) getAnnotations(), false, (ArchivingHandler) new ClassHandler(Annotation.class));
            archive.add((List) getTrafficTypes(), false, (ArchivingHandler) new ClassHandler(TrafficTypeSegment.class));
            archive.add((Archive) getElevationData(), true, (Class<Archive>) ElevationData.class);
            archive.add((List) getIndoorSegments(), false, (ArchivingHandler) new ClassHandler(IndoorSegment.class));
            archive.add((Archive) getZlevels(), true, (Class<Archive>) PolylineZlevels.class);
            return;
        }
        this.type = (FitnessType) archive.add((Archive) this.type, false, (Class<Archive>) FitnessType.class);
        this.type__is_initialized = true;
        this.constructions = nzs.e(ConstructionSegment.class, archive, this.constructions, false);
        this.constructions__is_initialized = true;
        this.restrictedEntries = nzs.e(RestrictedEntry.class, archive, this.restrictedEntries, false);
        this.restrictedEntries__is_initialized = true;
        this.viaPoints = nzs.e(PolylinePosition.class, archive, this.viaPoints, false);
        this.viaPoints__is_initialized = true;
        this.annotations = nzs.e(Annotation.class, archive, this.annotations, false);
        this.annotations__is_initialized = true;
        this.trafficTypes = nzs.e(TrafficTypeSegment.class, archive, this.trafficTypes, false);
        this.trafficTypes__is_initialized = true;
        this.elevationData = (ElevationData) archive.add((Archive) this.elevationData, true, (Class<Archive>) ElevationData.class);
        this.elevationData__is_initialized = true;
        this.indoorSegments = nzs.e(IndoorSegment.class, archive, this.indoorSegments, false);
        this.indoorSegments__is_initialized = true;
        PolylineZlevels polylineZlevels = (PolylineZlevels) archive.add((Archive) this.zlevels, true, (Class<Archive>) PolylineZlevels.class);
        this.zlevels = polylineZlevels;
        this.zlevels__is_initialized = true;
        this.nativeObject = init(this.type, this.constructions, this.restrictedEntries, this.viaPoints, this.annotations, this.trafficTypes, this.elevationData, this.indoorSegments, polylineZlevels);
    }

    public Fitness() {
        this.type__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.viaPoints__is_initialized = false;
        this.annotations__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.elevationData__is_initialized = false;
        this.indoorSegments__is_initialized = false;
        this.zlevels__is_initialized = false;
    }

    private Fitness(NativeObject nativeObject) {
        this.type__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.viaPoints__is_initialized = false;
        this.annotations__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.elevationData__is_initialized = false;
        this.indoorSegments__is_initialized = false;
        this.zlevels__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public Fitness(FitnessType fitnessType, List<ConstructionSegment> list, List<RestrictedEntry> list2, List<PolylinePosition> list3, List<Annotation> list4, List<TrafficTypeSegment> list5, ElevationData elevationData, List<IndoorSegment> list6) {
        this.type__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.viaPoints__is_initialized = false;
        this.annotations__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.elevationData__is_initialized = false;
        this.indoorSegments__is_initialized = false;
        this.zlevels__is_initialized = false;
        if (fitnessType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"constructions\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"restrictedEntries\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"viaPoints\" cannot be null");
            throw null;
        }
        if (list4 == null) {
            ny61.g("Required field \"annotations\" cannot be null");
            throw null;
        }
        if (list5 == null) {
            ny61.g("Required field \"trafficTypes\" cannot be null");
            throw null;
        }
        if (list6 != null) {
            this.nativeObject = initPublic(fitnessType, list, list2, list3, list4, list5, elevationData, list6);
            this.type = fitnessType;
            this.type__is_initialized = true;
            this.constructions = list;
            this.constructions__is_initialized = true;
            this.restrictedEntries = list2;
            this.restrictedEntries__is_initialized = true;
            this.viaPoints = list3;
            this.viaPoints__is_initialized = true;
            this.annotations = list4;
            this.annotations__is_initialized = true;
            this.trafficTypes = list5;
            this.trafficTypes__is_initialized = true;
            this.elevationData = elevationData;
            this.elevationData__is_initialized = true;
            this.indoorSegments = list6;
            this.indoorSegments__is_initialized = true;
            return;
        }
        ny61.g("Required field \"indoorSegments\" cannot be null");
        throw null;
    }
}
