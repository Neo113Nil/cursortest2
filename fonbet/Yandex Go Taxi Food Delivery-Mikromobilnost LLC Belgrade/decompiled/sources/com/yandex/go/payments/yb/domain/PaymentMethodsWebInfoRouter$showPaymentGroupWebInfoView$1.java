package com.yandex.go.payments.yb.domain;

import defpackage.dt41;
import defpackage.ft41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.yb.domain.PaymentMethodsWebInfoRouter$showPaymentGroupWebInfoView$1", f = "PaymentMethodsWebInfoRouter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsWebInfoRouter$showPaymentGroupWebInfoView$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsWebInfoRouter$showPaymentGroupWebInfoView$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsWebInfoRouter$showPaymentGroupWebInfoView$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsWebInfoRouter$showPaymentGroupWebInfoView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dt41 dt41Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dt41 dt41Var2 = (dt41) this.this$0.a.get();
            b bVar = this.this$0;
            String str = this.$url;
            this.L$0 = dt41Var2;
            this.label = 1;
            Object a = b.a(bVar, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            dt41Var = dt41Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dt41Var = (dt41) this.L$0;
            kotlin.b.b(obj);
        }
        ((ft41) dt41Var).Q((UiWebViewConfig) obj);
        return zy11.a;
    }
}
