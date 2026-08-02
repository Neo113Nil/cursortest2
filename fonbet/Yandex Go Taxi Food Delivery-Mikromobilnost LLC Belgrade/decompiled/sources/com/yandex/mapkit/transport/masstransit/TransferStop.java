package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class TransferStop implements Serializable {
    private NativeObject nativeObject;
    private RouteStop routeStop;
    private boolean routeStop__is_initialized;
    private List<Transport> transports;
    private boolean transports__is_initialized;

    public TransferStop(RouteStop routeStop, List<Transport> list) {
        this.routeStop__is_initialized = false;
        this.transports__is_initialized = false;
        if (routeStop == null) {
            ny61.g("Required field \"routeStop\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"transports\" cannot be null");
            throw null;
        }
        this.nativeObject = init(routeStop, list);
        this.routeStop = routeStop;
        this.routeStop__is_initialized = true;
        this.transports = list;
        this.transports__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::TransferStop";
    }

    private native RouteStop getRouteStop__Native();

    private native List<Transport> getTransports__Native();

    private native NativeObject init(RouteStop routeStop, List<Transport> list);

    public synchronized RouteStop getRouteStop() {
        try {
            if (!this.routeStop__is_initialized) {
                this.routeStop = getRouteStop__Native();
                this.routeStop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routeStop;
    }

    public synchronized List<Transport> getTransports() {
        try {
            if (!this.transports__is_initialized) {
                this.transports = getTransports__Native();
                this.transports__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transports;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getRouteStop(), false, (Class<Archive>) RouteStop.class);
            nzs.m(Transport.class, archive, getTransports(), false);
            return;
        }
        this.routeStop = (RouteStop) archive.add((Archive) this.routeStop, false, (Class<Archive>) RouteStop.class);
        this.routeStop__is_initialized = true;
        List<Transport> e = nzs.e(Transport.class, archive, this.transports, false);
        this.transports = e;
        this.transports__is_initialized = true;
        this.nativeObject = init(this.routeStop, e);
    }

    public TransferStop() {
        this.routeStop__is_initialized = false;
        this.transports__is_initialized = false;
    }

    private TransferStop(NativeObject nativeObject) {
        this.routeStop__is_initialized = false;
        this.transports__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
