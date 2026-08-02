package defpackage;

import java.util.List;
import kotlin.sequences.b;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class kdn {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d4a0 a(lea0 lea0Var) {
        PaymentMethodType paymentMethodType;
        PaymentMethodType paymentMethodType2;
        if (lea0Var != null) {
            if (lea0Var instanceof fl8) {
                fl8 fl8Var = (fl8) lea0Var;
                return new d4a0(fl8Var.a, PaymentMethodType.CARD, fl8Var.d, fl8Var.e, null);
            }
            if (lea0Var instanceof jve) {
                jve jveVar = (jve) lea0Var;
                return new d4a0(jveVar.a, PaymentMethodType.CORP, null, null, jveVar.c);
            }
            if (lea0Var instanceof h8b0) {
                h8b0 h8b0Var = (h8b0) lea0Var;
                return new d4a0(h8b0Var.a, PaymentMethodType.PERSONAL_WALLET, null, null, h8b0Var.c);
            }
            PaymentMethod$Type c = lea0Var.c();
            int i = c == null ? -1 : jdn.a[c.ordinal()];
            if (i == 1) {
                paymentMethodType = PaymentMethodType.CASH;
            } else if (i == 2) {
                paymentMethodType = PaymentMethodType.CARD;
            } else if (i == 3) {
                paymentMethodType = PaymentMethodType.GOOGLE_PAY;
            } else if (i == 4) {
                paymentMethodType = PaymentMethodType.CORP;
            } else if (i != 5) {
                paymentMethodType2 = null;
                if (paymentMethodType2 != null) {
                    return new d4a0(lea0Var.getId(), paymentMethodType2, null, null, null);
                }
            } else {
                paymentMethodType = PaymentMethodType.PERSONAL_WALLET;
            }
            paymentMethodType2 = paymentMethodType;
            if (paymentMethodType2 != null) {
            }
        }
        return null;
    }

    public static y7a0 c(hfa0 hfa0Var) {
        return new y7a0(a(hfa0Var != null ? hfa0Var.b() : null));
    }

    public final List b(List list) {
        return b.t(b.i(new yw01(new h73(1, list), new urm(this))));
    }
}
