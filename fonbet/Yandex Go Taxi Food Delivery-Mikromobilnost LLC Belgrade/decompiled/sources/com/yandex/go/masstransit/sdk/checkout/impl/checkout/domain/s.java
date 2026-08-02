package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import android.content.Context;
import defpackage.a351;
import defpackage.ak80;
import defpackage.c6p0;
import defpackage.ffx;
import defpackage.gbp0;
import defpackage.i3y;
import defpackage.sls;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.xsr0;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class s {
    public final Context a;
    public final com.yandex.fintechsdk.flows.payment.kit.internal.model.a b;
    public final gbp0 c;
    public final n0 d;
    public final i3y e;
    public final i3y f;

    public s(Context context, com.yandex.fintechsdk.flows.payment.kit.internal.model.a aVar) {
        this.a = context;
        this.b = aVar;
        gbp0 gbp0Var = new gbp0(new c6p0(9), "");
        this.c = gbp0Var;
        this.d = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.e = kotlin.a.a(new sls() { // from class: com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.l
            @Override // defpackage.sls
            public final Object invoke() {
                Object putIfAbsent;
                s sVar = s.this;
                com.yandex.fintechsdk.flows.payment.kit.internal.model.a aVar2 = sVar.b;
                a351 a351Var = com.yandex.fintechsdk.flows.payment.kit.internal.model.a.l;
                String str = aVar2.g;
                ConcurrentHashMap concurrentHashMap = a351Var.a;
                Object obj = concurrentHashMap.get(str);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = ffx.c(0, 10, null, 5)))) != null) {
                    obj = putIfAbsent;
                }
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o((tpr) obj, new PaymentWidgetHolder$_widgetExternalEventFlow$2$1(3, null));
                gbp0 gbp0Var2 = sVar.c;
                xsr0.a.getClass();
                return kotlinx.coroutines.flow.e.O(oVar, gbp0Var2, wsr0.b, 0);
            }
        });
        this.f = kotlin.a.a(new ak80(19, this));
        gbp0Var.a();
        gbp0.c(gbp0Var, new PaymentWidgetHolder$observePaymentMethodFlow$1(this, null));
    }
}
