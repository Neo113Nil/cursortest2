package io.appmetrica.analytics.locationapi.internal;

import android.location.Location;

/* loaded from: classes8.dex */
public interface LocationProvider {
    Location getSystemLocation();

    Location getUserLocation();
}
