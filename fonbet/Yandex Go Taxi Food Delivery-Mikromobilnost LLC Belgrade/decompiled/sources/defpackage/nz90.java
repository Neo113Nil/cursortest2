package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class nz90 {
    public static oz90 a(PlusPayCompositeOffers.Offer offer, omm0 omm0Var, tls tlsVar) {
        qz90 qz90Var = new qz90(offer, omm0Var);
        tlsVar.invoke(qz90Var);
        List J0 = a.J0(qz90Var.g);
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        PlusPayCompositeOffers.Offer.Vendor vendor = tariffOffer != null ? tariffOffer.getVendor() : null;
        int i = vendor == null ? -1 : pz90.b[vendor.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : J0) {
                    if (((PaymentErrorButtonContent$ClickAction) obj) != PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD) {
                        arrayList.add(obj);
                    }
                }
                J0 = arrayList;
            } else if (i != 3) {
                w511.b();
                return null;
            }
        }
        List list = J0;
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(qz90Var.c((PaymentErrorButtonContent$ClickAction) it.next()));
        }
        String str = qz90Var.b;
        String str2 = qz90Var.c;
        String str3 = qz90Var.d;
        String str4 = qz90Var.e;
        sz90 sz90Var = qz90Var.f;
        mz90 mz90Var = (mz90) a.S(0, arrayList2);
        if (mz90Var == null) {
            mz90Var = qz90Var.c(PaymentErrorButtonContent$ClickAction.CLOSE);
        }
        return new oz90(str, str2, str3, str4, sz90Var, mz90Var, (mz90) a.S(1, arrayList2));
    }
}
