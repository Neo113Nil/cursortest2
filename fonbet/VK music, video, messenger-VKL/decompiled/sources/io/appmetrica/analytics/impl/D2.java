package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes8.dex */
public final class D2 {
    public final LocationManager a;

    public D2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public D2(LocationManager locationManager) {
        this.a = locationManager;
    }
}
