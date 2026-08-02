package com.yandex.go.scooters.offers.v2.details;

import android.widget.FrameLayout;
import defpackage.cvw;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListGroupHeaderComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$5 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ ScootersOfferDetailsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferDetailsModalView$InnerMvpView$createDetailsAdapter$1$5(ScootersOfferDetailsModalView scootersOfferDetailsModalView) {
        super(0, 0, cvw.class, "prepareSectionTitleItem", "createDetailsAdapter$prepareSectionTitleItem(Lcom/yandex/go/scooters/offers/v2/details/ScootersOfferDetailsModalView;)Lru/yandex/taxi/design/ListGroupHeaderComponent;");
        this.this$0 = scootersOfferDetailsModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(this.this$0.getContext(), null, 0, 6, null);
        listGroupHeaderComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listGroupHeaderComponent.applyThemeForChildrenByDefault();
        return listGroupHeaderComponent;
    }
}
