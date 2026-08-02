package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.bms;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7k0;
import defpackage.p6k0;
import defpackage.p7k0;
import defpackage.q7k0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfnx0;", "selectedTariff", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "", "isDestinationMissing", "Lr7k0;", "<anonymous>", "(Lfnx0;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Z)Lr7k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.RidaOrderButtonUiStateInteractor$uiStateFlow$1", f = "RidaOrderButtonUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RidaOrderButtonUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ p6k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaOrderButtonUiStateInteractor$uiStateFlow$1(p6k0 p6k0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = p6k0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        RidaOrderButtonUiStateInteractor$uiStateFlow$1 ridaOrderButtonUiStateInteractor$uiStateFlow$1 = new RidaOrderButtonUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        ridaOrderButtonUiStateInteractor$uiStateFlow$1.L$0 = (fnx0) obj;
        ridaOrderButtonUiStateInteractor$uiStateFlow$1.L$1 = (PriceUpdate$PriceLoadingState) obj2;
        ridaOrderButtonUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        return ridaOrderButtonUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z2 = priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING;
        boolean z3 = fnx0Var.c.u;
        if (z) {
            return new o7k0((String) this.this$0.f.getValue());
        }
        p6k0 p6k0Var = this.this$0;
        return z3 ? new o7k0((String) p6k0Var.e.getValue()) : z2 ? new q7k0((String) p6k0Var.e.getValue()) : new p7k0((String) p6k0Var.e.getValue());
    }
}
