package com.yandex.go.taxi.order.change.price.domain;

import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.taxi.order.change.price.data.dto.ApplyAdditionalPaymentResponse;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.i3y;
import defpackage.ly1;
import defpackage.mdh;
import defpackage.o2y0;
import defpackage.p23;
import defpackage.sjh;
import defpackage.tb9;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final com.yandex.go.taxi.order.change.price.data.repository.a b;
    public final d c;
    public final i3y d = kotlin.a.b(LazyThreadSafetyMode.NONE, new ly1(27));

    public a(tt2 tt2Var, com.yandex.go.taxi.order.change.price.data.repository.a aVar, d dVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = dVar;
    }

    public static final void a(a aVar, o2y0 o2y0Var, ApplyAdditionalPaymentResponse applyAdditionalPaymentResponse) {
        Object value;
        TaxiOrder taxiOrder;
        Object value2;
        TaxiOrder taxiOrder2;
        ChangeOrderState$Source changeOrderState$Source;
        aVar.getClass();
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            taxiOrder.L(new ChangeOrderState$Pending(null, ChangeOrderState$Source.ADDITIONAL_PAYMENT));
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        OrderChangesDto.Status status = applyAdditionalPaymentResponse.b;
        String str = applyAdditionalPaymentResponse.a;
        int i = p23.a[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    c(o2y0Var, str);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            return;
        }
        r0 r0Var2 = o2y0Var.a;
        do {
            value2 = r0Var2.getValue();
            taxiOrder2 = (TaxiOrder) value2;
            changeOrderState$Source = ChangeOrderState$Source.ADDITIONAL_PAYMENT;
            taxiOrder2.a(new ChangeOrderState$Pending(str, changeOrderState$Source));
        } while (!r0Var2.k(value2, taxiOrder2));
        o2y0Var.f();
        aVar.c.a.h(new tb9(o2y0Var.b().a, str, changeOrderState$Source));
    }

    public static void c(o2y0 o2y0Var, String str) {
        Object value;
        TaxiOrder taxiOrder;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            taxiOrder.a(new ChangeOrderState$Failure(str, ChangeOrderState$Source.ADDITIONAL_PAYMENT, (OrderChangesDto.Notification) null, 4));
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
    }

    public final Object b(o2y0 o2y0Var, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ApplyAdditionalPaymentInteractor$changePrice$2(o2y0Var, this, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
