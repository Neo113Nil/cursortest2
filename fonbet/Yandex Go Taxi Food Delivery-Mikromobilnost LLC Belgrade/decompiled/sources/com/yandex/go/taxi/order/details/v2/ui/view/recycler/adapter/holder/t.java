package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.RideCardProgressBarItemView;
import defpackage.akk0;
import defpackage.amk0;
import defpackage.bmk0;
import defpackage.gss0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.tss0;
import defpackage.xss0;
import defpackage.z8k0;
import defpackage.zlk0;

/* loaded from: classes14.dex */
public final class t extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final RideCardProgressBarItemView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public t(RideCardProgressBarItemView rideCardProgressBarItemView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardProgressBarItemView);
        this.R = rideCardProgressBarItemView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        amk0 amk0Var = (amk0) obj;
        akk0 akk0Var = amk0Var.e;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 17));
        b0(new RideCardProgressBarItemViewHolder$processAnalytics$2(this, akk0Var, null));
        xss0 xss0Var = amk0Var.c;
        gss0 gss0Var = xss0Var.a;
        RideCardProgressBarItemView rideCardProgressBarItemView = this.R;
        rideCardProgressBarItemView.getSlotItem().renderLead(gss0Var);
        rideCardProgressBarItemView.getSlotItem().renderBody(xss0Var.b);
        tss0 tss0Var = xss0Var.c;
        akk0 akk0Var2 = amk0Var.e;
        rideCardProgressBarItemView.getSlotItem().renderTrail(tss0Var, new bmk0(this, akk0Var2, 0));
        rideCardProgressBarItemView.getSlotItem().setAction(xss0Var.d, new bmk0(this, akk0Var2, 1));
        zlk0 zlk0Var = amk0Var.d;
        if (zlk0Var != null) {
            rideCardProgressBarItemView.setProgressBar(zlk0Var);
        }
    }
}
