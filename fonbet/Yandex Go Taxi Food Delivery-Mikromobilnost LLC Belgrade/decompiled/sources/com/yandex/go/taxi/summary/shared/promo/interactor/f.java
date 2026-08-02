package com.yandex.go.taxi.summary.shared.promo.interactor;

import defpackage.kb5;
import defpackage.llx0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ kb5 b;
    public final /* synthetic */ llx0 c;

    public f(tpr tprVar, kb5 kb5Var, llx0 llx0Var) {
        this.a = tprVar;
        this.b = kb5Var;
        this.c = llx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1 tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1;
        int i;
        if (continuation instanceof TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1) {
            tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1 = (TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1) continuation;
            int i2 = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c);
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.L$0 = null;
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.L$1 = null;
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.L$2 = null;
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.label = 1;
                    if (this.a.collect(eVar, tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1) == coroutineSingletons) {
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
        tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1 = new TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1(this, continuation);
        Object obj2 = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
