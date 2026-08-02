package com.yandex.go.taxi.order.view;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.ny61;
import defpackage.ra80;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1 orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1) {
            orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1 = (OrderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OrderScreen orderScreen = ((ra80) obj).a;
                    orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.L$0 = null;
                    orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.L$1 = null;
                    orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.L$2 = null;
                    orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.L$3 = null;
                    orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(orderScreen, orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1 = new OrderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderViewStateRepository$orderScreenFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
