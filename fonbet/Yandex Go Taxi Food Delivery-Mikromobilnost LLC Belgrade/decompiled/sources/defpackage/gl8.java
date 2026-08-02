package defpackage;

import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public class gl8 {
    public static final gl8 a = new gl8();

    public static CardPaymentSystem a(String str) {
        String X = a.X(c.e(str, " "), "", null, null, null, 62);
        if (X.length() != 0 && bvu0.m(10, X) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = rp8.f;
            ArrayList i = scc.i(CardPaymentSystem.AmericanExpress, CardPaymentSystem.DinersClub, CardPaymentSystem.DiscoverCard, CardPaymentSystem.JCB, CardPaymentSystem.HUMO, CardPaymentSystem.Maestro, CardPaymentSystem.MasterCard, CardPaymentSystem.MIR, CardPaymentSystem.UnionPay, CardPaymentSystem.Uzcard, CardPaymentSystem.VISA, CardPaymentSystem.VISA_ELECTRON, CardPaymentSystem.UNKNOWN);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = i.iterator();
            while (it.hasNext()) {
                CardPaymentSystem cardPaymentSystem = (CardPaymentSystem) it.next();
                ArrayList arrayList4 = rp8.f;
                arrayList3.add(q501.r(cardPaymentSystem, false));
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                rp8 rp8Var = (rp8) it2.next();
                for (hl8 hl8Var : rp8Var.b) {
                    String str2 = hl8Var.a;
                    String str3 = hl8Var.b;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    int length = X.length();
                    int length2 = str2.length();
                    if (length >= length2) {
                        length = length2;
                    }
                    int length3 = X.length();
                    int length4 = str3.length();
                    if (length3 >= length4) {
                        length3 = length4;
                    }
                    if (bvu0.m(10, c.g(0, Integer.valueOf(length), X)).longValue() >= bvu0.m(10, c.g(0, Integer.valueOf(length), str2)).longValue() && bvu0.m(10, c.g(0, Integer.valueOf(length3), X)).longValue() <= bvu0.m(10, c.g(0, Integer.valueOf(length3), str3)).longValue()) {
                        arrayList.add(rp8Var.a);
                    }
                }
            }
            if (arrayList.size() <= 1 && arrayList.size() == 1) {
                return (CardPaymentSystem) arrayList.get(0);
            }
            return CardPaymentSystem.UNKNOWN;
        }
        return CardPaymentSystem.UNKNOWN;
    }
}
