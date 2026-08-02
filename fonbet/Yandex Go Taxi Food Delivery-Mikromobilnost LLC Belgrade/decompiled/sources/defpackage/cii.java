package defpackage;

import com.yandex.go.payments.paymentlist.data.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.delivery.extracted_delivery_form.models.data.PaymentType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes5.dex */
public final class cii {
    public final cda0 a;

    public cii(cda0 cda0Var) {
        this.a = cda0Var;
    }

    public final PaymentType a(lv90 lv90Var) {
        Object obj;
        PaymentMethod$Type paymentMethod$Type = lv90Var.a;
        switch (paymentMethod$Type == null ? -1 : bii.a[paymentMethod$Type.ordinal()]) {
            case 1:
                return PaymentType.CASH;
            case 2:
                return PaymentType.CARD;
            case 3:
                return PaymentType.CORP;
            case 4:
                return PaymentType.CARGO_CORP;
            case 5:
                return PaymentType.GOOGLE_PAY;
            case 6:
                return PaymentType.PERSONAL_WALLET;
            case 7:
                ListBuilder h = ((c) this.a).h();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = h.listIterator(0);
                while (true) {
                    qqy qqyVar = (qqy) listIterator;
                    if (!qqyVar.hasNext()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (jl40.l(((snr0) obj).a, lv90Var.b)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        snr0 snr0Var = (snr0) obj;
                        if (snr0Var == null) {
                            return PaymentType.UNKNOWN;
                        }
                        int i = bii.b[snr0Var.c.ordinal()];
                        return i != 1 ? i != 2 ? PaymentType.UNKNOWN : PaymentType.SHARED_BUSINESS : PaymentType.SHARED_FAMILY;
                    }
                    Object next = qqyVar.next();
                    if (next instanceof snr0) {
                        arrayList.add(next);
                    }
                }
            case 8:
                return PaymentType.YB_WALLET;
            default:
                return PaymentType.UNKNOWN;
        }
    }
}
