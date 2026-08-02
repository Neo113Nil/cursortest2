package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class MasstransitRouteSerializerBinding implements MasstransitRouteSerializer {
    private final NativeObject nativeObject;

    public MasstransitRouteSerializerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer
    public native Route load(byte[] bArr);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer
    public native byte[] save(Route route);
}
