package com.yandex.go.scooters.offers.v2.details;

import android.widget.FrameLayout;
import defpackage.cvw;
import defpackage.mrg0;
import defpackage.sls;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$1 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ ScootersOfferDetailsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$1(ScootersOfferDetailsModalView scootersOfferDetailsModalView) {
        super(0, 0, cvw.class, "prepareHeaderItem", "createDetailsAdapter$prepareHeaderItem(Lcom/yandex/go/scooters/offers/v2/details/ScootersOfferDetailsModalView;)Lru/yandex/taxi/widget/RobotoTextView;");
        this.this$0 = scootersOfferDetailsModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        RobotoTextView robotoTextView = new RobotoTextView(this.this$0.getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int r = tje.r(mrg0.go_design_m_space, robotoTextView.getContext());
        robotoTextView.setPadding(r, r, r, r);
        robotoTextView.setTextTypeface(3);
        robotoTextView.setTextSize(0, tje.r(mrg0.component_text_size_subtitle, robotoTextView.getContext()));
        return robotoTextView;
    }
}
