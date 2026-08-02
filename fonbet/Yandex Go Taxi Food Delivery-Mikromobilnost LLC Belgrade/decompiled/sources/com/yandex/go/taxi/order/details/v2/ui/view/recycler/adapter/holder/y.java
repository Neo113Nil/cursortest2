package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusProgressItemView;
import defpackage.akk0;
import defpackage.bok0;
import defpackage.j8y;
import defpackage.sik0;
import defpackage.wnk0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class y extends sik0 {
    public static final /* synthetic */ int V = 0;
    public final RideCardStatusProgressItemView T;
    public final com.yandex.go.taxi.order.details.v2.analytics.g U;

    public y(RideCardStatusProgressItemView rideCardStatusProgressItemView, com.yandex.go.taxi.order.details.v2.analytics.g gVar, j8y j8yVar) {
        super(rideCardStatusProgressItemView, j8yVar);
        this.T = rideCardStatusProgressItemView;
        this.U = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        bok0 bok0Var = (bok0) obj;
        akk0 akk0Var = bok0Var.j;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 22));
        b0(new RideCardStatusProgressItemViewHolder$processAnalytics$2(this, akk0Var, null));
        wnk0 wnk0Var = bok0Var.d;
        akk0 akk0Var2 = bok0Var.j;
        RideCardStatusProgressItemView rideCardStatusProgressItemView = this.T;
        rideCardStatusProgressItemView.renderTitle(wnk0Var, akk0Var2);
        rideCardStatusProgressItemView.renderSubtitle(bok0Var.e, akk0Var2);
        rideCardStatusProgressItemView.renderTrail(bok0Var.f);
        rideCardStatusProgressItemView.renderProgressBar(bok0Var.c);
        rideCardStatusProgressItemView.renderState(bok0Var.h);
        rideCardStatusProgressItemView.renderTimer(bok0Var.g);
        c0(bok0Var);
    }
}
