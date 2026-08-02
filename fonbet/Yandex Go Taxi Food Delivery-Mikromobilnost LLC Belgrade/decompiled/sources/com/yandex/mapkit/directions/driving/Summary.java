package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Summary implements Serializable {
    private String drivingArrivalPointId;
    private Flags flags;
    private NonAvoidedFeatures nonAvoidedFeatures;
    private Weight weight;

    public Summary(Weight weight, Flags flags, String str, NonAvoidedFeatures nonAvoidedFeatures) {
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (flags == null) {
            ny61.g("Required field \"flags\" cannot be null");
            throw null;
        }
        if (nonAvoidedFeatures == null) {
            ny61.g("Required field \"nonAvoidedFeatures\" cannot be null");
            throw null;
        }
        this.weight = weight;
        this.flags = flags;
        this.drivingArrivalPointId = str;
        this.nonAvoidedFeatures = nonAvoidedFeatures;
    }

    public String getDrivingArrivalPointId() {
        return this.drivingArrivalPointId;
    }

    public Flags getFlags() {
        return this.flags;
    }

    public NonAvoidedFeatures getNonAvoidedFeatures() {
        return this.nonAvoidedFeatures;
    }

    public Weight getWeight() {
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.flags = (Flags) archive.add((Archive) this.flags, false, (Class<Archive>) Flags.class);
        this.drivingArrivalPointId = archive.add(this.drivingArrivalPointId, true);
        this.nonAvoidedFeatures = (NonAvoidedFeatures) archive.add((Archive) this.nonAvoidedFeatures, false, (Class<Archive>) NonAvoidedFeatures.class);
    }

    public Summary() {
    }

    public Summary(Weight weight, Flags flags, NonAvoidedFeatures nonAvoidedFeatures) {
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (flags == null) {
            ny61.g("Required field \"flags\" cannot be null");
            throw null;
        }
        if (nonAvoidedFeatures != null) {
            this.weight = weight;
            this.flags = flags;
            this.nonAvoidedFeatures = nonAvoidedFeatures;
            return;
        }
        ny61.g("Required field \"nonAvoidedFeatures\" cannot be null");
        throw null;
    }
}
