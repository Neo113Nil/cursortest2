package com.yandex.go.inapp_calls.ui.select;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk7;
import defpackage.qk7;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ud;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.ui.select.CallTypeSelectPresenter$attachView$$inlined$collectIn$1", f = "CallTypeSelectPresenter.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class CallTypeSelectPresenter$attachView$$inlined$collectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ pk7 $mvpView$inlined;
    final /* synthetic */ tpr $this_collectIn;
    int label;
    final /* synthetic */ qk7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallTypeSelectPresenter$attachView$$inlined$collectIn$1(tpr tprVar, Continuation continuation, pk7 pk7Var, qk7 qk7Var) {
        super(2, continuation);
        this.$this_collectIn = tprVar;
        this.$mvpView$inlined = pk7Var;
        this.this$0 = qk7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallTypeSelectPresenter$attachView$$inlined$collectIn$1(this.$this_collectIn, continuation, this.$mvpView$inlined, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallTypeSelectPresenter$attachView$$inlined$collectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$this_collectIn;
            ud udVar = new ud(3, this.$mvpView$inlined, this.this$0);
            this.label = 1;
            if (tprVar.collect(udVar, this) == coroutineSingletons) {
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
