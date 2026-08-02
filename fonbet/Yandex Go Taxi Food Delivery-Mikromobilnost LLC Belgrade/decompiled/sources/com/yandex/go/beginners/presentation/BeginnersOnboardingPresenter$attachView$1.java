package com.yandex.go.beginners.presentation;

import defpackage.cl5;
import defpackage.dl5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.presentation.BeginnersOnboardingPresenter$attachView$1", f = "BeginnersOnboardingPresenter.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BeginnersOnboardingPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ cl5 $mvpView;
    int label;
    final /* synthetic */ dl5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersOnboardingPresenter$attachView$1(dl5 dl5Var, cl5 cl5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dl5Var;
        this.$mvpView = cl5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersOnboardingPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersOnboardingPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.lifecycle.a aVar = this.this$0.B;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$mvpView.startAnimation();
        return zy11.a;
    }
}
