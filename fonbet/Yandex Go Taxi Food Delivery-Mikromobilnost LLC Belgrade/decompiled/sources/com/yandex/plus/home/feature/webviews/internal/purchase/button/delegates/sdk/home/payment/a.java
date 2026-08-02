package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$OfferType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.home.state.UpdateTargetEvent;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$PaymentFlowErrorReason;
import com.yandex.plus.pay.adapter.internal.q;
import defpackage.EvgenAnalytics$EvgenButtonType;
import defpackage.EvgenAnalytics$EvgenPurchaseType;
import defpackage.a441;
import defpackage.bfd0;
import defpackage.d15;
import defpackage.dfd0;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.inv;
import defpackage.j73;
import defpackage.jse;
import defpackage.lho;
import defpackage.nhd0;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.qio;
import defpackage.qzf0;
import defpackage.rzf0;
import defpackage.sls;
import defpackage.t821;
import defpackage.tio;
import defpackage.tje;
import defpackage.tls;
import defpackage.uio;
import defpackage.ved0;
import defpackage.w511;
import defpackage.wed0;
import defpackage.wog;
import defpackage.xed0;
import defpackage.y821;
import defpackage.yed0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final bfd0 a;
    public final dfd0 b;
    public final Map c;
    public final rzf0 d;
    public final imd0 e;
    public final jse f;
    public final sls g;
    public final tls h;
    public final ijd0 i;
    public final y821 j;

    public a(bfd0 bfd0Var, dfd0 dfd0Var, Map map, rzf0 rzf0Var, imd0 imd0Var, jse jseVar, sls slsVar, tls tlsVar, ijd0 ijd0Var, y821 y821Var) {
        this.a = bfd0Var;
        this.b = dfd0Var;
        this.c = map;
        this.d = rzf0Var;
        this.e = imd0Var;
        this.f = jseVar;
        this.g = slsVar;
        this.h = tlsVar;
        this.i = ijd0Var;
        this.j = y821Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, SubscriptionConfiguration subscriptionConfiguration, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, ContinuationImpl continuationImpl) {
        PaySdkAdapterPaymentFacadeImpl$doOnSuccess$1 paySdkAdapterPaymentFacadeImpl$doOnSuccess$1;
        int i;
        if (continuationImpl instanceof PaySdkAdapterPaymentFacadeImpl$doOnSuccess$1) {
            paySdkAdapterPaymentFacadeImpl$doOnSuccess$1 = (PaySdkAdapterPaymentFacadeImpl$doOnSuccess$1) continuationImpl;
            int i2 = paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.label;
                if (i != 0) {
                    b.b(obj);
                    PurchaseStatusTypeDto purchaseStatusTypeDto = PurchaseStatusTypeDto.SUCCESS;
                    rzf0 rzf0Var = this.d;
                    rzf0Var.g.invoke(new inv(str, PurchaseTypeDto.NATIVE, purchaseStatusTypeDto, null));
                    nhd0 d = rzf0.d(rzf0Var, subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer);
                    if (d != null) {
                        rzf0Var.h.d(rzf0Var.c, d.b, PlusPaymentStat$ButtonType.NATIVE, d.d, d.e);
                    }
                    if (subscriptionConfiguration.getSubscription().getButtonType() == SubscriptionConfiguration.Subscription.ButtonType.NATIVE) {
                        PaySdkAdapterPaymentFacadeImpl$doOnSuccess$2 paySdkAdapterPaymentFacadeImpl$doOnSuccess$2 = new PaySdkAdapterPaymentFacadeImpl$doOnSuccess$2(this, null);
                        paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.L$0 = null;
                        paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.L$1 = null;
                        paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.L$2 = null;
                        paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.label = 1;
                        if (tje.k0(this.f, paySdkAdapterPaymentFacadeImpl$doOnSuccess$2, paySdkAdapterPaymentFacadeImpl$doOnSuccess$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                a441 a441Var = (a441) this.j;
                a441Var.getClass();
                ((t821) ((wog) a441Var.c).r.getValue()).a.g(j73.f0(new UpdateTargetEvent[]{UpdateTargetEvent.PLUS_AMOUNT, UpdateTargetEvent.PAY_BUTTON}));
                return zy11.a;
            }
        }
        paySdkAdapterPaymentFacadeImpl$doOnSuccess$1 = new PaySdkAdapterPaymentFacadeImpl$doOnSuccess$1(this, continuationImpl);
        Object obj2 = paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paySdkAdapterPaymentFacadeImpl$doOnSuccess$1.label;
        if (i != 0) {
        }
        a441 a441Var2 = (a441) this.j;
        a441Var2.getClass();
        ((t821) ((wog) a441Var2.c).r.getValue()).a.g(j73.f0(new UpdateTargetEvent[]{UpdateTargetEvent.PLUS_AMOUNT, UpdateTargetEvent.PAY_BUTTON}));
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (a(r1, r9, r5, r11) == r12) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        if (r0 == r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        if (r0 == r12) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0252, code lost:
    
        if (r0 == r1) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, SubscriptionConfiguration subscriptionConfiguration, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, ContinuationImpl continuationImpl) {
        PaySdkAdapterPaymentFacadeImpl$purchaseSubscription$1 paySdkAdapterPaymentFacadeImpl$purchaseSubscription$1;
        int i;
        String str2;
        String str3;
        Object f;
        SubscriptionConfiguration subscriptionConfiguration2;
        PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer2;
        yed0 yed0Var;
        SubscriptionConfiguration subscriptionConfiguration3;
        jse jseVar;
        PaySdkAdapterPaymentFacadeImpl$purchaseSubscription$1 paySdkAdapterPaymentFacadeImpl$purchaseSubscription$12;
        CoroutineSingletons coroutineSingletons;
        CoroutineSingletons coroutineSingletons2;
        Object obj;
        PlusPaySdkAdapter$PaymentFlowErrorReason plusPaySdkAdapter$PaymentFlowErrorReason;
        Object obj2;
        PlusPayButtonDiagnostic$OfferType plusPayButtonDiagnostic$OfferType;
        rzf0 rzf0Var = this.d;
        PlusPaymentStat$Source plusPaymentStat$Source = rzf0Var.c;
        tls tlsVar = rzf0Var.g;
        if (continuationImpl instanceof PaySdkAdapterPaymentFacadeImpl$purchaseSubscription$1) {
            paySdkAdapterPaymentFacadeImpl$purchaseSubscription$1 = (PaySdkAdapterPaymentFacadeImpl$purchaseSubscription$1) continuationImpl;
            int i2 = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paySdkAdapterPaymentFacadeImpl$purchaseSubscription$1.label = i2 - Integer.MIN_VALUE;
                PaySdkAdapterPaymentFacadeImpl$purchaseSubscription$1 paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13 = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$1;
                Object obj3 = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj3);
                    boolean isSilentPaymentEnabled = subscriptionConfiguration.isSilentPaymentEnabled();
                    str2 = str;
                    paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$0 = str2;
                    paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$1 = subscriptionConfiguration;
                    paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$2 = plusPaySdkAdapter$CompositeOffer;
                    paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.label = 1;
                    str3 = null;
                    f = ((q) this.a).f(plusPaySdkAdapter$CompositeOffer, this.b, this.c, isSilentPaymentEnabled, paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13);
                    if (f != coroutineSingletons3) {
                        subscriptionConfiguration2 = subscriptionConfiguration;
                        plusPaySdkAdapter$CompositeOffer2 = plusPaySdkAdapter$CompositeOffer;
                    }
                    return coroutineSingletons3;
                }
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj3);
                    return zy11Var;
                }
                plusPaySdkAdapter$CompositeOffer2 = (PlusPaySdkAdapter$CompositeOffer) paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$2;
                SubscriptionConfiguration subscriptionConfiguration4 = (SubscriptionConfiguration) paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$1;
                String str4 = (String) paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$0;
                b.b(obj3);
                f = obj3;
                str3 = null;
                str2 = str4;
                subscriptionConfiguration2 = subscriptionConfiguration4;
                yed0Var = (yed0) f;
                if (yed0Var instanceof xed0) {
                    boolean z = yed0Var instanceof wed0;
                    jse jseVar2 = this.f;
                    if (z) {
                        PlusPaySdkAdapter$PaymentFlowErrorReason plusPaySdkAdapter$PaymentFlowErrorReason2 = ((wed0) yed0Var).a;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$0 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$1 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$2 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$3 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.label = 3;
                        ?? r18 = str3;
                        tlsVar.invoke(new inv(str2, PurchaseTypeDto.NATIVE, PurchaseStatusTypeDto.FAILURE, plusPaySdkAdapter$PaymentFlowErrorReason2.toString()));
                        nhd0 d = rzf0.d(rzf0Var, subscriptionConfiguration2, plusPaySdkAdapter$CompositeOffer2);
                        if (d != null) {
                            uio uioVar = rzf0Var.h;
                            PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType = d.b;
                            PlusPaymentStat$ButtonType plusPaymentStat$ButtonType = PlusPaymentStat$ButtonType.NATIVE;
                            String str5 = d.d;
                            List list = d.e;
                            plusPaySdkAdapter$PaymentFlowErrorReason = plusPaySdkAdapter$PaymentFlowErrorReason2;
                            uioVar.c(plusPaymentStat$Source, plusPaymentStat$PurchaseType, plusPaymentStat$ButtonType, str5, list);
                        } else {
                            plusPaySdkAdapter$PaymentFlowErrorReason = plusPaySdkAdapter$PaymentFlowErrorReason2;
                        }
                        if (subscriptionConfiguration2.getSubscription().getButtonType() == SubscriptionConfiguration.Subscription.ButtonType.NATIVE) {
                            qio qioVar = rzf0Var.f;
                            PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType = PlusPayButtonDiagnostic$ButtonType.NATIVE_SDK;
                            PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType = PlusPayButtonDiagnostic$PaymentType.TARIFFICATOR;
                            int i3 = qzf0.a[subscriptionConfiguration2.getSubscription().getPaymentMethod().ordinal()];
                            if (i3 == 1) {
                                plusPayButtonDiagnostic$OfferType = PlusPayButtonDiagnostic$OfferType.NATIVE;
                            } else if (i3 == 2) {
                                plusPayButtonDiagnostic$OfferType = PlusPayButtonDiagnostic$OfferType.IN_APP;
                            } else {
                                if (i3 != 3) {
                                    w511.b();
                                    return r18;
                                }
                                plusPayButtonDiagnostic$OfferType = PlusPayButtonDiagnostic$OfferType.UNKNOWN;
                            }
                            qioVar.a(plusPayButtonDiagnostic$ButtonType, plusPayButtonDiagnostic$PaymentType, plusPayButtonDiagnostic$OfferType, plusPaySdkAdapter$PaymentFlowErrorReason.toString());
                            obj2 = tje.k0(jseVar2, new PaySdkAdapterPaymentFacadeImpl$doOnError$2(this, r18), paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13);
                        }
                        obj2 = zy11Var;
                    } else {
                        if (!(yed0Var instanceof ved0)) {
                            w511.b();
                            return null;
                        }
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$0 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$1 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$2 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$3 = str3;
                        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.label = 4;
                        tlsVar.invoke(new inv(str2, PurchaseTypeDto.NATIVE, PurchaseStatusTypeDto.CANCEL, str3));
                        nhd0 d2 = rzf0.d(rzf0Var, subscriptionConfiguration2, plusPaySdkAdapter$CompositeOffer2);
                        if (d2 != null) {
                            uio uioVar2 = rzf0Var.h;
                            PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType2 = d2.b;
                            PlusPaymentStat$ButtonType plusPaymentStat$ButtonType2 = PlusPaymentStat$ButtonType.NATIVE;
                            String str6 = d2.d;
                            List list2 = d2.e;
                            boolean z2 = uioVar2.b;
                            lho lhoVar = uioVar2.a;
                            int i4 = tio.a[plusPaymentStat$Source.ordinal()];
                            subscriptionConfiguration3 = subscriptionConfiguration2;
                            coroutineSingletons = coroutineSingletons3;
                            jseVar = jseVar2;
                            paySdkAdapterPaymentFacadeImpl$purchaseSubscription$12 = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13;
                            if (i4 == 1) {
                                EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType2);
                                EvgenAnalytics$EvgenButtonType a = d15.a(plusPaymentStat$ButtonType2);
                                String str7 = str6 == null ? "no_value" : str6;
                                LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
                                nnm.r(b, n, "purchase_type", a, "purchase_button");
                                n.put("product_id", str7);
                                nnm.x(n, "options_id", list2, false, "is_one_click_payment");
                                n.put("is_tarifficator", String.valueOf(z2));
                                HashMap hashMap = new HashMap();
                                nnm.u("version", 1, hashMap, "Payment");
                                n.put("_meta", lho.a(1, hashMap));
                                lhoVar.d("PlusHome.BuySubscription.Cancelled", n);
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType2);
                                EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType2);
                                String str8 = str6 == null ? "no_value" : str6;
                                LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
                                nnm.r(b2, n2, "purchase_type", a2, "purchase_button");
                                n2.put("product_id", str8);
                                nnm.x(n2, "options_id", list2, false, "is_one_click_payment");
                                n2.put("is_tarifficator", String.valueOf(z2));
                                HashMap hashMap2 = new HashMap();
                                nnm.u("version", 1, hashMap2, "Payment");
                                n2.put("_meta", lho.a(1, hashMap2));
                                lhoVar.d("PlusStories.BuySubscription.Cancelled", n2);
                            }
                        } else {
                            subscriptionConfiguration3 = subscriptionConfiguration2;
                            jseVar = jseVar2;
                            paySdkAdapterPaymentFacadeImpl$purchaseSubscription$12 = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13;
                            coroutineSingletons = coroutineSingletons3;
                        }
                        if (subscriptionConfiguration3.getSubscription().getButtonType() == SubscriptionConfiguration.Subscription.ButtonType.NATIVE) {
                            obj = tje.k0(jseVar, new PaySdkAdapterPaymentFacadeImpl$doOnCancel$2(this, null), paySdkAdapterPaymentFacadeImpl$purchaseSubscription$12);
                            coroutineSingletons2 = coroutineSingletons;
                        } else {
                            coroutineSingletons2 = coroutineSingletons;
                        }
                        obj = zy11Var;
                        if (obj == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    }
                    return zy11Var;
                }
                paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$0 = str3;
                paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$1 = str3;
                paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$2 = str3;
                paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.L$3 = str3;
                paySdkAdapterPaymentFacadeImpl$purchaseSubscription$13.label = 2;
            }
        }
        paySdkAdapterPaymentFacadeImpl$purchaseSubscription$1 = new PaySdkAdapterPaymentFacadeImpl$purchaseSubscription$1(this, continuationImpl);
        PaySdkAdapterPaymentFacadeImpl$purchaseSubscription$1 paySdkAdapterPaymentFacadeImpl$purchaseSubscription$132 = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$1;
        Object obj32 = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$132.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paySdkAdapterPaymentFacadeImpl$purchaseSubscription$132.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        yed0Var = (yed0) f;
        if (yed0Var instanceof xed0) {
        }
    }
}
