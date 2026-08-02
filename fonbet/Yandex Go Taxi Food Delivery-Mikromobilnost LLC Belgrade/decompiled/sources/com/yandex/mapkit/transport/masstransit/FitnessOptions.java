package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class FitnessOptions implements Serializable {
    private boolean avoidStairs;
    private boolean avoidSteep;

    public FitnessOptions() {
        this.avoidSteep = false;
        this.avoidStairs = false;
    }

    public boolean getAvoidStairs() {
        return this.avoidStairs;
    }

    public boolean getAvoidSteep() {
        return this.avoidSteep;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.avoidSteep = archive.add(this.avoidSteep);
        this.avoidStairs = archive.add(this.avoidStairs);
    }

    public FitnessOptions(boolean z, boolean z2) {
        this.avoidSteep = z;
        this.avoidStairs = z2;
    }
}
