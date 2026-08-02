package com.yandex.mapkit.sensors;

/* loaded from: classes15.dex */
public interface ExternalLocationReceiver {
    boolean isValid();

    void send(ExternalLocation externalLocation);
}
