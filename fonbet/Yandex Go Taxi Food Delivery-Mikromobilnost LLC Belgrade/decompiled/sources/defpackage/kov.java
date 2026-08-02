package defpackage;

import android.app.Activity;
import com.yandex.go.overdraft.data.model.PaymentState;
import com.yandex.go.payments.domain.k;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.payments.order.domain.b;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes13.dex */
public final class kov implements ffa0 {
    public final sls a;
    public final b b;
    public final i c;
    public final k d;
    public final com.yandex.go.overdraft.domain.i e;
    public final xma0 f;

    public kov(sls slsVar, b bVar, i iVar, k kVar, com.yandex.go.overdraft.domain.i iVar2, xma0 xma0Var) {
        this.a = slsVar;
        this.b = bVar;
        this.c = iVar;
        this.d = kVar;
        this.e = iVar2;
        this.f = xma0Var;
    }

    @Override // defpackage.ffa0
    public final void a(iba0 iba0Var, a4m a4mVar, ak80 ak80Var) {
        lv90 lv90Var = (lv90) this.d.c.a.getValue();
        if (lv90Var != null) {
            sls slsVar = this.a;
            TaxiOrder b = ((o2y0) slsVar.invoke()).b();
            i iVar = this.c;
            iVar.getClass();
            if (!jl40.l(lv90Var.b, b.q().b)) {
                if (lv90Var.a == PaymentMethod$Type.GOOGLE_PAY) {
                    evt evtVar = (evt) this.b.b.N.get();
                    e eVar = evtVar.b;
                    Activity activity = evtVar.a;
                    eVar.getClass();
                    if (!eVar.m(activity, true, lvt.f)) {
                        iba0Var.o();
                        return;
                    }
                }
                iVar.l(lv90Var, ((o2y0) slsVar.invoke()).b(), new jov(iba0Var, ak80Var));
                return;
            }
        }
        ak80Var.invoke();
    }

    @Override // defpackage.ffa0
    public final void b() {
        this.d.c.a.l(null);
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        if (this.e.a().b.i == PaymentState.DEBT) {
            this.b.a();
            return;
        }
        if (lea0Var instanceof ivt) {
            this.f.c.a(SavePersonalStateNotifier$SavePersonalStateReason.PAYMENT_METHOD);
        }
        this.d.c.a.l(vez0.b0(lea0Var));
    }
}
