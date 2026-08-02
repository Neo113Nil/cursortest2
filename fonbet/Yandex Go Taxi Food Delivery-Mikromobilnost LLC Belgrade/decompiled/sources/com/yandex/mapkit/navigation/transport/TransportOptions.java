package com.yandex.mapkit.navigation.transport;

import com.yandex.mapkit.transport.masstransit.TransitOptions;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public class TransportOptions implements Serializable {
    private Integer routesCount;
    private TransitOptions transitOptions;

    public TransportOptions(TransitOptions transitOptions, Integer num) {
        if (transitOptions == null) {
            ny61.g("Required field \"transitOptions\" cannot be null");
            throw null;
        }
        this.transitOptions = transitOptions;
        this.routesCount = num;
    }

    public Integer getRoutesCount() {
        return this.routesCount;
    }

    public TransitOptions getTransitOptions() {
        return this.transitOptions;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.transitOptions = (TransitOptions) archive.add((Archive) this.transitOptions, false, (Class<Archive>) TransitOptions.class);
        this.routesCount = archive.add(this.routesCount, true);
    }

    public TransportOptions() {
    }
}
