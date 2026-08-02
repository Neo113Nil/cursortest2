package com.yandex.go.taxi.order.support.ui.support_menu;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.qjw0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.ui.support_menu.SupportMenuPresenter$attachView$$inlined$collectIn$2", f = "SupportMenuPresenter.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SupportMenuPresenter$attachView$$inlined$collectIn$2 extends SuspendLambda implements wls {
    final /* synthetic */ qjw0 $mvpView$inlined;
    final /* synthetic */ tpr $this_collectIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportMenuPresenter$attachView$$inlined$collectIn$2(tpr tprVar, Continuation continuation, qjw0 qjw0Var) {
        super(2, continuation);
        this.$this_collectIn = tprVar;
        this.$mvpView$inlined = qjw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportMenuPresenter$attachView$$inlined$collectIn$2(this.$this_collectIn, continuation, this.$mvpView$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportMenuPresenter$attachView$$inlined$collectIn$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$this_collectIn;
            qit0 qit0Var = new qit0(23, this.$mvpView$inlined);
            this.label = 1;
            if (tprVar.collect(qit0Var, this) == coroutineSingletons) {
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
