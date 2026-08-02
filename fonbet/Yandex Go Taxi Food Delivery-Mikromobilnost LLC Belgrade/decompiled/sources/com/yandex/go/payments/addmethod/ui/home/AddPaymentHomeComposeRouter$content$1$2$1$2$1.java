package com.yandex.go.payments.addmethod.ui.home;

import defpackage.gg0;
import defpackage.mh0;
import defpackage.mvg;
import defpackage.ny61;
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
@mvg(c = "com.yandex.go.payments.addmethod.ui.home.AddPaymentHomeComposeRouter$content$1$2$1$2$1", f = "AddPaymentHomeComposeRouter.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddPaymentHomeComposeRouter$content$1$2$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $errorMessage;
    int label;
    final /* synthetic */ gg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentHomeComposeRouter$content$1$2$1$2$1(gg0 gg0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gg0Var;
        this.$errorMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddPaymentHomeComposeRouter$content$1$2$1$2$1(this.this$0, this.$errorMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddPaymentHomeComposeRouter$content$1$2$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0.L;
        String str = this.$errorMessage;
        this.label = 1;
        r0 r0Var = eVar.f;
        xh0 xh0Var = (xh0) r0Var.getValue();
        if (xh0Var instanceof mh0) {
            r0Var.emit(mh0.b((mh0) xh0Var, str), this);
        }
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
