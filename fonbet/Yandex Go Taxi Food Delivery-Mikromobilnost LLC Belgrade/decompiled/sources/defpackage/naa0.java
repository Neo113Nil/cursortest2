package defpackage;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$ChangeType;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$LoyaltyToggleAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.composite.navigation.a;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.payments.paymentlist.domain.i;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class naa0 implements ffa0 {
    public final drd a;
    public final g9a0 b;
    public final ycq0 c;
    public final e d;
    public final i e;
    public final aq80 f;

    static {
        List list = e.x;
    }

    public naa0(drd drdVar, g9a0 g9a0Var, ycq0 ycq0Var, e eVar, i iVar, aq80 aq80Var) {
        this.a = drdVar;
        this.b = g9a0Var;
        this.c = ycq0Var;
        this.d = eVar;
        this.e = iVar;
        this.f = aq80Var;
    }

    @Override // defpackage.ffa0
    public final void a(iba0 iba0Var, a4m a4mVar, ak80 ak80Var) {
        String id;
        PaymentMethod$Type c;
        String code;
        i iVar = this.e;
        lea0 e = iVar.e();
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen = PaymentMethodsAnalytics$PaymentMethodsScreen.Summary;
        String str = (e == null || (c = e.c()) == null || (code = c.getCode()) == null) ? "" : code;
        String str2 = (e == null || (id = e.getId()) == null) ? "" : id;
        drd drdVar = this.a;
        boolean z = false;
        g9a0.d(this.b, paymentMethodsAnalytics$PaymentMethodsScreen, str, str2, Boolean.valueOf(drdVar.b.b()), Boolean.valueOf(drdVar.a() && drdVar.d.c(PaymentMethod$Type.PERSONAL_WALLET)));
        boolean b = drdVar.b.b();
        lea0 e2 = iVar.e();
        boolean d = iVar.g.d(e2 != null ? e2.c() : null);
        if (!b && d) {
            z = true;
        }
        ((a) this.f.a).r(new yce(z, 18));
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        String str;
        if (lea0Var instanceof ivt) {
            ycq0 ycq0Var = this.c;
            kv90 kv90Var = lv90.Companion;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.GOOGLE_PAY;
            kv90Var.getClass();
            ycq0Var.b(kv90.b(null, paymentMethod$Type));
            g9a0.f(this.b, PaymentMethodsAnalytics$PaymentMethodsScreen.Summary, paymentMethod$Type.getCode(), null, null, 28);
            this.d.q = true;
            return;
        }
        PaymentMethod$Type c = lea0Var.c();
        if (!this.a.d(c) && this.a.b.b()) {
            xxc g = this.a.g();
            g9a0 g9a0Var = this.b;
            String str2 = g != null ? g.c : null;
            if (str2 == null) {
                str2 = "";
                str = str2;
            } else {
                str = "";
            }
            PaymentMethodsAnalytics$LoyaltyToggleAction paymentMethodsAnalytics$LoyaltyToggleAction = PaymentMethodsAnalytics$LoyaltyToggleAction.Off;
            String str3 = g != null ? g.b : null;
            if (str3 != null) {
                str = str3;
            }
            g9a0Var.h(str2, paymentMethodsAnalytics$LoyaltyToggleAction, str, PaymentMethodsAnalytics$ChangeType.Auto, "summary");
        }
        ycq0 ycq0Var2 = this.c;
        kv90 kv90Var2 = lv90.Companion;
        String id = lea0Var.getId();
        kv90Var2.getClass();
        ycq0Var2.b(kv90.b(id, c));
    }
}
