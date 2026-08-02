package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public class Subpolyline implements Serializable {
    private PolylinePosition begin;
    private PolylinePosition end;

    public Subpolyline(PolylinePosition polylinePosition, PolylinePosition polylinePosition2) {
        if (polylinePosition == null) {
            ny61.g("Required field \"begin\" cannot be null");
            throw null;
        }
        if (polylinePosition2 == null) {
            ny61.g("Required field \"end\" cannot be null");
            throw null;
        }
        this.begin = polylinePosition;
        this.end = polylinePosition2;
    }

    public PolylinePosition getBegin() {
        return this.begin;
    }

    public PolylinePosition getEnd() {
        return this.end;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.begin = (PolylinePosition) archive.add((Archive) this.begin, false, (Class<Archive>) PolylinePosition.class);
        this.end = (PolylinePosition) archive.add((Archive) this.end, false, (Class<Archive>) PolylinePosition.class);
    }

    public Subpolyline() {
    }
}
