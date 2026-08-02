package com.yandex.mapkit.navigation.transport;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class FitnessManoeuvre implements Serializable {
    private FitnessAction action;
    private Landmark landmark;

    public FitnessManoeuvre(FitnessAction fitnessAction, Landmark landmark) {
        this.action = fitnessAction;
        this.landmark = landmark;
    }

    public FitnessAction getAction() {
        return this.action;
    }

    public Landmark getLandmark() {
        return this.landmark;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.action = (FitnessAction) archive.add((Archive) this.action, true, (Class<Archive>) FitnessAction.class);
        this.landmark = (Landmark) archive.add((Archive) this.landmark, true, (Class<Archive>) Landmark.class);
    }

    public FitnessManoeuvre() {
    }
}
