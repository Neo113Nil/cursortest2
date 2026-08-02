package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffersKt;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutFragment$onViewCreated$checkoutContentViewController$7 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str;
        ArrayList arrayList;
        String str2 = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        d dVar = (d) this.receiver;
        r0 r0Var = dVar.N;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) r0Var.getValue();
        if (plusPayCompositeOfferDetails != null) {
            PlusPayAdditionalOffers additionalOffers = plusPayCompositeOfferDetails.getAdditionalOffers();
            List<PlusPayAdditionalOffer> offers = additionalOffers.getOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(offers, 10));
            for (PlusPayAdditionalOffer plusPayAdditionalOffer : offers) {
                if (str2.equals(plusPayAdditionalOffer.getOffer().getOfferName())) {
                    str = str2;
                    arrayList = arrayList2;
                    plusPayAdditionalOffer = PlusPayAdditionalOffer.copy$default(plusPayAdditionalOffer, null, null, false, booleanValue, null, null, null, null, 247, null);
                } else {
                    str = str2;
                    arrayList = arrayList2;
                }
                arrayList.add(plusPayAdditionalOffer);
                arrayList2 = arrayList;
                str2 = str;
            }
            PlusPayAdditionalOffers copy$default = PlusPayAdditionalOffers.copy$default(additionalOffers, null, null, arrayList2, null, null, 27, null);
            r0Var.l(PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, null, copy$default, 4095, null));
            dVar.Z(dVar.c.a.a(), plusPayCompositeOfferDetails, PlusPayAdditionalOffersKt.toOfferDetailsConfiguration(copy$default));
        }
        return zy11.a;
    }
}
