package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.e9e;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
final class LocationManagerCompat$CancellableLocationListener implements LocationListener {
    private e9e mConsumer;
    private final Executor mExecutor;
    private final LocationManager mLocationManager;
    private final Handler mTimeoutHandler = new Handler(Looper.getMainLooper());
    Runnable mTimeoutRunnable;
    private boolean mTriggered;

    public LocationManagerCompat$CancellableLocationListener(LocationManager locationManager, Executor executor, e9e e9eVar) {
        this.mLocationManager = locationManager;
        this.mExecutor = executor;
        this.mConsumer = e9eVar;
    }

    private void cleanup() {
        this.mConsumer = null;
        this.mLocationManager.removeUpdates(this);
        Runnable runnable = this.mTimeoutRunnable;
        if (runnable != null) {
            this.mTimeoutHandler.removeCallbacks(runnable);
            this.mTimeoutRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onLocationChanged$1(e9e e9eVar, Location location) {
        e9eVar.accept(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTimeout$0() {
        this.mTimeoutRunnable = null;
        onLocationChanged((Location) null);
    }

    public void cancel() {
        synchronized (this) {
            try {
                if (this.mTriggered) {
                    return;
                }
                this.mTriggered = true;
                cleanup();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        synchronized (this) {
            try {
                if (this.mTriggered) {
                    return;
                }
                this.mTriggered = true;
                this.mExecutor.execute(new b(0, this.mConsumer, location));
                cleanup();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        onLocationChanged((Location) null);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void startTimeout(long j) {
        synchronized (this) {
            try {
                if (this.mTriggered) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: androidx.core.location.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat$CancellableLocationListener.this.lambda$startTimeout$0();
                    }
                };
                this.mTimeoutRunnable = runnable;
                this.mTimeoutHandler.postDelayed(runnable, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
