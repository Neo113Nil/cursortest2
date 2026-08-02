package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPhotoView;
import defpackage.akk0;
import defpackage.plk0;
import defpackage.qlk0;
import defpackage.qpk0;
import defpackage.rlk0;
import defpackage.slk0;
import defpackage.w511;
import defpackage.z8k0;
import kotlin.TypeCastException;

/* loaded from: classes14.dex */
public final class r extends qpk0 {
    public static final /* synthetic */ int T = 0;
    public final RideCardPhotoView R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;

    public r(RideCardPhotoView rideCardPhotoView, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardPhotoView);
        this.R = rideCardPhotoView;
        this.S = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        slk0 slk0Var = (slk0) obj;
        akk0 akk0Var = slk0Var.a;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 15));
        b0(new RideCardPhotoViewHolder$processAnalytics$2(this, akk0Var, null));
        RideCardPhotoView rideCardPhotoView = this.R;
        ViewGroup.LayoutParams layoutParams = rideCardPhotoView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = slk0Var.m();
        rideCardPhotoView.setLayoutParams(layoutParams);
        rideCardPhotoView.setContentDescription(slk0Var.n());
        if (slk0Var instanceof plk0) {
            rideCardPhotoView.showContent(((plk0) slk0Var).e);
            rideCardPhotoView.setLoading(false);
        } else if (slk0Var instanceof rlk0) {
            rideCardPhotoView.setLoading(true);
        } else if (!(slk0Var instanceof qlk0)) {
            w511.b();
        } else {
            rideCardPhotoView.setLoading(false);
            rideCardPhotoView.showError();
        }
    }
}
