package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.common.analytics.AdAnalyticsProvider;
import com.yandex.mobile.ads.network.interceptor.NetworkInterceptor;
import com.yandex.mobile.ads.network.interceptor.b;
import defpackage.a081;
import defpackage.a281;
import defpackage.bv81;
import defpackage.cvu0;
import defpackage.gb71;
import defpackage.ge71;
import defpackage.gga1;
import defpackage.hay;
import defpackage.ity;
import defpackage.ix81;
import defpackage.pk71;
import defpackage.q181;
import defpackage.rw71;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
abstract class CustomYandexAds {
    public static void setAnalyticsProvider(Context context, AdAnalyticsProvider adAnalyticsProvider) {
        if (adAnalyticsProvider == null) {
            a081 a081Var = pk71.a;
            synchronized (ge71.e) {
                pk71.b = null;
            }
            synchronized (bv81.a) {
                bv81.b = null;
            }
            a281.b = null;
            gb71.b = null;
            ix81.b = null;
            return;
        }
        hay hayVar = new hay(20, adAnalyticsProvider);
        q181 q181Var = a281.a;
        a081 a081Var2 = pk71.a;
        synchronized (ge71.e) {
            pk71.b = null;
        }
        synchronized (bv81.a) {
            bv81.b = null;
        }
        a281.b = hayVar;
        ity ityVar = new ity(adAnalyticsProvider);
        gb71.b = null;
        ix81.b = ityVar;
    }

    public static void setNetworkInterceptor(Context context, NetworkInterceptor networkInterceptor) {
        b bVar;
        Set set = rw71.a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (cvu0.x(context.getPackageName(), (String) it.next(), false)) {
                if (networkInterceptor != null) {
                    NetworkInterceptor.Companion.getClass();
                    bVar = new b(networkInterceptor);
                } else {
                    bVar = null;
                }
                gga1.b = bVar;
                return;
            }
        }
    }
}
