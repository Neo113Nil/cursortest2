package defpackage;

import android.widget.TextView;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final /* synthetic */ class mv90 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PaymentActivity b;

    public /* synthetic */ mv90(PaymentActivity paymentActivity, int i) {
        this.a = i;
        this.b = paymentActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        bqr0 activityViewModel_delegate$lambda$0;
        ay90 paymentComponent_delegate$lambda$0;
        TextView orCreateCallbacks$lambda$0;
        PaymentButtonView orCreateCallbacks$lambda$1;
        int i = this.a;
        PaymentActivity paymentActivity = this.b;
        switch (i) {
            case 0:
                activityViewModel_delegate$lambda$0 = PaymentActivity.activityViewModel_delegate$lambda$0(paymentActivity);
                return activityViewModel_delegate$lambda$0;
            case 1:
                paymentComponent_delegate$lambda$0 = PaymentActivity.paymentComponent_delegate$lambda$0(paymentActivity);
                return paymentComponent_delegate$lambda$0;
            case 2:
                orCreateCallbacks$lambda$0 = PaymentActivity.getOrCreateCallbacks$lambda$0(paymentActivity);
                return orCreateCallbacks$lambda$0;
            default:
                orCreateCallbacks$lambda$1 = PaymentActivity.getOrCreateCallbacks$lambda$1(paymentActivity);
                return orCreateCallbacks$lambda$1;
        }
    }
}
