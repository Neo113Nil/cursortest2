package com.yandex.go.scooters.offers.v2.domain;

import defpackage.b4p0;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p3o0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lp3o0;", "offersState", "Lb4p0;", "selectedTariff", "Lzy11;", "<unused var>", "Lz5n0;", "<anonymous>", "(Lcom/yandex/go/scooters/domain/model/ScootersOfferLoadResult;Lcom/yandex/go/scooters/domain/model/ScootersTariff;V)Lcom/yandex/go/scooters/offers/v2/domain/model/ScootersCardState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToScootersCardState$3", f = "ScootersCardStateInteractor.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardStateInteractor$listenToScootersCardState$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardStateInteractor$listenToScootersCardState$3(e eVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ScootersCardStateInteractor$listenToScootersCardState$3 scootersCardStateInteractor$listenToScootersCardState$3 = new ScootersCardStateInteractor$listenToScootersCardState$3(this.this$0, (Continuation) obj4);
        scootersCardStateInteractor$listenToScootersCardState$3.L$0 = (p3o0) obj;
        scootersCardStateInteractor$listenToScootersCardState$3.L$1 = (b4p0) obj2;
        return scootersCardStateInteractor$listenToScootersCardState$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p3o0 p3o0Var = (p3o0) this.L$0;
        b4p0 b4p0Var = (b4p0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.scooters.offers.v2.domain.mapper.a aVar = this.this$0.e;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object a = aVar.a(p3o0Var, b4p0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
