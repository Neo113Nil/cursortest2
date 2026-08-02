package com.yandex.alicekit.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import defpackage.s92;

/* loaded from: classes11.dex */
class AndroidGeoLocationProvider$LocationListenerImpl implements LocationListener {
    final /* synthetic */ s92 this$0;

    private AndroidGeoLocationProvider$LocationListenerImpl(s92 s92Var) {
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location != null) {
            location.getElapsedRealtimeNanos();
            GeoPoint.valueOf(location.getLatitude(), location.getLongitude());
            location.getAccuracy();
        }
        throw null;
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
