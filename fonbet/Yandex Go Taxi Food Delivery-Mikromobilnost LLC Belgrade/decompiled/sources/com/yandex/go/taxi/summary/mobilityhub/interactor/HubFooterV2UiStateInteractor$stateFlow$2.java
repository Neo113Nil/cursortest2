package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.bms;
import defpackage.j5r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oa11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\b\u0002\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lj5r;", "mutualExclusiveFilterUpdate", "Loa11;", "transportTypeFilterUpdate", "Lzy11;", "<unused var>", "Lkotlin/Pair;", "", "", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/FilterUpdateV2;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/TransportTypeFilterUpdate;V)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.HubFooterV2UiStateInteractor$stateFlow$2", f = "HubFooterV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubFooterV2UiStateInteractor$stateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        HubFooterV2UiStateInteractor$stateFlow$2 hubFooterV2UiStateInteractor$stateFlow$2 = new HubFooterV2UiStateInteractor$stateFlow$2(4, (Continuation) obj4);
        hubFooterV2UiStateInteractor$stateFlow$2.L$0 = (j5r) obj;
        hubFooterV2UiStateInteractor$stateFlow$2.L$1 = (oa11) obj2;
        return hubFooterV2UiStateInteractor$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j5r j5rVar = (j5r) this.L$0;
        oa11 oa11Var = (oa11) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(j5rVar.a, oa11Var.a);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
