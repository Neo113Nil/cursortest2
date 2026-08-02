package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ev5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ old0 b;

    public /* synthetic */ ev5(old0 old0Var, int i) {
        this.a = i;
        this.b = old0Var;
    }

    public final void a(g0a0 g0a0Var) {
        int i = this.a;
        old0 old0Var = this.b;
        switch (i) {
            case 0:
                a aVar = (a) old0Var;
                if (g0a0Var instanceof f0a0) {
                    r0 r0Var = aVar.h;
                    PaymentKitError paymentKitError = ((f0a0) g0a0Var).a;
                    PlusSelectPaymentMethodState.NonTerminalError nonTerminalError = new PlusSelectPaymentMethodState.NonTerminalError(paymentKitError.getMessage(), paymentKitError.getCode(), paymentKitError.getStatus(), paymentKitError.getKind().name(), paymentKitError.getTrigger().name());
                    r0Var.getClass();
                    r0Var.m(null, nonTerminalError);
                    break;
                }
                break;
            default:
                com.yandex.plus.paymentsdk.internal.method.sbp.a aVar2 = (com.yandex.plus.paymentsdk.internal.method.sbp.a) old0Var;
                if (g0a0Var instanceof f0a0) {
                    r0 r0Var2 = aVar2.h;
                    PaymentKitError paymentKitError2 = ((f0a0) g0a0Var).a;
                    PlusSelectPaymentMethodState.NonTerminalError nonTerminalError2 = new PlusSelectPaymentMethodState.NonTerminalError(paymentKitError2.getMessage(), paymentKitError2.getCode(), paymentKitError2.getStatus(), paymentKitError2.getKind().name(), paymentKitError2.getTrigger().name());
                    r0Var2.getClass();
                    r0Var2.m(null, nonTerminalError2);
                    break;
                }
                break;
        }
    }
}
