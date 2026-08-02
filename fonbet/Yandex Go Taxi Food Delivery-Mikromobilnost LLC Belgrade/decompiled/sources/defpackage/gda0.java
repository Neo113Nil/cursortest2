package defpackage;

import com.yandex.go.loyalty.impl.common.experiments.LoyaltyProgramsStateExperiment;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.CashLikeAccount;
import com.yandex.go.payments.data.model.response.CommonPaymentMethodDto;
import com.yandex.go.payments.data.model.response.ComplementWallet;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.JazzcashWallet;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.SbpToken;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.YangoPaySimpleIntegrationDto;
import com.yandex.go.payments.data.model.response.YangoPayWalletDto;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.data.model.response.r0;
import com.yandex.go.payments.data.model.response.x1;
import com.yandex.go.payments.data.model.response.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class gda0 {
    public final lz90 a;
    public final jvz b;
    public final boj c;

    public gda0(lz90 lz90Var, jvz jvzVar, boj bojVar) {
        this.a = lz90Var;
        this.b = jvzVar;
        this.c = bojVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListBuilder a(PaymentMethods paymentMethods, boolean z) {
        qgx qgxVar;
        ListBuilder a = rcc.a();
        List list = paymentMethods.t;
        PaymentMethods.SbpTokensPaymentMethods sbpTokensPaymentMethods = paymentMethods.q;
        PaymentMethods.CardPaymentMethods cardPaymentMethods = paymentMethods.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            qgx qgxVar2 = null;
            lz90 lz90Var = this.a;
            if (!hasNext) {
                a.addAll(arrayList);
                List list2 = cardPaymentMethods.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(lz90Var.a((Card) it2.next(), true));
                }
                a.addAll(arrayList2);
                List list3 = cardPaymentMethods.b;
                ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(lz90Var.a((Card) it3.next(), false));
                }
                a.addAll(arrayList3);
                List list4 = sbpTokensPaymentMethods.a;
                ArrayList arrayList4 = new ArrayList(tcc.n(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(lz90Var.k((SbpToken) it4.next(), true));
                }
                a.addAll(arrayList4);
                List list5 = sbpTokensPaymentMethods.b;
                ArrayList arrayList5 = new ArrayList(tcc.n(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(lz90Var.k((SbpToken) it5.next(), false));
                }
                a.addAll(arrayList5);
                MBankAccount mBankAccount = paymentMethods.r.a;
                if (mBankAccount != null) {
                    a.add(lz90Var.g(mBankAccount));
                }
                if (((LoyaltyProgramsStateExperiment) this.b.a.b()).getB()) {
                    List list6 = paymentMethods.s.a;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        wxc o = lz90Var.o((ComplementWallet) it6.next());
                        if (o != null) {
                            arrayList6.add(o);
                        }
                    }
                    a.addAll(arrayList6);
                } else {
                    List list7 = paymentMethods.e.a;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = list7.iterator();
                    while (it7.hasNext()) {
                        h8b0 i = lz90Var.i((PersonalAccount) it7.next());
                        if (i != null) {
                            arrayList7.add(i);
                        }
                    }
                    a.addAll(arrayList7);
                }
                List list8 = paymentMethods.g.a;
                ArrayList arrayList8 = new ArrayList(tcc.n(list8, 10));
                Iterator it8 = list8.iterator();
                while (it8.hasNext()) {
                    arrayList8.add(lz90Var.n((YbWallet) it8.next()));
                }
                a.addAll(arrayList8);
                List list9 = paymentMethods.f.b;
                ArrayList arrayList9 = new ArrayList(tcc.n(list9, 10));
                Iterator it9 = list9.iterator();
                while (it9.hasNext()) {
                    arrayList9.add(lz90Var.l((SharedAccount) it9.next()));
                }
                a.addAll(arrayList9);
                List<CashLikeAccount> list10 = paymentMethods.b.a;
                ArrayList arrayList10 = new ArrayList(tcc.n(list10, 10));
                for (CashLikeAccount cashLikeAccount : list10) {
                    lz90Var.getClass();
                    String a2 = cashLikeAccount.getA();
                    lz90Var.b.getClass();
                    arrayList10.add(new t19(a2, ry90.b(cashLikeAccount), cashLikeAccount.getB(), cashLikeAccount.getC(), cashLikeAccount.getD()));
                }
                a.addAll(arrayList10);
                List list11 = paymentMethods.c.a;
                ArrayList arrayList11 = new ArrayList(tcc.n(list11, 10));
                Iterator it10 = list11.iterator();
                while (it10.hasNext()) {
                    arrayList11.add(lz90Var.b((CorpAccount) it10.next()));
                }
                a.addAll(arrayList11);
                List list12 = paymentMethods.d.a;
                ArrayList arrayList12 = new ArrayList(tcc.n(list12, 10));
                Iterator it11 = list12.iterator();
                while (it11.hasNext()) {
                    arrayList12.add(lz90Var.c((DeliveryPaymentMethod) it11.next()));
                }
                a.addAll(arrayList12);
                this.c.getClass();
                if (z) {
                    String str = paymentMethods.n;
                    ivt ivtVar = (str == null || evu0.J(str)) ? null : new ivt(null);
                    if (ivtVar != null) {
                        a.add(ivtVar);
                    }
                }
                PaymentMethods.LocationInfo locationInfo = paymentMethods.o;
                a.add(new u19(locationInfo != null ? locationInfo.b : null));
                return a.j();
            }
            r0 r0Var = (r0) it.next();
            if (r0Var instanceof YapeToken) {
                YapeToken yapeToken = (YapeToken) r0Var;
                qgxVar = yapeToken.getE() == null ? lz90Var.m(yapeToken, true) : lz90Var.m(yapeToken, false);
            } else if (r0Var instanceof NequiToken) {
                NequiToken nequiToken = (NequiToken) r0Var;
                qgxVar = nequiToken.getE() == null ? lz90Var.h(nequiToken, true) : lz90Var.h(nequiToken, false);
            } else if (r0Var instanceof FastshiftAccount) {
                FastshiftAccount fastshiftAccount = (FastshiftAccount) r0Var;
                qgxVar = fastshiftAccount.getE() == null ? lz90Var.d(fastshiftAccount, true) : lz90Var.d(fastshiftAccount, false);
            } else if (r0Var instanceof JazzcashWallet) {
                JazzcashWallet jazzcashWallet = (JazzcashWallet) r0Var;
                qgxVar = jazzcashWallet.getE() == null ? lz90Var.e(jazzcashWallet, true) : lz90Var.e(jazzcashWallet, false);
            } else {
                if (r0Var instanceof SbpBindToken) {
                    qgxVar2 = lz90Var.j((SbpBindToken) r0Var);
                } else if (r0Var instanceof Kaspi) {
                    qgxVar2 = lz90Var.f((Kaspi) r0Var);
                } else if (!(r0Var instanceof CommonPaymentMethodDto)) {
                    w511.b();
                    return null;
                }
                if (qgxVar2 == null) {
                    arrayList.add(qgxVar2);
                }
            }
            qgxVar2 = qgxVar;
            if (qgxVar2 == null) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final lea0 b(PaymentMethods paymentMethods, lv90 lv90Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        PaymentMethod$Type paymentMethod$Type = lv90Var.a;
        String str = lv90Var.b;
        int i = paymentMethod$Type == null ? -1 : fda0.a[paymentMethod$Type.ordinal()];
        lz90 lz90Var = this.a;
        switch (i) {
            case -1:
            case 7:
            case 8:
            case 22:
            case 23:
                return null;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                List list = paymentMethods.t;
                ArrayList arrayList = new ArrayList();
                for (Object obj19 : list) {
                    if (obj19 instanceof YapeToken) {
                        arrayList.add(obj19);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((YapeToken) obj).getA(), str)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                YapeToken yapeToken = (YapeToken) obj;
                if (yapeToken != null) {
                    return yapeToken.getE() == null ? lz90Var.m(yapeToken, true) : lz90Var.m(yapeToken, false);
                }
                return null;
            case 2:
                List list2 = paymentMethods.t;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj20 : list2) {
                    if (obj20 instanceof NequiToken) {
                        arrayList2.add(obj20);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (jl40.l(((NequiToken) obj2).getA(), str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                NequiToken nequiToken = (NequiToken) obj2;
                if (nequiToken != null) {
                    return nequiToken.getE() == null ? lz90Var.h(nequiToken, true) : lz90Var.h(nequiToken, false);
                }
                return null;
            case 3:
                List list3 = paymentMethods.t;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj21 : list3) {
                    if (obj21 instanceof FastshiftAccount) {
                        arrayList3.add(obj21);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (jl40.l(((FastshiftAccount) obj3).getA(), str)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                FastshiftAccount fastshiftAccount = (FastshiftAccount) obj3;
                if (fastshiftAccount != null) {
                    return fastshiftAccount.getE() == null ? lz90Var.d(fastshiftAccount, true) : lz90Var.d(fastshiftAccount, false);
                }
                return null;
            case 4:
                List list4 = paymentMethods.t;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj22 : list4) {
                    if (obj22 instanceof JazzcashWallet) {
                        arrayList4.add(obj22);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (jl40.l(((JazzcashWallet) obj4).getA(), str)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                JazzcashWallet jazzcashWallet = (JazzcashWallet) obj4;
                if (jazzcashWallet != null) {
                    return jazzcashWallet.getE() == null ? lz90Var.e(jazzcashWallet, true) : lz90Var.e(jazzcashWallet, false);
                }
                return null;
            case 5:
                List list5 = paymentMethods.t;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj23 : list5) {
                    if (obj23 instanceof SbpBindToken) {
                        arrayList5.add(obj23);
                    }
                }
                Iterator it5 = arrayList5.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj5 = it5.next();
                        if (jl40.l(((SbpBindToken) obj5).getA(), str)) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                SbpBindToken sbpBindToken = (SbpBindToken) obj5;
                if (sbpBindToken != null) {
                    return lz90Var.j(sbpBindToken);
                }
                return null;
            case 6:
                List list6 = paymentMethods.t;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj24 : list6) {
                    if (obj24 instanceof Kaspi) {
                        arrayList6.add(obj24);
                    }
                }
                Iterator it6 = arrayList6.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj6 = it6.next();
                        if (jl40.l(((Kaspi) obj6).getA(), str)) {
                        }
                    } else {
                        obj6 = null;
                    }
                }
                Kaspi kaspi = (Kaspi) obj6;
                if (kaspi != null) {
                    return lz90Var.f(kaspi);
                }
                return null;
            case 9:
                PaymentMethods.LocationInfo locationInfo = paymentMethods.o;
                return new u19(locationInfo != null ? locationInfo.b : null);
            case 10:
                String str2 = paymentMethods.n;
                if (str2 == null || evu0.J(str2)) {
                    return null;
                }
                return new ivt(null);
            case 11:
                Iterator it7 = paymentMethods.a.a.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj7 = it7.next();
                        if (jl40.l(((Card) obj7).getA(), str)) {
                        }
                    } else {
                        obj7 = null;
                    }
                }
                Card card = (Card) obj7;
                if (card != null) {
                    return lz90Var.a(card, true);
                }
                Iterator it8 = paymentMethods.a.b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj8 = it8.next();
                        if (jl40.l(((Card) obj8).getA(), str)) {
                        }
                    } else {
                        obj8 = null;
                    }
                }
                Card card2 = (Card) obj8;
                if (card2 != null) {
                    return lz90Var.a(card2, false);
                }
                return null;
            case 12:
                Iterator it9 = paymentMethods.q.a.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        obj9 = it9.next();
                        if (jl40.l(((SbpToken) obj9).getA(), str)) {
                        }
                    } else {
                        obj9 = null;
                    }
                }
                SbpToken sbpToken = (SbpToken) obj9;
                if (sbpToken != null) {
                    return lz90Var.k(sbpToken, true);
                }
                Iterator it10 = paymentMethods.q.b.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        obj10 = it10.next();
                        if (jl40.l(((SbpToken) obj10).getA(), str)) {
                        }
                    } else {
                        obj10 = null;
                    }
                }
                SbpToken sbpToken2 = (SbpToken) obj10;
                if (sbpToken2 != null) {
                    return lz90Var.k(sbpToken2, false);
                }
                return null;
            case 13:
                MBankAccount mBankAccount = paymentMethods.r.a;
                if (mBankAccount != null) {
                    if (!jl40.l(mBankAccount.a, str)) {
                        mBankAccount = null;
                    }
                    if (mBankAccount != null) {
                        return lz90Var.g(mBankAccount);
                    }
                }
                return null;
            case 14:
                Iterator it11 = paymentMethods.c.a.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        obj11 = it11.next();
                        if (jl40.l(((CorpAccount) obj11).getA(), str)) {
                        }
                    } else {
                        obj11 = null;
                    }
                }
                CorpAccount corpAccount = (CorpAccount) obj11;
                if (corpAccount != null) {
                    return lz90Var.b(corpAccount);
                }
                return null;
            case 15:
                Iterator it12 = paymentMethods.e.a.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        obj12 = it12.next();
                        if (jl40.l(((PersonalAccount) obj12).a, str)) {
                        }
                    } else {
                        obj12 = null;
                    }
                }
                PersonalAccount personalAccount = (PersonalAccount) obj12;
                if (personalAccount != null) {
                    return lz90Var.i(personalAccount);
                }
                return null;
            case 16:
                Iterator it13 = paymentMethods.f.b.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        obj13 = it13.next();
                        if (jl40.l(((SharedAccount) obj13).getA(), str)) {
                        }
                    } else {
                        obj13 = null;
                    }
                }
                SharedAccount sharedAccount = (SharedAccount) obj13;
                if (sharedAccount != null) {
                    return lz90Var.l(sharedAccount);
                }
                return null;
            case 17:
                Iterator it14 = paymentMethods.g.a.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        obj14 = it14.next();
                        if (jl40.l(((YbWallet) obj14).getA(), str)) {
                        }
                    } else {
                        obj14 = null;
                    }
                }
                YbWallet ybWallet = (YbWallet) obj14;
                if (ybWallet != null) {
                    return lz90Var.n(ybWallet);
                }
                return null;
            case 18:
                Iterator it15 = paymentMethods.d.a.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        obj15 = it15.next();
                        if (jl40.l(((DeliveryPaymentMethod) obj15).a, str)) {
                        }
                    } else {
                        obj15 = null;
                    }
                }
                DeliveryPaymentMethod deliveryPaymentMethod = (DeliveryPaymentMethod) obj15;
                if (deliveryPaymentMethod != null) {
                    return lz90Var.c(deliveryPaymentMethod);
                }
                return null;
            case 19:
                Iterator it16 = paymentMethods.h.a.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        obj16 = it16.next();
                        if (jl40.l(((y1) obj16).getA(), str)) {
                        }
                    } else {
                        obj16 = null;
                    }
                }
                y1 y1Var = (y1) obj16;
                if (y1Var != null) {
                    ry90 ry90Var = lz90Var.b;
                    if (y1Var.equals(x1.INSTANCE)) {
                        return yo51.a;
                    }
                    if (y1Var instanceof YangoPaySimpleIntegrationDto) {
                        YangoPaySimpleIntegrationDto yangoPaySimpleIntegrationDto = (YangoPaySimpleIntegrationDto) y1Var;
                        String a = yangoPaySimpleIntegrationDto.getA();
                        ry90Var.getClass();
                        return new wo51(a, ry90.b(y1Var), yangoPaySimpleIntegrationDto.getB(), yangoPaySimpleIntegrationDto.getD(), yangoPaySimpleIntegrationDto.getC());
                    }
                    if (!(y1Var instanceof YangoPayWalletDto)) {
                        w511.b();
                        return null;
                    }
                    YangoPayWalletDto yangoPayWalletDto = (YangoPayWalletDto) y1Var;
                    String a2 = yangoPayWalletDto.getA();
                    ry90Var.getClass();
                    return new zo51(a2, ry90.b(y1Var), yangoPayWalletDto.getB(), yangoPayWalletDto.getD(), yangoPayWalletDto.getE() && yangoPayWalletDto.f());
                }
                return null;
            case 20:
                Iterator it17 = paymentMethods.b.a.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        obj17 = it17.next();
                        if (jl40.l(((CashLikeAccount) obj17).getA(), str)) {
                        }
                    } else {
                        obj17 = null;
                    }
                }
                CashLikeAccount cashLikeAccount = (CashLikeAccount) obj17;
                if (cashLikeAccount != null) {
                    lz90Var.getClass();
                    String a3 = cashLikeAccount.getA();
                    lz90Var.b.getClass();
                    return new t19(a3, ry90.b(cashLikeAccount), cashLikeAccount.getB(), cashLikeAccount.getC(), cashLikeAccount.getD());
                }
                return null;
            case 21:
                Iterator it18 = paymentMethods.s.a.iterator();
                while (true) {
                    if (it18.hasNext()) {
                        obj18 = it18.next();
                        ComplementWallet complementWallet = (ComplementWallet) obj18;
                        if (complementWallet.getB() != PaymentMethod$Type.BIRBONUS_WALLET || !jl40.l(complementWallet.getA(), str)) {
                        }
                    } else {
                        obj18 = null;
                    }
                }
                ComplementWallet complementWallet2 = (ComplementWallet) obj18;
                if (complementWallet2 != null) {
                    return lz90Var.o(complementWallet2);
                }
                return null;
        }
    }
}
