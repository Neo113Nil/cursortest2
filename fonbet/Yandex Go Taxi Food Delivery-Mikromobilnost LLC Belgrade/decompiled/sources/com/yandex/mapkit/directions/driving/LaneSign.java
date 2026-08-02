package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class LaneSign implements Serializable {
    private Boolean annotated;
    private boolean annotated__is_initialized;
    private List<Lane> lanes;
    private boolean lanes__is_initialized;
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;

    public LaneSign(PolylinePosition polylinePosition, Boolean bool, List<Lane> list) {
        this.position__is_initialized = false;
        this.annotated__is_initialized = false;
        this.lanes__is_initialized = false;
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"lanes\" cannot be null");
            throw null;
        }
        this.nativeObject = init(polylinePosition, bool, list);
        this.position = polylinePosition;
        this.position__is_initialized = true;
        this.annotated = bool;
        this.annotated__is_initialized = true;
        this.lanes = list;
        this.lanes__is_initialized = true;
    }

    private native Boolean getAnnotated__Native();

    private native List<Lane> getLanes__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::LaneSign";
    }

    private native PolylinePosition getPosition__Native();

    private native NativeObject init(PolylinePosition polylinePosition, Boolean bool, List<Lane> list);

    public synchronized Boolean getAnnotated() {
        try {
            if (!this.annotated__is_initialized) {
                this.annotated = getAnnotated__Native();
                this.annotated__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotated;
    }

    public synchronized List<Lane> getLanes() {
        try {
            if (!this.lanes__is_initialized) {
                this.lanes = getLanes__Native();
                this.lanes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.lanes;
    }

    public synchronized PolylinePosition getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            archive.add(getAnnotated(), true);
            nzs.m(Lane.class, archive, getLanes(), false);
            return;
        }
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position__is_initialized = true;
        this.annotated = archive.add(this.annotated, true);
        this.annotated__is_initialized = true;
        List<Lane> e = nzs.e(Lane.class, archive, this.lanes, false);
        this.lanes = e;
        this.lanes__is_initialized = true;
        this.nativeObject = init(this.position, this.annotated, e);
    }

    public LaneSign() {
        this.position__is_initialized = false;
        this.annotated__is_initialized = false;
        this.lanes__is_initialized = false;
    }

    private LaneSign(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.annotated__is_initialized = false;
        this.lanes__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
