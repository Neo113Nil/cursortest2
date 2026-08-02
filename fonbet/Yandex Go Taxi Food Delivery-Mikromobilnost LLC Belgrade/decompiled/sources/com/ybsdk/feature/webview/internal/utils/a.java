package com.ybsdk.feature.webview.internal.utils;

import android.content.Context;
import android.location.LocationManager;
import android.webkit.GeolocationPermissions;
import androidx.core.location.j;
import androidx.lifecycle.p;
import defpackage.qi51;
import defpackage.tje;
import defpackage.zgf;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class a {
    public final p a;
    public final com.ybsdk.core.permissions.a b;

    public a(p pVar, com.ybsdk.core.permissions.a aVar) {
        this.a = pVar;
        this.b = aVar;
    }

    public final void a(String str, qi51 qi51Var, Context context) {
        boolean isLocationEnabled;
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            isLocationEnabled = false;
        } else {
            WeakHashMap weakHashMap = j.a;
            isLocationEnabled = locationManager.isLocationEnabled();
        }
        if (isLocationEnabled) {
            tje.N(this.a, null, null, new GeolocationPermissionManager$onPermissionRequested$1(this, qi51Var, str, null), 3);
        } else {
            ((GeolocationPermissions.Callback) ((zgf) qi51Var).b).invoke(str, false, false);
        }
    }
}
