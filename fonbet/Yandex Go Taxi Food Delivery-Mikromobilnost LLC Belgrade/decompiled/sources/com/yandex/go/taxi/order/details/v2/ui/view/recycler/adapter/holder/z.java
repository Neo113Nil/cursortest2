package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;
import defpackage.akk0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.tok0;
import defpackage.xok0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class z extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final RideCardTimelineView R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;
    public final p9y0 T;

    public z(RideCardTimelineView rideCardTimelineView, com.yandex.go.taxi.order.details.v2.analytics.g gVar, p9y0 p9y0Var) {
        super(rideCardTimelineView);
        this.R = rideCardTimelineView;
        this.S = gVar;
        this.T = p9y0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        tok0 tok0Var = (tok0) obj;
        akk0 akk0Var = tok0Var.h;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 23));
        b0(new RideCardTimelineViewHolder$processAnalytics$2(this, akk0Var, null));
        RideCardTimelineView rideCardTimelineView = this.R;
        rideCardTimelineView.render(tok0Var);
        rideCardTimelineView.renderTimelineOptions(tok0Var.g, new xok0(this), new xok0(this));
    }
}
