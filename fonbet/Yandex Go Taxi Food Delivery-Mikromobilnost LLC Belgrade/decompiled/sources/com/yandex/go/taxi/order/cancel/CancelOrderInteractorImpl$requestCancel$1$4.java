package com.yandex.go.taxi.order.cancel;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qw7;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lv780;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.CancelOrderInteractorImpl$requestCancel$1$4", f = "CancelOrderInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelOrderInteractorImpl$requestCancel$1$4 extends SuspendLambda implements zls {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ qw7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelOrderInteractorImpl$requestCancel$1$4(qw7 qw7Var, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = qw7Var;
        this.$orderId = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CancelOrderInteractorImpl$requestCancel$1$4 cancelOrderInteractorImpl$requestCancel$1$4 = new CancelOrderInteractorImpl$requestCancel$1$4(this.this$0, this.$orderId, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        cancelOrderInteractorImpl$requestCancel$1$4.invokeSuspend(zy11Var);
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
        qw7 qw7Var = this.this$0;
        String str = this.$orderId;
        synchronized (qw7Var) {
            l8x l8xVar = (l8x) qw7Var.g.remove(str);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
        }
        return zy11.a;
    }
}
