package com.yandex.go.taxi.order.cancel;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.l8x;
import defpackage.qw7;
import defpackage.rol0;
import defpackage.tje;
import defpackage.wls;
import kotlinx.coroutines.flow.k;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements wls {
    public final /* synthetic */ qw7 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ OrderStatusParam.Break c;
    public final /* synthetic */ TaxiOrder w;

    public /* synthetic */ a(qw7 qw7Var, String str, OrderStatusParam.Break r3, TaxiOrder taxiOrder) {
        this.a = qw7Var;
        this.b = str;
        this.c = r3;
        this.w = taxiOrder;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        l8x l8xVar = (l8x) obj2;
        if (l8xVar != null && l8xVar.isActive()) {
            return l8xVar;
        }
        qw7 qw7Var = this.a;
        return tje.N(qw7Var.a, null, null, new CancelOrderInteractorImpl$requestCancel$lambda$0$$inlined$safeCollectIn$1(new k(new e(new c(new rol0(new CancelOrderInteractorImpl$requestCancel$1$1(qw7Var, this.b, str, this.c, this.w, null)), qw7Var)), new CancelOrderInteractorImpl$requestCancel$1$4(qw7Var, str, null)), null, qw7Var, str, str), 3);
    }
}
