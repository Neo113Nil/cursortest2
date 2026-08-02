package com.yandex.go.payments.porttech.navigation;

import com.yandex.go.payments.porttech.domain.PaymentMethodResponse;
import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import defpackage.dce0;
import defpackage.hfa0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$handleSelectPaymentMethod$2$onPaymentSelected$1", f = "PorttechWebViewRouter.kt", l = {226}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorttechWebViewRouter$handleSelectPaymentMethod$2$onPaymentSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ hfa0 $payment;
    final /* synthetic */ PorttechJsNativeApi $porttechJsNativeApi;
    final /* synthetic */ String $promiseId;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechWebViewRouter$handleSelectPaymentMethod$2$onPaymentSelected$1(hfa0 hfa0Var, d dVar, PorttechJsNativeApi porttechJsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.$payment = hfa0Var;
        this.this$0 = dVar;
        this.$porttechJsNativeApi = porttechJsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechWebViewRouter$handleSelectPaymentMethod$2$onPaymentSelected$1(this.$payment, this.this$0, this.$porttechJsNativeApi, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorttechWebViewRouter$handleSelectPaymentMethod$2$onPaymentSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lea0 b = this.$payment.b();
            d dVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            obj = dVar.Q(b, this);
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
        dce0 dce0Var = (dce0) obj;
        this.this$0.O = dce0Var;
        if (dce0Var != null) {
            this.$porttechJsNativeApi.resolveSelectPaymentMethod(this.$promiseId, new PaymentMethodResponse(dce0Var.a, dce0Var.b.getCode(), dce0Var.c, dce0Var.d));
        }
        return zy11.a;
    }
}
