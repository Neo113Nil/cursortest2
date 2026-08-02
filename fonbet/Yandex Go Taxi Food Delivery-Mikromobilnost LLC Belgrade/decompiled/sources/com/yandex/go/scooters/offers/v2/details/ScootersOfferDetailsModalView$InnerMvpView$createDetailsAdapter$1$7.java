package com.yandex.go.scooters.offers.v2.details;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.cvw;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$7 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ ScootersOfferDetailsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$7(ScootersOfferDetailsModalView scootersOfferDetailsModalView) {
        super(0, 0, cvw.class, "prepareSectionDivider", "createDetailsAdapter$prepareSectionDivider(Lcom/yandex/go/scooters/offers/v2/details/ScootersOfferDetailsModalView;)Landroid/view/View;");
        this.this$0 = scootersOfferDetailsModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View view = new View(this.this$0.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tje.u(1, view.getContext()));
        layoutParams.setMargins(tje.u(16, view.getContext()), 0, tje.u(16, view.getContext()), 0);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(qje.t(xng0.line, view.getContext()));
        return view;
    }
}
