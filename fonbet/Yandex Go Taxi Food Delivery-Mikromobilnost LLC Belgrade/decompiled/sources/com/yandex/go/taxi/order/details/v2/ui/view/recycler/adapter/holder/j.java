package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView;
import defpackage.akk0;
import defpackage.qpk0;
import defpackage.wek0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class j extends qpk0 {
    public static final /* synthetic */ int T = 0;
    public final RideCardCompanionSectionView R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;

    public j(RideCardCompanionSectionView rideCardCompanionSectionView, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardCompanionSectionView);
        this.R = rideCardCompanionSectionView;
        this.S = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        wek0 wek0Var = (wek0) obj;
        akk0 akk0Var = wek0Var.e;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 7));
        b0(new RideCardCompanionViewHolder$processAnalytics$2(this, akk0Var, null));
        this.R.render(wek0Var);
    }
}
