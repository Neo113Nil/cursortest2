package com.yandex.fintechsdk.flows.payment.kit.internal.activity;

import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2a0;
import defpackage.r2a0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$setupDismissHandler$1", f = "PaymentKitActivityDelegate.kt", l = {290}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PaymentKitActivityDelegate$setupDismissHandler$1 extends SuspendLambda implements wls {
    final /* synthetic */ lz40 $dismissFlow;
    int label;
    final /* synthetic */ r2a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentKitActivityDelegate$setupDismissHandler$1(lz40 lz40Var, r2a0 r2a0Var, Continuation continuation) {
        super(2, continuation);
        this.$dismissFlow = lz40Var;
        this.this$0 = r2a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentKitActivityDelegate$setupDismissHandler$1(this.$dismissFlow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentKitActivityDelegate$setupDismissHandler$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lz40 lz40Var = this.$dismissFlow;
            o2a0 o2a0Var = new o2a0(this.this$0, 1);
            this.label = 1;
            if (lz40Var.collect(o2a0Var, this) == coroutineSingletons) {
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
