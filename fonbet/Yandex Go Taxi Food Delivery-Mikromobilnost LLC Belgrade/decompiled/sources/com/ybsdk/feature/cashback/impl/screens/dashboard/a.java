package com.ybsdk.feature.cashback.impl.screens.dashboard;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.ds31;
import defpackage.g5;
import defpackage.j3h;
import defpackage.l3h;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.ucp0;
import defpackage.vm7;
import defpackage.we8;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final CashbackDashboardScreenParams B;
    public final com.ybsdk.feature.cashback.impl.domain.a C;
    public final tfl0 D;
    public final ucp0 E;
    public final g5 F;
    public final AppAnalyticsReporter G;

    public a(CashbackDashboardScreenParams cashbackDashboardScreenParams, com.ybsdk.feature.cashback.impl.domain.a aVar, tfl0 tfl0Var, ucp0 ucp0Var, g5 g5Var, AppAnalyticsReporter appAnalyticsReporter) {
        super(new we8(15), new vm7(18));
        this.B = cashbackDashboardScreenParams;
        this.C = aVar;
        this.D = tfl0Var;
        this.E = ucp0Var;
        this.F = g5Var;
        this.G = appAnalyticsReporter;
        b0(false);
        appAnalyticsReporter.m.a.a("cashback.dashboard_open", null);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.C.a.d.a.l(null);
    }

    public final void b0(boolean z) {
        tje.N(ds31.a(this), null, null, new CashbackDashboardViewModel$loadData$1(this, z, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        j3h j3hVar = this.F.a;
        l3h l3hVar = (l3h) j3hVar;
        l3hVar.d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Support(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), DeeplinkNavigation.Add.INSTANCE));
    }
}
