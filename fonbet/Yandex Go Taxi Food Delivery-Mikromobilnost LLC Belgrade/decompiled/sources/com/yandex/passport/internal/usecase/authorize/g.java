package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.entities.TrackId;
import com.yandex.passport.internal.util.p;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class g implements m {
    public final TrackId a;
    public final Environment b;
    public final AnalyticsFromValue c;

    public g(TrackId trackId) {
        AnalyticsFromValue analyticsFromValue;
        this.a = trackId;
        this.b = p.u(trackId.m304getEnvironment());
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

    public final TrackId c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && jl40.l(this.a, ((g) obj).a);
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final Environment getEnvironment() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Params(trackId=" + this.a + ", socialCode=null)";
    }
}
