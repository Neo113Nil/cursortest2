package com.yandex.go.taxi.order.robotaxi.ui;

import defpackage.cfj0;
import defpackage.mvg;
import defpackage.mvk0;
import defpackage.ny61;
import defpackage.rvk0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalViewPresenter$attachView$1", f = "RobotaxiModalViewPresenter.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RobotaxiModalViewPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ rvk0 $mvpView;
    int label;
    final /* synthetic */ mvk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotaxiModalViewPresenter$attachView$1(mvk0 mvk0Var, rvk0 rvk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mvk0Var;
        this.$mvpView = rvk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RobotaxiModalViewPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RobotaxiModalViewPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g X = e.X(this.this$0.D.a(), new RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            cfj0 cfj0Var = new cfj0(8, this.$mvpView);
            this.label = 1;
            if (X.collect(cfj0Var, this) == coroutineSingletons) {
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
