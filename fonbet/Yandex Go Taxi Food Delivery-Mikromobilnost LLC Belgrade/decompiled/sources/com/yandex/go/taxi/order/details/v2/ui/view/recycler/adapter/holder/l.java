package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardDriverSimpleSectionView;
import defpackage.akk0;
import defpackage.jik0;
import defpackage.jl40;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.s9k0;
import defpackage.tai0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class l extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final RideCardDriverSimpleSectionView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public l(RideCardDriverSimpleSectionView rideCardDriverSimpleSectionView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardDriverSimpleSectionView);
        this.R = rideCardDriverSimpleSectionView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        jik0 jik0Var = (jik0) obj;
        akk0 akk0Var = jik0Var.g;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 9));
        b0(new RideCardDriverSimpleViewHolder$processAnalytics$2(this, akk0Var, null));
        RideCardDriverSimpleSectionView rideCardDriverSimpleSectionView = this.R;
        rideCardDriverSimpleSectionView.render(jik0Var);
        if (jl40.l(jik0Var.f, s9k0.a)) {
            rideCardDriverSimpleSectionView.setDriverClickListener(null);
        } else {
            rideCardDriverSimpleSectionView.setDriverClickListener(new tai0(2, this, jik0Var));
        }
    }
}
