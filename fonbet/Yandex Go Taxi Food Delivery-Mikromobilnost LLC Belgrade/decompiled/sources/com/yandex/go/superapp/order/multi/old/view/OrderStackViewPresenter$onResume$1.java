package com.yandex.go.superapp.order.multi.old.view;

import defpackage.a780;
import defpackage.lw40;
import defpackage.mvg;
import defpackage.mw40;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewPresenter$onResume$1", f = "OrderStackViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewPresenter$onResume$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewPresenter$onResume$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStackViewPresenter$onResume$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderStackViewPresenter$onResume$1 orderStackViewPresenter$onResume$1 = (OrderStackViewPresenter$onResume$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderStackViewPresenter$onResume$1.invokeSuspend(zy11Var);
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
        f fVar = this.this$0;
        mw40 mw40Var = fVar.F;
        a780 a780Var = new a780(fVar);
        mw40Var.a = a780Var;
        lw40 lw40Var = mw40Var.b;
        if (lw40Var != null) {
            a780Var.a(lw40Var);
            mw40Var.b = null;
        }
        return zy11.a;
    }
}
