package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wh70;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1 changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1) {
            changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1 = (ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    wh70 wh70Var = new wh70((TaxiOrder) obj);
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(wh70Var, changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1 = new ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
