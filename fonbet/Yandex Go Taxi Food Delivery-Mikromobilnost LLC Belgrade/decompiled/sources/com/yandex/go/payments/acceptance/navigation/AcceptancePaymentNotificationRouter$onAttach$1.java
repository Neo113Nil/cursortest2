package com.yandex.go.payments.acceptance.navigation;

import defpackage.mvg;
import defpackage.ne;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.x5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.acceptance.navigation.AcceptancePaymentNotificationRouter$onAttach$1", f = "AcceptancePaymentNotificationRouter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AcceptancePaymentNotificationRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ ne $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptancePaymentNotificationRouter$onAttach$1(a aVar, ne neVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = neVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptancePaymentNotificationRouter$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptancePaymentNotificationRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 a = this.this$0.G.a(this.$payload.a);
            x5 x5Var = new x5(3, this.this$0);
            this.label = 1;
            if (a.collect(x5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
