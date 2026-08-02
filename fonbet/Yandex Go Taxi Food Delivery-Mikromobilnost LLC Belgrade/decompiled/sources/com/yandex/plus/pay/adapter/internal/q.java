package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$GoogleBillingConfig;
import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import defpackage.add0;
import defpackage.aed0;
import defpackage.bfd0;
import defpackage.bpd0;
import defpackage.dfd0;
import defpackage.dye;
import defpackage.fnb0;
import defpackage.fu91;
import defpackage.gv40;
import defpackage.gwk0;
import defpackage.i3y;
import defpackage.k7d0;
import defpackage.lrd;
import defpackage.mpd0;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.pwt;
import defpackage.t9a0;
import defpackage.tls;
import defpackage.tt20;
import defpackage.v7d0;
import defpackage.wnd0;
import defpackage.xz3;
import defpackage.ydd0;
import defpackage.zdd0;
import defpackage.zv91;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class q implements bfd0 {
    public final i3y a;
    public final com.yandex.plus.home.common.utils.b b;

    public q(oay0 oay0Var, tls tlsVar) {
        this.a = kotlin.a.a(new t9a0(23, oay0Var));
        this.b = new com.yandex.plus.home.common.utils.b(gwk0.b(), new AtomicBoolean(false), new PlusPaySdkAdapterImpl$plusPayUIDeferred$1(tlsVar, null));
    }

    public static PlusPayCompositeOffers.Offer a(PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer) {
        PlusPayCompositeOffers.Offer actualOffer;
        CompositeOfferImpl compositeOfferImpl = plusPaySdkAdapter$CompositeOffer instanceof CompositeOfferImpl ? (CompositeOfferImpl) plusPaySdkAdapter$CompositeOffer : null;
        if (compositeOfferImpl != null && (actualOffer = compositeOfferImpl.getActualOffer()) != null) {
            return actualOffer;
        }
        ny61.g("Offer must be of type CompositeOfferImpl");
        return null;
    }

    public final PlusSdkBrandType b() {
        return ((com.yandex.plus.pay.internal.b) ((add0) e())).b.b().e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, dye dyeVar, ContinuationImpl continuationImpl) {
        PlusPaySdkAdapterImpl$getCompositeOffers$1 plusPaySdkAdapterImpl$getCompositeOffers$1;
        int i;
        if (continuationImpl instanceof PlusPaySdkAdapterImpl$getCompositeOffers$1) {
            plusPaySdkAdapterImpl$getCompositeOffers$1 = (PlusPaySdkAdapterImpl$getCompositeOffers$1) continuationImpl;
            int i2 = plusPaySdkAdapterImpl$getCompositeOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAdapterImpl$getCompositeOffers$1.label = i2 - Integer.MIN_VALUE;
                PlusPaySdkAdapterImpl$getCompositeOffers$1 plusPaySdkAdapterImpl$getCompositeOffers$12 = plusPaySdkAdapterImpl$getCompositeOffers$1;
                Object obj = plusPaySdkAdapterImpl$getCompositeOffers$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAdapterImpl$getCompositeOffers$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aed0 aed0Var = (aed0) ((com.yandex.plus.pay.internal.b) e()).e.getValue();
                    com.yandex.plus.pay.api.analytics.a aVar = PlusPayAnalyticsParams.Companion;
                    fnb0 fnb0Var = new fnb0(27);
                    aVar.getClass();
                    PlusPayAnalyticsParams a = com.yandex.plus.pay.api.analytics.a.a(fnb0Var);
                    ydd0 ydd0Var = new ydd0();
                    ydd0Var.b(list);
                    zdd0 a2 = ydd0Var.a();
                    gv40 gv40Var = new gv40(13, dyeVar);
                    plusPaySdkAdapterImpl$getCompositeOffers$12.L$0 = null;
                    plusPaySdkAdapterImpl$getCompositeOffers$12.L$1 = null;
                    plusPaySdkAdapterImpl$getCompositeOffers$12.L$2 = null;
                    plusPaySdkAdapterImpl$getCompositeOffers$12.L$3 = null;
                    plusPaySdkAdapterImpl$getCompositeOffers$12.label = 1;
                    obj = aed0.a(aed0Var, str, a, a2, gv40Var, plusPaySdkAdapterImpl$getCompositeOffers$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return c.d((PlusPayCompositeOffers) obj);
            }
        }
        plusPaySdkAdapterImpl$getCompositeOffers$1 = new PlusPaySdkAdapterImpl$getCompositeOffers$1(this, continuationImpl);
        PlusPaySdkAdapterImpl$getCompositeOffers$1 plusPaySdkAdapterImpl$getCompositeOffers$122 = plusPaySdkAdapterImpl$getCompositeOffers$1;
        Object obj2 = plusPaySdkAdapterImpl$getCompositeOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAdapterImpl$getCompositeOffers$122.label;
        if (i != 0) {
        }
        return c.d((PlusPayCompositeOffers) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PlusPaySdkAdapterImpl$getGoogleBillingConfig$1 plusPaySdkAdapterImpl$getGoogleBillingConfig$1;
        int i;
        PlusPayGoogleBillingConfig plusPayGoogleBillingConfig;
        if (continuationImpl instanceof PlusPaySdkAdapterImpl$getGoogleBillingConfig$1) {
            plusPaySdkAdapterImpl$getGoogleBillingConfig$1 = (PlusPaySdkAdapterImpl$getGoogleBillingConfig$1) continuationImpl;
            int i2 = plusPaySdkAdapterImpl$getGoogleBillingConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAdapterImpl$getGoogleBillingConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPaySdkAdapterImpl$getGoogleBillingConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAdapterImpl$getGoogleBillingConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pwt pwtVar = (pwt) ((com.yandex.plus.pay.internal.b) e()).f.getValue();
                    plusPaySdkAdapterImpl$getGoogleBillingConfig$1.label = 1;
                    obj = pwtVar.a.b(plusPaySdkAdapterImpl$getGoogleBillingConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
                if (plusPayGoogleBillingConfig == null) {
                    return new PlusPaySdkAdapter$GoogleBillingConfig(plusPayGoogleBillingConfig.getGoogleCountryCode(), plusPayGoogleBillingConfig.isNativePaymentAllowed());
                }
                return null;
            }
        }
        plusPaySdkAdapterImpl$getGoogleBillingConfig$1 = new PlusPaySdkAdapterImpl$getGoogleBillingConfig$1(this, continuationImpl);
        Object obj2 = plusPaySdkAdapterImpl$getGoogleBillingConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAdapterImpl$getGoogleBillingConfig$1.label;
        if (i != 0) {
        }
        plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj2;
        if (plusPayGoogleBillingConfig == null) {
        }
    }

    public final v7d0 e() {
        return (v7d0) this.a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r11 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, dfd0 dfd0Var, Map map, boolean z, ContinuationImpl continuationImpl) {
        PlusPaySdkAdapterImpl$startCompositePayment$1 plusPaySdkAdapterImpl$startCompositePayment$1;
        int i;
        PlusPayCompositeOffers.Offer offer;
        if (continuationImpl instanceof PlusPaySdkAdapterImpl$startCompositePayment$1) {
            plusPaySdkAdapterImpl$startCompositePayment$1 = (PlusPaySdkAdapterImpl$startCompositePayment$1) continuationImpl;
            int i2 = plusPaySdkAdapterImpl$startCompositePayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAdapterImpl$startCompositePayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPaySdkAdapterImpl$startCompositePayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAdapterImpl$startCompositePayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayCompositeOffers.Offer a = a(plusPaySdkAdapter$CompositeOffer);
                    plusPaySdkAdapterImpl$startCompositePayment$1.L$0 = null;
                    plusPaySdkAdapterImpl$startCompositePayment$1.L$1 = dfd0Var;
                    plusPaySdkAdapterImpl$startCompositePayment$1.L$2 = map;
                    plusPaySdkAdapterImpl$startCompositePayment$1.L$3 = a;
                    plusPaySdkAdapterImpl$startCompositePayment$1.Z$0 = z;
                    plusPaySdkAdapterImpl$startCompositePayment$1.label = 1;
                    obj = this.b.k(plusPaySdkAdapterImpl$startCompositePayment$1);
                    if (obj != coroutineSingletons) {
                        offer = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return lrd.a((bpd0) obj);
                }
                z = plusPaySdkAdapterImpl$startCompositePayment$1.Z$0;
                offer = (PlusPayCompositeOffers.Offer) plusPaySdkAdapterImpl$startCompositePayment$1.L$3;
                map = (Map) plusPaySdkAdapterImpl$startCompositePayment$1.L$2;
                dfd0Var = (dfd0) plusPaySdkAdapterImpl$startCompositePayment$1.L$1;
                kotlin.b.b(obj);
                mpd0 h = fu91.h((com.yandex.plus.pay.ui.core.internal.a) obj);
                com.yandex.plus.pay.api.analytics.b bVar = PlusPayPaymentAnalyticsParams.Companion;
                k7d0 k7d0Var = new k7d0(3, dfd0Var);
                bVar.getClass();
                PlusPayPaymentAnalyticsParams a2 = com.yandex.plus.pay.api.analytics.b.a(k7d0Var);
                wnd0 c = zv91.c(new xz3(z, map, 12));
                plusPaySdkAdapterImpl$startCompositePayment$1.L$0 = null;
                plusPaySdkAdapterImpl$startCompositePayment$1.L$1 = null;
                plusPaySdkAdapterImpl$startCompositePayment$1.L$2 = null;
                plusPaySdkAdapterImpl$startCompositePayment$1.L$3 = null;
                plusPaySdkAdapterImpl$startCompositePayment$1.Z$0 = z;
                plusPaySdkAdapterImpl$startCompositePayment$1.label = 2;
                obj = ((tt20) h).a(offer, a2, c, plusPaySdkAdapterImpl$startCompositePayment$1);
            }
        }
        plusPaySdkAdapterImpl$startCompositePayment$1 = new PlusPaySdkAdapterImpl$startCompositePayment$1(this, continuationImpl);
        Object obj2 = plusPaySdkAdapterImpl$startCompositePayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAdapterImpl$startCompositePayment$1.label;
        if (i != 0) {
        }
        mpd0 h2 = fu91.h((com.yandex.plus.pay.ui.core.internal.a) obj2);
        com.yandex.plus.pay.api.analytics.b bVar2 = PlusPayPaymentAnalyticsParams.Companion;
        k7d0 k7d0Var2 = new k7d0(3, dfd0Var);
        bVar2.getClass();
        PlusPayPaymentAnalyticsParams a22 = com.yandex.plus.pay.api.analytics.b.a(k7d0Var2);
        wnd0 c2 = zv91.c(new xz3(z, map, 12));
        plusPaySdkAdapterImpl$startCompositePayment$1.L$0 = null;
        plusPaySdkAdapterImpl$startCompositePayment$1.L$1 = null;
        plusPaySdkAdapterImpl$startCompositePayment$1.L$2 = null;
        plusPaySdkAdapterImpl$startCompositePayment$1.L$3 = null;
        plusPaySdkAdapterImpl$startCompositePayment$1.Z$0 = z;
        plusPaySdkAdapterImpl$startCompositePayment$1.label = 2;
        obj2 = ((tt20) h2).a(offer, a22, c2, plusPaySdkAdapterImpl$startCompositePayment$1);
    }
}
