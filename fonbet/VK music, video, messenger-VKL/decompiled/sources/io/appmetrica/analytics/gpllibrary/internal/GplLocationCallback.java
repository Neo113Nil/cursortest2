package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationResult;
import xsna.kxz;

/* loaded from: classes8.dex */
class GplLocationCallback extends kxz {
    private final LocationListener a;

    public GplLocationCallback(LocationListener locationListener) {
        this.a = locationListener;
    }

    @Override // xsna.kxz
    public void onLocationResult(LocationResult locationResult) {
        this.a.onLocationChanged(locationResult.i());
    }
}
