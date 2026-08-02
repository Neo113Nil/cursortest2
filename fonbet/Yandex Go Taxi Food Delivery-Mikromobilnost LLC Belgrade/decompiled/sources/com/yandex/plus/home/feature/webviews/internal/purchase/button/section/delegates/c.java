package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import defpackage.EvgenAnalytics$EvgenButtonType;
import defpackage.EvgenAnalytics$EvgenPurchaseType;
import defpackage.bvf0;
import defpackage.cd0;
import defpackage.d15;
import defpackage.f27;
import defpackage.g27;
import defpackage.h0w;
import defpackage.h27;
import defpackage.ha2;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jqr;
import defpackage.jse;
import defpackage.lho;
import defpackage.mth;
import defpackage.n4u0;
import defpackage.nhd0;
import defpackage.nio;
import defpackage.nn3;
import defpackage.nnm;
import defpackage.oio;
import defpackage.on3;
import defpackage.pn3;
import defpackage.pu80;
import defpackage.pzt0;
import defpackage.qn3;
import defpackage.qzf0;
import defpackage.rzf0;
import defpackage.skd0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.y250;
import defpackage.z250;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public abstract class c {
    public final rzf0 a;
    public final z250 b;
    public final h0w c;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a d;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.a e;
    public final ike f;
    public final r0 g;
    public final r0 h;
    public pzt0 i;
    public final i3y j;

    public c(jse jseVar, rzf0 rzf0Var, z250 z250Var, h0w h0wVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a aVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.a aVar2) {
        this.a = rzf0Var;
        this.b = z250Var;
        this.c = h0wVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = bvf0.a(jseVar);
        Boolean bool = Boolean.FALSE;
        this.g = bvf0.c(bool);
        this.h = bvf0.c(bool);
        this.j = kotlin.a.a(new sls() { // from class: com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.a
            @Override // defpackage.sls
            public final Object invoke() {
                c cVar = c.this;
                ha2 n = kotlinx.coroutines.flow.e.n(cVar.g, cVar.h, new jqr(cVar.d(), new BaseButtonSectionDelegate$buttonSectionStateFlow$2$1(2, cVar, c.class, "doOnSubscriptionInfo", "doOnSubscriptionInfo(Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo;)V", 4), 3), new BaseButtonSectionDelegate$buttonSectionStateFlow$2$2(4, cVar, c.class, "getButtonSectionState", "getButtonSectionState(ZZLcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo;)Lcom/yandex/plus/home/feature/webviews/internal/purchase/button/section/ButtonSectionState;", 4));
                ike ikeVar = cVar.f;
                xsr0.a.getClass();
                return kotlinx.coroutines.flow.e.R(n, ikeVar, wsr0.c, null);
            }
        });
    }

    public final void a(tls tlsVar) {
        com.yandex.plus.home.common.utils.c.c(new cd0(6, new mth(c(), 6), tlsVar), this.f, new BaseButtonSectionDelegate$collectButtonSectionState$2(2, this, c.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/button/section/ButtonSectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    }

    public final void b(String str) {
        String concat = str.concat(" is not supported for composite offers");
        skd0.c(PlusLogTag.SUBSCRIPTION, concat, null);
        this.a.f.b(PlusPayButtonDiagnostic$ButtonType.WEB, PlusPayButtonDiagnostic$PaymentType.TARIFFICATOR, concat);
    }

    public final n4u0 c() {
        return (n4u0) this.j.getValue();
    }

    public abstract tpr d();

    public final void e(qn3 qn3Var) {
        y250 y250Var;
        sls slsVar;
        g27 g27Var;
        h27 h27Var = (h27) c().getValue();
        if (!(h27Var instanceof g27)) {
            h27Var = null;
        }
        if (h27Var != null) {
            g27 g27Var2 = (g27) h27Var;
            rzf0 rzf0Var = this.a;
            oio oioVar = rzf0Var.i;
            SubscriptionConfiguration a = g27Var2.a();
            y250 c = g27Var2.c();
            nhd0 d = rzf0.d(rzf0Var, a, c != null ? c.a : null);
            if (d != null) {
                PlusPaymentStat$Source plusPaymentStat$Source = d.a;
                PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType = d.b;
                PlusPaymentStat$ButtonType plusPaymentStat$ButtonType = d.c;
                String str = d.d;
                List list = d.e;
                if (qn3Var instanceof pn3) {
                    g27Var = g27Var2;
                    boolean z = oioVar.b;
                    lho lhoVar = oioVar.a;
                    int i = nio.a[plusPaymentStat$Source.ordinal()];
                    if (i == 1) {
                        EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType);
                        EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType);
                        String str2 = str == null ? "no_value" : str;
                        LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
                        nnm.r(b, n, "purchase_type", a2, "purchase_button");
                        n.put("product_id", str2);
                        nnm.x(n, "options_id", list, false, "is_one_click_payment");
                        n.put("is_tarifficator", String.valueOf(z));
                        HashMap hashMap = new HashMap();
                        nnm.u("version", 1, hashMap, "Payment");
                        n.put("_meta", lho.a(1, hashMap));
                        lhoVar.d("PlusHome.BuySubscription.Authentication.Success", n);
                    } else {
                        if (i != 2) {
                            w511.b();
                            return;
                        }
                        EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType);
                        EvgenAnalytics$EvgenButtonType a3 = d15.a(plusPaymentStat$ButtonType);
                        String str3 = str == null ? "no_value" : str;
                        LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
                        nnm.r(b2, n2, "purchase_type", a3, "purchase_button");
                        n2.put("product_id", str3);
                        nnm.x(n2, "options_id", list, false, "is_one_click_payment");
                        n2.put("is_tarifficator", String.valueOf(z));
                        HashMap hashMap2 = new HashMap();
                        nnm.u("version", 1, hashMap2, "Payment");
                        n2.put("_meta", lho.a(1, hashMap2));
                        lhoVar.d("PlusStories.BuySubscription.Authentication.Success", n2);
                    }
                } else {
                    g27Var = g27Var2;
                    if (qn3Var.equals(nn3.a)) {
                        boolean z2 = oioVar.b;
                        lho lhoVar2 = oioVar.a;
                        int i2 = nio.a[plusPaymentStat$Source.ordinal()];
                        if (i2 == 1) {
                            EvgenAnalytics$EvgenPurchaseType b3 = d15.b(plusPaymentStat$PurchaseType);
                            EvgenAnalytics$EvgenButtonType a4 = d15.a(plusPaymentStat$ButtonType);
                            String str4 = str == null ? "no_value" : str;
                            LinkedHashMap n3 = nnm.n(lhoVar2, "purchase_session_id", "no_value");
                            nnm.r(b3, n3, "purchase_type", a4, "purchase_button");
                            n3.put("product_id", str4);
                            nnm.x(n3, "options_id", list, false, "is_one_click_payment");
                            n3.put("is_tarifficator", String.valueOf(z2));
                            HashMap hashMap3 = new HashMap();
                            nnm.u("version", 1, hashMap3, "Payment");
                            n3.put("_meta", lho.a(1, hashMap3));
                            lhoVar2.d("PlusHome.BuySubscription.Authentication.Cancelled", n3);
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return;
                            }
                            EvgenAnalytics$EvgenPurchaseType b4 = d15.b(plusPaymentStat$PurchaseType);
                            EvgenAnalytics$EvgenButtonType a5 = d15.a(plusPaymentStat$ButtonType);
                            String str5 = str == null ? "no_value" : str;
                            LinkedHashMap n4 = nnm.n(lhoVar2, "purchase_session_id", "no_value");
                            nnm.r(b4, n4, "purchase_type", a5, "purchase_button");
                            n4.put("product_id", str5);
                            nnm.x(n4, "options_id", list, false, "is_one_click_payment");
                            n4.put("is_tarifficator", String.valueOf(z2));
                            HashMap hashMap4 = new HashMap();
                            nnm.u("version", 1, hashMap4, "Payment");
                            n4.put("_meta", lho.a(1, hashMap4));
                            lhoVar2.d("PlusStories.BuySubscription.Authentication.Cancelled", n4);
                        }
                    } else {
                        if (!qn3Var.equals(on3.a)) {
                            w511.b();
                            return;
                        }
                        boolean z3 = oioVar.b;
                        lho lhoVar3 = oioVar.a;
                        int i3 = nio.a[plusPaymentStat$Source.ordinal()];
                        if (i3 == 1) {
                            EvgenAnalytics$EvgenPurchaseType b5 = d15.b(plusPaymentStat$PurchaseType);
                            EvgenAnalytics$EvgenButtonType a6 = d15.a(plusPaymentStat$ButtonType);
                            String str6 = str == null ? "no_value" : str;
                            LinkedHashMap n5 = nnm.n(lhoVar3, "purchase_session_id", "no_value");
                            nnm.r(b5, n5, "purchase_type", a6, "purchase_button");
                            n5.put("product_id", str6);
                            nnm.x(n5, "options_id", list, false, "is_one_click_payment");
                            n5.put("is_tarifficator", String.valueOf(z3));
                            HashMap hashMap5 = new HashMap();
                            nnm.u("version", 1, hashMap5, "Payment");
                            n5.put("_meta", lho.a(1, hashMap5));
                            lhoVar3.d("PlusHome.BuySubscription.Authentication.Failed", n5);
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return;
                            }
                            EvgenAnalytics$EvgenPurchaseType b6 = d15.b(plusPaymentStat$PurchaseType);
                            EvgenAnalytics$EvgenButtonType a7 = d15.a(plusPaymentStat$ButtonType);
                            String str7 = str == null ? "no_value" : str;
                            LinkedHashMap n6 = nnm.n(lhoVar3, "purchase_session_id", "no_value");
                            nnm.r(b6, n6, "purchase_type", a7, "purchase_button");
                            n6.put("product_id", str7);
                            nnm.x(n6, "options_id", list, false, "is_one_click_payment");
                            n6.put("is_tarifficator", String.valueOf(z3));
                            HashMap hashMap6 = new HashMap();
                            nnm.u("version", 1, hashMap6, "Payment");
                            n6.put("_meta", lho.a(1, hashMap6));
                            lhoVar3.d("PlusStories.BuySubscription.Authentication.Failed", n6);
                        }
                    }
                }
                g27Var2 = g27Var;
            }
            if (!(g27Var2 instanceof f27) || (y250Var = ((f27) g27Var2).c) == null || !y250Var.b || (qn3Var instanceof pn3) || (slsVar = this.d.g) == null) {
                return;
            }
            slsVar.invoke();
        }
    }

    public final void f() {
        h27 h27Var = (h27) c().getValue();
        if (!(h27Var instanceof g27)) {
            h27Var = null;
        }
        if (h27Var != null) {
            this.a.f((g27) h27Var);
        }
    }

    public final void g() {
        h27 h27Var = (h27) c().getValue();
        if (!(h27Var instanceof g27)) {
            h27Var = null;
        }
        if (h27Var != null) {
            g27 g27Var = (g27) h27Var;
            SubscriptionConfiguration a = g27Var.a();
            y250 c = g27Var.c();
            PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = c != null ? c.a : null;
            rzf0 rzf0Var = this.a;
            nhd0 d = rzf0.d(rzf0Var, a, plusPaySdkAdapter$CompositeOffer);
            if (d != null) {
                oio oioVar = rzf0Var.i;
                boolean z = oioVar.b;
                lho lhoVar = oioVar.a;
                List list = d.e;
                String str = d.d;
                PlusPaymentStat$ButtonType plusPaymentStat$ButtonType = d.c;
                PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType = d.b;
                int i = nio.a[d.a.ordinal()];
                if (i == 1) {
                    EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType);
                    EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType);
                    String str2 = str == null ? "no_value" : str;
                    LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
                    nnm.r(b, n, "purchase_type", a2, "purchase_button");
                    n.put("product_id", str2);
                    nnm.x(n, "options_id", list, false, "is_one_click_payment");
                    n.put("is_tarifficator", String.valueOf(z));
                    HashMap hashMap = new HashMap();
                    nnm.u("version", 1, hashMap, "Payment");
                    n.put("_meta", lho.a(1, hashMap));
                    lhoVar.d("PlusHome.BuySubscription.Authentication.Shown", n);
                    return;
                }
                if (i != 2) {
                    w511.b();
                    return;
                }
                EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType);
                EvgenAnalytics$EvgenButtonType a3 = d15.a(plusPaymentStat$ButtonType);
                String str3 = str == null ? "no_value" : str;
                LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
                nnm.r(b2, n2, "purchase_type", a3, "purchase_button");
                n2.put("product_id", str3);
                nnm.x(n2, "options_id", list, false, "is_one_click_payment");
                n2.put("is_tarifficator", String.valueOf(z));
                HashMap hashMap2 = new HashMap();
                nnm.u("version", 1, hashMap2, "Payment");
                n2.put("_meta", lho.a(1, hashMap2));
                lhoVar.d("PlusStories.BuySubscription.Authentication.Shown", n2);
            }
        }
    }

    public final void h(pu80 pu80Var) {
        PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType;
        h27 h27Var = (h27) c().getValue();
        if (!(h27Var instanceof f27)) {
            h27Var = null;
        }
        if (h27Var != null) {
            f27 f27Var = (f27) h27Var;
            switch (qzf0.b[pu80Var.b.ordinal()]) {
                case 1:
                case 2:
                    plusPaymentStat$PurchaseType = PlusPaymentStat$PurchaseType.HOST;
                    break;
                case 3:
                    plusPaymentStat$PurchaseType = PlusPaymentStat$PurchaseType.INAPP;
                    break;
                case 4:
                    plusPaymentStat$PurchaseType = PlusPaymentStat$PurchaseType.NATIVE;
                    break;
                case 5:
                    plusPaymentStat$PurchaseType = PlusPaymentStat$PurchaseType.WEB;
                    break;
                case 6:
                    plusPaymentStat$PurchaseType = null;
                    break;
                default:
                    w511.b();
                    return;
            }
            SubscriptionConfiguration subscriptionConfiguration = f27Var.b;
            y250 y250Var = f27Var.c;
            this.a.b(subscriptionConfiguration, y250Var != null ? y250Var.a : null, plusPaymentStat$PurchaseType, pu80Var.c);
        }
    }

    public final void i(tls tlsVar) {
        pzt0 pzt0Var = this.i;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.i = tje.N(this.f, null, null, new BaseButtonSectionDelegate$requestSubscriptionInfo$1(tlsVar, null), 3);
        }
    }
}
