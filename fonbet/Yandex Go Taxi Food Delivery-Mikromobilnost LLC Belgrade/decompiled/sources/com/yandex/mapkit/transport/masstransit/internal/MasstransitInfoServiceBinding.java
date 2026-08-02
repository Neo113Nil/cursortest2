package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.GeoObjectSession;
import com.yandex.mapkit.transport.masstransit.LineSession;
import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import com.yandex.mapkit.transport.masstransit.MultiThreadSession;
import com.yandex.mapkit.transport.masstransit.ThreadSession;
import com.yandex.mapkit.transport.masstransit.VehicleSession;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class MasstransitInfoServiceBinding implements MasstransitInfoService {
    private final NativeObject nativeObject;

    public MasstransitInfoServiceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native LineSession line(String str, LineSession.LineListener lineListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native MultiThreadSession multiThreads(List<String> list, MultiThreadSession.MultiThreadListener multiThreadListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native LineSession resolveLineUri(String str, LineSession.LineListener lineListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native GeoObjectSession resolveStopUri(String str, GeoObjectSession.GeoObjectListener geoObjectListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native GeoObjectSession schedule(String str, Long l, GeoObjectSession.GeoObjectListener geoObjectListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native GeoObjectSession scheduleByStopUri(String str, Long l, GeoObjectSession.GeoObjectListener geoObjectListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native GeoObjectSession stop(String str, GeoObjectSession.GeoObjectListener geoObjectListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native ThreadSession thread(String str, ThreadSession.ThreadListener threadListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitInfoService
    public native VehicleSession vehicle(String str, VehicleSession.VehicleListener vehicleListener);
}
