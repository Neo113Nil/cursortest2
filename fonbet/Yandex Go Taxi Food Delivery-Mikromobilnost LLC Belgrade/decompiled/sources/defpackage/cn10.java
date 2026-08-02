package defpackage;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.payments.paymentlist.domain.i;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class cn10 implements ffa0 {
    public final g9a0 a;
    public final e b;
    public final h3y c;

    static {
        List list = e.x;
    }

    public cn10(g9a0 g9a0Var, e eVar, h3y h3yVar) {
        this.a = g9a0Var;
        this.b = eVar;
        this.c = h3yVar;
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        if (lea0Var instanceof h8b0) {
            ((i) this.c.get()).j((h8b0) lea0Var, "menu");
            return;
        }
        if (lea0Var instanceof ivt) {
            this.b.q = true;
            g9a0.f(this.a, PaymentMethodsAnalytics$PaymentMethodsScreen.Menu, PaymentMethod$Type.GOOGLE_PAY.getCode(), null, null, 28);
            ((i) this.c.get()).k(vez0.b0(lea0Var), iba0Var);
            return;
        }
        boolean z = lea0Var instanceof wxc;
        h3y h3yVar = this.c;
        if (!z) {
            ((i) h3yVar.get()).k(vez0.b0(lea0Var), iba0Var);
            g9a0.f(this.a, PaymentMethodsAnalytics$PaymentMethodsScreen.Menu, lea0Var.c().getCode(), null, null, 28);
            return;
        }
        i iVar = (i) h3yVar.get();
        wxc wxcVar = (wxc) lea0Var;
        drd drdVar = iVar.g;
        if (drdVar.b.b()) {
            drdVar.h();
        } else {
            drdVar.f(wxcVar.a, wxcVar.b);
        }
        iVar.h(wxcVar.b, "menu", true);
    }
}
