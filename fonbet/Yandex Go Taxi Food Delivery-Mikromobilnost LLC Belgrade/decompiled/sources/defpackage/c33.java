package defpackage;

import com.yandex.go.payments.paymentlist.domain.i;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes13.dex */
public final class c33 implements ffa0, f33 {
    public final ycq0 a;
    public final fga0 b;
    public final xma0 c;
    public final i d;
    public final r0 e;
    public final r0 f;

    public c33(ycq0 ycq0Var, fga0 fga0Var, xma0 xma0Var, i iVar) {
        this.a = ycq0Var;
        this.b = fga0Var;
        this.c = xma0Var;
        this.d = iVar;
        r0 c = bvf0.c(null);
        this.e = c;
        this.f = c;
    }

    @Override // defpackage.ffa0
    public final void a(iba0 iba0Var, a4m a4mVar, ak80 ak80Var) {
        Boolean bool;
        e33 e33Var = (e33) this.e.getValue();
        if ((e33Var != null ? e33Var.a : null) != null) {
            lea0 lea0Var = e33Var.a;
            if (lea0Var == null) {
                ny61.g("Required value was null.");
                return;
            }
            lv90 a = this.b.a();
            if (a.a() != lea0Var.c() || !jl40.l(a.b, lea0Var.getId())) {
                lea0 lea0Var2 = e33Var.a;
                if (lea0Var2 == null) {
                    ny61.g("Required value was null.");
                    return;
                }
                if (!(lea0Var2 instanceof h8b0)) {
                    if (lea0Var2 instanceof ivt) {
                        this.c.c.a(SavePersonalStateNotifier$SavePersonalStateReason.PAYMENT_METHOD);
                    }
                    kv90 kv90Var = lv90.Companion;
                    PaymentMethod$Type c = lea0Var2.c();
                    String id = lea0Var2.getId();
                    fl8 fl8Var = lea0Var2 instanceof fl8 ? (fl8) lea0Var2 : null;
                    Boolean valueOf = Boolean.valueOf((fl8Var == null || (bool = fl8Var.m) == null) ? false : bool.booleanValue());
                    kv90Var.getClass();
                    this.a.b(kv90.a(c, id, valueOf));
                }
            }
        }
        if ((e33Var != null ? e33Var.b : null) != null) {
            d33 d33Var = e33Var.b;
            if (d33Var == null) {
                ny61.g("Required value was null.");
                return;
            }
            boolean z = d33Var.a;
            i iVar = this.d;
            if (z != iVar.g.b.b()) {
                iVar.m(true);
            }
        }
        ak80Var.invoke();
    }

    @Override // defpackage.ffa0
    public final void b() {
        this.e.l(null);
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        r0 r0Var;
        Object value;
        e33 e33Var;
        d33 d33Var;
        do {
            r0Var = this.e;
            value = r0Var.getValue();
            e33 e33Var2 = (e33) value;
            if (lea0Var instanceof h8b0) {
                e33Var = new e33(e33Var2 != null ? e33Var2.a : null, new d33((h8b0) lea0Var, !((e33Var2 == null || (d33Var = e33Var2.b) == null) ? this.d.g.b.b() : d33Var.a)));
            } else {
                e33Var = new e33(lea0Var, e33Var2 != null ? e33Var2.b : null);
            }
        } while (!r0Var.k(value, e33Var));
    }
}
