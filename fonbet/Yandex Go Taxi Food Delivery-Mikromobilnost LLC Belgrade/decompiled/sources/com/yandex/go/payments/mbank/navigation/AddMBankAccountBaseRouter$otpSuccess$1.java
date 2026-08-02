package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodAnalytics$AddMBankOTPCodeStatus;
import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wi0;
import defpackage.wls;
import defpackage.zi0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$otpSuccess$1", f = "AddMBankAccountBaseRouter.kt", l = {307}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMBankAccountBaseRouter$otpSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ WebviewBindingFlow $info;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ WebviewBindingFlow.PaymentMethodBindResponseSignal $signal;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMBankAccountBaseRouter$otpSuccess$1(b bVar, WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal, Map map, WebviewBindingFlow webviewBindingFlow, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$signal = paymentMethodBindResponseSignal;
        this.$params = map;
        this.$info = webviewBindingFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMBankAccountBaseRouter$otpSuccess$1(this.this$0, this.$signal, this.$params, this.$info, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddMBankAccountBaseRouter$otpSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            String P = b.P(this.this$0, this.$signal, this.$params, WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action.STATUS);
            if (P == null) {
                return zy11Var;
            }
            WebviewBindingFlow.PaymentMethodBindResponseSignalParam paymentMethodBindResponseSignalParam = (WebviewBindingFlow.PaymentMethodBindResponseSignalParam) kotlin.collections.a.R(this.$signal.c);
            boolean equals = P.equals(paymentMethodBindResponseSignalParam != null ? paymentMethodBindResponseSignalParam.c : null);
            b bVar = this.this$0;
            if (!equals) {
                bVar.I.b(PaymentMethodAnalytics$AddMBankOTPCodeStatus.Falied);
                return zy11Var;
            }
            bVar.I.b(PaymentMethodAnalytics$AddMBankOTPCodeStatus.Success);
            String str = this.$info.c;
            if (str == null) {
                str = ((avj0) this.this$0.G).h(kyh0.add_payment_method_preparing_loading_text);
            }
            wi0 wi0Var = this.this$0.M;
            ai0 ai0Var = new ai0(str, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            wi0Var.a(ai0Var, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar2 = this.this$0;
        zi0 zi0Var = (zi0) bVar2.K.get();
        bVar2.O = zi0Var;
        bVar2.z(zi0Var, sy60.Q2);
        return zy11Var;
    }
}
