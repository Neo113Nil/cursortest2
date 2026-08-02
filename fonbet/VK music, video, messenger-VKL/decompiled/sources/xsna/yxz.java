package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;

/* compiled from: LocationManagerObservableOnSubscribe.kt */
/* loaded from: classes.dex */
public final class yxz implements io.reactivex.rxjava3.core.s<Location> {
    public final Context b;
    public final cyz c;

    /* compiled from: LocationManagerObservableOnSubscribe.kt */
    public static final class b extends a {
        public final /* synthetic */ io.reactivex.rxjava3.core.r<Location> a;
        public final /* synthetic */ Exception b;

        public b(io.reactivex.rxjava3.core.r<Location> rVar, Exception exc) {
            this.a = rVar;
            this.b = exc;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            io.reactivex.rxjava3.core.r<Location> rVar = this.a;
            if (rVar.h()) {
                return;
            }
            rVar.onNext(location);
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            io.reactivex.rxjava3.core.r<Location> rVar = this.a;
            if (rVar.h()) {
                return;
            }
            rVar.onError(new Exception("Provider disabled.", this.b));
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            io.reactivex.rxjava3.core.r<Location> rVar = this.a;
            if (rVar.h() || i != 0) {
                return;
            }
            rVar.onError(new Exception("Provider out of service.", this.b));
        }
    }

    public yxz(Context context, cyz cyzVar) {
        this.b = context;
        this.c = cyzVar;
    }

    @Override // io.reactivex.rxjava3.core.s
    @SuppressLint({"MissingPermission"})
    public final void subscribe(io.reactivex.rxjava3.core.r<Location> rVar) {
        Exception exc = new Exception();
        final LocationManager locationManager = (LocationManager) this.b.getSystemService("location");
        if (locationManager == null) {
            if (rVar.h()) {
                return;
            }
            rVar.onError(new Exception("Can't get location manager.", exc));
            return;
        }
        final b bVar = new b(rVar, exc);
        cyz cyzVar = this.c;
        if (locationManager.isProviderEnabled(cyzVar.a)) {
            locationManager.requestLocationUpdates(cyzVar.a, cyzVar.b, cyzVar.c, bVar, Looper.getMainLooper());
            rVar.i(new io.reactivex.rxjava3.disposables.a(new io.reactivex.rxjava3.functions.a() { // from class: xsna.xxz
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    try {
                        locationManager.removeUpdates(bVar);
                    } catch (Exception e) {
                        L.i(e);
                    }
                }
            }));
        } else {
            LocationCommon.a.getClass();
            rVar.onNext(LocationCommon.b);
        }
    }

    /* compiled from: LocationManagerObservableOnSubscribe.kt */
    public static class a implements LocationListener {
        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }
    }
}
