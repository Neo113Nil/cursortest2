package com.yandex.go.taxi.summary.drive.vertical_tariff_selector;

import defpackage.iqx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yi31;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Liqx0;", "tariffState", "", "Lob31;", "verticals", "Lyi31;", "<anonymous>", "(Liqx0;Ljava/util/List;)Lyi31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorUiStateInteractor$stateFlow$1", f = "VerticalTariffSelectorUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalTariffSelectorUiStateInteractor$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalTariffSelectorUiStateInteractor$stateFlow$1 verticalTariffSelectorUiStateInteractor$stateFlow$1 = new VerticalTariffSelectorUiStateInteractor$stateFlow$1(3, (Continuation) obj3);
        verticalTariffSelectorUiStateInteractor$stateFlow$1.L$0 = (iqx0) obj;
        verticalTariffSelectorUiStateInteractor$stateFlow$1.L$1 = (List) obj2;
        return verticalTariffSelectorUiStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        iqx0 iqx0Var = (iqx0) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new yi31(list, iqx0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
