package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;

/* loaded from: classes2.dex */
public final class a0a0 {
    public Context a;
    public PaymentSdkEnvironment b = PaymentSdkEnvironment.PRODUCTION;
    public ConsoleLoggingMode c = ConsoleLoggingMode.AUTOMATIC;

    public final c0a0 a() {
        Context context = this.a;
        if (context != null) {
            return new c0a0(context, this.b, this.c);
        }
        ny61.g("Provide application context");
        return null;
    }

    public final void b(ConsoleLoggingMode consoleLoggingMode) {
        this.c = consoleLoggingMode;
    }

    public final void c(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void d(PaymentSdkEnvironment paymentSdkEnvironment) {
        this.b = paymentSdkEnvironment;
    }
}
