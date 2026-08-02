package com.yandex.go.scooters.subscription.domain;

import com.yandex.go.scooters.subscription.api.exception.ScootersSubscriptionNoSelectedPaymentMethodException;
import defpackage.evu0;
import defpackage.fyo0;
import defpackage.gyo0;
import defpackage.hyo0;
import defpackage.jyo0;
import defpackage.lea0;
import defpackage.lyo0;
import defpackage.ny61;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.scooters.payments.domain.a a;
    public final com.yandex.go.scooters.subscription.data.c b;
    public final com.yandex.go.scooters.subscription.data.b c;

    public a(com.yandex.go.scooters.payments.domain.a aVar, com.yandex.go.scooters.subscription.data.c cVar, com.yandex.go.scooters.subscription.data.b bVar) {
        this.a = aVar;
        this.b = cVar;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlinx.serialization.json.c cVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchasingInteractorImpl$startPurchase$1 scootersSubscriptionPurchasingInteractorImpl$startPurchase$1;
        int i;
        String id;
        boolean z;
        if (continuationImpl instanceof ScootersSubscriptionPurchasingInteractorImpl$startPurchase$1) {
            scootersSubscriptionPurchasingInteractorImpl$startPurchase$1 = (ScootersSubscriptionPurchasingInteractorImpl$startPurchase$1) continuationImpl;
            int i2 = scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lea0 b = this.a.c().b();
                    if (b != null) {
                        if (b.d()) {
                            b = null;
                        }
                        if (b != null && (id = b.getId()) != null) {
                            if (evu0.J(id)) {
                                id = null;
                            }
                            if (id != null) {
                                scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.L$0 = null;
                                scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.L$1 = null;
                                scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.L$2 = null;
                                scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.label = 1;
                                obj = this.b.a(cVar, id, scootersSubscriptionPurchasingInteractorImpl$startPurchase$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    throw new ScootersSubscriptionNoSelectedPaymentMethodException();
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                hyo0 hyo0Var = (hyo0) obj;
                z = hyo0Var instanceof gyo0;
                com.yandex.go.scooters.subscription.data.b bVar = this.c;
                if (!z) {
                    bVar.a(new lyo0(((gyo0) hyo0Var).a));
                    return hyo0Var;
                }
                if (!(hyo0Var instanceof fyo0)) {
                    w511.b();
                    return null;
                }
                r0 r0Var = bVar.b;
                r0Var.getClass();
                r0Var.m(null, jyo0.a);
                return hyo0Var;
            }
        }
        scootersSubscriptionPurchasingInteractorImpl$startPurchase$1 = new ScootersSubscriptionPurchasingInteractorImpl$startPurchase$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionPurchasingInteractorImpl$startPurchase$1.label;
        if (i != 0) {
        }
        hyo0 hyo0Var2 = (hyo0) obj2;
        z = hyo0Var2 instanceof gyo0;
        com.yandex.go.scooters.subscription.data.b bVar2 = this.c;
        if (!z) {
        }
    }
}
