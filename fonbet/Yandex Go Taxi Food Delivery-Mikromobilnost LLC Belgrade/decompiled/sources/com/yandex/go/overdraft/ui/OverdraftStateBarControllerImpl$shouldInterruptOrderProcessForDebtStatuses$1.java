package com.yandex.go.overdraft.ui;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.h0a0;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.mz80;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.pz80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.ui.OverdraftStateBarControllerImpl$shouldInterruptOrderProcessForDebtStatuses$1", f = "OverdraftStateBarControllerImpl.kt", l = {248}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftStateBarControllerImpl$shouldInterruptOrderProcessForDebtStatuses$1 extends SuspendLambda implements wls {
    final /* synthetic */ Preorder $preorder;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftStateBarControllerImpl$shouldInterruptOrderProcessForDebtStatuses$1(g gVar, Preorder preorder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$preorder = preorder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftStateBarControllerImpl$shouldInterruptOrderProcessForDebtStatuses$1(this.this$0, this.$preorder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftStateBarControllerImpl$shouldInterruptOrderProcessForDebtStatuses$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OverdraftContext overdraftContext;
        mz80 mz80Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            overdraftContext = OverdraftContext.ORDER_WITH_DEBT;
            g gVar = this.this$0;
            mz80 mz80Var2 = new mz80(1, gVar, this.$preorder);
            this.L$0 = overdraftContext;
            this.L$1 = mz80Var2;
            this.label = 1;
            obj = g.h(gVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            mz80Var = mz80Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mz80Var = (mz80) this.L$1;
            overdraftContext = (OverdraftContext) this.L$0;
            kotlin.b.b(obj);
        }
        pz80 pz80Var = new pz80(overdraftContext, mz80Var, (h0a0) obj);
        g gVar2 = this.this$0;
        ((pep0) gVar2.w).f(gVar2.v, pz80Var, hxx.a);
        return zy11.a;
    }
}
