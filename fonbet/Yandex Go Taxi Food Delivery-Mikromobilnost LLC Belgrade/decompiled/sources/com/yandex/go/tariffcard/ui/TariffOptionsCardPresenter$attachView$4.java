package com.yandex.go.tariffcard.ui;

import defpackage.gix0;
import defpackage.hix0;
import defpackage.iix0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.viv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardPresenter$attachView$4", f = "TariffOptionsCardPresenter.kt", l = {249}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardPresenter$attachView$4 extends SuspendLambda implements wls {
    final /* synthetic */ gix0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ iix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardPresenter$attachView$4(iix0 iix0Var, gix0 gix0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iix0Var;
        this.$mvpView = gix0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffOptionsCardPresenter$attachView$4(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsCardPresenter$attachView$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            viv0 viv0Var = this.this$0.Q;
            viv0Var.getClass();
            tpr t = kotlinx.coroutines.flow.e.t(new h(new com.yandex.go.tariffcard.experiment.q(ru.yandex.taxi.experiments.d.a(viv0Var)), this.this$0));
            gix0 gix0Var = this.$mvpView;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(t, new TariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            hix0 hix0Var = new hix0(gix0Var, 2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(hix0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
