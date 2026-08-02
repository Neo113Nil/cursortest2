package com.yandex.mapkit.location.external_providers;

import com.yandex.mapkit.location.LocationStatus;

/* loaded from: classes15.dex */
public interface LocationProviderListener {
    void onLocationStatusUpdated(LocationStatus locationStatus);

    void onLocationUpdated(SourceLocation sourceLocation);
}
