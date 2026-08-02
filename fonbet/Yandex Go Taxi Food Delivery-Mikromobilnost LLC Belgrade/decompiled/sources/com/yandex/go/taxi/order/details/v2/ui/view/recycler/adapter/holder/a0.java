package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsSelectorView;
import defpackage.akk0;
import defpackage.bpk0;
import defpackage.cpk0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.vxj0;
import defpackage.yxf0;
import defpackage.z8k0;
import java.util.List;

/* loaded from: classes14.dex */
public final class a0 extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final RideCardTipsSelectorView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public a0(RideCardTipsSelectorView rideCardTipsSelectorView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardTipsSelectorView);
        this.R = rideCardTipsSelectorView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void Y() {
        this.R.resetTipsToggleListener();
        super.Y();
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        cpk0 cpk0Var = (cpk0) obj;
        akk0 akk0Var = cpk0Var.e;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 24));
        b0(new RideCardTipsSelectorViewHolder$processAnalytics$2(this, akk0Var, null));
        List<bpk0> list = cpk0Var.d;
        RideCardTipsSelectorView rideCardTipsSelectorView = this.R;
        rideCardTipsSelectorView.updateTips(list);
        akk0 akk0Var2 = cpk0Var.e;
        rideCardTipsSelectorView.setTipsToggleListener(new yxf0(this, akk0Var2));
        rideCardTipsSelectorView.updatePreferredTipsSubscription(cpk0Var.c, new vxj0(8, this, akk0Var2));
    }
}
