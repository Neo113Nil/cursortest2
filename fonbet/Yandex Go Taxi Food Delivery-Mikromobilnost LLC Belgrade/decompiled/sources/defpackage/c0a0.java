package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.MetricaInitMode;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;

/* loaded from: classes2.dex */
public final class c0a0 {
    public final Context a;
    public final PaymentSdkEnvironment b;
    public final ConsoleLoggingMode c;

    public c0a0(Context context, PaymentSdkEnvironment paymentSdkEnvironment, ConsoleLoggingMode consoleLoggingMode) {
        this.a = context;
        this.b = paymentSdkEnvironment;
        this.c = consoleLoggingMode;
        new h2a0(context, paymentSdkEnvironment, consoleLoggingMode, MetricaInitMode.PAYMENT_SDK_DIALOG);
    }

    public final ksi0 a(Payer payer, Merchant merchant, AdditionalSettings additionalSettings, cvy0 cvy0Var, ev5 ev5Var) {
        ksi0 ksi0Var = new ksi0(this.a.getApplicationContext(), payer, merchant, this.b, additionalSettings, this.c, ev5Var);
        ckt.a = cvy0Var;
        djr.a = cvy0Var;
        return ksi0Var;
    }
}
