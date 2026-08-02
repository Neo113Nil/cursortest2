package com.yandex.go.scooters.preselection.loading.v2;

import defpackage.cmo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v41;
import defpackage.wls;
import defpackage.ylo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.preselection.loading.v2.ScootersPreselectionLoadingPresenter$attachView$3", f = "ScootersPreselectionLoadingV2Presenter.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreselectionLoadingPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ cmo0 $mvpView;
    int label;
    final /* synthetic */ ylo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreselectionLoadingPresenter$attachView$3(ylo0 ylo0Var, cmo0 cmo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ylo0Var;
        this.$mvpView = cmo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreselectionLoadingPresenter$attachView$3(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreselectionLoadingPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            h b = this.this$0.B.b();
            v41 v41Var = new v41(25, this.$mvpView);
            this.label = 1;
            if (b.collect(v41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
