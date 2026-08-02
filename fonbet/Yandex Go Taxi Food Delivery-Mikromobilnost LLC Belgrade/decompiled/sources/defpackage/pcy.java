package defpackage;

import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;

/* loaded from: classes2.dex */
public final class pcy {
    public final PaymentSdkEnvironment a;
    public q7w b;

    public pcy(PaymentSdkEnvironment paymentSdkEnvironment) {
        this.a = paymentSdkEnvironment == null ? PaymentSdkEnvironment.PRODUCTION : paymentSdkEnvironment;
    }

    public final String a() {
        int i = ocy.a[this.a.ordinal()];
        if (i == 1) {
            return "https://mobpayment-test.yandex-team.ru/";
        }
        if (i == 2) {
            return "http://127.0.0.1:8080/mobpayment/";
        }
        if (i == 3) {
            return "https://testing.crowdtest.mobpayment.yandex.ru/";
        }
        if (i == 4) {
            return "https://mobpayment-test-mimino.yandex-team.ru/";
        }
        if (i == 5) {
            return "https://mobpayment.yandex-net.ru/";
        }
        w511.b();
        return null;
    }

    public final boolean b() {
        int i = ocy.a[this.a.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        w511.b();
        return false;
    }
}
