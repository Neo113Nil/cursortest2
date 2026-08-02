package xsna;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.LocationRequest;
import com.vk.location.common.LocationCommon;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.izz;

/* compiled from: LocationUtils.kt */
/* loaded from: classes.dex */
public final class kzz {
    public static boolean a(Context context) {
        LocationCommon.a.getClass();
        return LocationCommon.b(context) && LocationCommon.a(context);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 b(Context context) {
        io.reactivex.rxjava3.core.q H;
        LocationRequest i = LocationRequest.i();
        i.n();
        i.l();
        cyz cyzVar = new cyz();
        cyzVar.a = "network";
        cyzVar.d = 1L;
        cyzVar.c = 10.0f;
        cyzVar.b = 1000L;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
            H = izz.a.a(context, i);
        } else {
            io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new yxz(context, cyzVar));
            long j = cyzVar.d;
            H = (j <= 0 || j >= Long.MAX_VALUE) ? io.reactivex.rxjava3.core.q.H(new Exception("Unexpected numUpdates")) : qVar.t0(j);
        }
        return H.r0(io.reactivex.rxjava3.schedulers.a.b()).F(new qs2(new gzn(12), 22)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static io.reactivex.rxjava3.internal.operators.observable.o1 c(long j, Context context) {
        return b(context).z0(j, TimeUnit.MILLISECONDS, e(context)).c0(e(context));
    }

    public static io.reactivex.rxjava3.core.q d(Context context) {
        if (a(context)) {
            return c(5000L, context);
        }
        LocationCommon.a.getClass();
        return io.reactivex.rxjava3.core.q.T(LocationCommon.b);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 e(Context context) {
        io.reactivex.rxjava3.internal.operators.observable.b0 F = new io.reactivex.rxjava3.internal.operators.observable.s0(new c3d(context, 1)).F(new ez(new azt(9), 26));
        LocationCommon.a.getClass();
        return F.d0(LocationCommon.b).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Location f(Context context) {
        Location location;
        List<String> allProviders;
        LocationCommon.a.getClass();
        Location location2 = null;
        if (LocationCommon.b(context)) {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
                c.a aVar = new c.a(context);
                aVar.a(wyz.a);
                nlz0 b = aVar.b();
                exc0.k("blockingConnect must not be called on the UI thread", Looper.myLooper() != Looper.getMainLooper());
                b.c.lock();
                try {
                    if (b.f >= 0) {
                        exc0.k("Sign-in mode should have been set explicitly by auto-manage.", b.w != null);
                    } else {
                        Integer num = b.w;
                        if (num == null) {
                            b.w = Integer.valueOf(nlz0.q(b.p.values(), false));
                        } else if (num.intValue() == 2) {
                            throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                        }
                    }
                    Integer num2 = b.w;
                    exc0.i(num2);
                    b.s(num2.intValue());
                    b.d.f = true;
                    pmz0 pmz0Var = b.e;
                    exc0.i(pmz0Var);
                    ConnectionResult b2 = pmz0Var.b();
                    b.c.unlock();
                    if (b2.j()) {
                        try {
                            location = wyz.b.getLastLocation(b);
                        } catch (SecurityException | Exception unused) {
                        } finally {
                            b.n();
                        }
                        if (location != null) {
                            LocationManager locationManager = (LocationManager) context.getSystemService("location");
                            if (locationManager != null && (allProviders = locationManager.getAllProviders()) != null) {
                                Iterator<String> it = allProviders.iterator();
                                float f = Float.MAX_VALUE;
                                long j = 0;
                                while (it.hasNext()) {
                                    try {
                                        Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                                        if (lastKnownLocation != null) {
                                            float accuracy = lastKnownLocation.getAccuracy();
                                            long time = lastKnownLocation.getTime();
                                            if (location2 == null || (time > j && accuracy < f)) {
                                                location2 = lastKnownLocation;
                                                f = accuracy;
                                                j = time;
                                            }
                                        }
                                    } catch (SecurityException unused2) {
                                    }
                                }
                            }
                        } else {
                            location2 = location;
                        }
                    }
                } catch (Throwable th) {
                    b.c.unlock();
                    throw th;
                }
            }
            location = null;
            if (location != null) {
            }
        }
        if (location2 != null) {
            return location2;
        }
        LocationCommon.a.getClass();
        return LocationCommon.b;
    }
}
