package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import android.content.Context;
import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.core.data.pay.PlusPaymentMethod;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileArguments;
import defpackage.bob;
import defpackage.bvf0;
import defpackage.cob;
import defpackage.dod0;
import defpackage.ds31;
import defpackage.fnd0;
import defpackage.fv5;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.gio;
import defpackage.hj;
import defpackage.hnd0;
import defpackage.hv5;
import defpackage.hzk;
import defpackage.ind0;
import defpackage.jl40;
import defpackage.jnd0;
import defpackage.k3v0;
import defpackage.kaa0;
import defpackage.kmb;
import defpackage.lj;
import defpackage.lmb;
import defpackage.m0u0;
import defpackage.mdd0;
import defpackage.me0;
import defpackage.mjb;
import defpackage.mmb;
import defpackage.nfd0;
import defpackage.nmb;
import defpackage.ny61;
import defpackage.ohd0;
import defpackage.omb;
import defpackage.omm0;
import defpackage.p2d0;
import defpackage.pfd0;
import defpackage.pzt0;
import defpackage.rld;
import defpackage.scc;
import defpackage.tbb;
import defpackage.tje;
import defpackage.tpd;
import defpackage.tqx0;
import defpackage.u7d0;
import defpackage.w200;
import defpackage.w511;
import defpackage.wqx0;
import defpackage.wsr0;
import defpackage.x0u0;
import defpackage.xsr0;
import defpackage.yr31;
import defpackage.zyh0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class d extends yr31 {
    public final dod0 A;
    public final k3v0 B;
    public final m0u0 C;
    public final x0u0 D;
    public final w200 E;
    public final a F;
    public final fnd0 G;
    public final hzk H;
    public final omm0 I;
    public final mdd0 J;
    public final r0 K;
    public final r0 L;
    public final r0 M;
    public final r0 N;
    public final r0 O;
    public boolean P;
    public pzt0 Q;
    public pzt0 R;
    public final LinkedHashSet S;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.a T;
    public final gci0 U;
    public final PlusTarifficatorMobileArguments b;
    public final jnd0 c;
    public final p2d0 w;
    public final fv5 x;
    public final hv5 y;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a z;

    public d(PlusTarifficatorMobileArguments plusTarifficatorMobileArguments, jnd0 jnd0Var, p2d0 p2d0Var, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a aVar3, dod0 dod0Var, k3v0 k3v0Var, m0u0 m0u0Var, x0u0 x0u0Var, w200 w200Var, a aVar4, fnd0 fnd0Var, hzk hzkVar, omm0 omm0Var, mdd0 mdd0Var, nfd0 nfd0Var, u7d0 u7d0Var) {
        this.b = plusTarifficatorMobileArguments;
        this.c = jnd0Var;
        this.w = p2d0Var;
        this.x = aVar;
        this.y = aVar2;
        this.z = aVar3;
        this.A = dod0Var;
        this.B = k3v0Var;
        this.C = m0u0Var;
        this.D = x0u0Var;
        this.E = w200Var;
        this.F = aVar4;
        this.G = fnd0Var;
        this.H = hzkVar;
        this.I = omm0Var;
        this.J = mdd0Var;
        r0 c = bvf0.c(Boolean.FALSE);
        this.K = c;
        r0 c2 = bvf0.c(null);
        this.L = c2;
        r0 c3 = bvf0.c(null);
        this.M = c3;
        r0 c4 = bvf0.c(null);
        this.N = c4;
        r0 c5 = bvf0.c(null);
        this.O = c5;
        this.S = new LinkedHashSet();
        this.T = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.a(ds31.a(this), nfd0Var, u7d0Var, mdd0Var);
        this.U = e.R(e.l(c, c2, c3, c4, c5, new CheckoutViewModel$screenState$1(6, this, d.class, "createState", "createState(ZLcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/checkout/CheckoutViewModel$PaymentProcessInfo;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;Lcom/yandex/plus/pay/internal/model/PlusPayMailingAdsAgreement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), ds31.a(this), wsr0.a(xsr0.a, 3), new mmb(null));
        Z(jnd0Var.a.a(), null, null);
        tje.N(ds31.a(this), null, null, new CheckoutViewModel$fetchMailingAdsAgreement$1(this, null), 3);
        tje.N(ds31.a(this), null, null, new CheckoutViewModel$setupShownAnalytics$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(d dVar, boolean z, bob bobVar, String str, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, Continuation continuation) {
        CheckoutViewModel$createState$1 checkoutViewModel$createState$1;
        int i;
        omm0 omm0Var = dVar.I;
        if (continuation instanceof CheckoutViewModel$createState$1) {
            checkoutViewModel$createState$1 = (CheckoutViewModel$createState$1) continuation;
            int i2 = checkoutViewModel$createState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutViewModel$createState$1.label = i2 - Integer.MIN_VALUE;
                CheckoutViewModel$createState$1 checkoutViewModel$createState$12 = checkoutViewModel$createState$1;
                Object obj = checkoutViewModel$createState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutViewModel$createState$12.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ind0 a = dVar.c.a.a();
                    if (plusPayCompositeOfferDetails == null) {
                        return new mmb(null);
                    }
                    a aVar = dVar.F;
                    PlusPayCompositeOffers.Offer offer = a.b.getOffer();
                    boolean z2 = tpd.b(offer) == PlusPayCompositeOffers.Offer.Vendor.NATIVE && jl40.l(tpd.a(offer), "RUB");
                    tbb tbbVar = new tbb(i3, dVar);
                    checkoutViewModel$createState$12.L$0 = bobVar;
                    checkoutViewModel$createState$12.L$1 = null;
                    checkoutViewModel$createState$12.L$2 = null;
                    checkoutViewModel$createState$12.L$3 = null;
                    checkoutViewModel$createState$12.L$4 = null;
                    checkoutViewModel$createState$12.Z$0 = z;
                    checkoutViewModel$createState$12.label = 1;
                    obj = aVar.a(plusPayCompositeOfferDetails, z2, plusPayMailingAdsAgreement, str, tbbVar, checkoutViewModel$createState$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = checkoutViewModel$createState$12.Z$0;
                    bobVar = (bob) checkoutViewModel$createState$12.L$0;
                    kotlin.b.b(obj);
                }
                mjb mjbVar = (mjb) obj;
                return !z ? new mmb(mjbVar) : bobVar != null ? bobVar.a != null ? new kmb(mjbVar, omm0Var.a(zyh0.PlusPay_Payment_Loader_ProcessingOrder_Title), omm0Var.a(zyh0.PlusPay_Payment_Loader_ProcessingOrder_Subtitle), bobVar.a, bobVar.b) : new nmb(mjbVar, omm0Var.a(zyh0.PlusPay_Payment_Loader_ProcessingOrder_Title), omm0Var.a(zyh0.PlusPay_Payment_Loader_ProcessingOrder_Subtitle)) : new lmb(mjbVar);
            }
        }
        checkoutViewModel$createState$1 = new CheckoutViewModel$createState$1(dVar, continuation);
        CheckoutViewModel$createState$1 checkoutViewModel$createState$122 = checkoutViewModel$createState$1;
        Object obj2 = checkoutViewModel$createState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutViewModel$createState$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        mjb mjbVar2 = (mjb) obj2;
        if (!z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
    
        if (r4 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e5, code lost:
    
        if (r4 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0201, code lost:
    
        if (r4 == r8) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X(d dVar, PlusTarifficatorPurchase plusTarifficatorPurchase, String str, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, ContinuationImpl continuationImpl) {
        CheckoutViewModel$getBoundPaymentMethodId$1 checkoutViewModel$getBoundPaymentMethodId$1;
        int i;
        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod;
        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup;
        List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods;
        int i2;
        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod2;
        String str2;
        fv5 fv5Var = dVar.x;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a aVar = dVar.z;
        if (continuationImpl instanceof CheckoutViewModel$getBoundPaymentMethodId$1) {
            checkoutViewModel$getBoundPaymentMethodId$1 = (CheckoutViewModel$getBoundPaymentMethodId$1) continuationImpl;
            int i3 = checkoutViewModel$getBoundPaymentMethodId$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                checkoutViewModel$getBoundPaymentMethodId$1.label = i3 - Integer.MIN_VALUE;
                Object obj = checkoutViewModel$getBoundPaymentMethodId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutViewModel$getBoundPaymentMethodId$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        PlusPaymentMethod plusPaymentMethod = (PlusPaymentMethod) obj;
                        if (plusPaymentMethod != null) {
                            return plusPaymentMethod.getId();
                        }
                        return null;
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        PlusPaymentMethod plusPaymentMethod2 = (PlusPaymentMethod) obj;
                        if (plusPaymentMethod2 != null) {
                            return plusPaymentMethod2.getId();
                        }
                        return null;
                    }
                    if (i == 4) {
                        paymentMethod2 = (PlusPayCompositeOfferDetails.PaymentMethod) checkoutViewModel$getBoundPaymentMethodId$1.L$3;
                        kotlin.b.b(obj);
                        str2 = (String) obj;
                        if (str2 == null) {
                            return str2;
                        }
                        paymentMethod = paymentMethod2;
                        return paymentMethod.getId();
                    }
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    PlusPaymentMethod plusPaymentMethod3 = (PlusPaymentMethod) obj;
                    if (plusPaymentMethod3 != null) {
                        return plusPaymentMethod3.getId();
                    }
                    return null;
                }
                kotlin.b.b(obj);
                if (str != null) {
                    PlusPayCompositeOfferDetails.PaymentMethod a = plusPayCompositeOfferDetails != null ? rld.a(plusPayCompositeOfferDetails, str) : null;
                    if (a != null) {
                        paymentMethod = a;
                        PlusPayCompositeOfferDetails.PaymentMethod.Type type = paymentMethod == null ? paymentMethod.getType() : null;
                        i2 = type != null ? -1 : cob.a[type.ordinal()];
                        if (i2 != -1) {
                            checkoutViewModel$getBoundPaymentMethodId$1.L$0 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$1 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$2 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$3 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.label = 5;
                            obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a) fv5Var).b(plusTarifficatorPurchase, checkoutViewModel$getBoundPaymentMethodId$1);
                        } else if (i2 == 1) {
                            checkoutViewModel$getBoundPaymentMethodId$1.L$0 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$1 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$2 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$3 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.label = 1;
                            obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a) fv5Var).b(plusTarifficatorPurchase, checkoutViewModel$getBoundPaymentMethodId$1);
                        } else if (i2 == 2) {
                            checkoutViewModel$getBoundPaymentMethodId$1.L$0 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$1 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$2 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$3 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.label = 2;
                            Object a2 = aVar.a(null, checkoutViewModel$getBoundPaymentMethodId$1);
                            if (a2 != coroutineSingletons) {
                                return a2;
                            }
                        } else {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        return paymentMethod.getId();
                                    }
                                    w511.b();
                                    return null;
                                }
                                PlusThemedUrl widgetUrls = paymentMethod.getWidgetUrls();
                                if (widgetUrls != null) {
                                    if (!widgetUrls.isNotEmpty()) {
                                        widgetUrls = null;
                                    }
                                    if (widgetUrls != null) {
                                        checkoutViewModel$getBoundPaymentMethodId$1.L$0 = null;
                                        checkoutViewModel$getBoundPaymentMethodId$1.L$1 = null;
                                        checkoutViewModel$getBoundPaymentMethodId$1.L$2 = null;
                                        checkoutViewModel$getBoundPaymentMethodId$1.L$3 = paymentMethod;
                                        checkoutViewModel$getBoundPaymentMethodId$1.L$4 = null;
                                        checkoutViewModel$getBoundPaymentMethodId$1.I$0 = 0;
                                        checkoutViewModel$getBoundPaymentMethodId$1.label = 4;
                                        obj = aVar.a(str, checkoutViewModel$getBoundPaymentMethodId$1);
                                        if (obj != coroutineSingletons) {
                                            paymentMethod2 = paymentMethod;
                                            str2 = (String) obj;
                                            if (str2 == null) {
                                            }
                                        }
                                    }
                                }
                                return paymentMethod.getId();
                            }
                            hv5 hv5Var = dVar.y;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$0 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$1 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$2 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.L$3 = null;
                            checkoutViewModel$getBoundPaymentMethodId$1.label = 3;
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a aVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a) hv5Var;
                            kaa0 kaa0Var = aVar2.b;
                            Context a3 = aVar2.a.a();
                            lj ljVar = (lj) aVar2.e.getValue();
                            Long id = ljVar.getId();
                            String authToken = ljVar.getAuthToken();
                            hj hjVar = ljVar instanceof hj ? (hj) ljVar : null;
                            ohd0 ohd0Var = new ohd0(id, authToken, hjVar != null ? hjVar.d : null);
                            String a4 = tpd.a(plusTarifficatorPurchase.getOffer());
                            PlusPayCompositeOfferDetails offerDetails = plusTarifficatorPurchase.getOfferDetails();
                            String posId = offerDetails != null ? offerDetails.getPosId() : null;
                            PlusPayCompositeOfferDetails offerDetails2 = plusTarifficatorPurchase.getOfferDetails();
                            obj = aVar2.a(new com.yandex.plus.paymentsdk.internal.method.sbp.a(kaa0Var.a, new me0(a3, (byte) 0), a3, ohd0Var, a4, posId, offerDetails2 != null ? offerDetails2.getServiceToken() : null, kaa0Var.c), checkoutViewModel$getBoundPaymentMethodId$1);
                        }
                        return coroutineSingletons;
                    }
                }
                paymentMethod = (plusPayCompositeOfferDetails == null || (paymentMethodsGroup = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) kotlin.collections.a.R(plusPayCompositeOfferDetails.getPaymentMethodsGroups())) == null || (paymentMethods = paymentMethodsGroup.getPaymentMethods()) == null) ? null : (PlusPayCompositeOfferDetails.PaymentMethod) kotlin.collections.a.R(paymentMethods);
                if (paymentMethod == null) {
                }
                if (type != null) {
                }
                if (i2 != -1) {
                }
                return coroutineSingletons;
            }
        }
        checkoutViewModel$getBoundPaymentMethodId$1 = new CheckoutViewModel$getBoundPaymentMethodId$1(dVar, continuationImpl);
        Object obj2 = checkoutViewModel$getBoundPaymentMethodId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutViewModel$getBoundPaymentMethodId$1.label;
        if (i == 0) {
        }
    }

    public static final void Y(d dVar, ind0 ind0Var) {
        dVar.getClass();
        tje.N(ds31.a(dVar), null, null, new CheckoutViewModel$startPayment$1(dVar, ind0Var, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        ind0 a = this.c.a.a();
        pfd0 pfd0Var = ((hnd0) this.G).b;
        PlusPayCompositeOffers.Offer offer = a.b.getOffer();
        gio gioVar = ((tqx0) pfd0Var).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Checkout.Stop", x);
        this.T.b();
    }

    public final void Z(ind0 ind0Var, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, PlusPayOfferDetailsConfiguration.AdditionalOffers additionalOffers) {
        pzt0 pzt0Var = this.Q;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.Q = tje.N(ds31.a(this), null, null, new CheckoutViewModel$refreshOfferDetails$1(this, ind0Var, additionalOffers, plusPayCompositeOfferDetails, null), 3);
    }

    public final void a0(ind0 ind0Var) {
        PlusPayAdditionalOffers additionalOffers;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) this.N.getValue();
        if (plusPayCompositeOfferDetails == null || (additionalOffers = plusPayCompositeOfferDetails.getAdditionalOffers()) == null) {
            return;
        }
        int i = 0;
        for (Object obj : additionalOffers.getOffers()) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            PlusPayAdditionalOffer plusPayAdditionalOffer = (PlusPayAdditionalOffer) obj;
            if (plusPayAdditionalOffer.isSelected()) {
                ((wqx0) ((hnd0) this.G).c).e(i, ind0Var.b.getOffer().getMeta().getSessionId(), plusPayAdditionalOffer.getOffer().getOffersBatchId(), plusPayAdditionalOffer.getOffer().getPositionId(), "onsale_offer", "checkout_onsale_page", null, kotlin.collections.b.f());
            }
            i = i2;
        }
    }

    public final void b0() {
        omb ombVar = (omb) this.U.a.getValue();
        if ((ombVar instanceof mmb) || (ombVar instanceof lmb) || (ombVar instanceof kmb)) {
            this.C.a();
        } else {
            if (ombVar instanceof nmb) {
                return;
            }
            w511.b();
        }
    }
}
