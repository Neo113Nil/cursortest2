package com.yandex.go.chargers.subscription.data;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionParamsDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionResponseDto;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final pwy0 b;
    public final com.yandex.go.chargers.subscription.data.mapper.a c;
    public final h3y d;

    public a(tt2 tt2Var, pwy0 pwy0Var, com.yandex.go.chargers.subscription.data.mapper.a aVar, h3y h3yVar) {
        this.a = tt2Var;
        this.b = pwy0Var;
        this.c = aVar;
        this.d = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ChargersSubscriptionRepository$getChargersSubscription$1 chargersSubscriptionRepository$getChargersSubscription$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ChargersSubscriptionRepository$getChargersSubscription$1) {
            chargersSubscriptionRepository$getChargersSubscription$1 = (ChargersSubscriptionRepository$getChargersSubscription$1) continuationImpl;
            int i2 = chargersSubscriptionRepository$getChargersSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersSubscriptionRepository$getChargersSubscription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersSubscriptionRepository$getChargersSubscription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersSubscriptionRepository$getChargersSubscription$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<ChargersSubscriptionResponseDto> a = ((ChargersSubscriptionApi) aVar.d.get()).a(new ChargersSubscriptionParamsDto());
                    chargersSubscriptionRepository$getChargersSubscription$1.L$0 = null;
                    chargersSubscriptionRepository$getChargersSubscription$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, chargersSubscriptionRepository$getChargersSubscription$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return (ChargersSubscriptionResponseDto) obj;
            }
        }
        chargersSubscriptionRepository$getChargersSubscription$1 = new ChargersSubscriptionRepository$getChargersSubscription$1(aVar, continuationImpl);
        Object obj2 = chargersSubscriptionRepository$getChargersSubscription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersSubscriptionRepository$getChargersSubscription$1.label;
        if (i != 0) {
        }
        return (ChargersSubscriptionResponseDto) obj2;
    }

    public final tpr b() {
        m0 m0Var = new m0(new rol0(new ChargersSubscriptionRepository$getSubscriptionData$1(this, null)), this.b.a(), new ChargersSubscriptionRepository$getSubscriptionData$2(this, null));
        this.a.getClass();
        return e.F(m0Var, uyj.a);
    }
}
