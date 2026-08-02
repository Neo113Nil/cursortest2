package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TollPost implements Serializable {
    private Long id;
    private Boolean nonTransactional;
    private PolylinePosition position;
    private Double time_with_traffic;

    public TollPost(PolylinePosition polylinePosition, Long l, Double d, Boolean bool) {
        if (polylinePosition == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.position = polylinePosition;
        this.id = l;
        this.time_with_traffic = d;
        this.nonTransactional = bool;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getNonTransactional() {
        return this.nonTransactional;
    }

    public PolylinePosition getPosition() {
        return this.position;
    }

    public Double getTime_with_traffic() {
        return this.time_with_traffic;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.id = archive.add(this.id, true);
        this.time_with_traffic = archive.add(this.time_with_traffic, true);
        this.nonTransactional = archive.add(this.nonTransactional, true);
    }

    public TollPost() {
    }
}
