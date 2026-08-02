package com.yandex.passport.internal.properties;

import com.yandex.passport.api.c1;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.w1;
import com.yandex.passport.internal.network.UrlOverride;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public abstract class o {
    public static p a(w1 w1Var) {
        LoginProperties loginProperties;
        Map j = w1Var.j();
        Map l = w1Var.l();
        String applicationPackageName = w1Var.getApplicationPackageName();
        String d = w1Var.d();
        Long n = w1Var.n();
        String a = w1Var.a();
        String deviceGeoLocation = w1Var.getDeviceGeoLocation();
        List g = w1Var.g();
        List productLocation = w1Var.getProductLocation();
        OkHttpClient.a c = w1Var.c();
        String q = w1Var.q();
        String h = w1Var.h();
        List e = w1Var.e();
        Boolean f = w1Var.f();
        e1 p = w1Var.p();
        if (p != null) {
            LoginProperties.Companion.getClass();
            loginProperties = i.b((com.yandex.passport.api.limited.a) p);
        } else {
            loginProperties = null;
        }
        LoginProperties loginProperties2 = loginProperties;
        c1 i = w1Var.i();
        Locale k = w1Var.k();
        p2 urlOverride = w1Var.getUrlOverride();
        UrlOverride.Companion.getClass();
        return new p(j, l, applicationPackageName, d, n, a, deviceGeoLocation, g, productLocation, c, q, h, e, f, loginProperties2, i, k, com.yandex.passport.internal.network.p.a(urlOverride), com.yandex.passport.internal.util.p.w(w1Var.getLocationsUrlOverride()), w1Var.getOrigin(), w1Var.b(), w1Var.o(), w1Var.isWhiteLabel(), w1Var.m(), w1Var.getVpnBlockerAdditionalParams());
    }
}
