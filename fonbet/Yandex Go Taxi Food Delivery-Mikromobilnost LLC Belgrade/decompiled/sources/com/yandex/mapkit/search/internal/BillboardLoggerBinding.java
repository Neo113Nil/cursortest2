package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.search.BillboardLogger;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class BillboardLoggerBinding implements BillboardLogger {
    private final NativeObject nativeObject;

    public BillboardLoggerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.BillboardLogger
    public native void logAdvertAction(String str, GeoObject geoObject);

    @Override // com.yandex.mapkit.search.BillboardLogger
    public native void logBannerClick(GeoObject geoObject);

    @Override // com.yandex.mapkit.search.BillboardLogger
    public native void logBannerShow(GeoObject geoObject);

    @Override // com.yandex.mapkit.search.BillboardLogger
    public native void logRouteVia(GeoObject geoObject);
}
