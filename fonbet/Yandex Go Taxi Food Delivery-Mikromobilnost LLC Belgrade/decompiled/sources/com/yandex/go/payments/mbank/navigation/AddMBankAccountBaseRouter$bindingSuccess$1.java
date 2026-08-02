package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodAnalytics$AddMBankBindingStatus;
import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import defpackage.ai0;
import defpackage.ff41;
import defpackage.h0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.nf0;
import defpackage.ny61;
import defpackage.scg;
import defpackage.tls;
import defpackage.wi0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$bindingSuccess$1", f = "AddMBankAccountBaseRouter.kt", l = {339, 349, 352}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMBankAccountBaseRouter$bindingSuccess$1 extends SuspendLambda implements tls {
    final /* synthetic */ WebviewBindingFlow $info;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ WebviewBindingFlow.PaymentMethodBindResponseSignal $signal;
    final /* synthetic */ ff41 $webContainerApi;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMBankAccountBaseRouter$bindingSuccess$1(b bVar, ff41 ff41Var, WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal, Map map, WebviewBindingFlow webviewBindingFlow, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$webContainerApi = ff41Var;
        this.$signal = paymentMethodBindResponseSignal;
        this.$params = map;
        this.$info = webviewBindingFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AddMBankAccountBaseRouter$bindingSuccess$1(this.this$0, this.$webContainerApi, this.$signal, this.$params, this.$info, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AddMBankAccountBaseRouter$bindingSuccess$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r2 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007c, code lost:
    
        if (r11 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String P;
        Object obj2;
        String id;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 2;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.I.a(PaymentMethodAnalytics$AddMBankBindingStatus.Success);
            ((scg) this.$webContainerApi).b().i();
            P = b.P(this.this$0, this.$signal, this.$params, WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action.PAYMENT_METHOD_ID);
            if (P == null) {
                ny61.k();
                return null;
            }
            nf0 nf0Var = this.this$0.D;
            this.L$0 = P;
            this.label = 1;
            obj = nf0Var.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$3;
                    kotlin.b.b(obj);
                    this.this$0.r(new h0(str, i2));
                    return zy11Var;
                }
                String str2 = (String) this.L$3;
                kotlin.b.b(obj);
                id = str2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = id;
                this.label = 3;
                if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                    str = id;
                    this.this$0.r(new h0(str, i2));
                    return zy11Var;
                }
                return coroutineSingletons;
            }
            P = (String) this.L$0;
            kotlin.b.b(obj);
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            lea0 lea0Var = (lea0) obj2;
            if (lea0Var.c() == PaymentMethod$Type.MBANK_ACCOUNT && jl40.l(lea0Var.getId(), P)) {
                break;
            }
        }
        lea0 lea0Var2 = (lea0) obj2;
        id = lea0Var2 != null ? lea0Var2.getId() : null;
        if (id == null) {
            jst.e.i("Payments.AddMBankAccountBaseRouter", new IllegalStateException("Added MBank account not found in /paymentmethods response!"));
            ny61.r("Added MBank account not found in /paymentmethods response!");
            return null;
        }
        wi0 wi0Var = this.this$0.M;
        ai0 ai0Var = new ai0(this.$info.a, AddPaymentInfo$AddPaymentInfoStatus.DONE);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = id;
        this.label = 2;
        wi0Var.a(ai0Var, this);
    }
}
