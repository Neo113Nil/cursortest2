package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.comment.RideCardCommentItemView;
import defpackage.akk0;
import defpackage.ijk0;
import defpackage.kqe0;
import defpackage.nqs0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.xdk0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class g extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final RideCardCommentItemView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public g(RideCardCommentItemView rideCardCommentItemView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardCommentItemView);
        this.R = rideCardCommentItemView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        xdk0 xdk0Var = (xdk0) obj;
        akk0 akk0Var = xdk0Var.h;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 4));
        b0(new RideCardCommentViewHolder$processAnalytics$2(this, akk0Var, null));
        String str = xdk0Var.c;
        RideCardCommentItemView rideCardCommentItemView = this.R;
        rideCardCommentItemView.renderTitle(str);
        rideCardCommentItemView.renderHint(xdk0Var.d);
        rideCardCommentItemView.renderCommentText(xdk0Var.e);
        rideCardCommentItemView.renderBackground(xdk0Var.f);
        nqs0 nqs0Var = xdk0Var.g;
        akk0 akk0Var2 = xdk0Var.h;
        if (ijk0.a(nqs0Var) != null) {
            rideCardCommentItemView.setClickListener(new kqe0(12, this, nqs0Var, akk0Var2));
        } else {
            rideCardCommentItemView.setClickListener(null);
        }
    }
}
