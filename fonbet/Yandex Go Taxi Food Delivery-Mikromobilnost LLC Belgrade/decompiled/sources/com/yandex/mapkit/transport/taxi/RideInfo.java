package com.yandex.mapkit.transport.taxi;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RideInfo implements Serializable {
    private NativeObject nativeObject;
    private List<RideOption> rideOptions;
    private boolean rideOptions__is_initialized;

    public RideInfo(List<RideOption> list) {
        this.rideOptions__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"rideOptions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.rideOptions = list;
        this.rideOptions__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::taxi::RideInfo";
    }

    private native List<RideOption> getRideOptions__Native();

    private native NativeObject init(List<RideOption> list);

    public synchronized List<RideOption> getRideOptions() {
        try {
            if (!this.rideOptions__is_initialized) {
                this.rideOptions = getRideOptions__Native();
                this.rideOptions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.rideOptions;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RideOption.class, archive, getRideOptions(), false);
            return;
        }
        List<RideOption> e = nzs.e(RideOption.class, archive, this.rideOptions, false);
        this.rideOptions = e;
        this.rideOptions__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RideInfo() {
        this.rideOptions__is_initialized = false;
    }

    private RideInfo(NativeObject nativeObject) {
        this.rideOptions__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
