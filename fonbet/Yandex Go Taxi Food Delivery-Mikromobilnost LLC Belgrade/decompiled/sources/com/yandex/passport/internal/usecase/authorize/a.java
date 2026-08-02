package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.util.p;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class a implements m {
    public final Cookie a;
    public final AnalyticsFromValue b;
    public final String c;
    public final long d;
    public final Environment e;

    public a(Cookie cookie, AnalyticsFromValue analyticsFromValue, String str, long j) {
        this.a = cookie;
        this.b = analyticsFromValue;
        this.c = str;
        this.d = j;
        this.e = p.u(cookie.m303getEnvironment());
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final AnalyticsFromValue a() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final long b() {
        return this.d;
    }

    public final Cookie c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && this.d == aVar.d;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final Environment getEnvironment() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Long.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(cookie=");
        sb.append(this.a);
        sb.append(", analyticsFromValue=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", socialCode=null, locationId=");
        return b64.o(sb, this.d, ')');
    }
}
