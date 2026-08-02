package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.lnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkw;
import defpackage.qkw;
import defpackage.wls;
import defpackage.xfw;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpkw;", "previousSelectorItem", "<anonymous>", "(Lpkw;)Lpkw;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2", f = "UpdateIntercityDashboardSectionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2 extends SuspendLambda implements wls {
    final /* synthetic */ xfw $tariffSelection;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2(m mVar, xfw xfwVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$tariffSelection = xfwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2 updateIntercityDashboardSectionsInteractor$applyTariffChange$2 = new UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2(this.this$0, this.$tariffSelection, continuation);
        updateIntercityDashboardSectionsInteractor$applyTariffChange$2.L$0 = obj;
        return updateIntercityDashboardSectionsInteractor$applyTariffChange$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2) create((pkw) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pkw pkwVar = (pkw) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qkw qkwVar = this.this$0.a;
        lnx0 lnx0Var = new lnx0(this.$tariffSelection.a);
        qkwVar.getClass();
        return qkw.a(pkwVar, lnx0Var);
    }
}
