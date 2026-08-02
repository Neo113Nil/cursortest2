package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardNavigationTarget;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.k;
import defpackage.mvg;
import defpackage.nfw;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ujw;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$onOpenSummaryClick$1", f = "IntercityDashboardPresenter.kt", l = {351}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$onOpenSummaryClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ ujw $selectedTariffInfo;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$onOpenSummaryClick$1(g gVar, ujw ujwVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$selectedTariffInfo = ujwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardPresenter$onOpenSummaryClick$1(this.this$0, this.$selectedTariffInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardPresenter$onOpenSummaryClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0.P;
            this.label = 1;
            if (kVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        nfw nfwVar = this.this$0.x;
        ujw ujwVar = this.$selectedTariffInfo;
        nfwVar.a.r(new com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.a(ujwVar.a, ujwVar.b));
        this.this$0.M.a(IntercityDashboardNavigationTarget.SUMMARY);
        return zy11.a;
    }
}
