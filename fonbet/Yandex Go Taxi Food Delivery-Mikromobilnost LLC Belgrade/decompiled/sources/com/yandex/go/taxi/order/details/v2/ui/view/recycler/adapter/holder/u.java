package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_reasons.RideCardRatingReasonsSelectorView;
import defpackage.hmk0;
import defpackage.imk0;
import defpackage.jmk0;
import defpackage.kmk0;
import defpackage.mmk0;
import defpackage.nmk0;
import defpackage.o990;
import defpackage.omk0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.r8i0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wrs0;
import defpackage.z8k0;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class u extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final RideCardRatingReasonsSelectorView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public u(RideCardRatingReasonsSelectorView rideCardRatingReasonsSelectorView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(rideCardRatingReasonsSelectorView);
        this.R = rideCardRatingReasonsSelectorView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.R.cleanRatingReasonsView();
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        omk0 omk0Var = (omk0) obj;
        wrs0 analytics = omk0Var.getAnalytics();
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, analytics, 18));
        b0(new RideCardRatingReasonsSelectorViewHolder$processAnalytics$2(this, analytics, null));
        o990 o990Var = new o990(21, this, omk0Var);
        RideCardRatingReasonsSelectorView rideCardRatingReasonsSelectorView = this.R;
        rideCardRatingReasonsSelectorView.setOnReasonClickListener(o990Var);
        rideCardRatingReasonsSelectorView.renderTitle(omk0Var.getTitle());
        if (omk0Var instanceof hmk0) {
            rideCardRatingReasonsSelectorView.setSelectorType(RideCardRatingReasonsSelectorView.Type.ACHIEVEMENTS);
        } else if (omk0Var instanceof mmk0) {
            rideCardRatingReasonsSelectorView.setSelectorType(RideCardRatingReasonsSelectorView.Type.TAGS);
        } else {
            if (!(omk0Var instanceof nmk0)) {
                w511.b();
                return;
            }
            rideCardRatingReasonsSelectorView.setSelectorType(RideCardRatingReasonsSelectorView.Type.TEXT);
        }
        c0(omk0Var);
    }

    public final void c0(omk0 omk0Var) {
        ArrayList arrayList;
        if (omk0Var instanceof hmk0) {
            ArrayList<imk0> arrayList2 = ((hmk0) omk0Var).d;
            arrayList = new ArrayList(tcc.n(arrayList2, 10));
            for (imk0 imk0Var : arrayList2) {
                arrayList.add(new r8i0(96, imk0Var.a, imk0Var.c, imk0Var.d, imk0Var.e, null, imk0Var.b));
            }
        } else if (omk0Var instanceof mmk0) {
            ArrayList<jmk0> arrayList3 = ((mmk0) omk0Var).d;
            arrayList = new ArrayList(tcc.n(arrayList3, 10));
            for (jmk0 jmk0Var : arrayList3) {
                String str = jmk0Var.a;
                String str2 = jmk0Var.c;
                boolean z = jmk0Var.b;
                String str3 = jmk0Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new r8i0(112, str, str2, str3, null, null, z));
            }
        } else {
            if (!(omk0Var instanceof nmk0)) {
                w511.b();
                return;
            }
            ArrayList<kmk0> arrayList4 = ((nmk0) omk0Var).d;
            arrayList = new ArrayList(tcc.n(arrayList4, 10));
            for (kmk0 kmk0Var : arrayList4) {
                arrayList.add(new r8i0(120, kmk0Var.a, kmk0Var.c, null, null, null, kmk0Var.b));
            }
        }
        this.R.setRatingReasons(arrayList);
    }
}
