package com.yandex.go.payments_widgets;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;

    public b(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1 paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof PaymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1) {
            paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1 = (PaymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1) continuation;
            int i2 = paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.L$0 = null;
                    paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.L$1 = null;
                    paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.L$2 = null;
                    paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1) == coroutineSingletons) {
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
        paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1 = new PaymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentWidgetsContextChangedInteractorImpl$bankScreenClosedFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
