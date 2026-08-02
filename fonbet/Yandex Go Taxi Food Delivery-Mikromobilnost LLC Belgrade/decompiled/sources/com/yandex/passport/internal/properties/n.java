package com.yandex.passport.internal.properties;

import com.yandex.passport.api.c1;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.v1;
import com.yandex.passport.internal.network.UrlOverride;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class n implements v1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final List c;
    public final List d;
    public OkHttpClient.a e;
    public String f;
    public String g;
    public List h;
    public Boolean i;
    public Locale j;
    public p2 k;
    public Map l;
    public boolean m;
    public boolean n;
    public final Map o;
    public final Map p;

    public n() {
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = new OkHttpClient.a();
        this.h = emptyList;
        this.k = new UrlOverride(kotlin.collections.b.f());
        this.l = kotlin.collections.b.f();
        this.o = kotlin.collections.b.f();
        this.p = kotlin.collections.b.f();
    }

    @Override // com.yandex.passport.api.w1
    public final String a() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.passport.api.w1
    public final OkHttpClient.a c() {
        return this.e;
    }

    @Override // com.yandex.passport.api.w1
    public final String d() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final List e() {
        return this.h;
    }

    @Override // com.yandex.passport.api.w1
    public final Boolean f() {
        return this.i;
    }

    @Override // com.yandex.passport.api.w1
    public final List g() {
        return this.c;
    }

    @Override // com.yandex.passport.api.w1
    public final String getApplicationPackageName() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final String getDeviceGeoLocation() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final Map getLocationsUrlOverride() {
        return this.l;
    }

    @Override // com.yandex.passport.api.w1
    public final String getOrigin() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final List getProductLocation() {
        return this.d;
    }

    @Override // com.yandex.passport.api.w1
    public final p2 getUrlOverride() {
        return this.k;
    }

    @Override // com.yandex.passport.api.w1
    public final Map getVpnBlockerAdditionalParams() {
        return this.p;
    }

    @Override // com.yandex.passport.api.w1
    public final String h() {
        return this.g;
    }

    @Override // com.yandex.passport.api.w1
    public final c1 i() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final boolean isWhiteLabel() {
        return this.n;
    }

    @Override // com.yandex.passport.api.w1
    public final Map j() {
        return this.a;
    }

    @Override // com.yandex.passport.api.w1
    public final Locale k() {
        return this.j;
    }

    @Override // com.yandex.passport.api.w1
    public final Map l() {
        return this.b;
    }

    @Override // com.yandex.passport.api.w1
    public final Map m() {
        return this.o;
    }

    @Override // com.yandex.passport.api.w1
    public final Long n() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final boolean o() {
        return this.m;
    }

    @Override // com.yandex.passport.api.w1
    public final e1 p() {
        return null;
    }

    @Override // com.yandex.passport.api.w1
    public final String q() {
        return this.f;
    }
}
