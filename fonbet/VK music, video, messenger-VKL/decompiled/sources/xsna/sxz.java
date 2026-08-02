package xsna;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LocationInfo.kt */
/* loaded from: classes14.dex */
public final class sxz implements LocationListener {
    public final /* synthetic */ AtomicReference<Location> a;
    public final /* synthetic */ CountDownLatch b;

    public sxz(AtomicReference<Location> atomicReference, CountDownLatch countDownLatch) {
        this.a = atomicReference;
        this.b = countDownLatch;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.set(location);
        try {
            this.b.countDown();
        } catch (Throwable unused) {
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
