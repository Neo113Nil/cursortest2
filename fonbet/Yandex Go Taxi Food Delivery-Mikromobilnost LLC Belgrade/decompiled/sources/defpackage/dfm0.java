package defpackage;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$SbpOpenType;
import com.yandex.go.payments.sbp.domain.analytics.SbpBindingAnalytics$Button;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes8.dex */
public final class dfm0 {
    public final lx4 a;
    public final g9a0 b;
    public final t61 c;
    public PaymentMethodsAnalytics$PaymentMethodsScreen d = PaymentMethodsAnalytics$PaymentMethodsScreen.Summary;

    public dfm0(lx4 lx4Var, g9a0 g9a0Var, t61 t61Var) {
        this.a = lx4Var;
        this.b = g9a0Var;
        this.c = t61Var;
    }

    public final void a(String str, SbpBindingAnalytics$Button sbpBindingAnalytics$Button) {
        if (sbpBindingAnalytics$Button == SbpBindingAnalytics$Button.OPEN) {
            PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen = this.d;
            PaymentMethodsAnalytics$SbpOpenType paymentMethodsAnalytics$SbpOpenType = PaymentMethodsAnalytics$SbpOpenType.App;
            g9a0 g9a0Var = this.b;
            g9a0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
            hashMap.put("bank_id", str);
            hashMap.put("open_type", paymentMethodsAnalytics$SbpOpenType.getEventValue());
            g9a0Var.a.a("PaymentMethods.SBP.Confirmed", hashMap, 1, new HashMap());
        }
        i d = ((j) this.a).d("SBPBank.Modal.Tapped");
        d.d("choosen_bank", str);
        d.d("button_name", sbpBindingAnalytics$Button.getButtonName());
        d.m();
    }
}
