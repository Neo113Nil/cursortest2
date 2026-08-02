package com.yandex.passport.internal.common;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.i3y;
import defpackage.qke;
import defpackage.rcc;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes8.dex */
public final class f {
    public final Context a;
    public final i3y b = kotlin.a.a(new com.yandex.passport.internal.d(1, this));

    public f(Context context) {
        this.a = context;
    }

    public final g a() {
        Object failure;
        Context context = this.a;
        boolean z = qke.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = qke.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if (z || z2) {
            Object systemService = context.getSystemService("location");
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager != null) {
                ListBuilder a = rcc.a();
                if (z) {
                    a.add("gps");
                }
                a.add("network");
                a.add("passive");
                Iterator it = kotlin.collections.a.I(a.j()).iterator();
                while (it.hasNext()) {
                    try {
                        failure = locationManager.getLastKnownLocation((String) it.next());
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    Location location = (Location) failure;
                    if (location != null) {
                        return new g(location.getLatitude(), location.getLongitude());
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer b() {
        String networkOperator;
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getValue();
        if (telephonyManager != null && (networkOperator = telephonyManager.getNetworkOperator()) != null) {
            if (networkOperator.length() >= 5) {
                for (int i = 0; i < networkOperator.length(); i++) {
                    if (Character.isDigit(networkOperator.charAt(i))) {
                    }
                }
                if (networkOperator != null) {
                    return bvu0.l(10, gvu0.A0(3, networkOperator));
                }
            }
            networkOperator = null;
            if (networkOperator != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer c() {
        String networkOperator;
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getValue();
        if (telephonyManager != null && (networkOperator = telephonyManager.getNetworkOperator()) != null) {
            if (networkOperator.length() >= 5) {
                for (int i = 0; i < networkOperator.length(); i++) {
                    if (Character.isDigit(networkOperator.charAt(i))) {
                    }
                }
                if (networkOperator != null) {
                    return bvu0.l(10, gvu0.r0(3, networkOperator));
                }
            }
            networkOperator = null;
            if (networkOperator != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d() {
        Object failure;
        String simCountryIso;
        Object upperCase;
        Object systemService = this.a.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null) {
            try {
                simCountryIso = telephonyManager.getSimCountryIso();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (simCountryIso != null) {
                if (evu0.J(simCountryIso)) {
                    simCountryIso = null;
                }
                if (simCountryIso != null) {
                    upperCase = simCountryIso.toUpperCase(Locale.ROOT);
                    failure = upperCase;
                    return (String) (failure instanceof Result.Failure ? null : failure);
                }
            }
        }
        upperCase = null;
        failure = upperCase;
        return (String) (failure instanceof Result.Failure ? null : failure);
    }
}
