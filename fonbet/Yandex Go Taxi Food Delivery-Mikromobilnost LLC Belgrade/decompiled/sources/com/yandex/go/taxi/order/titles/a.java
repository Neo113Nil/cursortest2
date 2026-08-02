package com.yandex.go.taxi.order.titles;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.d980;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, d980 d980Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1 orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1;
        int i;
        FormattedText formattedText;
        OrderStatusInfo.CashbackDetails cashbackDetails;
        if (continuation instanceof OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1) {
            orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1 = (OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1) continuation;
            int i2 = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OrderStatusInfo.CostMessageDetails costMessageDetails = ((TaxiOrder) obj).V().T;
                    if (costMessageDetails == null || (cashbackDetails = costMessageDetails.c) == null || (formattedText = cashbackDetails.b) == null) {
                        formattedText = FormattedText.c;
                    }
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.L$0 = null;
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.L$1 = null;
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.L$2 = null;
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.L$3 = null;
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(formattedText, orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1 = new OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
