package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffersKt;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.jl40;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutFragment$onViewCreated$checkoutContentViewController$8 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PlusPayAdditionalOffers additionalOffers;
        PlusPayAdditionalOffer switchOffer;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails;
        ArrayList arrayList;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d dVar = (d) this.receiver;
        r0 r0Var = dVar.N;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = (PlusPayCompositeOfferDetails) r0Var.getValue();
        if (plusPayCompositeOfferDetails2 != null && (switchOffer = PlusPayAdditionalOffersKt.getSwitchOffer((additionalOffers = plusPayCompositeOfferDetails2.getAdditionalOffers()))) != null && switchOffer.isSelected() != booleanValue) {
            List<PlusPayAdditionalOffer> offers = additionalOffers.getOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(offers, 10));
            for (PlusPayAdditionalOffer plusPayAdditionalOffer : offers) {
                if (jl40.l(plusPayAdditionalOffer.getOffer().getOfferName(), switchOffer.getOffer().getOfferName())) {
                    plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
                    arrayList = arrayList2;
                    plusPayAdditionalOffer = PlusPayAdditionalOffer.copy$default(plusPayAdditionalOffer, null, null, false, booleanValue, null, null, null, null, 247, null);
                } else {
                    plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
                    arrayList = arrayList2;
                }
                arrayList.add(plusPayAdditionalOffer);
                arrayList2 = arrayList;
                plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails;
            }
            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails3 = plusPayCompositeOfferDetails2;
            PlusPayAdditionalOffers copy$default = PlusPayAdditionalOffers.copy$default(additionalOffers, null, null, arrayList2, null, null, 27, null);
            r0Var.l(PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails3, null, null, null, null, null, null, null, null, null, null, null, null, copy$default, 4095, null));
            dVar.Z(dVar.c.a.a(), plusPayCompositeOfferDetails3, PlusPayAdditionalOffersKt.toOfferDetailsConfiguration(copy$default));
        }
        return zy11.a;
    }
}
