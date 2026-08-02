package com.yandex.go.scooters.offers.v2.details;

import android.widget.FrameLayout;
import defpackage.cvw;
import defpackage.q0h0;
import defpackage.sls;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$3 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ ScootersOfferDetailsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$3(ScootersOfferDetailsModalView scootersOfferDetailsModalView) {
        super(0, 0, cvw.class, "prepareDetailsItem", "createDetailsAdapter$prepareDetailsItem(Lcom/yandex/go/scooters/offers/v2/details/ScootersOfferDetailsModalView;)Lru/yandex/taxi/design/ListItemComponent;");
        this.this$0 = scootersOfferDetailsModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ListItemComponent listItemComponent = new ListItemComponent(this.this$0.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setMinimumHeight(tje.u(60, listItemComponent.getContext()));
        listItemComponent.setTitleTypeface(5);
        listItemComponent.setTrailCompanionTextColorAttr(xng0.textMain);
        listItemComponent.setBackground(vng.t(q0h0.scooters_item_bg, listItemComponent.getContext()));
        return listItemComponent;
    }
}
