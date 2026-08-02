package com.yandex.go.something_wrong_screen.ui;

import defpackage.c8t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8t0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x8t0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.something_wrong_screen.ui.SomethingWrongOnboardingScreenPresenter$onOnboardingShown$1", f = "SomethingWrongOnboardingScreenPresenter.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SomethingWrongOnboardingScreenPresenter$onOnboardingShown$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c8t0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SomethingWrongOnboardingScreenPresenter$onOnboardingShown$1(c8t0 c8t0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c8t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SomethingWrongOnboardingScreenPresenter$onOnboardingShown$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SomethingWrongOnboardingScreenPresenter$onOnboardingShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        s8t0 s8t0Var = this.this$0.x;
        this.label = 1;
        com.yandex.go.something_wrong_screen.repository.b bVar = s8t0Var.a;
        Object e = bVar.e(bVar.d, new x8t0(0), this);
        if (e != coroutineSingletons) {
            e = zy11Var;
        }
        return e == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
