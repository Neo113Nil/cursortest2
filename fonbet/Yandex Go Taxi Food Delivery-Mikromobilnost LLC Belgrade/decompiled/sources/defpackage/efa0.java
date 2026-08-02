package defpackage;

import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
import com.yandex.go.payments.data.model.u;
import com.yandex.go.payments.payment.AddPaymentModel$State;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class efa0 {
    public final kyz a;
    public final fj21 b;
    public final c9v c;

    public efa0(kyz kyzVar, fj21 fj21Var, c9v c9vVar) {
        this.a = kyzVar;
        this.b = fj21Var;
        this.c = c9vVar;
    }

    public static AddPaymentModel$State a(AddSbpTokenButtonDto.StateType stateType) {
        int i = cfa0.a[stateType.ordinal()];
        if (i == 1) {
            return AddPaymentModel$State.ENABLED;
        }
        if (i == 2) {
            return AddPaymentModel$State.BUSY;
        }
        if (i == 3) {
            return AddPaymentModel$State.DISABLED;
        }
        w511.b();
        return null;
    }

    public final lea0 b(ArrayList arrayList, u uVar) {
        fga0 fga0Var = (fga0) this.b.a.b;
        PaymentMethod$Type a = fga0Var.c().a();
        lea0 lea0Var = null;
        m6a0 m6a0Var = a == null ? null : new m6a0(a, fga0Var.q(a), null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lea0 lea0Var2 = (lea0) it.next();
            if (jl40.l(lea0Var2.getId(), uVar.getA())) {
                return lea0Var2;
            }
            if (m6a0Var != null && jl40.l(lea0Var2.getId(), m6a0Var.b) && lea0Var2.c() == m6a0Var.a) {
                lea0Var = lea0Var2;
            }
        }
        return lea0Var;
    }
}
