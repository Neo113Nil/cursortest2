package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.mapkit.directions.driving.Summary;
import com.yandex.mapkit.directions.driving.Weight;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class AlternativeBalloon implements Serializable {
    private NativeObject nativeObject;
    private Weight relativeWeight;
    private boolean relativeWeight__is_initialized;
    private Summary summary;
    private boolean summary__is_initialized;

    public AlternativeBalloon(Summary summary, Weight weight) {
        this.summary__is_initialized = false;
        this.relativeWeight__is_initialized = false;
        if (summary == null) {
            ny61.g("Required field \"summary\" cannot be null");
            throw null;
        }
        if (weight == null) {
            ny61.g("Required field \"relativeWeight\" cannot be null");
            throw null;
        }
        this.nativeObject = init(summary, weight);
        this.summary = summary;
        this.summary__is_initialized = true;
        this.relativeWeight = weight;
        this.relativeWeight__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::automotive::layer::AlternativeBalloon";
    }

    private native Weight getRelativeWeight__Native();

    private native Summary getSummary__Native();

    private native NativeObject init(Summary summary, Weight weight);

    public synchronized Weight getRelativeWeight() {
        try {
            if (!this.relativeWeight__is_initialized) {
                this.relativeWeight = getRelativeWeight__Native();
                this.relativeWeight__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.relativeWeight;
    }

    public synchronized Summary getSummary() {
        try {
            if (!this.summary__is_initialized) {
                this.summary = getSummary__Native();
                this.summary__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.summary;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getSummary(), false, (Class<Archive>) Summary.class);
            archive.add((Archive) getRelativeWeight(), false, (Class<Archive>) Weight.class);
            return;
        }
        this.summary = (Summary) archive.add((Archive) this.summary, false, (Class<Archive>) Summary.class);
        this.summary__is_initialized = true;
        Weight weight = (Weight) archive.add((Archive) this.relativeWeight, false, (Class<Archive>) Weight.class);
        this.relativeWeight = weight;
        this.relativeWeight__is_initialized = true;
        this.nativeObject = init(this.summary, weight);
    }

    public AlternativeBalloon() {
        this.summary__is_initialized = false;
        this.relativeWeight__is_initialized = false;
    }

    private AlternativeBalloon(NativeObject nativeObject) {
        this.summary__is_initialized = false;
        this.relativeWeight__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
