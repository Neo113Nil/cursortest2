package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6k0;
import defpackage.t7k0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "isTariffUnavailable", "", "Lr6k0;", "pricesList", "", "selectedPriceIndex", "selectedPrice", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "Lt7k0;", "<anonymous>", "(ZLjava/util/List;ILr6k0;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)Lt7k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.RidaPriceSelectorUiStateInteractor$uiStateFlow$1", f = "RidaPriceSelectorUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RidaPriceSelectorUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;

    public RidaPriceSelectorUiStateInteractor$uiStateFlow$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj3).intValue();
        RidaPriceSelectorUiStateInteractor$uiStateFlow$1 ridaPriceSelectorUiStateInteractor$uiStateFlow$1 = new RidaPriceSelectorUiStateInteractor$uiStateFlow$1((Continuation) obj6);
        ridaPriceSelectorUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        ridaPriceSelectorUiStateInteractor$uiStateFlow$1.L$0 = (List) obj2;
        ridaPriceSelectorUiStateInteractor$uiStateFlow$1.I$0 = intValue;
        ridaPriceSelectorUiStateInteractor$uiStateFlow$1.L$1 = (r6k0) obj4;
        ridaPriceSelectorUiStateInteractor$uiStateFlow$1.L$2 = (PriceUpdate$PriceLoadingState) obj5;
        return ridaPriceSelectorUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        List list = (List) this.L$0;
        int i = this.I$0;
        r6k0 r6k0Var = (r6k0) this.L$1;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            return new t7k0(false, "—", false, false);
        }
        String str = r6k0Var.a;
        boolean z2 = i + (-1) >= 0;
        return new t7k0(priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING, str, i + 1 < list.size(), z2);
    }
}
