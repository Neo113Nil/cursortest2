package defpackage;

import com.yandex.go.payments.paymentlist.domain.i;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes13.dex */
public final class ere0 implements ffa0 {
    public final ycq0 a;
    public final i b;
    public final xma0 c;

    public ere0(ycq0 ycq0Var, i iVar, xma0 xma0Var) {
        this.a = ycq0Var;
        this.b = iVar;
        this.c = xma0Var;
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        Boolean bool;
        boolean z = lea0Var instanceof h8b0;
        i iVar = this.b;
        if (z) {
            iVar.j((h8b0) lea0Var, null);
            return;
        }
        if (lea0Var instanceof wxc) {
            wxc wxcVar = (wxc) lea0Var;
            drd drdVar = iVar.g;
            if (drdVar.b.b()) {
                drdVar.h();
                return;
            } else {
                drdVar.f(wxcVar.a, wxcVar.b);
                return;
            }
        }
        if (lea0Var instanceof ivt) {
            this.c.c.a(SavePersonalStateNotifier$SavePersonalStateReason.PAYMENT_METHOD);
        }
        kv90 kv90Var = lv90.Companion;
        PaymentMethod$Type c = lea0Var.c();
        String id = lea0Var.getId();
        fl8 fl8Var = lea0Var instanceof fl8 ? (fl8) lea0Var : null;
        Boolean valueOf = Boolean.valueOf((fl8Var == null || (bool = fl8Var.m) == null) ? false : bool.booleanValue());
        kv90Var.getClass();
        this.a.b(kv90.a(c, id, valueOf));
    }
}
