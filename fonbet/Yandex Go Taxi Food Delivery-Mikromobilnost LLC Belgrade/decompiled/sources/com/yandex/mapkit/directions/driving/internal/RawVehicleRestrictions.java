package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.ManoeuvreVehicleRestriction;
import com.yandex.mapkit.directions.driving.RoadVehicleRestriction;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawVehicleRestrictions implements Serializable {
    private List<ManoeuvreVehicleRestriction> manoeuvreRestrictions;
    private boolean manoeuvreRestrictions__is_initialized;
    private NativeObject nativeObject;
    private List<RoadVehicleRestriction> roadRestrictions;
    private boolean roadRestrictions__is_initialized;

    public RawVehicleRestrictions(List<RoadVehicleRestriction> list, List<ManoeuvreVehicleRestriction> list2) {
        this.roadRestrictions__is_initialized = false;
        this.manoeuvreRestrictions__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"roadRestrictions\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"manoeuvreRestrictions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.roadRestrictions = list;
        this.roadRestrictions__is_initialized = true;
        this.manoeuvreRestrictions = list2;
        this.manoeuvreRestrictions__is_initialized = true;
    }

    private native List<ManoeuvreVehicleRestriction> getManoeuvreRestrictions__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawVehicleRestrictions";
    }

    private native List<RoadVehicleRestriction> getRoadRestrictions__Native();

    private native NativeObject init(List<RoadVehicleRestriction> list, List<ManoeuvreVehicleRestriction> list2);

    public synchronized List<ManoeuvreVehicleRestriction> getManoeuvreRestrictions() {
        try {
            if (!this.manoeuvreRestrictions__is_initialized) {
                this.manoeuvreRestrictions = getManoeuvreRestrictions__Native();
                this.manoeuvreRestrictions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.manoeuvreRestrictions;
    }

    public synchronized List<RoadVehicleRestriction> getRoadRestrictions() {
        try {
            if (!this.roadRestrictions__is_initialized) {
                this.roadRestrictions = getRoadRestrictions__Native();
                this.roadRestrictions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.roadRestrictions;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getRoadRestrictions(), false, (ArchivingHandler) new ClassHandler(RoadVehicleRestriction.class));
            nzs.m(ManoeuvreVehicleRestriction.class, archive, getManoeuvreRestrictions(), false);
            return;
        }
        this.roadRestrictions = nzs.e(RoadVehicleRestriction.class, archive, this.roadRestrictions, false);
        this.roadRestrictions__is_initialized = true;
        List<ManoeuvreVehicleRestriction> e = nzs.e(ManoeuvreVehicleRestriction.class, archive, this.manoeuvreRestrictions, false);
        this.manoeuvreRestrictions = e;
        this.manoeuvreRestrictions__is_initialized = true;
        this.nativeObject = init(this.roadRestrictions, e);
    }

    public RawVehicleRestrictions() {
        this.roadRestrictions__is_initialized = false;
        this.manoeuvreRestrictions__is_initialized = false;
    }

    private RawVehicleRestrictions(NativeObject nativeObject) {
        this.roadRestrictions__is_initialized = false;
        this.manoeuvreRestrictions__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
