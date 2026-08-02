package com.yandex.go.xiva.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes11.dex */
public final class d implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ f b;

    public d(kotlinx.coroutines.flow.internal.g gVar, f fVar) {
        this.a = gVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1 taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1) {
            taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1 = (TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1) continuation;
            int i2 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.L$0 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.L$1 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.L$2 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1 = new TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
