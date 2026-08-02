package com.yandex.go.chargers.subscription.presentation.landing;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;

    public f(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1 chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1) {
            chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1 = (ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1 = new ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
