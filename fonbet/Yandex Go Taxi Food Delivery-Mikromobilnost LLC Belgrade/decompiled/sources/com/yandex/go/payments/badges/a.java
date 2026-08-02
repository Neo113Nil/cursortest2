package com.yandex.go.payments.badges;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment;
import defpackage.cg0;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.edc;
import defpackage.jbh;
import defpackage.mw90;
import defpackage.ny61;
import defpackage.ol40;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.uj4;
import defpackage.vj4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements vj4 {
    public final rqo a;
    public final ol40 b;

    public a(rqo rqoVar, ol40 ol40Var) {
        this.a = rqoVar;
        this.b = ol40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, PaymentsScreen paymentsScreen, ContinuationImpl continuationImpl) {
        BadgeConfigProviderImpl$getBadgeConfig$1 badgeConfigProviderImpl$getBadgeConfig$1;
        int i;
        String str3;
        String str4;
        PaymentsScreen paymentsScreen2;
        PaymentMethodsBadgesExperiment paymentMethodsBadgesExperiment;
        ol40 ol40Var;
        edc a;
        edc a2;
        if (continuationImpl instanceof BadgeConfigProviderImpl$getBadgeConfig$1) {
            badgeConfigProviderImpl$getBadgeConfig$1 = (BadgeConfigProviderImpl$getBadgeConfig$1) continuationImpl;
            int i2 = badgeConfigProviderImpl$getBadgeConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                badgeConfigProviderImpl$getBadgeConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = badgeConfigProviderImpl$getBadgeConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = badgeConfigProviderImpl$getBadgeConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentMethodsBadgesExperiment.Companion.getClass();
                    t1b0 e = ((jbh) this.a).e(PaymentMethodsBadgesExperiment.g);
                    badgeConfigProviderImpl$getBadgeConfig$1.L$0 = str;
                    badgeConfigProviderImpl$getBadgeConfig$1.L$1 = str2;
                    badgeConfigProviderImpl$getBadgeConfig$1.L$2 = paymentsScreen;
                    badgeConfigProviderImpl$getBadgeConfig$1.L$3 = null;
                    badgeConfigProviderImpl$getBadgeConfig$1.label = 1;
                    obj = e.b(badgeConfigProviderImpl$getBadgeConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str;
                    str4 = str2;
                    paymentsScreen2 = paymentsScreen;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    paymentsScreen2 = (PaymentsScreen) badgeConfigProviderImpl$getBadgeConfig$1.L$2;
                    str4 = (String) badgeConfigProviderImpl$getBadgeConfig$1.L$1;
                    str3 = (String) badgeConfigProviderImpl$getBadgeConfig$1.L$0;
                    kotlin.b.b(obj);
                }
                paymentMethodsBadgesExperiment = (PaymentMethodsBadgesExperiment) obj;
                if (paymentMethodsBadgesExperiment.b) {
                    return uj4.c;
                }
                String upperCase = paymentsScreen2.getOpenReason().toUpperCase(Locale.ROOT);
                List list = paymentMethodsBadgesExperiment.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    PaymentMethodsBadgesExperiment.Badge badge = (PaymentMethodsBadgesExperiment.Badge) obj2;
                    if (badge.getD().contains(str3)) {
                        if (!badge.getF().isEmpty()) {
                            List f = badge.getF();
                            if (!(f instanceof Collection) || !f.isEmpty()) {
                                Iterator it = f.iterator();
                                while (it.hasNext()) {
                                    if (cvu0.t((String) it.next(), upperCase, true)) {
                                    }
                                }
                            }
                        }
                        if (!badge.getG().isEmpty()) {
                            List g = badge.getG();
                            if (!(g instanceof Collection) || !g.isEmpty()) {
                                Iterator it2 = g.iterator();
                                while (it2.hasNext()) {
                                    if (cvu0.t((String) it2.next(), str4, true)) {
                                    }
                                }
                            }
                        }
                        arrayList.add(obj2);
                        break;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    ol40Var = this.b;
                    if (!hasNext) {
                        break;
                    }
                    PaymentMethodsBadgesExperiment.Badge badge2 = (PaymentMethodsBadgesExperiment.Badge) it3.next();
                    String j = badge2.getJ();
                    ol40Var.getClass();
                    edc a3 = ol40.a(j);
                    mw90 mw90Var = (a3 == null || (a2 = ol40.a(badge2.getL())) == null) ? null : new mw90(badge2.getA(), badge2.getH(), badge2.getI(), badge2.getK(), d6z.Y(paymentMethodsBadgesExperiment, badge2.getE()), a3, a2, badge2.getB(), badge2.getC());
                    if (mw90Var != null) {
                        arrayList2.add(mw90Var);
                    }
                }
                List list2 = paymentMethodsBadgesExperiment.e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((PaymentMethodsBadgesExperiment.AddPaymentBadge) obj3).getD().contains(str3)) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    PaymentMethodsBadgesExperiment.AddPaymentBadge addPaymentBadge = (PaymentMethodsBadgesExperiment.AddPaymentBadge) it4.next();
                    String g2 = addPaymentBadge.getG();
                    ol40Var.getClass();
                    edc a4 = ol40.a(g2);
                    cg0 cg0Var = (a4 == null || (a = ol40.a(addPaymentBadge.getH())) == null) ? null : new cg0(addPaymentBadge.getA(), addPaymentBadge.getF(), d6z.Y(paymentMethodsBadgesExperiment, addPaymentBadge.getE()), a4, a, addPaymentBadge.getB(), addPaymentBadge.getC());
                    if (cg0Var != null) {
                        arrayList4.add(cg0Var);
                    }
                }
                return new uj4(arrayList2, arrayList4);
            }
        }
        badgeConfigProviderImpl$getBadgeConfig$1 = new BadgeConfigProviderImpl$getBadgeConfig$1(this, continuationImpl);
        Object obj4 = badgeConfigProviderImpl$getBadgeConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = badgeConfigProviderImpl$getBadgeConfig$1.label;
        if (i != 0) {
        }
        paymentMethodsBadgesExperiment = (PaymentMethodsBadgesExperiment) obj4;
        if (paymentMethodsBadgesExperiment.b) {
        }
    }
}
