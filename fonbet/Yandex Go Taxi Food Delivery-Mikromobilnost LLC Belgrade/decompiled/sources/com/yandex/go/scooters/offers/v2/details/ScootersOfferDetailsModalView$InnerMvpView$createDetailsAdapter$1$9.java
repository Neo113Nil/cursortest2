package com.yandex.go.scooters.offers.v2.details;

import android.widget.FrameLayout;
import defpackage.g3o0;
import defpackage.mrg0;
import defpackage.sls;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$9 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        g3o0 g3o0Var = (g3o0) this.receiver;
        g3o0Var.getClass();
        ShimmeringBar shimmeringBar = new ShimmeringBar(g3o0Var.b.getContext(), null, 0, 0, 14, null);
        shimmeringBar.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.u(60, shimmeringBar.getContext())));
        shimmeringBar.setPadding(tje.r(mrg0.go_design_m_space, shimmeringBar.getContext()), tje.u(22, shimmeringBar.getContext()), tje.u(76, shimmeringBar.getContext()), tje.u(22, shimmeringBar.getContext()));
        return shimmeringBar;
    }
}
