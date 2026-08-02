package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class i {
    public final Environment a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final AnalyticsFromValue f;

    public i(Environment environment, String str, String str2, String str3, String str4, AnalyticsFromValue analyticsFromValue) {
        this.a = environment;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = analyticsFromValue;
    }

    public final AnalyticsFromValue a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final Environment d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && jl40.l(this.b, iVar.b) && jl40.l(this.c, iVar.c) && jl40.l(this.d, iVar.d) && jl40.l(this.e, iVar.e) && jl40.l(this.f, iVar.f);
    }

    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", trackId=" + this.b + ", password=" + this.c + ", avatarUrl=" + this.d + ", captchaAnswer=" + this.e + ", analyticFromValue=" + this.f + ')';
    }
}
