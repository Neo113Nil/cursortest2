package com.yandex.go.payments.delivery.navigation;

import defpackage.aii;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zhi;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.delivery.navigation.DeliveryPaymentListRouterImpl$onLaunch$1", f = "DeliveryPaymentListRouterImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DeliveryPaymentListRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ zhi $payload;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPaymentListRouterImpl$onLaunch$1(a aVar, zhi zhiVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = zhiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryPaymentListRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryPaymentListRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        m950 m950Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            m950 m950Var2 = (m950) aVar.D.get();
            a aVar2 = this.this$0;
            zhi zhiVar = this.$payload;
            this.L$0 = aVar;
            this.L$1 = m950Var2;
            this.label = 1;
            Object P = a.P(aVar2, zhiVar, this);
            if (P == coroutineSingletons) {
                return coroutineSingletons;
            }
            m950Var = m950Var2;
            obj = P;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m950Var = (m950) this.L$1;
            aVar = (a) this.L$0;
            b.b(obj);
        }
        aVar.A(m950Var, obj, new aii(this.this$0, 0));
        return zy11.a;
    }
}
