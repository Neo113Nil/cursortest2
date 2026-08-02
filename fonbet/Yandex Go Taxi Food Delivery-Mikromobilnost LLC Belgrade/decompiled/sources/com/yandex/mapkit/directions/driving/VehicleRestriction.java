package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class VehicleRestriction implements Serializable {
    private Float axleWeightLimit;
    private Float heightLimit;
    private Boolean legal;
    private Float lengthLimit;
    private Float maxWeightLimit;
    private Integer minEcoClass;
    private Float payloadLimit;
    private Boolean trailerNotAllowed;
    private Float weightLimit;
    private Float widthLimit;

    public VehicleRestriction(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Integer num, Boolean bool, Boolean bool2) {
        this.weightLimit = f;
        this.axleWeightLimit = f2;
        this.maxWeightLimit = f3;
        this.heightLimit = f4;
        this.widthLimit = f5;
        this.lengthLimit = f6;
        this.payloadLimit = f7;
        this.minEcoClass = num;
        this.trailerNotAllowed = bool;
        this.legal = bool2;
    }

    public Float getAxleWeightLimit() {
        return this.axleWeightLimit;
    }

    public Float getHeightLimit() {
        return this.heightLimit;
    }

    public Boolean getLegal() {
        return this.legal;
    }

    public Float getLengthLimit() {
        return this.lengthLimit;
    }

    public Float getMaxWeightLimit() {
        return this.maxWeightLimit;
    }

    public Integer getMinEcoClass() {
        return this.minEcoClass;
    }

    public Float getPayloadLimit() {
        return this.payloadLimit;
    }

    public Boolean getTrailerNotAllowed() {
        return this.trailerNotAllowed;
    }

    public Float getWeightLimit() {
        return this.weightLimit;
    }

    public Float getWidthLimit() {
        return this.widthLimit;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.weightLimit = archive.add(this.weightLimit, true);
        this.axleWeightLimit = archive.add(this.axleWeightLimit, true);
        this.maxWeightLimit = archive.add(this.maxWeightLimit, true);
        this.heightLimit = archive.add(this.heightLimit, true);
        this.widthLimit = archive.add(this.widthLimit, true);
        this.lengthLimit = archive.add(this.lengthLimit, true);
        this.payloadLimit = archive.add(this.payloadLimit, true);
        this.minEcoClass = archive.add(this.minEcoClass, true);
        this.trailerNotAllowed = archive.add(this.trailerNotAllowed, true);
        this.legal = archive.add(this.legal, true);
    }

    public VehicleRestriction() {
    }
}
