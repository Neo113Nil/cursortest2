package com.yandex.mapkit.transport.masstransit;

/* loaded from: classes15.dex */
public interface MasstransitRouteSerializer {
    Route load(byte[] bArr);

    byte[] save(Route route);
}
