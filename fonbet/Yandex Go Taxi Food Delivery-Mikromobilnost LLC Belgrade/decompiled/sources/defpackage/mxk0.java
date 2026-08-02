package defpackage;

import com.yandex.go.coroutines.b;
import com.yandex.go.payments_widgets.yandex_bank.PaymentMethodsHideBalanceExperiment;
import com.yandex.go.payments_widgets.yandex_bank.PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1;
import com.yandex.go.payments_widgets.yandex_bank.e;
import java.util.HashMap;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class mxk0 {
    public final t61 a;
    public final aba0 b;
    public final aba0 c;
    public final yaa0 d;
    public final e e;
    public lxk0 f;

    public mxk0(t61 t61Var, aba0 aba0Var, aba0 aba0Var2, yaa0 yaa0Var) {
        this.a = t61Var;
        this.b = aba0Var;
        this.c = aba0Var2;
        this.d = yaa0Var;
        this.e = new e(b.d(aba0Var2.c, new PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1(null, aba0Var2)), this);
        this.f = aba0Var2.a.a("FIELD_IS_BALANCE_HIDED", false) ? jxk0.a : kxk0.a;
    }

    public final void a() {
        zaa0 zaa0Var = (zaa0) this.d;
        boolean z = ((PaymentMethodsHideBalanceExperiment) zaa0Var.c()).b;
        aba0 aba0Var = this.c;
        if (z && ((Boolean) zaa0Var.d.a.getValue()).booleanValue()) {
            lw90 lw90Var = zaa0Var.c;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.YB_WALLET;
            lw90Var.getClass();
            if (lw90.c(lw90Var, null, new n65[0], 3).a(paymentMethod$Type).equals(xw91.C) && this.b.a()) {
                lxk0 lxk0Var = this.f;
                lxk0 lxk0Var2 = kxk0.a;
                boolean l = jl40.l(lxk0Var, lxk0Var2);
                lxk0 lxk0Var3 = jxk0.a;
                t61 t61Var = this.a;
                if (l) {
                    aba0Var.b(true);
                    t61Var.getClass();
                    HashMap hashMap = new HashMap();
                    t61Var.a.a("PaymentWidgetsHideBalance", hashMap, 1, g8e.v(hashMap, "isHidden", Boolean.TRUE));
                    lxk0Var2 = lxk0Var3;
                } else {
                    if (!jl40.l(lxk0Var, lxk0Var3)) {
                        w511.b();
                        return;
                    }
                    aba0Var.b(false);
                    t61Var.getClass();
                    HashMap hashMap2 = new HashMap();
                    t61Var.a.a("PaymentWidgetsHideBalance", hashMap2, 1, g8e.v(hashMap2, "isHidden", Boolean.FALSE));
                }
                this.f = lxk0Var2;
                return;
            }
        }
        aba0Var.c.g(Boolean.FALSE);
    }
}
