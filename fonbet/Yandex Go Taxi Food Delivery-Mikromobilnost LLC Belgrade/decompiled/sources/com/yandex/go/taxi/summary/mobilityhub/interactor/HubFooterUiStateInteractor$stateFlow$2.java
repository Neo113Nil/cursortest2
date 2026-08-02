package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import defpackage.bms;
import defpackage.i5r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;", "modalState", "Li5r;", "filterUpdate", "Lzy11;", "<unused var>", "Lkotlin/Pair;", "", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/repository/FilterUpdate;V)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.HubFooterUiStateInteractor$stateFlow$2", f = "HubFooterUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubFooterUiStateInteractor$stateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        HubFooterUiStateInteractor$stateFlow$2 hubFooterUiStateInteractor$stateFlow$2 = new HubFooterUiStateInteractor$stateFlow$2(4, (Continuation) obj4);
        hubFooterUiStateInteractor$stateFlow$2.L$0 = (ModalState) obj;
        hubFooterUiStateInteractor$stateFlow$2.L$1 = (i5r) obj2;
        return hubFooterUiStateInteractor$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ModalState modalState = (ModalState) this.L$0;
        i5r i5rVar = (i5r) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(modalState, i5rVar.a);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
