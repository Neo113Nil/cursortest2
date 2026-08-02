package defpackage;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodAnalytics$AddMBankBindingStatus;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodAnalytics$AddMBankOTPCodeStatus;
import java.util.HashMap;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class h4a0 {
    public final pho a;

    public h4a0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(PaymentMethodAnalytics$AddMBankBindingStatus paymentMethodAnalytics$AddMBankBindingStatus) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACSPConstants.STATUS, paymentMethodAnalytics$AddMBankBindingStatus.getEventValue());
        this.a.a("PaymentMethod.AddMBank.BindingStatus", hashMap, 1, new HashMap());
    }

    public final void b(PaymentMethodAnalytics$AddMBankOTPCodeStatus paymentMethodAnalytics$AddMBankOTPCodeStatus) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACSPConstants.STATUS, paymentMethodAnalytics$AddMBankOTPCodeStatus.getEventValue());
        this.a.a("PaymentMethod.AddMBank.OtpCode", hashMap, 1, new HashMap());
    }
}
