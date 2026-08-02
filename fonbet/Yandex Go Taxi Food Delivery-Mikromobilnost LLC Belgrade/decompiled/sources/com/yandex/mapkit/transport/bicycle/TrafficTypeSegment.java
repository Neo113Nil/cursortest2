package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TrafficTypeSegment implements Serializable {
    private Subpolyline subpolyline;
    private TrafficTypeID trafficType;

    public TrafficTypeSegment(TrafficTypeID trafficTypeID, Subpolyline subpolyline) {
        if (trafficTypeID == null) {
            ny61.g("Required field \"trafficType\" cannot be null");
            throw null;
        }
        if (subpolyline == null) {
            ny61.g("Required field \"subpolyline\" cannot be null");
            throw null;
        }
        this.trafficType = trafficTypeID;
        this.subpolyline = subpolyline;
    }

    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    public TrafficTypeID getTrafficType() {
        return this.trafficType;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.trafficType = (TrafficTypeID) archive.add((Archive) this.trafficType, false, (Class<Archive>) TrafficTypeID.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public TrafficTypeSegment() {
    }
}
