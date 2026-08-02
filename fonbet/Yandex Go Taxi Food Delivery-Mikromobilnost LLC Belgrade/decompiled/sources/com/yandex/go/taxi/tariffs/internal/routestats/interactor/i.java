package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.n1d;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class i implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ n1d b;
    public final /* synthetic */ ru.yandex.taxi.preorder.repositories.g c;

    public i(tpr tprVar, n1d n1dVar, ru.yandex.taxi.preorder.repositories.g gVar) {
        this.a = tprVar;
        this.b = n1dVar;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1 paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1) {
            paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1 = (PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b, this.c);
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1 = new PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
