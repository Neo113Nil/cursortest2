package defpackage;

import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class a8a0 {
    public static final List a(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return list;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((PaymentMethod) it.next()) instanceof PaymentMethod.NewSbpToken) {
                list = new ArrayList();
                for (Object obj : list2) {
                    if (!(((PaymentMethod) obj) instanceof PaymentMethod.Sbp)) {
                        list.add(obj);
                    }
                }
            }
        }
        return list;
    }

    public static final PaymentMethod b(String str, List list) {
        Object obj;
        Object next;
        List<String> list2;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            PaymentMethod paymentMethod = (PaymentMethod) next;
            if (jl40.l(c(paymentMethod), str)) {
                break;
            }
            if (paymentMethod.equals(PaymentMethod.Cash.INSTANCE) || paymentMethod.equals(PaymentMethod.NewCard.INSTANCE) || paymentMethod.equals(PaymentMethod.Sbp.INSTANCE) || paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE) || paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE) || paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE) || paymentMethod.equals(PaymentMethod.Split.INSTANCE) || paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                list2 = null;
            } else if (paymentMethod instanceof PaymentMethod.Card) {
                list2 = ((PaymentMethod.Card) paymentMethod).getAliases$core_release();
            } else if (paymentMethod instanceof PaymentMethod.YBMethod) {
                list2 = ((PaymentMethod.YBMethod) paymentMethod).getAliases$core_release();
            } else {
                if (!(paymentMethod instanceof PaymentMethod.SbpToken)) {
                    w511.b();
                    return null;
                }
                list2 = ((PaymentMethod.SbpToken) paymentMethod).getAliases$core_release();
            }
        } while (!n891.o(list2 != null ? Boolean.valueOf(list2.contains(str)) : null));
        obj = next;
        return (PaymentMethod) obj;
    }

    public static final String c(PaymentMethod paymentMethod) {
        return paymentMethod instanceof PaymentMethod.Cash ? "CASH" : paymentMethod instanceof PaymentMethod.NewCard ? "NEW_CARD" : paymentMethod instanceof PaymentMethod.Sbp ? "SBP_ID" : paymentMethod instanceof PaymentMethod.NewSbpToken ? "NEW_SBP_TOKEN_ID" : paymentMethod instanceof PaymentMethod.GooglePay ? "GOOGLE_PAY" : paymentMethod instanceof PaymentMethod.Card ? ((PaymentMethod.Card) paymentMethod).getCardId() : paymentMethod instanceof PaymentMethod.YBMethod ? ((PaymentMethod.YBMethod) paymentMethod).getId() : paymentMethod instanceof PaymentMethod.SbpToken ? ((PaymentMethod.SbpToken) paymentMethod).getId() : paymentMethod instanceof PaymentMethod.ChallengePollingMethod ? "CHALLENGE_POLLING_ID" : paymentMethod instanceof PaymentMethod.Split ? "SPLIT_ID" : "";
    }

    public static final boolean d(PaymentMethod paymentMethod) {
        return jl40.l(c(paymentMethod), "NEW_CARD");
    }

    public static final boolean e(PaymentMethod paymentMethod) {
        return a.G(j73.f0(new PaymentMethod[]{PaymentMethod.Split.INSTANCE, PaymentMethod.ChallengePollingMethod.INSTANCE}), paymentMethod);
    }

    public static final boolean f(PaymentMethod paymentMethod) {
        return (paymentMethod instanceof PaymentMethod.YBMethod) && ((PaymentMethod.YBMethod) paymentMethod).isOwner();
    }

    public static final ArrayList g(Parcelable[] parcelableArr) {
        if (parcelableArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            arrayList.add((PaymentMethod) parcelable);
        }
        return a.o0(arrayList, PaymentMethod.NewCard.INSTANCE);
    }
}
