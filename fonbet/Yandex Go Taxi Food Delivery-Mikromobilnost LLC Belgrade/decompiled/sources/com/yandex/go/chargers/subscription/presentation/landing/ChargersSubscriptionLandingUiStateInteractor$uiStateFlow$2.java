package com.yandex.go.chargers.subscription.presentation.landing;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vta;
import defpackage.yta;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyta;", "baseState", "", "isGettingOffers", "<anonymous>", "(Lyta;Z)Lyta;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.presentation.landing.ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$2", f = "ChargersSubscriptionLandingUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$2 chargersSubscriptionLandingUiStateInteractor$uiStateFlow$2 = new ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$2(3, (Continuation) obj3);
        chargersSubscriptionLandingUiStateInteractor$uiStateFlow$2.L$0 = (yta) obj;
        chargersSubscriptionLandingUiStateInteractor$uiStateFlow$2.Z$0 = booleanValue;
        return chargersSubscriptionLandingUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yta ytaVar = (yta) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ytaVar instanceof vta ? new vta(((vta) ytaVar).a, z) : ytaVar;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
