package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardCoherentRatingSelectorView;
import defpackage.akk0;
import defpackage.p9y0;
import defpackage.pdk0;
import defpackage.qpk0;
import defpackage.rdk0;
import defpackage.sdk0;
import defpackage.w7i0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class f extends qpk0 {
    public static final /* synthetic */ int V = 0;
    public final RideCardCoherentRatingSelectorView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;
    public w7i0 U;

    public f(RideCardCoherentRatingSelectorView rideCardCoherentRatingSelectorView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardCoherentRatingSelectorView);
        this.R = rideCardCoherentRatingSelectorView;
        this.S = p9y0Var;
        this.T = gVar;
        this.U = new sdk0(0);
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.R.removeOnRatingBarChangeListener(this.U);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        pdk0 pdk0Var = (pdk0) obj;
        akk0 akk0Var = pdk0Var.i;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 3));
        b0(new RideCardCoherentRatingSelectorViewHolder$processAnalytics$2(this, akk0Var, null));
        rdk0 rdk0Var = new rdk0(pdk0Var.i, pdk0Var.h, this, 0);
        this.U = rdk0Var;
        RideCardCoherentRatingSelectorView rideCardCoherentRatingSelectorView = this.R;
        rideCardCoherentRatingSelectorView.addOnRatingBarChangeListener(rdk0Var);
        rideCardCoherentRatingSelectorView.setRating(pdk0Var.e);
        rideCardCoherentRatingSelectorView.setTitle(pdk0Var.c);
        rideCardCoherentRatingSelectorView.setSubtitle(pdk0Var.d);
        rideCardCoherentRatingSelectorView.updateHeader();
        rideCardCoherentRatingSelectorView.updateBackgroundOnSelect(pdk0Var.f);
        rideCardCoherentRatingSelectorView.updateItemsDecoration(pdk0Var.g);
    }
}
