package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qtb1;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$attachView$8", f = "IntercityDashboardPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$attachView$8 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$attachView$8(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardPresenter$attachView$8(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        IntercityDashboardPresenter$attachView$8 intercityDashboardPresenter$attachView$8 = (IntercityDashboardPresenter$attachView$8) create((PriceUpdate$PriceLoadingState) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        intercityDashboardPresenter$attachView$8.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar = this.this$0.z;
        if (fVar.j.i()) {
            fVar.g.b(false);
            fVar.f.a(qtb1.D);
        }
        return zy11.a;
    }
}
