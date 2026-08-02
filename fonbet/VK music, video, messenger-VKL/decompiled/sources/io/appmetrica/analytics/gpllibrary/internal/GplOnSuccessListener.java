package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes8.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {
    private final LocationListener a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.a = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.a.onLocationChanged(location);
    }
}
