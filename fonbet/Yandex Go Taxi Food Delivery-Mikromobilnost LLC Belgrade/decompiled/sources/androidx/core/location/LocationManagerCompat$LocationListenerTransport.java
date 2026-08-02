package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import defpackage.u9z;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class LocationManagerCompat$LocationListenerTransport implements LocationListener {
    final Executor mExecutor;
    volatile u9z mKey;

    public LocationManagerCompat$LocationListenerTransport(u9z u9zVar, Executor executor) {
        this.mKey = u9zVar;
        this.mExecutor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFlushComplete$2(int i) {
        u9z u9zVar = this.mKey;
        if (u9zVar == null) {
            return;
        }
        u9zVar.b.onFlushComplete(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLocationChanged$0(Location location) {
        u9z u9zVar = this.mKey;
        if (u9zVar == null) {
            return;
        }
        u9zVar.b.onLocationChanged(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLocationChanged$1(List list) {
        u9z u9zVar = this.mKey;
        if (u9zVar == null) {
            return;
        }
        u9zVar.b.onLocationChanged((List<Location>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onProviderDisabled$5(String str) {
        u9z u9zVar = this.mKey;
        if (u9zVar == null) {
            return;
        }
        u9zVar.b.onProviderDisabled(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onProviderEnabled$4(String str) {
        u9z u9zVar = this.mKey;
        if (u9zVar == null) {
            return;
        }
        u9zVar.b.onProviderEnabled(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStatusChanged$3(String str, int i, Bundle bundle) {
        u9z u9zVar = this.mKey;
        if (u9zVar == null) {
            return;
        }
        u9zVar.b.onStatusChanged(str, i, bundle);
    }

    public u9z getKey() {
        u9z u9zVar = this.mKey;
        u9zVar.getClass();
        return u9zVar;
    }

    @Override // android.location.LocationListener
    public void onFlushComplete(final int i) {
        if (this.mKey == null) {
            return;
        }
        this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.g
            @Override // java.lang.Runnable
            public final void run() {
                LocationManagerCompat$LocationListenerTransport.this.lambda$onFlushComplete$2(i);
            }
        });
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.mKey == null) {
            return;
        }
        this.mExecutor.execute(new b(2, this, location));
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        if (this.mKey == null) {
            return;
        }
        this.mExecutor.execute(new f(this, str, 1));
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        if (this.mKey == null) {
            return;
        }
        this.mExecutor.execute(new f(this, str, 0));
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(final String str, final int i, final Bundle bundle) {
        if (this.mKey == null) {
            return;
        }
        this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.h
            @Override // java.lang.Runnable
            public final void run() {
                LocationManagerCompat$LocationListenerTransport.this.lambda$onStatusChanged$3(str, i, bundle);
            }
        });
    }

    public void unregister() {
        this.mKey = null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(List<Location> list) {
        if (this.mKey == null) {
            return;
        }
        this.mExecutor.execute(new b(1, this, list));
    }
}
