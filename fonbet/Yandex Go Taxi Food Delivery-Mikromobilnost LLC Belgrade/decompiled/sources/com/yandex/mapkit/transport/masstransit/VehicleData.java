package com.yandex.mapkit.transport.masstransit;

/* loaded from: classes6.dex */
public interface VehicleData {
    float getCurrentAzimuth();

    String getId();

    Line getLine();

    String getThreadId();

    boolean isValid();
}
