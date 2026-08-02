package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class a1 {
    public final Environment a;
    public final com.yandex.passport.internal.network.response.e b;
    public final AnalyticsFromValue c;

    static {
        int i = UserInfo.$stable;
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
    }

    public a1(Environment environment, com.yandex.passport.internal.network.response.e eVar, AnalyticsFromValue analyticsFromValue) {
        this.a = environment;
        this.b = eVar;
        this.c = analyticsFromValue;
    }

    public final AnalyticsFromValue a() {
        return this.c;
    }

    public final Environment b() {
        return this.a;
    }

    public final com.yandex.passport.internal.network.response.e c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (this.a == a1Var.a && this.b == a1Var.b && jl40.l(this.c, a1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", result=" + this.b + ", overriddenAccountName=null, analyticsFromValue=" + this.c + ')';
    }
}
