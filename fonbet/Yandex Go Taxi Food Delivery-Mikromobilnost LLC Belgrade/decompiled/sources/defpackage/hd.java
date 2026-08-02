package defpackage;

import com.yandex.go.overdraft.data.model.AutoAction$OpenUrlAction;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtStatusesResponse;
import com.yandex.go.overdraft.data.model.PaymentState;
import com.yandex.go.overdraft.data.model.e;
import kotlinx.coroutines.channels.a;

/* loaded from: classes8.dex */
public final class hd {
    public final id a;
    public final a b;
    public final di9 c;

    public hd(id idVar) {
        this.a = idVar;
        a a = sb2.a(-2, null, null, 6);
        this.b = a;
        this.c = new di9(a);
    }

    public final void a(DebtStatusesResponse debtStatusesResponse) {
        String str = this.a.b;
        if (str == null) {
            return;
        }
        if (debtStatusesResponse.g() != PaymentState.PROCESSING) {
            id idVar = this.a;
            String str2 = idVar.b;
            idVar.b = null;
            idVar.a.w("ACTIVE_ORDER_ID");
            if (str2 != null) {
                idVar.a.w("OPENED_URL_".concat(str2));
                return;
            }
            return;
        }
        DebtFlow e = debtStatusesResponse.getE();
        e eVar = e != null ? e.b : null;
        AutoAction$OpenUrlAction autoAction$OpenUrlAction = eVar instanceof AutoAction$OpenUrlAction ? (AutoAction$OpenUrlAction) eVar : null;
        if (autoAction$OpenUrlAction == null) {
            return;
        }
        String a = autoAction$OpenUrlAction.getA();
        if (evu0.J(a)) {
            a = null;
        }
        if (a == null || jl40.l(this.a.a.l("OPENED_URL_".concat(str), null), a)) {
            return;
        }
        this.a.a.r("OPENED_URL_".concat(str), a);
        this.b.d(a);
    }
}
