package com.yandex.go.taxi.order.promotions.modal_default.router;

import defpackage.a3y0;
import defpackage.fd60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pr70;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tr70;
import defpackage.tse;
import defpackage.ur70;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.modal_default.router.OrderDefaultModalRouterImpl$onAttach$1", f = "OrderDefaultModalRouterImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderDefaultModalRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ tr70 $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDefaultModalRouterImpl$onAttach$1(a aVar, tr70 tr70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = tr70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDefaultModalRouterImpl$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDefaultModalRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        tr70 tr70Var;
        a aVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar4 = this.this$0;
                tr70 tr70Var2 = this.$payload;
                try {
                    aVar4.H.getClass();
                    sjh sjhVar = uyj.a;
                    OrderDefaultModalRouterImpl$onAttach$1$1$1 orderDefaultModalRouterImpl$onAttach$1$1$1 = new OrderDefaultModalRouterImpl$onAttach$1$1$1(aVar4, tr70Var2, null);
                    this.L$0 = aVar4;
                    this.L$1 = tr70Var2;
                    this.L$2 = aVar4;
                    this.L$3 = aVar4;
                    this.label = 1;
                    Object k0 = tje.k0(sjhVar, orderDefaultModalRouterImpl$onAttach$1$1$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar4;
                    tr70Var = tr70Var2;
                    obj = k0;
                    aVar3 = aVar2;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar4;
                    a3y0.d(aVar.J, "onAttach", th, null, 4);
                    aVar.r(new ur70(0));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = (a) this.L$3;
                aVar = (a) this.L$2;
                tr70Var = (tr70) this.L$1;
                aVar3 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    a3y0.d(aVar.J, "onAttach", th, null, 4);
                    aVar.r(new ur70(0));
                    return zy11.a;
                }
            }
            aVar2.K = (pr70) obj;
            if (aVar3.K == null) {
                aVar3.r(new fd60(29));
            } else {
                super/*com.yandex.go.navigation.modals.coroutines.a*/.G(tr70Var);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
