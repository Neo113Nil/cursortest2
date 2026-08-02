package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.MetricaSwitch;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.MetricaInitMode;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class h2a0 {
    public final PaymentSdkEnvironment a;
    public final ConsoleLoggingMode b;
    public final MetricaInitMode c;
    public final Context d;

    public h2a0(Context context, PaymentSdkEnvironment paymentSdkEnvironment, ConsoleLoggingMode consoleLoggingMode, MetricaInitMode metricaInitMode) {
        this.a = paymentSdkEnvironment;
        this.b = consoleLoggingMode;
        this.c = metricaInitMode;
        this.d = context.getApplicationContext();
        if (metricaInitMode != MetricaInitMode.DO_NOT_INIT) {
            wb20.d = new wb20(MetricaSwitch.DEPENDENT, paymentSdkEnvironment.getIsDebug(), context.getApplicationContext(), consoleLoggingMode.isConsoleLoggingEnabled(paymentSdkEnvironment));
            LinkedHashMap linkedHashMap = zdz.a;
            zdz.a.put("default", we51.a);
        }
    }
}
