package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusItemView;
import defpackage.akk0;
import defpackage.gss0;
import defpackage.j8y;
import defpackage.p9y0;
import defpackage.sik0;
import defpackage.snk0;
import defpackage.tnk0;
import defpackage.tss0;
import defpackage.xss0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class x extends sik0 {
    public static final /* synthetic */ int W = 0;
    public final RideCardStatusItemView T;
    public final p9y0 U;
    public final com.yandex.go.taxi.order.details.v2.analytics.g V;

    public x(RideCardStatusItemView rideCardStatusItemView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar, j8y j8yVar) {
        super(rideCardStatusItemView, j8yVar);
        this.T = rideCardStatusItemView;
        this.U = p9y0Var;
        this.V = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        snk0 snk0Var = (snk0) obj;
        akk0 akk0Var = snk0Var.h;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 21));
        b0(new RideCardStatusItemViewHolder$processAnalytics$2(this, akk0Var, null));
        xss0 xss0Var = snk0Var.c;
        gss0 gss0Var = xss0Var.a;
        RideCardStatusItemView rideCardStatusItemView = this.T;
        rideCardStatusItemView.getSlotItem().renderLead(gss0Var);
        rideCardStatusItemView.getSlotItem().renderBody(xss0Var.b);
        tss0 tss0Var = xss0Var.c;
        akk0 akk0Var2 = snk0Var.h;
        rideCardStatusItemView.getSlotItem().renderTrail(tss0Var, new tnk0(this, akk0Var2, 1));
        rideCardStatusItemView.getSlotItem().setAction(xss0Var.d, new tnk0(this, akk0Var2, 0));
        rideCardStatusItemView.setContentDescription(snk0Var.f);
        rideCardStatusItemView.setBackgroundColor(snk0Var.d);
        rideCardStatusItemView.enableShimmering(snk0Var.e);
        c0(snk0Var);
    }
}
