package com.yandex.go.rida.bids.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.poz;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpoz;", "lookupData", "", "actualIteration", "Lp5k0;", "<anonymous>", "(Lpoz;I)Lp5k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.RidaHeaderDataInteractor$headerDataStateFlow$1", f = "RidaHeaderDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RidaHeaderDataInteractor$headerDataStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        RidaHeaderDataInteractor$headerDataStateFlow$1 ridaHeaderDataInteractor$headerDataStateFlow$1 = new RidaHeaderDataInteractor$headerDataStateFlow$1(3, (Continuation) obj3);
        ridaHeaderDataInteractor$headerDataStateFlow$1.L$0 = (poz) obj;
        ridaHeaderDataInteractor$headerDataStateFlow$1.I$0 = intValue;
        return ridaHeaderDataInteractor$headerDataStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        poz pozVar = (poz) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return i > pozVar.a ? pozVar.c : pozVar.b;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
