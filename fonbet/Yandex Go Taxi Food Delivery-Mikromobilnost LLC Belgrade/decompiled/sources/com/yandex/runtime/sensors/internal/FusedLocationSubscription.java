package com.yandex.runtime.sensors.internal;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import defpackage.bdz;
import defpackage.eqs;
import defpackage.k991;
import defpackage.qke;
import defpackage.vst;
import defpackage.wst;
import defpackage.xst;
import defpackage.yst;

/* loaded from: classes11.dex */
public class FusedLocationSubscription extends LocationCallback implements wst, xst {
    private static final String LOG_TAG = "com.yandex.runtime.sensors.internal.FusedLocationSubscription";
    private eqs fusedLocationProviderClient = null;
    private yst googleApiClient;
    private LocationRequest locationRequest;
    NativeLocationSubscriptionWrapper nativeSubscription;

    public FusedLocationSubscription(float f, int i, NativeObject nativeObject) {
        this.nativeSubscription = new NativeLocationSubscriptionWrapper(nativeObject);
        vst vstVar = new vst(Runtime.getApplicationContext());
        vstVar.a(bdz.a);
        vstVar.n.add(this);
        vstVar.o.add(this);
        this.googleApiClient = vstVar.b();
        this.locationRequest = LocationRequest.create().setSmallestDisplacement(f).setInterval(i).setPriority(100);
        this.googleApiClient.b();
    }

    public static final boolean fusedLocationProviderAvailable() {
        return a.d.d(Runtime.getApplicationContext(), b.a) == 0 && getPlayServicesVersion() >= 11600000;
    }

    private static long getPlayServicesVersion() {
        try {
            return Runtime.getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    @Override // defpackage.t4e
    public void onConnected(Bundle bundle) {
        if (qke.h(Runtime.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Log.e(LOG_TAG, "No ACCESS_FINE_LOCATION permission, can't start FusedProvider");
            return;
        }
        k991 a = bdz.a(Runtime.getApplicationContext());
        this.fusedLocationProviderClient = a;
        a.g(this.locationRequest, this, Looper.getMainLooper());
    }

    @Override // defpackage.yx60
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.nativeSubscription.onStatusReceived(false);
    }

    @Override // defpackage.t4e
    public void onConnectionSuspended(int i) {
        this.nativeSubscription.onStatusReceived(false);
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.nativeSubscription.onLocationReceived(locationResult.getLastLocation());
    }

    public void stop() {
        this.nativeSubscription.onStatusReceived(false);
        eqs eqsVar = this.fusedLocationProviderClient;
        if (eqsVar != null) {
            ((k991) eqsVar).f(this);
        }
        this.googleApiClient.c();
    }
}
