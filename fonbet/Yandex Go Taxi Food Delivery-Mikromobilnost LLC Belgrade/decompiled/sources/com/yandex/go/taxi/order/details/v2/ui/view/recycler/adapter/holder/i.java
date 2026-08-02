package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.companion_buffer_serch.RideCardCompanionBufferSearchView;
import defpackage.akk0;
import defpackage.nek0;
import defpackage.qpk0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class i extends qpk0 {
    public static final /* synthetic */ int T = 0;
    public final RideCardCompanionBufferSearchView R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;

    public i(RideCardCompanionBufferSearchView rideCardCompanionBufferSearchView, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardCompanionBufferSearchView);
        this.R = rideCardCompanionBufferSearchView;
        this.S = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        nek0 nek0Var = (nek0) obj;
        akk0 akk0Var = nek0Var.e;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 6));
        b0(new RideCardCompanionBufferSearchViewHolder$processAnalytics$2(this, akk0Var, null));
        this.R.render(nek0Var);
    }
}
