package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawTrafficLights implements Serializable {
    private NativeObject nativeObject;
    private List<RawTrafficLight> trafficLights;
    private boolean trafficLights__is_initialized;

    public RawTrafficLights(List<RawTrafficLight> list) {
        this.trafficLights__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"trafficLights\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.trafficLights = list;
        this.trafficLights__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawTrafficLights";
    }

    private native List<RawTrafficLight> getTrafficLights__Native();

    private native NativeObject init(List<RawTrafficLight> list);

    public synchronized List<RawTrafficLight> getTrafficLights() {
        try {
            if (!this.trafficLights__is_initialized) {
                this.trafficLights = getTrafficLights__Native();
                this.trafficLights__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.trafficLights;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawTrafficLight.class, archive, getTrafficLights(), false);
            return;
        }
        List<RawTrafficLight> e = nzs.e(RawTrafficLight.class, archive, this.trafficLights, false);
        this.trafficLights = e;
        this.trafficLights__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawTrafficLights() {
        this.trafficLights__is_initialized = false;
    }

    private RawTrafficLights(NativeObject nativeObject) {
        this.trafficLights__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
