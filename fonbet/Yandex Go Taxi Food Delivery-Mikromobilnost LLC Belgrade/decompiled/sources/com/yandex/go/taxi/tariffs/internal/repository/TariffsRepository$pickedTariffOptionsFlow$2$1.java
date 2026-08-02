package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.bms;
import defpackage.dk31;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldk31;", "verticalInfo", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceState", "Lfnx0;", "selected", "Lkotlin/Triple;", "<anonymous>", "(Ldk31;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Lfnx0;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.repository.TariffsRepository$pickedTariffOptionsFlow$2$1", f = "TariffsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffsRepository$pickedTariffOptionsFlow$2$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public TariffsRepository$pickedTariffOptionsFlow$2$1() {
        super(4, null);
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        TariffsRepository$pickedTariffOptionsFlow$2$1 tariffsRepository$pickedTariffOptionsFlow$2$1 = new TariffsRepository$pickedTariffOptionsFlow$2$1(4, (Continuation) obj4);
        tariffsRepository$pickedTariffOptionsFlow$2$1.L$0 = (dk31) obj;
        tariffsRepository$pickedTariffOptionsFlow$2$1.L$1 = (PriceUpdate$PriceLoadingState) obj2;
        tariffsRepository$pickedTariffOptionsFlow$2$1.L$2 = (fnx0) obj3;
        return tariffsRepository$pickedTariffOptionsFlow$2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dk31 dk31Var = (dk31) this.L$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$1;
        fnx0 fnx0Var = (fnx0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple(dk31Var, priceUpdate$PriceLoadingState, fnx0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
