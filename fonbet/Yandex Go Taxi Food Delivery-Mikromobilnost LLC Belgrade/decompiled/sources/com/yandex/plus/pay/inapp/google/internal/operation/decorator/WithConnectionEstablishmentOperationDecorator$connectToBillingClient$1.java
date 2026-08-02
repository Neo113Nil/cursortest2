package com.yandex.plus.pay.inapp.google.internal.operation.decorator;

import com.yandex.plus.log.api.LogPriority;
import defpackage.es5;
import defpackage.m851;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.pgz;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lns5;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.inapp.google.internal.operation.decorator.WithConnectionEstablishmentOperationDecorator$connectToBillingClient$1", f = "WithConnectionEstablishmentOperationDecorator.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WithConnectionEstablishmentOperationDecorator$connectToBillingClient$1 extends SuspendLambda implements wls {
    final /* synthetic */ es5 $billingClient;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithConnectionEstablishmentOperationDecorator$connectToBillingClient$1(a aVar, es5 es5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$billingClient = es5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WithConnectionEstablishmentOperationDecorator$connectToBillingClient$1 withConnectionEstablishmentOperationDecorator$connectToBillingClient$1 = new WithConnectionEstablishmentOperationDecorator$connectToBillingClient$1(this.this$0, this.$billingClient, continuation);
        withConnectionEstablishmentOperationDecorator$connectToBillingClient$1.L$0 = obj;
        return withConnectionEstablishmentOperationDecorator$connectToBillingClient$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WithConnectionEstablishmentOperationDecorator$connectToBillingClient$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            m851 m851Var = new m851(aVar, y6f0Var);
            pgz pgzVar = aVar.b;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "WithConnectionEstablishmentOperationDecorator", "Starting billing connection...");
            }
            this.$billingClient.j(m851Var);
            oay0 oay0Var = new oay0(20, this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, oay0Var, this) == coroutineSingletons) {
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
