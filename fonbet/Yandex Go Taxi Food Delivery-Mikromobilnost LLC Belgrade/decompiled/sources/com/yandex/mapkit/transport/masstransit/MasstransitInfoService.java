package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.GeoObjectSession;
import com.yandex.mapkit.transport.masstransit.LineSession;
import com.yandex.mapkit.transport.masstransit.MultiThreadSession;
import com.yandex.mapkit.transport.masstransit.ThreadSession;
import com.yandex.mapkit.transport.masstransit.VehicleSession;
import java.util.List;

/* loaded from: classes15.dex */
public interface MasstransitInfoService {
    LineSession line(String str, LineSession.LineListener lineListener);

    MultiThreadSession multiThreads(List<String> list, MultiThreadSession.MultiThreadListener multiThreadListener);

    LineSession resolveLineUri(String str, LineSession.LineListener lineListener);

    GeoObjectSession resolveStopUri(String str, GeoObjectSession.GeoObjectListener geoObjectListener);

    GeoObjectSession schedule(String str, Long l, GeoObjectSession.GeoObjectListener geoObjectListener);

    GeoObjectSession scheduleByStopUri(String str, Long l, GeoObjectSession.GeoObjectListener geoObjectListener);

    GeoObjectSession stop(String str, GeoObjectSession.GeoObjectListener geoObjectListener);

    ThreadSession thread(String str, ThreadSession.ThreadListener threadListener);

    VehicleSession vehicle(String str, VehicleSession.VehicleListener vehicleListener);
}
