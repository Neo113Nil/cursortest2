package com.yandex.go.taxi.order.common;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.smk0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1 orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1) {
            orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1 = (OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1) continuation;
            int i2 = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    Pair pair = new Pair(taxiOrder.a, taxiOrder.V().b(smk0.class));
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.L$0 = null;
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.L$1 = null;
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.L$2 = null;
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.L$3 = null;
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1 = new OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
