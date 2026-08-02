package com.yandex.go.taxi.order.change.source.mvp;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ g a;

    public c(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1 changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1) {
            changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1 = (ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1 = new ChangeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeOrderSourceAddressPresenter$subscribeToOrderStatus$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
