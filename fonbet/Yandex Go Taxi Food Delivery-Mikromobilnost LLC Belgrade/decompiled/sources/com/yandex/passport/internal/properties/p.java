package com.yandex.passport.internal.properties;

import com.yandex.passport.api.c1;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.n0;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.t0;
import com.yandex.passport.api.w1;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.network.UrlOverride;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class p implements w1 {
    public final Map A;
    public final Map a;
    public final Map b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final OkHttpClient.a j;
    public final String k;
    public final String l;
    public final List m;
    public final Boolean n;
    public final LoginProperties o;
    public final c1 p;
    public final Locale q;
    public final UrlOverride r;
    public final Map s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final Map x;
    public final Map y;
    public final Map z;

    public p(Map map, Map map2, String str, String str2, Long l, String str3, String str4, List list, List list2, OkHttpClient.a aVar, String str5, String str6, List list3, Boolean bool, LoginProperties loginProperties, c1 c1Var, Locale locale, UrlOverride urlOverride, Map map3, String str7, boolean z, boolean z2, boolean z3, Map map4, Map map5) {
        this.a = map;
        this.b = map2;
        this.c = str;
        this.d = str2;
        this.e = l;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = list2;
        this.j = aVar;
        this.k = str5;
        this.l = str6;
        this.m = list3;
        this.n = bool;
        this.o = loginProperties;
        this.p = c1Var;
        this.q = locale;
        this.r = urlOverride;
        this.s = map3;
        this.t = str7;
        this.u = z;
        this.v = z2;
        this.w = z3;
        this.x = map4;
        this.y = map5;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Environment u = com.yandex.passport.internal.util.p.u(PassportEnvironmentImpl.from((t0) entry.getKey()));
            com.yandex.passport.internal.credentials.a aVar2 = ClientCredentials.Factory;
            n0 n0Var = (n0) entry.getValue();
            aVar2.getClass();
            arrayList.add(new Pair(u, new Credentials(n0Var.getEncryptedId(), n0Var.getEncryptedSecret())));
        }
        this.z = kotlin.collections.b.s(arrayList);
        Map map6 = this.b;
        ArrayList arrayList2 = new ArrayList(map6.size());
        for (Map.Entry entry2 : map6.entrySet()) {
            Environment u2 = com.yandex.passport.internal.util.p.u(PassportEnvironmentImpl.from((t0) entry2.getKey()));
            n0 n0Var2 = (n0) entry2.getValue();
            arrayList2.add(new Pair(u2, new Credentials(n0Var2.getEncryptedId(), n0Var2.getEncryptedSecret())));
        }
        this.A = kotlin.collections.b.s(arrayList2);
    }

    @Override // com.yandex.passport.api.w1
    public final String a() {
        return this.f;
    }

    @Override // com.yandex.passport.api.w1
    public final boolean b() {
        return this.u;
    }

    @Override // com.yandex.passport.api.w1
    public final OkHttpClient.a c() {
        return this.j;
    }

    @Override // com.yandex.passport.api.w1
    public final String d() {
        return this.d;
    }

    @Override // com.yandex.passport.api.w1
    public final List e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (jl40.l(this.a, pVar.a) && jl40.l(this.b, pVar.b) && jl40.l(this.c, pVar.c) && jl40.l(this.d, pVar.d) && jl40.l(this.e, pVar.e) && jl40.l(this.f, pVar.f) && jl40.l(this.g, pVar.g) && jl40.l(this.h, pVar.h) && jl40.l(this.i, pVar.i) && jl40.l(this.j, pVar.j) && jl40.l(this.k, pVar.k) && jl40.l(this.l, pVar.l) && jl40.l(this.m, pVar.m) && jl40.l(this.n, pVar.n) && jl40.l(this.o, pVar.o) && jl40.l(this.p, pVar.p) && jl40.l(this.q, pVar.q) && this.r == pVar.r && this.s.equals(pVar.s) && jl40.l(this.t, pVar.t) && this.u == pVar.u && this.v == pVar.v && this.w == pVar.w && jl40.l(this.x, pVar.x) && jl40.l(this.y, pVar.y)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.passport.api.w1
    public final Boolean f() {
        return this.n;
    }

    @Override // com.yandex.passport.api.w1
    public final List g() {
        return this.h;
    }

    @Override // com.yandex.passport.api.w1
    public final String getApplicationPackageName() {
        return this.c;
    }

    @Override // com.yandex.passport.api.w1
    public final String getDeviceGeoLocation() {
        return this.g;
    }

    @Override // com.yandex.passport.api.w1
    public final Map getLocationsUrlOverride() {
        return this.s;
    }

    @Override // com.yandex.passport.api.w1
    public final String getOrigin() {
        return this.t;
    }

    @Override // com.yandex.passport.api.w1
    public final List getProductLocation() {
        return this.i;
    }

    @Override // com.yandex.passport.api.w1
    public final p2 getUrlOverride() {
        return this.r;
    }

    @Override // com.yandex.passport.api.w1
    public final Map getVpnBlockerAdditionalParams() {
        return this.y;
    }

    @Override // com.yandex.passport.api.w1
    public final String h() {
        return this.l;
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.e;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (this.j.hashCode() + unr0.c(unr0.c((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h), 31, this.i)) * 31;
        String str5 = this.k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int c = unr0.c((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 961, 31, this.m);
        Boolean bool = this.n;
        int hashCode7 = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        LoginProperties loginProperties = this.o;
        int hashCode8 = (hashCode7 + (loginProperties == null ? 0 : loginProperties.hashCode())) * 31;
        c1 c1Var = this.p;
        int hashCode9 = (hashCode8 + (c1Var == null ? 0 : c1Var.hashCode())) * 961;
        Locale locale = this.q;
        int d2 = unr0.d((this.r.hashCode() + ((hashCode9 + (locale == null ? 0 : locale.hashCode())) * 31)) * 31, 961, this.s);
        String str7 = this.t;
        return this.y.hashCode() + unr0.d(unr0.e(unr0.e(unr0.e((d2 + (str7 != null ? str7.hashCode() : 0)) * 31, 31, this.u), 31, this.v), 31, this.w), 31, this.x);
    }

    @Override // com.yandex.passport.api.w1
    public final c1 i() {
        return this.p;
    }

    @Override // com.yandex.passport.api.w1
    public final boolean isWhiteLabel() {
        return this.w;
    }

    @Override // com.yandex.passport.api.w1
    public final Map j() {
        return this.a;
    }

    @Override // com.yandex.passport.api.w1
    public final Locale k() {
        return this.q;
    }

    @Override // com.yandex.passport.api.w1
    public final Map l() {
        return this.b;
    }

    @Override // com.yandex.passport.api.w1
    public final Map m() {
        return this.x;
    }

    @Override // com.yandex.passport.api.w1
    public final Long n() {
        return this.e;
    }

    @Override // com.yandex.passport.api.w1
    public final boolean o() {
        return this.v;
    }

    @Override // com.yandex.passport.api.w1
    public final e1 p() {
        return this.o;
    }

    @Override // com.yandex.passport.api.w1
    public final String q() {
        return this.k;
    }

    public final ClientCredentials r(Environment environment) {
        return (ClientCredentials) this.z.get(environment);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Properties(credentialsMap=");
        sb.append(this.a);
        sb.append(", masterCredentialsMap=");
        sb.append(this.b);
        sb.append(", applicationPackageName=");
        sb.append(this.c);
        sb.append(", applicationVersion=");
        sb.append(this.d);
        sb.append(", applicationVersionCode=");
        sb.append(this.e);
        sb.append(", applicationClid=");
        sb.append(this.f);
        sb.append(", deviceGeoLocation=");
        sb.append(this.g);
        sb.append(", deviceGeoLocations=");
        sb.append(this.h);
        sb.append(", productLocation=");
        sb.append(this.i);
        sb.append(", okHttpClientBuilder=");
        sb.append(this.j);
        sb.append(", legalRulesUrl=");
        sb.append(this.k);
        sb.append(", legalConfidentialUrl=");
        sb.append(this.l);
        sb.append(", pushTokenProvider=null, pushTokenProviders=");
        sb.append(this.m);
        sb.append(", isAccountSharingEnabled=");
        sb.append(this.n);
        sb.append(", defaultLoginProperties=");
        sb.append(this.o);
        sb.append(", loggingDelegate=");
        sb.append(this.p);
        sb.append(", assertionDelegate=null, preferredLocale=");
        sb.append(this.q);
        sb.append(", urlOverride=");
        sb.append(this.r);
        sb.append(", locationsUrlOverride=");
        sb.append(this.s);
        sb.append(", twoFactorOtpProvider=null, origin=");
        sb.append(this.t);
        sb.append(", saveOnlyLocal=");
        sb.append(this.u);
        sb.append(", supportWebAuthN=");
        sb.append(this.v);
        sb.append(", isWhiteLabel=");
        sb.append(this.w);
        sb.append(", additionalMetricParams=");
        sb.append(this.x);
        sb.append(", vpnBlockerAdditionalParams=");
        return smw0.n(sb, this.y, ')');
    }
}
