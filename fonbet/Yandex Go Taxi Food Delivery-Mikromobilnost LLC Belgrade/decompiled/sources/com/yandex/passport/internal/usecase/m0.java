package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes2.dex */
public final class m0 {
    public final MasterToken a;
    public final com.yandex.passport.internal.j b;
    public final Environment c;
    public final long d;
    public final AnalyticsFromValue e;

    static {
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
    }

    public m0(MasterToken masterToken, com.yandex.passport.internal.j jVar, Environment environment, long j, AnalyticsFromValue analyticsFromValue) {
        this.a = masterToken;
        this.b = jVar;
        this.c = environment;
        this.d = j;
        this.e = analyticsFromValue;
    }

    public final Environment a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final com.yandex.passport.internal.j c() {
        return this.b;
    }

    public final MasterToken d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return jl40.l(this.a, m0Var.a) && this.b.equals(m0Var.b) && this.c == m0Var.c && this.d == m0Var.d && jl40.l(this.e, m0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qv10.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "Params(masterToken=" + this.a + ", masterCredentials=" + this.b + ", environment=" + this.c + ", locationId=" + this.d + ", analyticsFromValue=" + this.e + ')';
    }
}
