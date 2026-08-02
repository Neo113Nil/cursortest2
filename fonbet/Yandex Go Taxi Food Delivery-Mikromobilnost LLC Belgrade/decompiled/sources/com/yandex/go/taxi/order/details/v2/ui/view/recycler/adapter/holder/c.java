package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardAiBubbleView;
import defpackage.akk0;
import defpackage.qbk0;
import defpackage.qpk0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class c extends qpk0 {
    public static final /* synthetic */ int T = 0;
    public final RideCardAiBubbleView R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;

    public c(RideCardAiBubbleView rideCardAiBubbleView, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardAiBubbleView);
        this.R = rideCardAiBubbleView;
        this.S = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        qbk0 qbk0Var = (qbk0) obj;
        akk0 akk0Var = qbk0Var.g;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 1));
        b0(new RideCardAiBubbleViewHolder$processAnalytics$2(this, akk0Var, null));
        this.R.render(qbk0Var);
    }
}
