package com.yandex.go.taxi.order.cancel.v2.mvp;

import com.yandex.go.taxi.order.cancel.v2.domain.interactor.f;
import defpackage.at20;
import defpackage.b2k;
import defpackage.fd60;
import defpackage.i350;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.wk70;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalPresenter$attachView$2", f = "OrderCancelModalPresenter.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelModalPresenter$attachView$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ wk70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelModalPresenter$attachView$2(wk70 wk70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wk70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderCancelModalPresenter$attachView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderCancelModalPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            at20 at20Var = this.this$0.y;
            mth mthVar = new mth(e.t(new f(((o2y0) at20Var.a).a())), 4);
            ((tt2) at20Var.b).getClass();
            sjh sjhVar = uyj.a;
            b2k l = vng.l(e.F(mthVar, mdh.b), new fd60(19), vng.c);
            i350 i350Var = new i350(11, this.this$0);
            this.label = 1;
            if (l.collect(i350Var, this) == coroutineSingletons) {
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
