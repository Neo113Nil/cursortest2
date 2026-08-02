package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersErrorCardButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersErrorCardCloseReason;
import com.yandex.go.chargers.error.api.ChargersErrorUiState$Action;

/* loaded from: classes12.dex */
public final class ny9 extends ad5 {
    public final hh5 A;
    public final em9 x;
    public final sk7 y;
    public final cy9 z;

    public ny9(em9 em9Var, sk7 sk7Var, cy9 cy9Var, hh5 hh5Var) {
        super(hy9.class);
        this.x = em9Var;
        this.y = sk7Var;
        this.z = cy9Var;
        this.A = hh5Var;
    }

    public final void Kg(ChargersErrorUiState$Action chargersErrorUiState$Action) {
        cy9 cy9Var = this.z;
        String str = cy9Var.a;
        String str2 = cy9Var.d;
        int i = my9.a[chargersErrorUiState$Action.ordinal()];
        hh5 hh5Var = this.A;
        em9 em9Var = this.x;
        if (i == 1) {
            em9Var.i(str, ChargersAnalytics$ChargersErrorCardButtonName.Close, str2);
            em9Var.h(str, ChargersAnalytics$ChargersErrorCardCloseReason.Close, str2);
            ((qy9) hh5Var.b).r(new qu(9));
            return;
        }
        if (i == 2) {
            em9Var.i(str, ChargersAnalytics$ChargersErrorCardButtonName.Retry, str2);
            em9Var.h(str, ChargersAnalytics$ChargersErrorCardCloseReason.Retry, str2);
            ((qy9) hh5Var.b).r(new ew9(13));
        } else if (i == 3) {
            em9Var.i(str, ChargersAnalytics$ChargersErrorCardButtonName.FindAnotherStation, str2);
            em9Var.h(str, ChargersAnalytics$ChargersErrorCardCloseReason.FindAnotherStation, str2);
            ((qy9) hh5Var.b).r(new ew9(12));
        } else if (i == 4) {
            em9Var.i(str, ChargersAnalytics$ChargersErrorCardButtonName.ReturnToPayment, str2);
            em9Var.h(str, ChargersAnalytics$ChargersErrorCardCloseReason.ReturnToPayment, str2);
            ((qy9) hh5Var.b).r(new ew9(14));
        } else if (i == 5) {
            ((qy9) hh5Var.b).r(new ew9(11));
        } else {
            w511.b();
        }
    }
}
