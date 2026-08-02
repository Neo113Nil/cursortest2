package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.bms;
import defpackage.d0l0;
import defpackage.khq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkhq0;", "selectedOffer", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Ld0l0;", "route", "Lkotlin/Pair;", "<anonymous>", "(Lkhq0;Lru/yandex/taxi/theme/ThemeType;Ld0l0;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.HubRoutePinsFlowInteractor$hubRoutePinsFlow$1", f = "HubRoutePinsFlowInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubRoutePinsFlowInteractor$hubRoutePinsFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        HubRoutePinsFlowInteractor$hubRoutePinsFlow$1 hubRoutePinsFlowInteractor$hubRoutePinsFlow$1 = new HubRoutePinsFlowInteractor$hubRoutePinsFlow$1(4, (Continuation) obj4);
        hubRoutePinsFlowInteractor$hubRoutePinsFlow$1.L$0 = (khq0) obj;
        hubRoutePinsFlowInteractor$hubRoutePinsFlow$1.L$1 = (d0l0) obj3;
        return hubRoutePinsFlowInteractor$hubRoutePinsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        khq0 khq0Var = (khq0) this.L$0;
        d0l0 d0l0Var = (d0l0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(khq0Var, d0l0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
