package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.directions.driving.Annotation;
import com.yandex.mapkit.directions.driving.Weight;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.IntegerHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class DrivingRawSectionMetadata implements BaseMetadata, Serializable {
    private Annotation annotation;
    private RawAnnotationSchemes annotationSchemes;
    private boolean annotationSchemes__is_initialized;
    private boolean annotation__is_initialized;
    private RawCheckpoints checkpoints;
    private boolean checkpoints__is_initialized;
    private RawDirectionSigns directionSigns;
    private boolean directionSigns__is_initialized;
    private RawFerries ferries;
    private boolean ferries__is_initialized;
    private RawFordCrossings fordCrossings;
    private boolean fordCrossings__is_initialized;
    private RawHdGeometry hdGeometry;
    private boolean hdGeometry__is_initialized;
    private RawHighways highways;
    private boolean highways__is_initialized;
    private RawJams jams;
    private boolean jams__is_initialized;
    private RawLaneSigns laneSigns;
    private boolean laneSigns__is_initialized;
    private int legIndex;
    private boolean legIndex__is_initialized;
    private NativeObject nativeObject;
    private RawPedestrianCrossings pedestrianCrossings;
    private boolean pedestrianCrossings__is_initialized;
    private RawRailwayCrossings railwayCrossings;
    private boolean railwayCrossings__is_initialized;
    private RawRestrictedEntries restrictedEntries;
    private boolean restrictedEntries__is_initialized;
    private RawRestrictedTurns restrictedTurns;
    private boolean restrictedTurns__is_initialized;
    private RawRuggedRoads ruggedRoads;
    private boolean ruggedRoads__is_initialized;
    private RawSpeedBumps speedBumps;
    private boolean speedBumps__is_initialized;
    private RawSpeedLimits speedLimits;
    private boolean speedLimits__is_initialized;
    private RawStandingSegments standingSegments;
    private boolean standingSegments__is_initialized;
    private RawTollRoads tollRoads;
    private boolean tollRoads__is_initialized;
    private RawTollPosts toll_posts;
    private boolean toll_posts__is_initialized;
    private RawTrafficLights trafficLights;
    private boolean trafficLights__is_initialized;
    private RawTunnels tunnels;
    private boolean tunnels__is_initialized;
    private RawVehicleRestrictions vehicleRestrictions;
    private boolean vehicleRestrictions__is_initialized;
    private RawVerticesZlevel verticesZlevel;
    private boolean verticesZlevel__is_initialized;
    private List<Integer> viaPointPositions;
    private boolean viaPointPositions__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;
    private RawZoneCrossings zoneCrossings;
    private boolean zoneCrossings__is_initialized;

    public DrivingRawSectionMetadata(int i, Weight weight, Annotation annotation, List<Integer> list, RawSpeedLimits rawSpeedLimits, RawAnnotationSchemes rawAnnotationSchemes, RawLaneSigns rawLaneSigns, RawDirectionSigns rawDirectionSigns, RawRestrictedEntries rawRestrictedEntries, RawTrafficLights rawTrafficLights, RawJams rawJams, RawTollRoads rawTollRoads, RawRuggedRoads rawRuggedRoads, RawRestrictedTurns rawRestrictedTurns, RawStandingSegments rawStandingSegments, RawVehicleRestrictions rawVehicleRestrictions, RawFordCrossings rawFordCrossings, RawFerries rawFerries, RawRailwayCrossings rawRailwayCrossings, RawPedestrianCrossings rawPedestrianCrossings, RawSpeedBumps rawSpeedBumps, RawCheckpoints rawCheckpoints, RawTollPosts rawTollPosts, RawVerticesZlevel rawVerticesZlevel, RawHdGeometry rawHdGeometry, RawTunnels rawTunnels, RawHighways rawHighways, RawZoneCrossings rawZoneCrossings) {
        this.legIndex__is_initialized = false;
        this.weight__is_initialized = false;
        this.annotation__is_initialized = false;
        this.viaPointPositions__is_initialized = false;
        this.speedLimits__is_initialized = false;
        this.annotationSchemes__is_initialized = false;
        this.laneSigns__is_initialized = false;
        this.directionSigns__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.trafficLights__is_initialized = false;
        this.jams__is_initialized = false;
        this.tollRoads__is_initialized = false;
        this.ruggedRoads__is_initialized = false;
        this.restrictedTurns__is_initialized = false;
        this.standingSegments__is_initialized = false;
        this.vehicleRestrictions__is_initialized = false;
        this.fordCrossings__is_initialized = false;
        this.ferries__is_initialized = false;
        this.railwayCrossings__is_initialized = false;
        this.pedestrianCrossings__is_initialized = false;
        this.speedBumps__is_initialized = false;
        this.checkpoints__is_initialized = false;
        this.toll_posts__is_initialized = false;
        this.verticesZlevel__is_initialized = false;
        this.hdGeometry__is_initialized = false;
        this.tunnels__is_initialized = false;
        this.highways__is_initialized = false;
        this.zoneCrossings__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (annotation == null) {
            ny61.g("Required field \"annotation\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"viaPointPositions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, weight, annotation, list, rawSpeedLimits, rawAnnotationSchemes, rawLaneSigns, rawDirectionSigns, rawRestrictedEntries, rawTrafficLights, rawJams, rawTollRoads, rawRuggedRoads, rawRestrictedTurns, rawStandingSegments, rawVehicleRestrictions, rawFordCrossings, rawFerries, rawRailwayCrossings, rawPedestrianCrossings, rawSpeedBumps, rawCheckpoints, rawTollPosts, rawVerticesZlevel, rawHdGeometry, rawTunnels, rawHighways, rawZoneCrossings);
        this.legIndex = i;
        this.legIndex__is_initialized = true;
        this.weight = weight;
        this.weight__is_initialized = true;
        this.annotation = annotation;
        this.annotation__is_initialized = true;
        this.viaPointPositions = list;
        this.viaPointPositions__is_initialized = true;
        this.speedLimits = rawSpeedLimits;
        this.speedLimits__is_initialized = true;
        this.annotationSchemes = rawAnnotationSchemes;
        this.annotationSchemes__is_initialized = true;
        this.laneSigns = rawLaneSigns;
        this.laneSigns__is_initialized = true;
        this.directionSigns = rawDirectionSigns;
        this.directionSigns__is_initialized = true;
        this.restrictedEntries = rawRestrictedEntries;
        this.restrictedEntries__is_initialized = true;
        this.trafficLights = rawTrafficLights;
        this.trafficLights__is_initialized = true;
        this.jams = rawJams;
        this.jams__is_initialized = true;
        this.tollRoads = rawTollRoads;
        this.tollRoads__is_initialized = true;
        this.ruggedRoads = rawRuggedRoads;
        this.ruggedRoads__is_initialized = true;
        this.restrictedTurns = rawRestrictedTurns;
        this.restrictedTurns__is_initialized = true;
        this.standingSegments = rawStandingSegments;
        this.standingSegments__is_initialized = true;
        this.vehicleRestrictions = rawVehicleRestrictions;
        this.vehicleRestrictions__is_initialized = true;
        this.fordCrossings = rawFordCrossings;
        this.fordCrossings__is_initialized = true;
        this.ferries = rawFerries;
        this.ferries__is_initialized = true;
        this.railwayCrossings = rawRailwayCrossings;
        this.railwayCrossings__is_initialized = true;
        this.pedestrianCrossings = rawPedestrianCrossings;
        this.pedestrianCrossings__is_initialized = true;
        this.speedBumps = rawSpeedBumps;
        this.speedBumps__is_initialized = true;
        this.checkpoints = rawCheckpoints;
        this.checkpoints__is_initialized = true;
        this.toll_posts = rawTollPosts;
        this.toll_posts__is_initialized = true;
        this.verticesZlevel = rawVerticesZlevel;
        this.verticesZlevel__is_initialized = true;
        this.hdGeometry = rawHdGeometry;
        this.hdGeometry__is_initialized = true;
        this.tunnels = rawTunnels;
        this.tunnels__is_initialized = true;
        this.highways = rawHighways;
        this.highways__is_initialized = true;
        this.zoneCrossings = rawZoneCrossings;
        this.zoneCrossings__is_initialized = true;
    }

    private native RawAnnotationSchemes getAnnotationSchemes__Native();

    private native Annotation getAnnotation__Native();

    private native RawCheckpoints getCheckpoints__Native();

    private native RawDirectionSigns getDirectionSigns__Native();

    private native RawFerries getFerries__Native();

    private native RawFordCrossings getFordCrossings__Native();

    private native RawHdGeometry getHdGeometry__Native();

    private native RawHighways getHighways__Native();

    private native RawJams getJams__Native();

    private native RawLaneSigns getLaneSigns__Native();

    private native int getLegIndex__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawSectionMetadata";
    }

    private native RawPedestrianCrossings getPedestrianCrossings__Native();

    private native RawRailwayCrossings getRailwayCrossings__Native();

    private native RawRestrictedEntries getRestrictedEntries__Native();

    private native RawRestrictedTurns getRestrictedTurns__Native();

    private native RawRuggedRoads getRuggedRoads__Native();

    private native RawSpeedBumps getSpeedBumps__Native();

    private native RawSpeedLimits getSpeedLimits__Native();

    private native RawStandingSegments getStandingSegments__Native();

    private native RawTollRoads getTollRoads__Native();

    private native RawTollPosts getToll_posts__Native();

    private native RawTrafficLights getTrafficLights__Native();

    private native RawTunnels getTunnels__Native();

    private native RawVehicleRestrictions getVehicleRestrictions__Native();

    private native RawVerticesZlevel getVerticesZlevel__Native();

    private native List<Integer> getViaPointPositions__Native();

    private native Weight getWeight__Native();

    private native RawZoneCrossings getZoneCrossings__Native();

    private native NativeObject init(int i, Weight weight, Annotation annotation, List<Integer> list, RawSpeedLimits rawSpeedLimits, RawAnnotationSchemes rawAnnotationSchemes, RawLaneSigns rawLaneSigns, RawDirectionSigns rawDirectionSigns, RawRestrictedEntries rawRestrictedEntries, RawTrafficLights rawTrafficLights, RawJams rawJams, RawTollRoads rawTollRoads, RawRuggedRoads rawRuggedRoads, RawRestrictedTurns rawRestrictedTurns, RawStandingSegments rawStandingSegments, RawVehicleRestrictions rawVehicleRestrictions, RawFordCrossings rawFordCrossings, RawFerries rawFerries, RawRailwayCrossings rawRailwayCrossings, RawPedestrianCrossings rawPedestrianCrossings, RawSpeedBumps rawSpeedBumps, RawCheckpoints rawCheckpoints, RawTollPosts rawTollPosts, RawVerticesZlevel rawVerticesZlevel, RawHdGeometry rawHdGeometry, RawTunnels rawTunnels, RawHighways rawHighways, RawZoneCrossings rawZoneCrossings);

    public synchronized Annotation getAnnotation() {
        try {
            if (!this.annotation__is_initialized) {
                this.annotation = getAnnotation__Native();
                this.annotation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotation;
    }

    public synchronized RawAnnotationSchemes getAnnotationSchemes() {
        try {
            if (!this.annotationSchemes__is_initialized) {
                this.annotationSchemes = getAnnotationSchemes__Native();
                this.annotationSchemes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotationSchemes;
    }

    public synchronized RawCheckpoints getCheckpoints() {
        try {
            if (!this.checkpoints__is_initialized) {
                this.checkpoints = getCheckpoints__Native();
                this.checkpoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.checkpoints;
    }

    public synchronized RawDirectionSigns getDirectionSigns() {
        try {
            if (!this.directionSigns__is_initialized) {
                this.directionSigns = getDirectionSigns__Native();
                this.directionSigns__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.directionSigns;
    }

    public synchronized RawFerries getFerries() {
        try {
            if (!this.ferries__is_initialized) {
                this.ferries = getFerries__Native();
                this.ferries__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ferries;
    }

    public synchronized RawFordCrossings getFordCrossings() {
        try {
            if (!this.fordCrossings__is_initialized) {
                this.fordCrossings = getFordCrossings__Native();
                this.fordCrossings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.fordCrossings;
    }

    public synchronized RawHdGeometry getHdGeometry() {
        try {
            if (!this.hdGeometry__is_initialized) {
                this.hdGeometry = getHdGeometry__Native();
                this.hdGeometry__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hdGeometry;
    }

    public synchronized RawHighways getHighways() {
        try {
            if (!this.highways__is_initialized) {
                this.highways = getHighways__Native();
                this.highways__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.highways;
    }

    public synchronized RawJams getJams() {
        try {
            if (!this.jams__is_initialized) {
                this.jams = getJams__Native();
                this.jams__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.jams;
    }

    public synchronized RawLaneSigns getLaneSigns() {
        try {
            if (!this.laneSigns__is_initialized) {
                this.laneSigns = getLaneSigns__Native();
                this.laneSigns__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.laneSigns;
    }

    public synchronized int getLegIndex() {
        try {
            if (!this.legIndex__is_initialized) {
                this.legIndex = getLegIndex__Native();
                this.legIndex__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.legIndex;
    }

    public synchronized RawPedestrianCrossings getPedestrianCrossings() {
        try {
            if (!this.pedestrianCrossings__is_initialized) {
                this.pedestrianCrossings = getPedestrianCrossings__Native();
                this.pedestrianCrossings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.pedestrianCrossings;
    }

    public synchronized RawRailwayCrossings getRailwayCrossings() {
        try {
            if (!this.railwayCrossings__is_initialized) {
                this.railwayCrossings = getRailwayCrossings__Native();
                this.railwayCrossings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.railwayCrossings;
    }

    public synchronized RawRestrictedEntries getRestrictedEntries() {
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

    public synchronized RawRestrictedTurns getRestrictedTurns() {
        try {
            if (!this.restrictedTurns__is_initialized) {
                this.restrictedTurns = getRestrictedTurns__Native();
                this.restrictedTurns__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.restrictedTurns;
    }

    public synchronized RawRuggedRoads getRuggedRoads() {
        try {
            if (!this.ruggedRoads__is_initialized) {
                this.ruggedRoads = getRuggedRoads__Native();
                this.ruggedRoads__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ruggedRoads;
    }

    public synchronized RawSpeedBumps getSpeedBumps() {
        try {
            if (!this.speedBumps__is_initialized) {
                this.speedBumps = getSpeedBumps__Native();
                this.speedBumps__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.speedBumps;
    }

    public synchronized RawSpeedLimits getSpeedLimits() {
        try {
            if (!this.speedLimits__is_initialized) {
                this.speedLimits = getSpeedLimits__Native();
                this.speedLimits__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.speedLimits;
    }

    public synchronized RawStandingSegments getStandingSegments() {
        try {
            if (!this.standingSegments__is_initialized) {
                this.standingSegments = getStandingSegments__Native();
                this.standingSegments__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.standingSegments;
    }

    public synchronized RawTollRoads getTollRoads() {
        try {
            if (!this.tollRoads__is_initialized) {
                this.tollRoads = getTollRoads__Native();
                this.tollRoads__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tollRoads;
    }

    public synchronized RawTollPosts getToll_posts() {
        try {
            if (!this.toll_posts__is_initialized) {
                this.toll_posts = getToll_posts__Native();
                this.toll_posts__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.toll_posts;
    }

    public synchronized RawTrafficLights getTrafficLights() {
        try {
            if (!this.trafficLights__is_initialized) {
                this.trafficLights = getTrafficLights__Native();
                this.trafficLights__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.trafficLights;
    }

    public synchronized RawTunnels getTunnels() {
        try {
            if (!this.tunnels__is_initialized) {
                this.tunnels = getTunnels__Native();
                this.tunnels__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tunnels;
    }

    public synchronized RawVehicleRestrictions getVehicleRestrictions() {
        try {
            if (!this.vehicleRestrictions__is_initialized) {
                this.vehicleRestrictions = getVehicleRestrictions__Native();
                this.vehicleRestrictions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.vehicleRestrictions;
    }

    public synchronized RawVerticesZlevel getVerticesZlevel() {
        try {
            if (!this.verticesZlevel__is_initialized) {
                this.verticesZlevel = getVerticesZlevel__Native();
                this.verticesZlevel__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.verticesZlevel;
    }

    public synchronized List<Integer> getViaPointPositions() {
        try {
            if (!this.viaPointPositions__is_initialized) {
                this.viaPointPositions = getViaPointPositions__Native();
                this.viaPointPositions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.viaPointPositions;
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

    public synchronized RawZoneCrossings getZoneCrossings() {
        try {
            if (!this.zoneCrossings__is_initialized) {
                this.zoneCrossings = getZoneCrossings__Native();
                this.zoneCrossings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zoneCrossings;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLegIndex());
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getAnnotation(), false, (Class<Archive>) Annotation.class);
            archive.add((List) getViaPointPositions(), false, (ArchivingHandler) new IntegerHandler());
            archive.add((Archive) getSpeedLimits(), true, (Class<Archive>) RawSpeedLimits.class);
            archive.add((Archive) getAnnotationSchemes(), true, (Class<Archive>) RawAnnotationSchemes.class);
            archive.add((Archive) getLaneSigns(), true, (Class<Archive>) RawLaneSigns.class);
            archive.add((Archive) getDirectionSigns(), true, (Class<Archive>) RawDirectionSigns.class);
            archive.add((Archive) getRestrictedEntries(), true, (Class<Archive>) RawRestrictedEntries.class);
            archive.add((Archive) getTrafficLights(), true, (Class<Archive>) RawTrafficLights.class);
            archive.add((Archive) getJams(), true, (Class<Archive>) RawJams.class);
            archive.add((Archive) getTollRoads(), true, (Class<Archive>) RawTollRoads.class);
            archive.add((Archive) getRuggedRoads(), true, (Class<Archive>) RawRuggedRoads.class);
            archive.add((Archive) getRestrictedTurns(), true, (Class<Archive>) RawRestrictedTurns.class);
            archive.add((Archive) getStandingSegments(), true, (Class<Archive>) RawStandingSegments.class);
            archive.add((Archive) getVehicleRestrictions(), true, (Class<Archive>) RawVehicleRestrictions.class);
            archive.add((Archive) getFordCrossings(), true, (Class<Archive>) RawFordCrossings.class);
            archive.add((Archive) getFerries(), true, (Class<Archive>) RawFerries.class);
            archive.add((Archive) getRailwayCrossings(), true, (Class<Archive>) RawRailwayCrossings.class);
            archive.add((Archive) getPedestrianCrossings(), true, (Class<Archive>) RawPedestrianCrossings.class);
            archive.add((Archive) getSpeedBumps(), true, (Class<Archive>) RawSpeedBumps.class);
            archive.add((Archive) getCheckpoints(), true, (Class<Archive>) RawCheckpoints.class);
            archive.add((Archive) getToll_posts(), true, (Class<Archive>) RawTollPosts.class);
            archive.add((Archive) getVerticesZlevel(), true, (Class<Archive>) RawVerticesZlevel.class);
            archive.add((Archive) getHdGeometry(), true, (Class<Archive>) RawHdGeometry.class);
            archive.add((Archive) getTunnels(), true, (Class<Archive>) RawTunnels.class);
            archive.add((Archive) getHighways(), true, (Class<Archive>) RawHighways.class);
            archive.add((Archive) getZoneCrossings(), true, (Class<Archive>) RawZoneCrossings.class);
            return;
        }
        this.legIndex = archive.add(this.legIndex);
        this.legIndex__is_initialized = true;
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.annotation = (Annotation) archive.add((Archive) this.annotation, false, (Class<Archive>) Annotation.class);
        this.annotation__is_initialized = true;
        this.viaPointPositions = archive.add((List) this.viaPointPositions, false, (ArchivingHandler) new IntegerHandler());
        this.viaPointPositions__is_initialized = true;
        this.speedLimits = (RawSpeedLimits) archive.add((Archive) this.speedLimits, true, (Class<Archive>) RawSpeedLimits.class);
        this.speedLimits__is_initialized = true;
        this.annotationSchemes = (RawAnnotationSchemes) archive.add((Archive) this.annotationSchemes, true, (Class<Archive>) RawAnnotationSchemes.class);
        this.annotationSchemes__is_initialized = true;
        this.laneSigns = (RawLaneSigns) archive.add((Archive) this.laneSigns, true, (Class<Archive>) RawLaneSigns.class);
        this.laneSigns__is_initialized = true;
        this.directionSigns = (RawDirectionSigns) archive.add((Archive) this.directionSigns, true, (Class<Archive>) RawDirectionSigns.class);
        this.directionSigns__is_initialized = true;
        this.restrictedEntries = (RawRestrictedEntries) archive.add((Archive) this.restrictedEntries, true, (Class<Archive>) RawRestrictedEntries.class);
        this.restrictedEntries__is_initialized = true;
        this.trafficLights = (RawTrafficLights) archive.add((Archive) this.trafficLights, true, (Class<Archive>) RawTrafficLights.class);
        this.trafficLights__is_initialized = true;
        this.jams = (RawJams) archive.add((Archive) this.jams, true, (Class<Archive>) RawJams.class);
        this.jams__is_initialized = true;
        this.tollRoads = (RawTollRoads) archive.add((Archive) this.tollRoads, true, (Class<Archive>) RawTollRoads.class);
        this.tollRoads__is_initialized = true;
        this.ruggedRoads = (RawRuggedRoads) archive.add((Archive) this.ruggedRoads, true, (Class<Archive>) RawRuggedRoads.class);
        this.ruggedRoads__is_initialized = true;
        this.restrictedTurns = (RawRestrictedTurns) archive.add((Archive) this.restrictedTurns, true, (Class<Archive>) RawRestrictedTurns.class);
        this.restrictedTurns__is_initialized = true;
        this.standingSegments = (RawStandingSegments) archive.add((Archive) this.standingSegments, true, (Class<Archive>) RawStandingSegments.class);
        this.standingSegments__is_initialized = true;
        this.vehicleRestrictions = (RawVehicleRestrictions) archive.add((Archive) this.vehicleRestrictions, true, (Class<Archive>) RawVehicleRestrictions.class);
        this.vehicleRestrictions__is_initialized = true;
        this.fordCrossings = (RawFordCrossings) archive.add((Archive) this.fordCrossings, true, (Class<Archive>) RawFordCrossings.class);
        this.fordCrossings__is_initialized = true;
        this.ferries = (RawFerries) archive.add((Archive) this.ferries, true, (Class<Archive>) RawFerries.class);
        this.ferries__is_initialized = true;
        this.railwayCrossings = (RawRailwayCrossings) archive.add((Archive) this.railwayCrossings, true, (Class<Archive>) RawRailwayCrossings.class);
        this.railwayCrossings__is_initialized = true;
        this.pedestrianCrossings = (RawPedestrianCrossings) archive.add((Archive) this.pedestrianCrossings, true, (Class<Archive>) RawPedestrianCrossings.class);
        this.pedestrianCrossings__is_initialized = true;
        this.speedBumps = (RawSpeedBumps) archive.add((Archive) this.speedBumps, true, (Class<Archive>) RawSpeedBumps.class);
        this.speedBumps__is_initialized = true;
        this.checkpoints = (RawCheckpoints) archive.add((Archive) this.checkpoints, true, (Class<Archive>) RawCheckpoints.class);
        this.checkpoints__is_initialized = true;
        this.toll_posts = (RawTollPosts) archive.add((Archive) this.toll_posts, true, (Class<Archive>) RawTollPosts.class);
        this.toll_posts__is_initialized = true;
        this.verticesZlevel = (RawVerticesZlevel) archive.add((Archive) this.verticesZlevel, true, (Class<Archive>) RawVerticesZlevel.class);
        this.verticesZlevel__is_initialized = true;
        this.hdGeometry = (RawHdGeometry) archive.add((Archive) this.hdGeometry, true, (Class<Archive>) RawHdGeometry.class);
        this.hdGeometry__is_initialized = true;
        this.tunnels = (RawTunnels) archive.add((Archive) this.tunnels, true, (Class<Archive>) RawTunnels.class);
        this.tunnels__is_initialized = true;
        this.highways = (RawHighways) archive.add((Archive) this.highways, true, (Class<Archive>) RawHighways.class);
        this.highways__is_initialized = true;
        RawZoneCrossings rawZoneCrossings = (RawZoneCrossings) archive.add((Archive) this.zoneCrossings, true, (Class<Archive>) RawZoneCrossings.class);
        this.zoneCrossings = rawZoneCrossings;
        this.zoneCrossings__is_initialized = true;
        this.nativeObject = init(this.legIndex, this.weight, this.annotation, this.viaPointPositions, this.speedLimits, this.annotationSchemes, this.laneSigns, this.directionSigns, this.restrictedEntries, this.trafficLights, this.jams, this.tollRoads, this.ruggedRoads, this.restrictedTurns, this.standingSegments, this.vehicleRestrictions, this.fordCrossings, this.ferries, this.railwayCrossings, this.pedestrianCrossings, this.speedBumps, this.checkpoints, this.toll_posts, this.verticesZlevel, this.hdGeometry, this.tunnels, this.highways, rawZoneCrossings);
    }

    public DrivingRawSectionMetadata() {
        this.legIndex__is_initialized = false;
        this.weight__is_initialized = false;
        this.annotation__is_initialized = false;
        this.viaPointPositions__is_initialized = false;
        this.speedLimits__is_initialized = false;
        this.annotationSchemes__is_initialized = false;
        this.laneSigns__is_initialized = false;
        this.directionSigns__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.trafficLights__is_initialized = false;
        this.jams__is_initialized = false;
        this.tollRoads__is_initialized = false;
        this.ruggedRoads__is_initialized = false;
        this.restrictedTurns__is_initialized = false;
        this.standingSegments__is_initialized = false;
        this.vehicleRestrictions__is_initialized = false;
        this.fordCrossings__is_initialized = false;
        this.ferries__is_initialized = false;
        this.railwayCrossings__is_initialized = false;
        this.pedestrianCrossings__is_initialized = false;
        this.speedBumps__is_initialized = false;
        this.checkpoints__is_initialized = false;
        this.toll_posts__is_initialized = false;
        this.verticesZlevel__is_initialized = false;
        this.hdGeometry__is_initialized = false;
        this.tunnels__is_initialized = false;
        this.highways__is_initialized = false;
        this.zoneCrossings__is_initialized = false;
    }

    private DrivingRawSectionMetadata(NativeObject nativeObject) {
        this.legIndex__is_initialized = false;
        this.weight__is_initialized = false;
        this.annotation__is_initialized = false;
        this.viaPointPositions__is_initialized = false;
        this.speedLimits__is_initialized = false;
        this.annotationSchemes__is_initialized = false;
        this.laneSigns__is_initialized = false;
        this.directionSigns__is_initialized = false;
        this.restrictedEntries__is_initialized = false;
        this.trafficLights__is_initialized = false;
        this.jams__is_initialized = false;
        this.tollRoads__is_initialized = false;
        this.ruggedRoads__is_initialized = false;
        this.restrictedTurns__is_initialized = false;
        this.standingSegments__is_initialized = false;
        this.vehicleRestrictions__is_initialized = false;
        this.fordCrossings__is_initialized = false;
        this.ferries__is_initialized = false;
        this.railwayCrossings__is_initialized = false;
        this.pedestrianCrossings__is_initialized = false;
        this.speedBumps__is_initialized = false;
        this.checkpoints__is_initialized = false;
        this.toll_posts__is_initialized = false;
        this.verticesZlevel__is_initialized = false;
        this.hdGeometry__is_initialized = false;
        this.tunnels__is_initialized = false;
        this.highways__is_initialized = false;
        this.zoneCrossings__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
