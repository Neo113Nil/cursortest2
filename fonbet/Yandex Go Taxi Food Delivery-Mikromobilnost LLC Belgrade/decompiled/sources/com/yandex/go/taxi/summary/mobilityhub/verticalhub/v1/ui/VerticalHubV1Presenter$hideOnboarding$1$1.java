package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc31;
import defpackage.wls;
import defpackage.x0v;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1Presenter$hideOnboarding$1$1", f = "VerticalHubV1Presenter.kt", l = {332}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV1Presenter$hideOnboarding$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ x0v $it;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV1Presenter$hideOnboarding$1$1(c cVar, x0v x0vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$it = x0vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalHubV1Presenter$hideOnboarding$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalHubV1Presenter$hideOnboarding$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.M.b.add(this.$it.a);
        uc31 uc31Var = this.this$0.H;
        this.label = 1;
        return uc31Var.c.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
