package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.Tunnel;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawTunnels implements Serializable {
    private NativeObject nativeObject;
    private List<Tunnel> tunnel;
    private boolean tunnel__is_initialized;

    public RawTunnels(List<Tunnel> list) {
        this.tunnel__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"tunnel\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.tunnel = list;
        this.tunnel__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawTunnels";
    }

    private native List<Tunnel> getTunnel__Native();

    private native NativeObject init(List<Tunnel> list);

    public synchronized List<Tunnel> getTunnel() {
        try {
            if (!this.tunnel__is_initialized) {
                this.tunnel = getTunnel__Native();
                this.tunnel__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tunnel;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Tunnel.class, archive, getTunnel(), false);
            return;
        }
        List<Tunnel> e = nzs.e(Tunnel.class, archive, this.tunnel, false);
        this.tunnel = e;
        this.tunnel__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawTunnels() {
        this.tunnel__is_initialized = false;
    }

    private RawTunnels(NativeObject nativeObject) {
        this.tunnel__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
