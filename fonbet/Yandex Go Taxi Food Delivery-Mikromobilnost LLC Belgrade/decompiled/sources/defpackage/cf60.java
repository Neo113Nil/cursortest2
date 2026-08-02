package defpackage;

import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class cf60 implements t6d0 {
    public final sls a;

    public cf60(sls slsVar) {
        this.a = slsVar;
    }

    @Override // defpackage.t6d0
    public final PlusPayCompositeOfferDetails a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails) {
        PlusThemedUrl widgetUrls;
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
        ArrayList arrayList = new ArrayList(tcc.n(paymentMethodsGroups, 10));
        for (PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup : paymentMethodsGroups) {
            List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
            ArrayList arrayList2 = new ArrayList(tcc.n(paymentMethods, 10));
            for (PlusPayCompositeOfferDetails.PaymentMethod paymentMethod : paymentMethods) {
                if (paymentMethod.getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.CARD && (!((Boolean) this.a.invoke()).booleanValue() || ((widgetUrls = paymentMethod.getWidgetUrls()) != null && !widgetUrls.isValid()))) {
                    paymentMethod = PlusPayCompositeOfferDetails.PaymentMethod.copy$default(paymentMethod, null, null, null, null, null, null, null, null, null, null, 255, null);
                }
                arrayList2.add(paymentMethod);
            }
            arrayList.add(PlusPayCompositeOfferDetails.PaymentMethodsGroup.copy$default(paymentMethodsGroup, null, arrayList2, null, 5, null));
        }
        return PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, 6143, null);
    }
}
