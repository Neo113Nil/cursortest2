package com.yandex.go.promocodes.base.impl.discounts.domain.interactors;

import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.promocodes.base.api.domain.entities.status.PromoCodeStatus;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ErrorType;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.PromoState;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.activation.DiscountsCardAction;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.analytics.DiscountsAnalyticsScreen;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.exceptions.PromoCodeErrorException;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import defpackage.avj0;
import defpackage.b1;
import defpackage.cda0;
import defpackage.da0;
import defpackage.fl8;
import defpackage.gpj;
import defpackage.hpj;
import defpackage.jmf0;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mpj;
import defpackage.npj;
import defpackage.ny61;
import defpackage.o61;
import defpackage.pj;
import defpackage.ppj;
import defpackage.qqy;
import defpackage.qu;
import defpackage.vpj;
import defpackage.w511;
import defpackage.wlf0;
import defpackage.xjg;
import defpackage.yzh;
import defpackage.zuj0;
import defpackage.zvi;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class a {
    public final zuj0 a;
    public final com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.a b;
    public final d c;
    public final yzh d;
    public final xjg e;

    public a(zuj0 zuj0Var, com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.a aVar, d dVar, yzh yzhVar, xjg xjgVar) {
        this.a = zuj0Var;
        this.b = aVar;
        this.c = dVar;
        this.d = yzhVar;
        this.e = xjgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, hpj hpjVar, ContinuationImpl continuationImpl) {
        DiscountsPromoCodeActivationInteractor$activateCode$1 discountsPromoCodeActivationInteractor$activateCode$1;
        int i;
        Object a;
        hpj hpjVar2;
        List list2;
        String str2;
        wlf0 wlf0Var;
        List list3;
        Object obj;
        hpj hpjVar3;
        Throwable a2;
        hpj hpjVar4;
        String str3;
        boolean z;
        xjg xjgVar;
        Object obj2;
        String str4 = str;
        if (continuationImpl instanceof DiscountsPromoCodeActivationInteractor$activateCode$1) {
            discountsPromoCodeActivationInteractor$activateCode$1 = (DiscountsPromoCodeActivationInteractor$activateCode$1) continuationImpl;
            int i2 = discountsPromoCodeActivationInteractor$activateCode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discountsPromoCodeActivationInteractor$activateCode$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = discountsPromoCodeActivationInteractor$activateCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discountsPromoCodeActivationInteractor$activateCode$1.label;
                int i3 = 9;
                d dVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    r0 r0Var = hpjVar.a.H;
                    r0Var.getClass();
                    r0Var.m(null, ppj.a);
                    discountsPromoCodeActivationInteractor$activateCode$1.L$0 = str4;
                    discountsPromoCodeActivationInteractor$activateCode$1.L$1 = list;
                    discountsPromoCodeActivationInteractor$activateCode$1.L$2 = hpjVar;
                    discountsPromoCodeActivationInteractor$activateCode$1.label = 1;
                    a = this.b.a(str4, discountsPromoCodeActivationInteractor$activateCode$1);
                    if (a != coroutineSingletons) {
                        hpjVar2 = hpjVar;
                        list2 = list;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        wlf0Var = (wlf0) discountsPromoCodeActivationInteractor$activateCode$1.L$4;
                        obj = discountsPromoCodeActivationInteractor$activateCode$1.L$3;
                        hpjVar3 = (hpj) discountsPromoCodeActivationInteractor$activateCode$1.L$2;
                        list3 = (List) discountsPromoCodeActivationInteractor$activateCode$1.L$1;
                        str2 = (String) discountsPromoCodeActivationInteractor$activateCode$1.L$0;
                        kotlin.b.b(obj3);
                        if (wlf0Var != null) {
                            com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b bVar = hpjVar3.a;
                            xjg xjgVar2 = bVar.y;
                            xjgVar2.getClass();
                            xjgVar2.h(wlf0Var.f, wlf0Var.e, PromoState.ACTIVE, null);
                            bVar.Ng();
                            ((da0) bVar.D.a).r(new zvi(i3, wlf0Var));
                        }
                        hpjVar2 = hpjVar3;
                        a = obj;
                        list2 = list3;
                        a2 = Result.a(a);
                        if (a2 != null) {
                            discountsPromoCodeActivationInteractor$activateCode$1.L$0 = str2;
                            discountsPromoCodeActivationInteractor$activateCode$1.L$1 = null;
                            discountsPromoCodeActivationInteractor$activateCode$1.L$2 = hpjVar2;
                            discountsPromoCodeActivationInteractor$activateCode$1.L$3 = a;
                            discountsPromoCodeActivationInteractor$activateCode$1.L$4 = a2;
                            discountsPromoCodeActivationInteractor$activateCode$1.label = 3;
                            if (dVar.c(list2, discountsPromoCodeActivationInteractor$activateCode$1) != coroutineSingletons) {
                                hpjVar4 = hpjVar2;
                                str3 = str2;
                                z = a2 instanceof PromoCodeErrorException;
                                xjg xjgVar3 = this.e;
                                if (z) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return zy11.a;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a2 = (Throwable) discountsPromoCodeActivationInteractor$activateCode$1.L$4;
                    hpjVar4 = (hpj) discountsPromoCodeActivationInteractor$activateCode$1.L$2;
                    str3 = (String) discountsPromoCodeActivationInteractor$activateCode$1.L$0;
                    kotlin.b.b(obj3);
                    z = a2 instanceof PromoCodeErrorException;
                    xjg xjgVar32 = this.e;
                    if (z) {
                        jst.e.k(a2, "error activating coupon");
                        String h = ((avj0) this.a).h(kyh0.promocode_toooften);
                        r0 r0Var2 = hpjVar4.a.H;
                        npj npjVar = new npj(h);
                        r0Var2.getClass();
                        r0Var2.m(null, npjVar);
                        ((o61) xjgVar32.c).d(str3, null, null, ErrorType.NETWORK.getValue());
                    } else {
                        PromoCodeErrorException promoCodeErrorException = (PromoCodeErrorException) a2;
                        jmf0 a3 = promoCodeErrorException.a();
                        wlf0 promoCode = promoCodeErrorException.getPromoCode();
                        if (a3 == null || !a3.c) {
                            xjgVar = xjgVar32;
                            if (a3 == null || promoCode.g != PromoCodeStatus.INVALID) {
                                ((da0) hpjVar4.a.D.a).r(new qu(i3));
                            } else {
                                String str5 = a3.b;
                                r0 r0Var3 = hpjVar4.a.H;
                                npj npjVar2 = new npj(str5);
                                r0Var3.getClass();
                                r0Var3.m(null, npjVar2);
                            }
                        } else {
                            ListBuilder h2 = ((c) ((cda0) this.d.a)).h();
                            ArrayList arrayList = new ArrayList();
                            ListIterator listIterator = h2.listIterator(0);
                            while (true) {
                                qqy qqyVar = (qqy) listIterator;
                                if (!qqyVar.hasNext()) {
                                    break;
                                }
                                Object next = qqyVar.next();
                                if (next instanceof fl8) {
                                    arrayList.add(next);
                                }
                            }
                            DiscountsCardAction discountsCardAction = !arrayList.isEmpty() ? DiscountsCardAction.SELECT : DiscountsCardAction.ADD;
                            String str6 = a3.b;
                            com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b bVar2 = hpjVar4.a;
                            bVar2.F = promoCode;
                            xjg xjgVar4 = bVar2.y;
                            int i4 = gpj.a[discountsCardAction.ordinal()];
                            if (i4 == 1) {
                                xjgVar = xjgVar32;
                                obj2 = null;
                                vpj vpjVar = (vpj) xjgVar4.b;
                                DiscountsAnalyticsScreen discountsAnalyticsScreen = DiscountsAnalyticsScreen.INPUT;
                                pj pjVar = vpjVar.a;
                                String value = discountsAnalyticsScreen.getValue();
                                String str7 = promoCode.e;
                                String a4 = vpj.a(promoCode);
                                String str8 = promoCode.f;
                                pjVar.getClass();
                                HashMap hashMap = new HashMap();
                                if (value != null) {
                                    hashMap.put("position", value);
                                }
                                if (str7 != null) {
                                    hashMap.put(Constants.KEY_SERVICE, str7);
                                }
                                if (a4 != null) {
                                    hashMap.put(ClidProvider.STATE, a4);
                                }
                                if (str8 != null) {
                                    hashMap.put("promocode", str8);
                                }
                                pjVar.a.a("CouponRequiresAddCardShown", hashMap, 1, new HashMap());
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                vpj vpjVar2 = (vpj) xjgVar4.b;
                                DiscountsAnalyticsScreen discountsAnalyticsScreen2 = DiscountsAnalyticsScreen.INPUT;
                                b1 b1Var = vpjVar2.b;
                                String value2 = discountsAnalyticsScreen2.getValue();
                                String paymentMethod$Type = PaymentMethod$Type.CARD.toString();
                                String obj4 = vpjVar2.e.a.c().toString();
                                String str9 = promoCode.e;
                                String a5 = vpj.a(promoCode);
                                obj2 = null;
                                String str10 = promoCode.f;
                                b1Var.getClass();
                                xjgVar = xjgVar32;
                                HashMap hashMap2 = new HashMap();
                                if (value2 != null) {
                                    hashMap2.put("position", value2);
                                }
                                hashMap2.put("required_payment_type", paymentMethod$Type);
                                if (obj4 != null) {
                                    hashMap2.put("current_payment_type", obj4);
                                }
                                if (str9 != null) {
                                    hashMap2.put(Constants.KEY_SERVICE, str9);
                                }
                                if (a5 != null) {
                                    hashMap2.put(ClidProvider.STATE, a5);
                                }
                                if (str10 != null) {
                                    hashMap2.put("promocode", str10);
                                }
                                b1Var.a.a("CouponRequiresChangePaymentTypeShown", hashMap2, 1, new HashMap());
                            }
                            r0 r0Var4 = bVar2.H;
                            mpj mpjVar = new mpj(discountsCardAction, str6);
                            r0Var4.getClass();
                            r0Var4.m(obj2, mpjVar);
                        }
                        xjgVar.getClass();
                        jmf0 jmf0Var = promoCode.h;
                        String str11 = promoCode.e;
                        String str12 = promoCode.f;
                        if (jmf0Var == null || !jmf0Var.c) {
                            xjg xjgVar5 = xjgVar;
                            if (jmf0Var == null || promoCode.g != PromoCodeStatus.INVALID) {
                                ((o61) xjgVar5.c).d(str12, null, null, ErrorType.NETWORK.getValue());
                            } else if (jmf0Var.e) {
                                xjgVar5.h(str12, str11, PromoState.INVALID, ErrorType.EXPIRED);
                            } else {
                                xjgVar5.h(str12, str11, PromoState.INVALID, ErrorType.UNRECOGNIZED);
                            }
                        } else if (jmf0Var.d) {
                            xjgVar.h(str12, str11, PromoState.RESTRICTION, ErrorType.CARD_ONLY);
                        } else {
                            xjgVar.h(str12, str11, PromoState.RESTRICTION, ErrorType.CARD_REQUIRED);
                        }
                    }
                    return zy11.a;
                }
                hpj hpjVar5 = (hpj) discountsPromoCodeActivationInteractor$activateCode$1.L$2;
                list2 = (List) discountsPromoCodeActivationInteractor$activateCode$1.L$1;
                String str13 = (String) discountsPromoCodeActivationInteractor$activateCode$1.L$0;
                kotlin.b.b(obj3);
                Object value3 = ((Result) obj3).getValue();
                hpjVar2 = hpjVar5;
                str4 = str13;
                a = value3;
                if (!(a instanceof Result.Failure)) {
                    str2 = str4;
                    a2 = Result.a(a);
                    if (a2 != null) {
                    }
                    return zy11.a;
                }
                wlf0 wlf0Var2 = (wlf0) a;
                discountsPromoCodeActivationInteractor$activateCode$1.L$0 = str4;
                discountsPromoCodeActivationInteractor$activateCode$1.L$1 = list2;
                discountsPromoCodeActivationInteractor$activateCode$1.L$2 = hpjVar2;
                discountsPromoCodeActivationInteractor$activateCode$1.L$3 = a;
                discountsPromoCodeActivationInteractor$activateCode$1.L$4 = wlf0Var2;
                discountsPromoCodeActivationInteractor$activateCode$1.label = 2;
                if (dVar.c(list2, discountsPromoCodeActivationInteractor$activateCode$1) != coroutineSingletons) {
                    str2 = str4;
                    wlf0Var = wlf0Var2;
                    list3 = list2;
                    obj = a;
                    hpjVar3 = hpjVar2;
                    if (wlf0Var != null) {
                    }
                    hpjVar2 = hpjVar3;
                    a = obj;
                    list2 = list3;
                    a2 = Result.a(a);
                    if (a2 != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        discountsPromoCodeActivationInteractor$activateCode$1 = new DiscountsPromoCodeActivationInteractor$activateCode$1(this, continuationImpl);
        Object obj32 = discountsPromoCodeActivationInteractor$activateCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discountsPromoCodeActivationInteractor$activateCode$1.label;
        int i32 = 9;
        d dVar2 = this.c;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }
}
