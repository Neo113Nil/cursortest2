package com.yandex.go.payments.addmethod.ui.home;

import defpackage.eh0;
import defpackage.gg0;
import defpackage.jh0;
import defpackage.kk0;
import defpackage.mh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qh0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.ui.home.AddPaymentHomeComposeRouter$content$1$2$1", f = "AddPaymentHomeComposeRouter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddPaymentHomeComposeRouter$content$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ jh0 $action;
    Object L$0;
    int label;
    final /* synthetic */ gg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentHomeComposeRouter$content$1$2$1(jh0 jh0Var, gg0 gg0Var, Continuation continuation) {
        super(2, continuation);
        this.$action = jh0Var;
        this.this$0 = gg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddPaymentHomeComposeRouter$content$1$2$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddPaymentHomeComposeRouter$content$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qh0 qh0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            qh0 qh0Var2 = ((eh0) this.$action).c;
            e eVar = this.this$0.L;
            this.L$0 = qh0Var2;
            this.label = 1;
            r0 r0Var = eVar.f;
            xh0 xh0Var = (xh0) r0Var.getValue();
            if (xh0Var instanceof mh0) {
                mh0 mh0Var = (mh0) xh0Var;
                if (mh0Var.j != null) {
                    r0Var.emit(mh0.b(mh0Var, null), this);
                }
            }
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
            qh0Var = qh0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qh0Var = (qh0) this.L$0;
            kotlin.b.b(obj);
        }
        gg0 gg0Var = this.this$0;
        kk0 kk0Var = gg0Var.J;
        eh0 eh0Var = (eh0) this.$action;
        kk0Var.c(eh0Var.b, eh0Var.a, new b(qh0Var, gg0Var), new a(gg0Var, 1));
        return zy11Var;
    }
}
