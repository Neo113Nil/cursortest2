package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.cost_breakdown.RideCardCostBreakdownView;
import defpackage.akk0;
import defpackage.nfk0;
import defpackage.qpk0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class k extends qpk0 {
    public static final /* synthetic */ int T = 0;
    public final RideCardCostBreakdownView R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;

    public k(RideCardCostBreakdownView rideCardCostBreakdownView, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardCostBreakdownView);
        this.R = rideCardCostBreakdownView;
        this.S = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        nfk0 nfk0Var = (nfk0) obj;
        akk0 akk0Var = nfk0Var.e;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 8));
        b0(new RideCardCostBreakdownViewHolder$processAnalytics$2(this, akk0Var, null));
        this.R.render(nfk0Var);
    }
}
