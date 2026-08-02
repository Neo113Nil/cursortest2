package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDebtCardCloseReason;
import com.yandex.go.chargers.data.model.ChargersDebt;
import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class op9 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp9 b;

    public /* synthetic */ op9(pp9 pp9Var, int i) {
        this.a = i;
        this.b = pp9Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        cy9 cy9Var;
        int i = this.a;
        c21 c21Var = sy60.Q2;
        zy11 zy11Var = zy11.a;
        pp9 pp9Var = this.b;
        switch (i) {
            case 0:
                if (((ChargersDebt) obj) == null) {
                    pp9Var.j(new epb((iq9) pp9Var.M.getValue()));
                    ChargersAnalytics$ChargersDebtCardCloseReason chargersAnalytics$ChargersDebtCardCloseReason = ChargersAnalytics$ChargersDebtCardCloseReason.DebtPaid;
                    em9 em9Var = pp9Var.D;
                    HashMap w = b64.w(em9Var);
                    w.put("close_reason", chargersAnalytics$ChargersDebtCardCloseReason.getEventValue());
                    em9Var.a.a("Chargers.DebtCard.Closed", w, 1, new HashMap());
                    pp9Var.j(new epb((lj9) pp9Var.L.getValue()));
                    break;
                } else if (!pp9Var.v((iq9) pp9Var.M.getValue())) {
                    pp9Var.z((iq9) pp9Var.M.getValue(), c21Var);
                    break;
                }
                break;
            case 1:
                i3y i3yVar = pp9Var.L;
                i3y i3yVar2 = pp9Var.L;
                if (!pp9Var.v((lj9) i3yVar.getValue())) {
                    if (!pp9Var.v((lj9) i3yVar2.getValue())) {
                        pp9Var.z((lj9) i3yVar2.getValue(), c21Var);
                        break;
                    }
                } else {
                    ChargersAnalytics$ChargersDebtCardCloseReason chargersAnalytics$ChargersDebtCardCloseReason2 = ChargersAnalytics$ChargersDebtCardCloseReason.Back;
                    em9 em9Var2 = pp9Var.D;
                    HashMap w2 = b64.w(em9Var2);
                    w2.put("close_reason", chargersAnalytics$ChargersDebtCardCloseReason2.getEventValue());
                    em9Var2.a.a("Chargers.DebtCard.Closed", w2, 1, new HashMap());
                    pp9Var.j(new epb((lj9) i3yVar2.getValue()));
                    break;
                }
                break;
            default:
                up9 up9Var = (up9) obj;
                if (!pp9Var.v((qy9) pp9Var.K.getValue()) && (up9Var instanceof sp9) && (cy9Var = ((sp9) up9Var).a) != null) {
                    qy9 qy9Var = (qy9) pp9Var.K.getValue();
                    ly9 ly9Var = new ly9(cy9Var);
                    ky9.D1.getClass();
                    pp9Var.A(qy9Var, ly9Var, jy9.b);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
