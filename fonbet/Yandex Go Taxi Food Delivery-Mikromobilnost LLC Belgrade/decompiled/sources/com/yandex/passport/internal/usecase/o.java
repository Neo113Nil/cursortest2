package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes2.dex */
public final class o {
    public final Environment a;
    public final long b;
    public final MasterToken c;
    public final PassportSocialProviderCode d;
    public final AnalyticsFromValue e;

    static {
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
    }

    public o(Environment environment, long j, MasterToken masterToken, PassportSocialProviderCode passportSocialProviderCode, AnalyticsFromValue analyticsFromValue) {
        this.a = environment;
        this.b = j;
        this.c = masterToken;
        this.d = passportSocialProviderCode;
        this.e = analyticsFromValue;
    }

    public final AnalyticsFromValue a() {
        return this.e;
    }

    public final Environment b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final MasterToken d() {
        return this.c;
    }

    public final PassportSocialProviderCode e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b && jl40.l(this.c, oVar.c) && this.d == oVar.d && jl40.l(this.e, oVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        PassportSocialProviderCode passportSocialProviderCode = this.d;
        return this.e.hashCode() + ((hashCode + (passportSocialProviderCode == null ? 0 : passportSocialProviderCode.hashCode())) * 31);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", locationId=" + this.b + ", masterToken=" + this.c + ", socialCode=" + this.d + ", analyticsFromValue=" + this.e + ')';
    }
}
