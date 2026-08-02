package defpackage;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.domain.k;
import com.yandex.go.overdraft.g;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import java.math.BigDecimal;
import java.util.HashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class fz80 implements ffa0 {
    public final aq80 a;
    public final yj70 b;
    public final yy80 c;
    public final k d;
    public final OverdraftContext e;

    public fz80(aq80 aq80Var, yj70 yj70Var, yy80 yy80Var, k kVar, OverdraftContext overdraftContext) {
        this.a = aq80Var;
        this.b = yj70Var;
        this.c = yy80Var;
        this.d = kVar;
        this.e = overdraftContext;
    }

    @Override // defpackage.ffa0
    public final void a(iba0 iba0Var, a4m a4mVar, ak80 ak80Var) {
        BigDecimal bigDecimal;
        g gVar = (g) this.b.a;
        boolean l = jl40.l(a4mVar, gz80.a);
        OverdraftContext overdraftContext = this.e;
        yy80 yy80Var = this.c;
        if (l) {
            yy80Var.h("pay_debt", overdraftContext);
            this.d.b(EmptyList.a);
            return;
        }
        if (a4mVar instanceof hz80) {
            yy80Var.h("AddYandexPay", overdraftContext);
            ((dv51) ((cv51) gVar.S.b.get())).b(new fv51(new aw51(((hz80) a4mVar).a, YbScreenSource.OVERDRAFT_TOPUP_ACTION), false), new bav0(new lz70(8, gVar), 2));
            return;
        }
        if (!(a4mVar instanceof iz80)) {
            jst.e.q("Unknown action: " + a4mVar);
            return;
        }
        yy80Var.h("AddYandexPay", overdraftContext);
        zv51 zv51Var = ((iz80) a4mVar).a;
        aoj aojVar = (aoj) gVar.R.get();
        if (zv51Var != null && (bigDecimal = zv51Var.b) != null) {
            bigDecimal.toPlainString();
        }
        aojVar.getClass();
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        yy80 yy80Var = this.c;
        rx2 rx2Var = yy80Var.i;
        ((sz80) this.a.a).a.l(new m6a0(lea0Var.c(), lea0Var.getId(), null));
        if (lea0Var instanceof fl8) {
            x4e.B(rx2Var.a, "Overdraft.SelectCard.SelectCreditCardTapped", new HashMap(), 1);
            return;
        }
        if (lea0Var instanceof cfm0) {
            yy80Var.h("AcceptanceSBP", this.e);
        } else if (lea0Var instanceof bjm0) {
            rx2Var.getClass();
            rx2Var.a.a("Overdraft.SelectSbpToken.SelectSbpTokenTapped", new HashMap(), 1, new HashMap());
        }
    }
}
