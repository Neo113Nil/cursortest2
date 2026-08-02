package androidx.core.location;

import android.location.GpsStatus;
import android.location.LocationManager;
import defpackage.bxt;
import defpackage.d6z;
import defpackage.vlt;
import defpackage.wlt;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
class LocationManagerCompat$GpsStatusTransport implements GpsStatus.Listener {
    final vlt mCallback;
    volatile Executor mExecutor;
    private final LocationManager mLocationManager;

    public LocationManagerCompat$GpsStatusTransport(LocationManager locationManager, vlt vltVar) {
        d6z.m("invalid null callback", vltVar != null);
        this.mLocationManager = locationManager;
        this.mCallback = vltVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGpsStatusChanged$0(Executor executor) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGpsStatusChanged$1(Executor executor) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGpsStatusChanged$2(Executor executor, int i) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGpsStatusChanged$3(Executor executor, wlt wltVar) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.getClass();
    }

    @Override // android.location.GpsStatus.Listener
    public void onGpsStatusChanged(int i) {
        GpsStatus gpsStatus;
        final Executor executor = this.mExecutor;
        if (executor == null) {
            return;
        }
        final int i2 = 1;
        if (i == 1) {
            final int i3 = 0;
            executor.execute(new Runnable(this) { // from class: androidx.core.location.e
                public final /* synthetic */ LocationManagerCompat$GpsStatusTransport b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    Executor executor2 = executor;
                    LocationManagerCompat$GpsStatusTransport locationManagerCompat$GpsStatusTransport = this.b;
                    switch (i4) {
                        case 0:
                            locationManagerCompat$GpsStatusTransport.lambda$onGpsStatusChanged$0(executor2);
                            break;
                        default:
                            locationManagerCompat$GpsStatusTransport.lambda$onGpsStatusChanged$1(executor2);
                            break;
                    }
                }
            });
            return;
        }
        if (i == 2) {
            executor.execute(new Runnable(this) { // from class: androidx.core.location.e
                public final /* synthetic */ LocationManagerCompat$GpsStatusTransport b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i2;
                    Executor executor2 = executor;
                    LocationManagerCompat$GpsStatusTransport locationManagerCompat$GpsStatusTransport = this.b;
                    switch (i4) {
                        case 0:
                            locationManagerCompat$GpsStatusTransport.lambda$onGpsStatusChanged$0(executor2);
                            break;
                        default:
                            locationManagerCompat$GpsStatusTransport.lambda$onGpsStatusChanged$1(executor2);
                            break;
                    }
                }
            });
            return;
        }
        if (i != 3) {
            if (i == 4 && (gpsStatus = this.mLocationManager.getGpsStatus(null)) != null) {
                executor.execute(new c(this, executor, new bxt(gpsStatus), i2));
                return;
            }
            return;
        }
        GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus(null);
        if (gpsStatus2 != null) {
            executor.execute(new d(this, executor, gpsStatus2.getTimeToFirstFix(), i2));
        }
    }

    public void register(Executor executor) {
        d6z.y(null, this.mExecutor == null);
        this.mExecutor = executor;
    }

    public void unregister() {
        this.mExecutor = null;
    }
}
