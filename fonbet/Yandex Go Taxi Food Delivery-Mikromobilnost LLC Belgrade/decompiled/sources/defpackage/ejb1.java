package defpackage;

import com.yandex.go.chargers.payments.api.data.ChargersPaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes11.dex */
public abstract class ejb1 {
    public static final Float a(Object obj, Map map) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static boolean b(float f, float f2) {
        return f == f2 || Math.abs(f - f2) < Math.max(Math.ulp(f), Math.ulp(f2));
    }

    public static final List c(m6a0 m6a0Var) {
        ChargersPaymentMethod chargersPaymentMethod;
        ChargersPaymentMethod chargersPaymentMethod2;
        if (m6a0Var == null) {
            return EmptyList.a;
        }
        String str = m6a0Var.b;
        PaymentMethod$Type paymentMethod$Type = m6a0Var.a;
        switch (wla.a[paymentMethod$Type.ordinal()]) {
            case 1:
                chargersPaymentMethod = new ChargersPaymentMethod(paymentMethod$Type.getCode(), null);
                break;
            case 2:
                chargersPaymentMethod2 = new ChargersPaymentMethod(paymentMethod$Type.getCode(), str);
                chargersPaymentMethod = chargersPaymentMethod2;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                chargersPaymentMethod2 = new ChargersPaymentMethod(paymentMethod$Type.getCode(), str);
                chargersPaymentMethod = chargersPaymentMethod2;
                break;
            default:
                chargersPaymentMethod = new ChargersPaymentMethod(PaymentMethod$Type.CARD.getCode(), str);
                break;
        }
        ArrayList i = scc.i(chargersPaymentMethod);
        m6a0 m6a0Var2 = m6a0Var.c;
        if (m6a0Var2 != null) {
            i.add(new ChargersPaymentMethod("yandex_account", m6a0Var2.b));
        }
        return i;
    }
}
