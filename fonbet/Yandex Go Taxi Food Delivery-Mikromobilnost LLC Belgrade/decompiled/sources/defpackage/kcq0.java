package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.datasource.payment.interfaces.PaymentButton$DisableReason;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public class kcq0 implements ucq0 {
    public jc8 a;
    public qgn0 b;
    public tls c;
    public rnf w;
    public List x = EmptyList.a;
    public rwo y;
    public PaymentMethod z;

    public static PaymentOptionNameForAnalytics b(PaymentMethod paymentMethod) {
        return paymentMethod instanceof PaymentMethod.Card ? PaymentOptionNameForAnalytics.EXISTING_CARD : paymentMethod instanceof PaymentMethod.SbpToken ? PaymentOptionNameForAnalytics.SBP_TOKEN : paymentMethod instanceof PaymentMethod.YBMethod ? PaymentOptionNameForAnalytics.YB : jl40.l(paymentMethod, PaymentMethod.Cash.INSTANCE) ? PaymentOptionNameForAnalytics.CASH : jl40.l(paymentMethod, PaymentMethod.GooglePay.INSTANCE) ? PaymentOptionNameForAnalytics.GOOGLE_PAY : jl40.l(paymentMethod, PaymentMethod.NewCard.INSTANCE) ? PaymentOptionNameForAnalytics.NEW_CARD : jl40.l(paymentMethod, PaymentMethod.Sbp.INSTANCE) ? PaymentOptionNameForAnalytics.SBP : jl40.l(paymentMethod, PaymentMethod.NewSbpToken.INSTANCE) ? PaymentOptionNameForAnalytics.NEW_SBP_TOKEN : PaymentOptionNameForAnalytics.UNKNOWN;
    }

    public final ArrayList a() {
        boolean z;
        List<PaymentMethod> list = this.x;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (PaymentMethod paymentMethod : list) {
            if (paymentMethod instanceof PaymentMethod.Card) {
                jc8 jc8Var = this.a;
                if (n891.o(jc8Var != null ? Boolean.valueOf(jc8Var.a((PaymentMethod.Card) paymentMethod)) : null)) {
                    z = true;
                    arrayList.add(new vcq0(paymentMethod, z, false, null, null));
                }
            }
            z = false;
            arrayList.add(new vcq0(paymentMethod, z, false, null, null));
        }
        return arrayList;
    }

    public final Integer c() {
        Integer valueOf = Integer.valueOf(this.x.indexOf(this.z));
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public final void d(PaymentMethod paymentMethod) {
        if (paymentMethod == null || this.x.contains(paymentMethod)) {
            if (paymentMethod == null) {
                qgn0 qgn0Var = this.b;
                if (qgn0Var != null) {
                    nw90 nw90Var = new nw90(PaymentButton$DisableReason.NoSelectedMethod);
                    afq0 afq0Var = (afq0) qgn0Var.b;
                    afq0Var.J = nw90Var;
                    afq0.b0(afq0Var);
                }
            } else {
                f(paymentMethod);
            }
            this.z = paymentMethod;
            return;
        }
        List list = this.x;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((PaymentMethod) it.next()));
        }
        rwo rwoVar = this.y;
        if (rwoVar != null) {
            sv90 sv90Var = qv90.a;
            PaymentOptionNameForAnalytics b = b(paymentMethod);
            ArrayList arrayList2 = new ArrayList(arrayList);
            sv90Var.getClass();
            ((y22) rwoVar).a(sv90.s0("Method list does not contain provided method", b, null, null, arrayList2));
        }
        ny61.r(oyr.i(this.x.size(), "Method list does not contain provided method, methods.size = "));
    }

    public final void e(List list) {
        List<String> restrictions;
        Object obj = null;
        if (list.isEmpty()) {
            rwo rwoVar = this.y;
            if (rwoVar != null) {
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.s0("Method list should not be empty", null, null, null, null));
            }
            ny61.r("Method list should not be empty");
            return;
        }
        this.x = list;
        for (Object obj2 : list) {
            PaymentMethod paymentMethod = (PaymentMethod) obj2;
            if (!(paymentMethod instanceof PaymentMethod.Card) || (restrictions = ((PaymentMethod.Card) paymentMethod).getRestrictions()) == null || restrictions.isEmpty()) {
                obj = obj2;
                break;
            }
        }
        d((PaymentMethod) obj);
    }

    public final void f(PaymentMethod paymentMethod) {
        h991 h991Var;
        qgn0 qgn0Var = this.b;
        if (qgn0Var != null) {
            if (paymentMethod instanceof PaymentMethod.Card) {
                jc8 jc8Var = this.a;
                if (n891.o(jc8Var != null ? Boolean.valueOf(jc8Var.a((PaymentMethod.Card) paymentMethod)) : null)) {
                    h991Var = new nw90(PaymentButton$DisableReason.InvalidCvn);
                    afq0 afq0Var = (afq0) qgn0Var.b;
                    afq0Var.J = h991Var;
                    afq0.b0(afq0Var);
                }
            }
            h991Var = ow90.b;
            afq0 afq0Var2 = (afq0) qgn0Var.b;
            afq0Var2.J = h991Var;
            afq0.b0(afq0Var2);
        }
    }

    @Override // defpackage.ucq0
    public final void onChangeCvn(int i, boolean z, rnf rnfVar) {
        if (i >= 0 && i < this.x.size()) {
            qgn0 qgn0Var = this.b;
            if (z) {
                if (qgn0Var != null) {
                    afq0 afq0Var = (afq0) qgn0Var.b;
                    afq0Var.J = ow90.b;
                    afq0.b0(afq0Var);
                }
            } else if (qgn0Var != null) {
                nw90 nw90Var = new nw90(PaymentButton$DisableReason.InvalidCvn);
                afq0 afq0Var2 = (afq0) qgn0Var.b;
                afq0Var2.J = nw90Var;
                afq0.b0(afq0Var2);
            }
            this.w = rnfVar;
            return;
        }
        List list = this.x;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((PaymentMethod) it.next()));
        }
        rwo rwoVar = this.y;
        if (rwoVar != null) {
            sv90 sv90Var = qv90.a;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(this.x.size());
            ArrayList arrayList2 = new ArrayList(arrayList);
            sv90Var.getClass();
            ((y22) rwoVar).a(sv90.s0("Selected position index is out of methods array", null, valueOf, valueOf2, arrayList2));
        }
        ny61.m(oyr.h(i, this.x.size(), "Selected position index is out of methods array, position = ", ", methods.size = "));
    }

    @Override // defpackage.ucq0
    public final void onSelectPaymentMethod(int i) {
        if (i >= 0 && i < this.x.size()) {
            PaymentMethod paymentMethod = (PaymentMethod) this.x.get(i);
            d(paymentMethod);
            f(paymentMethod);
            tls tlsVar = this.c;
            if (tlsVar != null) {
                tlsVar.invoke(paymentMethod);
                return;
            }
            return;
        }
        List list = this.x;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((PaymentMethod) it.next()));
        }
        rwo rwoVar = this.y;
        if (rwoVar != null) {
            sv90 sv90Var = qv90.a;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(this.x.size());
            ArrayList arrayList2 = new ArrayList(arrayList);
            sv90Var.getClass();
            ((y22) rwoVar).a(sv90.s0("Selected position index is out of methods array", null, valueOf, valueOf2, arrayList2));
        }
        ny61.m(oyr.h(i, this.x.size(), "Selected position index is out of methods array, position = ", ", methods.size = "));
    }
}
