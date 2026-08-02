package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import defpackage.bjk0;
import defpackage.ejk0;
import defpackage.kdc;
import defpackage.qpk0;
import defpackage.wrs0;
import defpackage.xss0;
import defpackage.yz;

/* loaded from: classes14.dex */
public abstract class a extends qpk0 {
    public final ejk0 R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;

    public a(ejk0 ejk0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(ejk0Var.asView());
        this.R = ejk0Var;
        this.S = gVar;
    }

    public final void c0(xss0 xss0Var, boolean z, kdc kdcVar, wrs0 wrs0Var) {
        ejk0 ejk0Var = this.R;
        RideCardPerfAnalytics$RenderViewType rideCardPerfAnalytics$RenderViewType = ejk0Var instanceof bjk0 ? RideCardPerfAnalytics$RenderViewType.COMPOSE : RideCardPerfAnalytics$RenderViewType.VIEW;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        View view = this.a;
        OneShotPreDrawListener.add(view, new yz(view, view, elapsedRealtimeNanos, this, wrs0Var, rideCardPerfAnalytics$RenderViewType));
        b0(new RideCardAbstractSlotItemViewHolder$processAnalytics$2(this, wrs0Var, null));
        ejk0Var.b(xss0Var, z, kdcVar, wrs0Var);
    }
}
