package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import com.vk.reefton.literx.observable.ObservableCreate;

/* compiled from: ReefLocationObservableOnSubscribe.kt */
/* loaded from: classes5.dex */
public final class vnf0 {
    public static final bpn0 c = new bpn0(new com.vk.movika.tools.controls.seekbar.n(29));
    public final Context a;
    public final ynf0 b;

    public vnf0(Context context, ynf0 ynf0Var) {
        this.a = context;
        this.b = ynf0Var;
    }

    @SuppressLint({"MissingPermission"})
    public final void a(ObservableCreate.CreateEmitter createEmitter) {
        LocationManager locationManager = (LocationManager) this.a.getSystemService("location");
        if (locationManager == null) {
            createEmitter.a(new Exception("Can't get location manager."));
            return;
        }
        wnf0 wnf0Var = new wnf0(createEmitter);
        ynf0 ynf0Var = this.b;
        if (!locationManager.isProviderEnabled(ynf0Var.a)) {
            createEmitter.b((Location) c.getValue());
        } else {
            locationManager.requestLocationUpdates(ynf0Var.a, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wnf0Var, Looper.getMainLooper());
            createEmitter.c(new j4(21, locationManager, wnf0Var));
        }
    }

    /* compiled from: ReefLocationObservableOnSubscribe.kt */
    public static class a implements LocationListener {
        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }
    }
}
