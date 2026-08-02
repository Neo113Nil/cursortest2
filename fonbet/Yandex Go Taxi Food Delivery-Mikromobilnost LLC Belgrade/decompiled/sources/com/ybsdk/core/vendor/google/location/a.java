package com.ybsdk.core.vendor.google.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import androidx.core.location.j;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.vendor.api.VendorRequiredApi;
import defpackage.bdz;
import defpackage.bp5;
import defpackage.dvw;
import defpackage.ih91;
import defpackage.j18;
import defpackage.jtt;
import defpackage.k991;
import defpackage.ny61;
import defpackage.u6z;
import defpackage.ybz;
import defpackage.zkj;
import defpackage.zm2;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a extends VendorRequiredApi implements ybz {
    public final Context c;
    public final k991 d;
    public final List e;

    public a(Context context, AppAnalyticsReporter appAnalyticsReporter, boolean z) {
        super(z, appAnalyticsReporter);
        this.c = context;
        this.d = bdz.a(context);
        this.e = Collections.singletonList("com.google.android.gms.location.LocationSettingsRequest");
    }

    public static Object f(Task task, ContinuationImpl continuationImpl) {
        if (!task.n()) {
            j18 j18Var = new j18(1, dvw.b(continuationImpl));
            j18Var.u();
            task.c(zkj.w, new bp5(j18Var));
            Object s = j18Var.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        }
        Exception j = task.j();
        if (j != null) {
            throw j;
        }
        if (!task.m()) {
            return task.k();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static u6z h(Location location) {
        return new u6z(location.getLatitude(), location.getLongitude(), Double.valueOf(location.getAltitude()), Float.valueOf(location.getAccuracy()), Long.valueOf(location.getTime()));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(9:11|12|13|14|15|16|(1:18)|19|(1:(4:22|(1:24)|25|26)(1:28))(2:29|30))(2:34|35))(2:36|37))(3:51|52|(2:54|45)(1:55))|38|39|(4:42|43|(7:46|14|15|16|(0)|19|(0)(0))|45)(5:41|16|(0)|19|(0)(0))))|58|6|7|(0)(0)|38|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0062, code lost:
    
        r8 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.ybz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        GoogleLocationProvider$getLastKnownLocation$1 googleLocationProvider$getLastKnownLocation$1;
        int i;
        Object failure;
        Throwable th;
        Object obj;
        Object g;
        Result result;
        Object failure2;
        u6z u6zVar;
        a aVar;
        if (continuation instanceof GoogleLocationProvider$getLastKnownLocation$1) {
            googleLocationProvider$getLastKnownLocation$1 = (GoogleLocationProvider$getLastKnownLocation$1) continuation;
            int i2 = googleLocationProvider$getLastKnownLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleLocationProvider$getLastKnownLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = googleLocationProvider$getLastKnownLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleLocationProvider$getLastKnownLocation$1.label;
                if (i != 0) {
                    b.b(obj2);
                    Task currentLocation = this.d.getCurrentLocation(100, null);
                    googleLocationProvider$getLastKnownLocation$1.L$0 = this;
                    googleLocationProvider$getLastKnownLocation$1.label = 1;
                    obj2 = f(currentLocation, googleLocationProvider$getLastKnownLocation$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = googleLocationProvider$getLastKnownLocation$1.L$0;
                        try {
                            b.b(obj2);
                            failure2 = (u6z) obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            failure2 = new Result.Failure(th);
                            result = new Result(failure2);
                            failure = obj;
                            if (failure instanceof Result.Failure) {
                            }
                            u6zVar = (u6z) failure;
                            if (u6zVar != null) {
                            }
                        }
                        result = new Result(failure2);
                        failure = obj;
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        u6zVar = (u6z) failure;
                        if (u6zVar != null) {
                            return u6zVar;
                        }
                        if (result == null) {
                            return null;
                        }
                        Object value = result.getValue();
                        return (u6z) (value instanceof Result.Failure ? null : value);
                    }
                    aVar = (a) googleLocationProvider$getLastKnownLocation$1.L$0;
                    b.b(obj2);
                }
                aVar.getClass();
                failure = h((Location) obj2);
                if (!(failure instanceof Result.Failure)) {
                    try {
                        googleLocationProvider$getLastKnownLocation$1.L$0 = failure;
                        googleLocationProvider$getLastKnownLocation$1.label = 2;
                        g = g(googleLocationProvider$getLastKnownLocation$1);
                    } catch (Throwable th3) {
                        Object obj3 = failure;
                        th = th3;
                        obj = obj3;
                        failure2 = new Result.Failure(th);
                        result = new Result(failure2);
                        failure = obj;
                        if (failure instanceof Result.Failure) {
                        }
                        u6zVar = (u6z) failure;
                        if (u6zVar != null) {
                        }
                    }
                    if (g != coroutineSingletons) {
                        Object obj4 = failure;
                        obj2 = g;
                        obj = obj4;
                        failure2 = (u6z) obj2;
                        result = new Result(failure2);
                        failure = obj;
                        if (failure instanceof Result.Failure) {
                        }
                        u6zVar = (u6z) failure;
                        if (u6zVar != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                result = null;
                if (failure instanceof Result.Failure) {
                }
                u6zVar = (u6z) failure;
                if (u6zVar != null) {
                }
            }
        }
        googleLocationProvider$getLastKnownLocation$1 = new GoogleLocationProvider$getLastKnownLocation$1(this, (ContinuationImpl) continuation);
        Object obj22 = googleLocationProvider$getLastKnownLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleLocationProvider$getLastKnownLocation$1.label;
        if (i != 0) {
        }
        aVar.getClass();
        failure = h((Location) obj22);
        if (!(failure instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.ybz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        GoogleLocationProvider$tryGetSettingsIntent$1 googleLocationProvider$tryGetSettingsIntent$1;
        int i;
        try {
            if (continuation instanceof GoogleLocationProvider$tryGetSettingsIntent$1) {
                googleLocationProvider$tryGetSettingsIntent$1 = (GoogleLocationProvider$tryGetSettingsIntent$1) continuation;
                int i2 = googleLocationProvider$tryGetSettingsIntent$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    googleLocationProvider$tryGetSettingsIntent$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = googleLocationProvider$tryGetSettingsIntent$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = googleLocationProvider$tryGetSettingsIntent$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            b.b(obj);
                            return null;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    LocationSettingsRequest.a aVar = new LocationSettingsRequest.a();
                    aVar.a(LocationRequest.create().setNumUpdates(1).setPriority(100));
                    LocationSettingsRequest b = aVar.b();
                    Context context = this.c;
                    zm2 zm2Var = bdz.a;
                    zzw checkLocationSettings = new ih91(context).checkLocationSettings(b);
                    googleLocationProvider$tryGetSettingsIntent$1.label = 1;
                    if (f(checkLocationSettings, googleLocationProvider$tryGetSettingsIntent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return null;
                }
            }
            if (i == 0) {
            }
        } catch (ApiException e) {
            if (e.b() != 6) {
                return null;
            }
            ResolvableApiException resolvableApiException = e instanceof ResolvableApiException ? (ResolvableApiException) e : null;
            if (resolvableApiException != null) {
                return resolvableApiException.c();
            }
            return null;
        }
        googleLocationProvider$tryGetSettingsIntent$1 = new GoogleLocationProvider$tryGetSettingsIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = googleLocationProvider$tryGetSettingsIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleLocationProvider$tryGetSettingsIntent$1.label;
    }

    @Override // defpackage.ybz
    public final boolean c() {
        LocationManager locationManager = (LocationManager) this.c.getSystemService(LocationManager.class);
        WeakHashMap weakHashMap = j.a;
        return locationManager.isLocationEnabled();
    }

    @Override // com.ybsdk.core.vendor.api.VendorRequiredApi
    public final List d() {
        return this.e;
    }

    public final Object g(Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        this.d.requestLocationUpdates(LocationRequest.create().setNumUpdates(1).setPriority(100), new jtt(this, j18Var), Looper.getMainLooper());
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
