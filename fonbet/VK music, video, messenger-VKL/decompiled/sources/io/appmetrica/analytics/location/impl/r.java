package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import xsna.i5s;
import xsna.s3q0;
import xsna.tuz;
import xsna.vii0;

/* loaded from: classes8.dex */
public final class r extends u implements LocationReceiver {
    public final Looper e;
    public final long f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.e = looper;
        this.f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final s3q0 a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.d, rVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rVar.c, rVar.e);
        return s3q0.a;
    }

    public static final s3q0 b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.c);
        return s3q0.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.b.hasNecessaryPermissions(this.a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", i5s.a(new StringBuilder("request location updates for "), this.d, " provider"), "location manager", new tuz(this, 29));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", "stop location updates for passive provider", "location manager", new vii0(this, 12));
    }
}
