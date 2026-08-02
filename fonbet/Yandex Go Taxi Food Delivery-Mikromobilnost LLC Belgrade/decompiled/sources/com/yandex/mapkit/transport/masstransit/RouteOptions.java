package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RouteOptions implements Serializable {
    private boolean deliveryScenario;
    private FitnessOptions fitnessOptions;

    public RouteOptions(FitnessOptions fitnessOptions, boolean z) {
        this.deliveryScenario = false;
        if (fitnessOptions == null) {
            ny61.g("Required field \"fitnessOptions\" cannot be null");
            throw null;
        }
        this.fitnessOptions = fitnessOptions;
        this.deliveryScenario = z;
    }

    public boolean getDeliveryScenario() {
        return this.deliveryScenario;
    }

    public FitnessOptions getFitnessOptions() {
        return this.fitnessOptions;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.fitnessOptions = (FitnessOptions) archive.add((Archive) this.fitnessOptions, false, (Class<Archive>) FitnessOptions.class);
        this.deliveryScenario = archive.add(this.deliveryScenario);
    }

    public RouteOptions() {
        this.deliveryScenario = false;
    }

    public RouteOptions(FitnessOptions fitnessOptions) {
        this.deliveryScenario = false;
        if (fitnessOptions != null) {
            this.fitnessOptions = fitnessOptions;
        } else {
            ny61.g("Required field \"fitnessOptions\" cannot be null");
            throw null;
        }
    }
}
