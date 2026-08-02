package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.n1d;
import defpackage.ny61;
import defpackage.rfa0;
import defpackage.sfa0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n1d b;
    public final /* synthetic */ ru.yandex.taxi.preorder.repositories.g c;

    public h(vpr vprVar, n1d n1dVar, ru.yandex.taxi.preorder.repositories.g gVar) {
        this.a = vprVar;
        this.b = n1dVar;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1 paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        ru.yandex.taxi.preorder.repositories.g gVar = this.c;
        if (continuation instanceof PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1) {
            paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1 = (PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    rfa0 a = ((sfa0) this.b.b).a(gVar.a.a.c(), gVar.a());
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(a, paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1 = new PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentInfoInteractor$paymentFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
