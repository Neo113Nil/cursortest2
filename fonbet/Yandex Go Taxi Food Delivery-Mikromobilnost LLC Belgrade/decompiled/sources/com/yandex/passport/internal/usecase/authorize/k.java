package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class k implements m {
    public final String a;
    public final Environment b;
    public final AnalyticsFromValue c;

    public k(String str, Environment environment) {
        AnalyticsFromValue analyticsFromValue;
        this.a = str;
        this.b = environment;
        AnalyticsFromValue.Companion.getClass();
        analyticsFromValue = AnalyticsFromValue.TRACK_ID;
        this.c = analyticsFromValue;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final AnalyticsFromValue a() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final long b() {
        return 0L;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jl40.l(this.a, kVar.a) && this.b == kVar.b;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final Environment getEnvironment() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(trackId=" + this.a + ", environment=" + this.b + ')';
    }
}
