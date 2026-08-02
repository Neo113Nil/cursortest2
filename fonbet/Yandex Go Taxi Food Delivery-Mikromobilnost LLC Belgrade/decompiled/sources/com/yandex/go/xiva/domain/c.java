package com.yandex.go.xiva.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes11.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public c(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1 taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1) {
            taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1 = (TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1) continuation;
            int i2 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    f fVar = this.b;
                    DriveState driveState = ((TaxiOrder) obj).h.b;
                    fVar.getClass();
                    Boolean valueOf = Boolean.valueOf(driveState.compareTo(DriveState.WAITING) <= 0 && driveState.compareTo(DriveState.DRIVING) >= 0);
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.L$0 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.L$1 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.L$2 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.L$3 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(valueOf, taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1 = new TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$lambda$0$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
