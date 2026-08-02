package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;

/* loaded from: classes2.dex */
public final class f implements com.yandex.passport.internal.usecase.authorize.m {
    public final Uid a;
    public final Uid b;
    public final Uid c;
    public final MasterToken d;
    public final Environment e;
    public final AnalyticsFromValue f;
    public final long g;

    static {
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
        int i = Uid.$stable;
    }

    public f(Uid uid, Uid uid2, Uid uid3, MasterToken masterToken, Environment environment, AnalyticsFromValue analyticsFromValue, long j) {
        this.a = uid;
        this.b = uid2;
        this.c = uid3;
        this.d = masterToken;
        this.e = environment;
        this.f = analyticsFromValue;
        this.g = j;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final AnalyticsFromValue a() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final long b() {
        return this.g;
    }

    public final Uid c() {
        return this.a;
    }

    public final MasterToken d() {
        return this.d;
    }

    public final Uid e() {
        return this.b;
    }

    public final Uid f() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final Environment getEnvironment() {
        return this.e;
    }
}
