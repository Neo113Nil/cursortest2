package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkw;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpkw;", "previousSelectorItem", "<anonymous>", "(Lpkw;)Lpkw;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1", f = "UpdateIntercityDashboardSectionsInteractor.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1 extends SuspendLambda implements wls {
    final /* synthetic */ PriceUpdate$PriceLoadingState $priceLoadingState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1(m mVar, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$priceLoadingState = priceUpdate$PriceLoadingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1 updateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1 = new UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1(this.this$0, this.$priceLoadingState, continuation);
        updateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1.L$0 = obj;
        return updateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1) create((pkw) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pkw pkwVar = (pkw) this.L$0;
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
        m mVar = this.this$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = this.$priceLoadingState;
        this.L$0 = null;
        this.label = 1;
        Object a = m.a(mVar, pkwVar, priceUpdate$PriceLoadingState, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
