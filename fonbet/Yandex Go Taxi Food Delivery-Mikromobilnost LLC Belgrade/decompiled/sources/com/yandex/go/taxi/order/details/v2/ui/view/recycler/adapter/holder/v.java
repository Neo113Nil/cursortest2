package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardRatingSelectorView;
import defpackage.akk0;
import defpackage.ibk0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.rdk0;
import defpackage.sdk0;
import defpackage.vmk0;
import defpackage.w7i0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class v extends qpk0 {
    public static final /* synthetic */ int V = 0;
    public final RideCardRatingSelectorView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;
    public w7i0 U;

    public v(RideCardRatingSelectorView rideCardRatingSelectorView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardRatingSelectorView);
        this.R = rideCardRatingSelectorView;
        this.S = p9y0Var;
        this.T = gVar;
        this.U = new sdk0(1);
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.R.removeOnRatingBarChangeListener(this.U);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        vmk0 vmk0Var = (vmk0) obj;
        akk0 akk0Var = vmk0Var.h;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 19));
        b0(new RideCardRatingSelectorViewHolder$processAnalytics$2(this, akk0Var, null));
        ibk0 ibk0Var = vmk0Var.g;
        akk0 akk0Var2 = vmk0Var.h;
        w7i0 w7i0Var = this.U;
        RideCardRatingSelectorView rideCardRatingSelectorView = this.R;
        rideCardRatingSelectorView.removeOnRatingBarChangeListener(w7i0Var);
        rdk0 rdk0Var = new rdk0(akk0Var2, ibk0Var, this, 1);
        this.U = rdk0Var;
        rideCardRatingSelectorView.addOnRatingBarChangeListener(rdk0Var);
        rideCardRatingSelectorView.setRating(vmk0Var.c);
        rideCardRatingSelectorView.setHint(vmk0Var.d);
        rideCardRatingSelectorView.updateBackgroundOnSelect(vmk0Var.e);
        rideCardRatingSelectorView.updateItemsDecoration(vmk0Var.f);
    }
}
