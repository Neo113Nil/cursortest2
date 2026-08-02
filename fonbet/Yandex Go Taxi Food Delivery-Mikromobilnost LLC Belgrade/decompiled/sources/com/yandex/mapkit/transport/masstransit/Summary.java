package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Summary implements Serializable {
    private TravelEstimation estimation;
    private boolean estimation__is_initialized;
    private Flags flags;
    private boolean flags__is_initialized;
    private NativeObject nativeObject;
    private Weight weight;
    private boolean weight__is_initialized;

    public Summary(Weight weight, TravelEstimation travelEstimation, Flags flags) {
        this.weight__is_initialized = false;
        this.estimation__is_initialized = false;
        this.flags__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        this.nativeObject = init(weight, travelEstimation, flags);
        this.weight = weight;
        this.weight__is_initialized = true;
        this.estimation = travelEstimation;
        this.estimation__is_initialized = true;
        this.flags = flags;
        this.flags__is_initialized = true;
    }

    private native TravelEstimation getEstimation__Native();

    private native Flags getFlags__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Summary";
    }

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, TravelEstimation travelEstimation, Flags flags);

    public synchronized TravelEstimation getEstimation() {
        try {
            if (!this.estimation__is_initialized) {
                this.estimation = getEstimation__Native();
                this.estimation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.estimation;
    }

    public synchronized Flags getFlags() {
        try {
            if (!this.flags__is_initialized) {
                this.flags = getFlags__Native();
                this.flags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.flags;
    }

    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getEstimation(), true, (Class<Archive>) TravelEstimation.class);
            archive.add((Archive) getFlags(), true, (Class<Archive>) Flags.class);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.estimation = (TravelEstimation) archive.add((Archive) this.estimation, true, (Class<Archive>) TravelEstimation.class);
        this.estimation__is_initialized = true;
        Flags flags = (Flags) archive.add((Archive) this.flags, true, (Class<Archive>) Flags.class);
        this.flags = flags;
        this.flags__is_initialized = true;
        this.nativeObject = init(this.weight, this.estimation, flags);
    }

    public Summary() {
        this.weight__is_initialized = false;
        this.estimation__is_initialized = false;
        this.flags__is_initialized = false;
    }

    private Summary(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.estimation__is_initialized = false;
        this.flags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
