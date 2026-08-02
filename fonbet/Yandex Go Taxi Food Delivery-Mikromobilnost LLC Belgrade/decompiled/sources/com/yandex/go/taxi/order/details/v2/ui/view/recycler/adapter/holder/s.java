package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPickupCodeView;
import defpackage.akk0;
import defpackage.ijk0;
import defpackage.kqe0;
import defpackage.nqs0;
import defpackage.p9y0;
import defpackage.tlk0;
import defpackage.wys;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class s extends wys {
    public static final /* synthetic */ int U = 0;
    public final RideCardPickupCodeView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public s(RideCardPickupCodeView rideCardPickupCodeView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardPickupCodeView);
        this.R = rideCardPickupCodeView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        tlk0 tlk0Var = (tlk0) obj;
        akk0 akk0Var = tlk0Var.h;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 16));
        b0(new RideCardPickupCodeViewHolder$processAnalytics$2(this, akk0Var, null));
        boolean z = tlk0Var.g;
        RideCardPickupCodeView rideCardPickupCodeView = this.R;
        rideCardPickupCodeView.setShouldInitializeImmediately(z);
        rideCardPickupCodeView.renderText(tlk0Var.e);
        rideCardPickupCodeView.renderCode(tlk0Var.f);
        nqs0 nqs0Var = tlk0Var.c;
        akk0 akk0Var2 = tlk0Var.h;
        if (ijk0.a(nqs0Var) != null) {
            rideCardPickupCodeView.setClickListener(new kqe0(15, this, nqs0Var, akk0Var2));
        } else {
            rideCardPickupCodeView.setClickListener(null);
        }
        rideCardPickupCodeView.setContentDescription(tlk0Var.d);
    }
}
