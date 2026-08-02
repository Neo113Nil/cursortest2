package defpackage;

import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h5r implements t6d0 {
    public final kaa0 a;
    public final sls b;
    public final sls c;

    public h5r(kaa0 kaa0Var, sls slsVar, sls slsVar2) {
        this.a = kaa0Var;
        this.b = slsVar;
        this.c = slsVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (((java.lang.Boolean) r10.invoke()).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r7.isValid() == true) goto L31;
     */
    @Override // defpackage.t6d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PlusPayCompositeOfferDetails a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails) {
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
        ArrayList arrayList = new ArrayList(tcc.n(paymentMethodsGroups, 10));
        for (PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup : paymentMethodsGroups) {
            List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : paymentMethods) {
                PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) obj;
                this.a.getClass();
                int i = g5r.a[paymentMethod.getType().ordinal()];
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        sls slsVar = this.b;
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    w511.b();
                                    return null;
                                }
                                z = ((Boolean) slsVar.invoke()).booleanValue();
                            }
                        }
                    } else {
                        if (((Boolean) this.c.invoke()).booleanValue()) {
                            PlusThemedUrl widgetUrls = paymentMethod.getWidgetUrls();
                            if (widgetUrls != null) {
                            }
                        }
                        z = false;
                    }
                }
                if (z) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(PlusPayCompositeOfferDetails.PaymentMethodsGroup.copy$default(paymentMethodsGroup, null, arrayList2, null, 5, null));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((PlusPayCompositeOfferDetails.PaymentMethodsGroup) next).getPaymentMethods().isEmpty()) {
                arrayList3.add(next);
            }
        }
        return PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, arrayList3, null, 6143, null);
    }
}
