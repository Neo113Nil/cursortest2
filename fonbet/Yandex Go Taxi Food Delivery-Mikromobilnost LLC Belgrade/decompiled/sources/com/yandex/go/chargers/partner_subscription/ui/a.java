package com.yandex.go.chargers.partner_subscription.ui;

import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class a implements yt11 {
    public final tt2 a;
    public final com.yandex.go.chargers.error.data.a b;
    public final com.yandex.go.chargers.partner_subscription.data.a c;
    public final b d;

    public a(tt2 tt2Var, com.yandex.go.chargers.error.data.a aVar, com.yandex.go.chargers.partner_subscription.data.a aVar2, b bVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        tpr t = e.t(new rol0(new ChargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1(this, null)));
        this.a.getClass();
        return e.F(t, uyj.a);
    }
}
