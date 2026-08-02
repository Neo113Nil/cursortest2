package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsWishSelectorView;
import defpackage.akk0;
import defpackage.lpk0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.r3k0;
import defpackage.vxj0;
import defpackage.xss0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class b0 extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final RideCardTipsWishSelectorView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public b0(RideCardTipsWishSelectorView rideCardTipsWishSelectorView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardTipsWishSelectorView);
        this.R = rideCardTipsWishSelectorView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void Y() {
        this.R.resetTipsToggleListener();
        super.Y();
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        lpk0 lpk0Var = (lpk0) obj;
        akk0 akk0Var = lpk0Var.j;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 25));
        b0(new RideCardTipsWishSelectorViewHolder$processAnalytics$2(this, akk0Var, null));
        CharSequence charSequence = lpk0Var.c;
        RideCardTipsWishSelectorView rideCardTipsWishSelectorView = this.R;
        rideCardTipsWishSelectorView.updateTitle(charSequence);
        rideCardTipsWishSelectorView.updateSubtitle(lpk0Var.d);
        rideCardTipsWishSelectorView.updateTips(lpk0Var.i);
        rideCardTipsWishSelectorView.updateTipsWishCardBackground(lpk0Var.e);
        rideCardTipsWishSelectorView.updateMediaContent(lpk0Var.g);
        rideCardTipsWishSelectorView.updateBackgroundCornerRadius(lpk0Var.f);
        xss0 xss0Var = lpk0Var.h;
        akk0 akk0Var2 = lpk0Var.j;
        rideCardTipsWishSelectorView.updatePreferredTipsSubscription(xss0Var, new vxj0(9, this, akk0Var2));
        rideCardTipsWishSelectorView.setTipsToggleListener(new r3k0(3, this, akk0Var2));
    }
}
