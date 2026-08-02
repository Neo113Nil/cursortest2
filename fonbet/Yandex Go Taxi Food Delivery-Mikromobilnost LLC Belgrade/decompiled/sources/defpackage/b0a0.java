package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.flows.payment.kit.api.model.ConsoleLoggingMode;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;

/* loaded from: classes6.dex */
public final class b0a0 {
    public Context a;
    public PaymentKitEnvironment b = PaymentKitEnvironment.PRODUCTION;
    public ConsoleLoggingMode c = ConsoleLoggingMode.AUTOMATIC;

    public final p370 a() {
        Context context = this.a;
        if (context != null) {
            return new p370(23, this.c, context, this.b);
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

    public final void d(PaymentKitEnvironment paymentKitEnvironment) {
        this.b = paymentKitEnvironment;
    }
}
