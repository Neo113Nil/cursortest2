package xsna;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzce;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.vk.location.common.LocationCommon;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LocationFacade.kt */
/* loaded from: classes3.dex */
public final class oxz {
    public static final AtomicReference<Location> a = new AtomicReference<>(null);

    public static boolean a(Context context) {
        LocationCommon.a.getClass();
        return LocationCommon.b(context) && LocationCommon.a(context);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.z b(Context context) {
        return new io.reactivex.rxjava3.internal.operators.observable.z(kzz.b(context).U(new o40(new tcu(8), 24)), new cp0(new byo(7), 29));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.z c(long j, Context context) {
        return new io.reactivex.rxjava3.internal.operators.observable.z(kzz.c(j, context).U(new o40(new tcu(8), 24)), new cp0(new byo(7), 29));
    }

    public static io.reactivex.rxjava3.core.q d(Context context) {
        return kzz.d(context);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 e(Context context) {
        io.reactivex.rxjava3.internal.operators.observable.b0 F = new io.reactivex.rxjava3.internal.operators.observable.s0(new c3d(context, 1)).F(new ez(new azt(false), 26));
        LocationCommon.a.getClass();
        return F.d0(LocationCommon.b).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static boolean f(Context context) {
        LocationCommon.a.getClass();
        return LocationCommon.a(context);
    }

    public static boolean g(Context context) {
        LocationCommon.a.getClass();
        return LocationCommon.b(context);
    }

    public static void h(final Activity activity) {
        LocationRequest i = LocationRequest.i();
        i.k(10000L);
        i.d = 5000L;
        i.n();
        ArrayList arrayList = new ArrayList();
        arrayList.add(i);
        com.google.android.gms.common.api.a<a.d.c> aVar = wyz.a;
        new zzce(activity).checkLocationSettings(new LocationSettingsRequest(arrayList, false, false)).addOnFailureListener(new OnFailureListener() { // from class: xsna.jzz
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Activity activity2 = activity;
                if (exc instanceof ResolvableApiException) {
                    try {
                        ((ResolvableApiException) exc).h(activity2, 128);
                    } catch (IntentSender.SendIntentException unused) {
                    }
                }
            }
        });
    }

    public static void i(Context context) {
        Object obj = null;
        new AlertDialog.Builder(context).setTitle(R.string.location_disabled_title).setMessage(R.string.location_disabled).setPositiveButton(R.string.open_settings, new hj7(1, context, obj)).setNegativeButton(R.string.cancel, new z1z(obj, 1)).show();
    }
}
