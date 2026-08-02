package com.yandex.go.payments.mbank.navigation;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import defpackage.a60;
import defpackage.evu0;
import defpackage.h4a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$openExternalUrl$1", f = "AddMBankAccountBaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMBankAccountBaseRouter$openExternalUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ WebviewBindingFlow.PaymentMethodBindResponseSignal $signal;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMBankAccountBaseRouter$openExternalUrl$1(b bVar, WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$signal = paymentMethodBindResponseSignal;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMBankAccountBaseRouter$openExternalUrl$1(this.this$0, this.$signal, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddMBankAccountBaseRouter$openExternalUrl$1 addMBankAccountBaseRouter$openExternalUrl$1 = (AddMBankAccountBaseRouter$openExternalUrl$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addMBankAccountBaseRouter$openExternalUrl$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h4a0 h4a0Var = this.this$0.I;
        h4a0Var.getClass();
        h4a0Var.a.a("PaymentMethod.AddMBank.Info", new HashMap(), 1, new HashMap());
        String P = b.P(this.this$0, this.$signal, this.$params, WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action.URL);
        if (P != null && !evu0.J(P)) {
            try {
                ((a60) this.this$0.F).b(new Intent("android.intent.action.VIEW", Uri.parse(P)));
            } catch (Exception unused) {
            }
        }
        return zy11.a;
    }
}
