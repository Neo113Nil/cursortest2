package com.yandex.go.chargers.debt.screen;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDebtCardButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDebtCardCloseReason;
import com.yandex.go.chargers.debt.screen.domain.b;
import defpackage.ad5;
import defpackage.em9;
import defpackage.jj9;
import defpackage.jl40;
import defpackage.jq9;
import defpackage.kj9;
import defpackage.kq9;
import defpackage.lj9;
import defpackage.lq9;
import defpackage.m950;
import defpackage.mq9;
import defpackage.nq9;
import defpackage.oq9;
import defpackage.pq9;
import defpackage.qp9;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tje;
import defpackage.w511;
import defpackage.zla;
import java.util.HashMap;
import java.util.Optional;

/* loaded from: classes12.dex */
public final class a extends ad5 {
    public final b A;
    public final kj9 B;
    public final em9 x;
    public final com.yandex.go.chargers.error.data.a y;
    public final com.yandex.go.chargers.debt.screen.domain.a z;

    public a(em9 em9Var, com.yandex.go.chargers.error.data.a aVar, com.yandex.go.chargers.debt.screen.domain.a aVar2, b bVar, kj9 kj9Var) {
        super(qp9.class);
        this.x = em9Var;
        this.y = aVar;
        this.z = aVar2;
        this.A = bVar;
        this.B = kj9Var;
    }

    public final void Kg(pq9 pq9Var) {
        boolean z = pq9Var instanceof kq9;
        em9 em9Var = this.x;
        kj9 kj9Var = this.B;
        if (z) {
            em9Var.d(ChargersAnalytics$ChargersDebtCardButtonName.Back);
            ChargersAnalytics$ChargersDebtCardCloseReason chargersAnalytics$ChargersDebtCardCloseReason = ChargersAnalytics$ChargersDebtCardCloseReason.Back;
            HashMap hashMap = new HashMap();
            hashMap.put("close_reason", chargersAnalytics$ChargersDebtCardCloseReason.getEventValue());
            em9Var.a.a("Chargers.DebtCard.Closed", hashMap, 1, new HashMap());
            kj9Var.a.r(new qu(9));
            return;
        }
        if (pq9Var instanceof oq9) {
            em9Var.d(ChargersAnalytics$ChargersDebtCardButtonName.Pay);
            tje.N(Jg(), null, null, new ChargersDebtPresenter$tryPayOff$1(this, (oq9) pq9Var, null), 3);
            return;
        }
        if (jl40.l(pq9Var, mq9.a)) {
            em9Var.d(ChargersAnalytics$ChargersDebtCardButtonName.ShowOrdersHistory);
            lj9 lj9Var = kj9Var.a;
            lj9Var.A((m950) lj9Var.F.get(), Optional.empty(), sy60.Q2);
            return;
        }
        if (jl40.l(pq9Var, lq9.a)) {
            em9Var.d(ChargersAnalytics$ChargersDebtCardButtonName.SelectPaymentMethod);
            lj9 lj9Var2 = kj9Var.a;
            lj9Var2.A((m950) lj9Var2.J.get(), new zla(false, 5), new jj9(0));
        } else if (pq9Var instanceof jq9) {
            em9Var.d(ChargersAnalytics$ChargersDebtCardButtonName.ChangePaymentMethod);
            lj9 lj9Var3 = kj9Var.a;
            lj9Var3.A((m950) lj9Var3.J.get(), new zla(false, 5), new jj9(0));
        } else {
            if (!(pq9Var instanceof nq9)) {
                w511.b();
                return;
            }
            em9Var.d(ChargersAnalytics$ChargersDebtCardButtonName.Back);
            ChargersAnalytics$ChargersDebtCardCloseReason chargersAnalytics$ChargersDebtCardCloseReason2 = ChargersAnalytics$ChargersDebtCardCloseReason.Back;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("close_reason", chargersAnalytics$ChargersDebtCardCloseReason2.getEventValue());
            em9Var.a.a("Chargers.DebtCard.Closed", hashMap2, 1, new HashMap());
        }
    }
}
