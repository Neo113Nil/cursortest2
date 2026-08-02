package com.yandex.mapkit.transport.bicycle.internal;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.transport.bicycle.ConstructionSegment;
import com.yandex.mapkit.transport.bicycle.Flags;
import com.yandex.mapkit.transport.bicycle.Leg;
import com.yandex.mapkit.transport.bicycle.RestrictedEntry;
import com.yandex.mapkit.transport.bicycle.Section;
import com.yandex.mapkit.transport.bicycle.TrafficTypeSegment;
import com.yandex.mapkit.transport.bicycle.WayPoint;
import com.yandex.mapkit.transport.bicycle.Weight;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RouteMetadata implements BaseMetadata, Serializable {
    private List<ConstructionSegment> constructions;
    private boolean constructions__is_initialized;
    private Flags flags;
    private boolean flags__is_initialized;
    private List<Leg> legs;
    private boolean legs__is_initialized;
    private NativeObject nativeObject;
    private List<RestrictedEntry> restrictedEntries;
    private boolean restrictedEntries__is_initialized;
    private String routeId;
    private boolean routeId__is_initialized;
    private List<Section> sections;
    private boolean sections__is_initialized;
    private List<TrafficTypeSegment> trafficTypes;
    private boolean trafficTypes__is_initialized;
    private List<WayPoint> wayPoints;
    private boolean wayPoints__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;

    public RouteMetadata(Weight weight, List<Section> list, List<Leg> list2, Flags flags, List<TrafficTypeSegment> list3, List<ConstructionSegment> list4, List<RestrictedEntry> list5, List<WayPoint> list6, String str) {
        this.weight__is_initialized = false;
        this.sections__is_initialized = false;
        this.legs__is_initialized = false;
        this.flags__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"sections\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"legs\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"trafficTypes\" cannot be null");
            throw null;
        }
        if (list4 == null) {
            ny61.g("Required field \"constructions\" cannot be null");
            throw null;
        }
        if (list5 == null) {
            ny61.g("Required field \"restrictedEntries\" cannot be null");
            throw null;
        }
        if (list6 == null) {
            ny61.g("Required field \"wayPoints\" cannot be null");
            throw null;
        }
        this.nativeObject = init(weight, list, list2, flags, list3, list4, list5, list6, str);
        this.weight = weight;
        this.weight__is_initialized = true;
        this.sections = list;
        this.sections__is_initialized = true;
        this.legs = list2;
        this.legs__is_initialized = true;
        this.flags = flags;
        this.flags__is_initialized = true;
        this.trafficTypes = list3;
        this.trafficTypes__is_initialized = true;
        this.constructions = list4;
        this.constructions__is_initialized = true;
        this.restrictedEntries = list5;
        this.restrictedEntries__is_initialized = true;
        this.wayPoints = list6;
        this.wayPoints__is_initialized = true;
        this.routeId = str;
        this.routeId__is_initialized = true;
    }

    private native List<ConstructionSegment> getConstructions__Native();

    private native Flags getFlags__Native();

    private native List<Leg> getLegs__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::bicycle::internal::RouteMetadata";
    }

    private native List<RestrictedEntry> getRestrictedEntries__Native();

    private native String getRouteId__Native();

    private native List<Section> getSections__Native();

    private native List<TrafficTypeSegment> getTrafficTypes__Native();

    private native List<WayPoint> getWayPoints__Native();

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, List<Section> list, List<Leg> list2, Flags flags, List<TrafficTypeSegment> list3, List<ConstructionSegment> list4, List<RestrictedEntry> list5, List<WayPoint> list6, String str);

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

    public synchronized Flags getFlags() {
        try {
            if (!this.flags__is_initialized) {
                this.flags = getFlags__Native();
                this.flags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.flags;
    }

    public synchronized List<Leg> getLegs() {
        try {
            if (!this.legs__is_initialized) {
                this.legs = getLegs__Native();
                this.legs__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.legs;
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

    public synchronized String getRouteId() {
        try {
            if (!this.routeId__is_initialized) {
                this.routeId = getRouteId__Native();
                this.routeId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routeId;
    }

    public synchronized List<Section> getSections() {
        try {
            if (!this.sections__is_initialized) {
                this.sections = getSections__Native();
                this.sections__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sections;
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

    public synchronized List<WayPoint> getWayPoints() {
        try {
            if (!this.wayPoints__is_initialized) {
                this.wayPoints = getWayPoints__Native();
                this.wayPoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.wayPoints;
    }

    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((List) getSections(), false, (ArchivingHandler) new ClassHandler(Section.class));
            archive.add((List) getLegs(), false, (ArchivingHandler) new ClassHandler(Leg.class));
            archive.add((Archive) getFlags(), true, (Class<Archive>) Flags.class);
            archive.add((List) getTrafficTypes(), false, (ArchivingHandler) new ClassHandler(TrafficTypeSegment.class));
            archive.add((List) getConstructions(), false, (ArchivingHandler) new ClassHandler(ConstructionSegment.class));
            archive.add((List) getRestrictedEntries(), false, (ArchivingHandler) new ClassHandler(RestrictedEntry.class));
            archive.add((List) getWayPoints(), false, (ArchivingHandler) new ClassHandler(WayPoint.class));
            archive.add(getRouteId(), true);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.sections = nzs.e(Section.class, archive, this.sections, false);
        this.sections__is_initialized = true;
        this.legs = nzs.e(Leg.class, archive, this.legs, false);
        this.legs__is_initialized = true;
        this.flags = (Flags) archive.add((Archive) this.flags, true, (Class<Archive>) Flags.class);
        this.flags__is_initialized = true;
        this.trafficTypes = nzs.e(TrafficTypeSegment.class, archive, this.trafficTypes, false);
        this.trafficTypes__is_initialized = true;
        this.constructions = nzs.e(ConstructionSegment.class, archive, this.constructions, false);
        this.constructions__is_initialized = true;
        this.restrictedEntries = nzs.e(RestrictedEntry.class, archive, this.restrictedEntries, false);
        this.restrictedEntries__is_initialized = true;
        this.wayPoints = nzs.e(WayPoint.class, archive, this.wayPoints, false);
        this.wayPoints__is_initialized = true;
        String add = archive.add(this.routeId, true);
        this.routeId = add;
        this.routeId__is_initialized = true;
        this.nativeObject = init(this.weight, this.sections, this.legs, this.flags, this.trafficTypes, this.constructions, this.restrictedEntries, this.wayPoints, add);
    }

    public RouteMetadata() {
        this.weight__is_initialized = false;
        this.sections__is_initialized = false;
        this.legs__is_initialized = false;
        this.flags__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
    }

    private RouteMetadata(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.sections__is_initialized = false;
        this.legs__is_initialized = false;
        this.flags__is_initialized = false;
        this.trafficTypes__is_initialized = false;
        this.constructions__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
