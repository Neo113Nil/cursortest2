package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.e27;
import defpackage.pzf0;
import defpackage.rzf0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.y250;

/* loaded from: classes2.dex */
public final class a {
    public final tse a;
    public final rzf0 b;
    public final sls c;

    public a(tse tseVar, rzf0 rzf0Var, sls slsVar) {
        this.a = tseVar;
        this.b = rzf0Var;
        this.c = slsVar;
    }

    public final void a(e27 e27Var) {
        y250 y250Var = e27Var.c;
        if (y250Var != null) {
            tje.N(this.a, null, null, new HostPayButtonDelegateImpl$showHostPayButton$1$1(this, y250Var, null), 3);
        }
        SubscriptionConfiguration subscriptionConfiguration = e27Var.b;
        rzf0 rzf0Var = this.b;
        rzf0Var.b(subscriptionConfiguration, null, null, null);
        pzf0.a(rzf0Var, null, PurchaseTypeDto.HOST, PurchaseStatusTypeDto.SUCCESS, null, 8);
        this.c.invoke();
    }
}
