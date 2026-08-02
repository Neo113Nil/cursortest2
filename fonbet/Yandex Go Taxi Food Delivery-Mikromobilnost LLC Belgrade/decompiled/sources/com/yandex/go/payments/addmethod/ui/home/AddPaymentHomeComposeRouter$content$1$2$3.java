package com.yandex.go.payments.addmethod.ui.home;

import defpackage.g9a0;
import defpackage.gg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.ui.home.AddPaymentHomeComposeRouter$content$1$2$3", f = "AddPaymentHomeComposeRouter.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddPaymentHomeComposeRouter$content$1$2$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ gg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentHomeComposeRouter$content$1$2$3(gg0 gg0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddPaymentHomeComposeRouter$content$1$2$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddPaymentHomeComposeRouter$content$1$2$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.L;
            this.label = 1;
            obj = eVar.c(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            g9a0 g9a0Var = this.this$0.H;
            g9a0Var.getClass();
            g9a0Var.a.a("PaymentMethods.YapeToken.Close", new HashMap(), 1, new HashMap());
            this.this$0.r(new qu(9));
        }
        return zy11.a;
    }
}
