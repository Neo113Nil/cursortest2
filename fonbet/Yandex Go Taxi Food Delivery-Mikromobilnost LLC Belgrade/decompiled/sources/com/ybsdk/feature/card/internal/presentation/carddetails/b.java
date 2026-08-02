package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.samsung.android.sdk.samsungpay.v2.card.CardManager;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenDetailsCopyField;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.interactors.e;
import com.ybsdk.feature.card.internal.interactors.requisites.c;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationParams;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionScreenParams;
import com.ybsdk.feature.card.internal.presentation.carddetails.b;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import com.ybsdk.feature.card.internal.samsungpay.d;
import com.ybsdk.rconfig.configs.SamsungPayFeature;
import defpackage.ae8;
import defpackage.aj8;
import defpackage.al8;
import defpackage.be8;
import defpackage.bq51;
import defpackage.bq8;
import defpackage.bvf0;
import defpackage.cf8;
import defpackage.ds31;
import defpackage.dvw;
import defpackage.dzh0;
import defpackage.ee8;
import defpackage.en8;
import defpackage.fe8;
import defpackage.ff8;
import defpackage.fq51;
import defpackage.fzl0;
import defpackage.g9r0;
import defpackage.gao;
import defpackage.gq51;
import defpackage.gzl0;
import defpackage.if8;
import defpackage.j18;
import defpackage.jd8;
import defpackage.je8;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k5c;
import defpackage.l8x;
import defpackage.lf8;
import defpackage.mfb1;
import defpackage.n0t0;
import defpackage.nhq0;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.ov3;
import defpackage.owf;
import defpackage.pm5;
import defpackage.pn8;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qn8;
import defpackage.qoi0;
import defpackage.qq7;
import defpackage.re8;
import defpackage.rk6;
import defpackage.sk7;
import defpackage.sls;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.uza;
import defpackage.v4r0;
import defpackage.vm7;
import defpackage.vp51;
import defpackage.w511;
import defpackage.wls;
import defpackage.wm8;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y5e;
import defpackage.zd8;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final CardDetailsScreenArguments B;
    public final tfl0 C;
    public final com.ybsdk.feature.card.internal.interactors.b D;
    public final wm8 E;
    public final cf8 F;
    public final pn8 G;
    public final qn8 H;
    public final al8 I;
    public final jd8 J;
    public final AppAnalyticsReporter K;
    public final lf8 L;
    public final d M;
    public final ov3 N;
    public final vm7 O;
    public final ff8 P;
    public final vm7 Q;
    public final com.ybsdk.feature.card.internal.interactors.d R;
    public final en8 S;
    public pzt0 T;
    public final ArrayList U;
    public String V;
    public final e W;

    public b(CardDetailsScreenArguments cardDetailsScreenArguments, tfl0 tfl0Var, com.ybsdk.feature.card.internal.interactors.b bVar, wm8 wm8Var, cf8 cf8Var, pn8 pn8Var, qn8 qn8Var, al8 al8Var, jd8 jd8Var, AppAnalyticsReporter appAnalyticsReporter, lf8 lf8Var, d dVar, ov3 ov3Var, vm7 vm7Var, ff8 ff8Var, vm7 vm7Var2, com.ybsdk.feature.card.internal.interactors.d dVar2, aj8 aj8Var, be8 be8Var) {
        super(new rk6(21, cardDetailsScreenArguments), new re8());
        this.B = cardDetailsScreenArguments;
        this.C = tfl0Var;
        this.D = bVar;
        this.E = wm8Var;
        this.F = cf8Var;
        this.G = pn8Var;
        this.H = qn8Var;
        this.I = al8Var;
        this.J = jd8Var;
        this.K = appAnalyticsReporter;
        this.L = lf8Var;
        this.M = dVar;
        this.N = ov3Var;
        this.O = vm7Var;
        this.P = ff8Var;
        this.Q = vm7Var2;
        this.R = dVar2;
        boolean a = com.ybsdk.feature.card.internal.interactors.requisites.a.a(null);
        com.ybsdk.feature.card.internal.repositories.b bVar2 = aj8Var.a;
        this.S = a ? new com.ybsdk.feature.card.internal.interactors.requisites.b(bVar2) : new c(bVar2);
        this.U = new ArrayList();
        k5c a2 = ds31.a(this);
        pm5 pm5Var = new pm5(20, this);
        CardDetailsViewModel$cardSettingsInteractor$2 cardDetailsViewModel$cardSettingsInteractor$2 = new CardDetailsViewModel$cardSettingsInteractor$2(1, this, b.class, "sideEffect", "sideEffect(Lcom/ybsdk/core/mvp/SideEffect;)V", 0);
        sk7 sk7Var = be8Var.a;
        this.W = new e(pm5Var, a2, cardDetailsViewModel$cardSettingsInteractor$2, this, (com.ybsdk.feature.settings.internal.domain.card.a) ((owf) sk7Var.b).get(), (tfl0) ((owf) sk7Var.c).get(), (qn8) ((owf) sk7Var.w).get());
        if (cardDetailsScreenArguments.getDeeplinkOpenAfterInit() != null) {
            ((com.ybsdk.di.modules.features.c) al8Var).a(cardDetailsScreenArguments.getDeeplinkOpenAfterInit());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, String str, String str2, ContinuationImpl continuationImpl) {
        CardDetailsViewModel$addCardToSamsungPay$1 cardDetailsViewModel$addCardToSamsungPay$1;
        int i;
        int i2;
        r0 r0Var;
        Object value;
        bq8 bq8Var;
        SamsungPayState samsungPayState;
        Integer num;
        bVar.getClass();
        if (continuationImpl instanceof CardDetailsViewModel$addCardToSamsungPay$1) {
            cardDetailsViewModel$addCardToSamsungPay$1 = (CardDetailsViewModel$addCardToSamsungPay$1) continuationImpl;
            int i3 = cardDetailsViewModel$addCardToSamsungPay$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cardDetailsViewModel$addCardToSamsungPay$1.label = i3 - Integer.MIN_VALUE;
                Object obj = cardDetailsViewModel$addCardToSamsungPay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDetailsViewModel$addCardToSamsungPay$1.label;
                num = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = bVar.M;
                    cardDetailsViewModel$addCardToSamsungPay$1.L$0 = str;
                    cardDetailsViewModel$addCardToSamsungPay$1.label = 1;
                    dVar.getClass();
                    j18 j18Var = new j18(1, dvw.b(cardDetailsViewModel$addCardToSamsungPay$1));
                    j18Var.u();
                    AddCardInfo addCardInfo = new AddCardInfo(Card.CARD_TYPE_DEBIT, AddCardInfo.PROVIDER_MIR, wwg.g(new Pair(AddCardInfo.EXTRA_PROVISION_PAYLOAD, str2)));
                    CardManager cardManager = dVar.f;
                    if (cardManager == null) {
                        cardManager = null;
                    }
                    cardManager.m(addCardInfo, new com.ybsdk.feature.card.internal.samsungpay.b(dVar, str, j18Var));
                    obj = j18Var.s();
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) cardDetailsViewModel$addCardToSamsungPay$1.L$0;
                    kotlin.b.b(obj);
                }
                i2 = je8.a[((SamsungPayState.AddCardResult) obj).ordinal()];
                if (i2 != 1) {
                    jd8 jd8Var = bVar.J;
                    String c = ((bq8) bVar.X()).c();
                    bq51 b = ((bq8) bVar.X()).b();
                    String str3 = b != null ? b.j : null;
                    qq7 qq7Var = jd8Var.a.l;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                    if (c != null) {
                        linkedHashMap.put("card_id", c);
                    }
                    if (str3 != null) {
                        linkedHashMap.put("pan", str3);
                    }
                    qq7Var.a.a("card.main_screen.samsungpay.tokenization.result", linkedHashMap);
                    pz40 Y = bVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                        bq8Var = (bq8) value;
                        samsungPayState = bq8Var.j;
                    } while (!r0Var.k(value, bq8.a(bq8Var, null, null, false, null, null, null, null, SamsungPayState.a(samsungPayState, null, null, null, false, v4r0.i(samsungPayState.e, str), null, 95), null, 15359)));
                    num = new Integer(dzh0.ybsdk_deposit_card_bind_succeed);
                } else if (i2 == 2) {
                    num = new Integer(dzh0.ybsdk_card_mir_pay_internal_error);
                } else if (i2 != 3) {
                    w511.b();
                    return null;
                }
                if (num != null) {
                    bVar.Z(new fe8(new n0t0(new Text.Resource(num.intValue()))));
                }
                return zy11.a;
            }
        }
        cardDetailsViewModel$addCardToSamsungPay$1 = new CardDetailsViewModel$addCardToSamsungPay$1(bVar, continuationImpl);
        Object obj2 = cardDetailsViewModel$addCardToSamsungPay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDetailsViewModel$addCardToSamsungPay$1.label;
        num = null;
        if (i != 0) {
        }
        i2 = je8.a[((SamsungPayState.AddCardResult) obj2).ordinal()];
        if (i2 != 1) {
        }
        if (num != null) {
        }
        return zy11.a;
    }

    public static void x0(b bVar, String str, Integer num, wls wlsVar, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        pzt0 pzt0Var = bVar.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.T = tje.N(ds31.a(bVar), null, null, new CardDetailsViewModel$requestRequisitesIfRequired$2(bVar, str, wlsVar, null, null, num2, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        ArrayList arrayList = this.U;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        arrayList.clear();
    }

    public final void c0(String str) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = ((com.ybsdk.common.repositiories.card.b) this.D.b).g;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = bvf0.c(null)))) != null) {
            obj = putIfAbsent;
        }
        this.U.add(kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr((tpr) obj, new CardDetailsViewModel$observePromoActivationStatus$1(this, null), 3)));
    }

    public final void d0() {
        Integer num;
        r0 r0Var;
        Object value;
        List list;
        u8j0 u8j0Var = ((bq8) X()).a;
        if (u8j0Var == null || (list = (List) u8j0Var.a()) == null) {
            num = null;
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((ae8) it.next()) instanceof zd8) {
                    break;
                } else {
                    i++;
                }
            }
            num = Integer.valueOf(i);
        }
        if (num == null || num.intValue() < 0) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, bq8.a((bq8) value, null, null, false, null, new nhq0(num.intValue(), false), null, null, null, null, 16363)));
    }

    public final void e0() {
        String c = ((bq8) X()).c();
        bq51 b = ((bq8) X()).b();
        String str = b != null ? b.j : null;
        jd8 jd8Var = this.J;
        qq7 qq7Var = jd8Var.a.l;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (c != null) {
            linkedHashMap.put("card_id", c);
        }
        if (str != null) {
            linkedHashMap.put("pan", str);
        }
        qq7Var.a.a("card.main_screen.samsungpay.click", linkedHashMap);
        if (((SamsungPayFeature) ((if8) this.E).a.d(com.ybsdk.rconfig.configs.b.a).getData()).isEnabled() && !((bq8) X()).j.d) {
            SamsungPayState.InitializationResult initializationResult = ((bq8) X()).j.a;
            int i = initializationResult == null ? -1 : je8.b[initializationResult.ordinal()];
            if (i != -1) {
                final int i2 = 1;
                if (i == 1) {
                    String c2 = ((bq8) X()).c();
                    bq51 b2 = ((bq8) X()).b();
                    String str2 = b2 != null ? b2.j : null;
                    qq7 qq7Var2 = jd8Var.a.l;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
                    if (c2 != null) {
                        linkedHashMap2.put("card_id", c2);
                    }
                    if (str2 != null) {
                        linkedHashMap2.put("pan", str2);
                    }
                    qq7Var2.a.a("card.main_screen.samsungpay.tokenization.initiated", linkedHashMap2);
                    String c3 = ((bq8) X()).c();
                    if (c3 == null) {
                        Z(new fe8(gao.e(null, null, null, 7)));
                        d.b(this.M, "Empty cardId when trying to tokenize card", null, null, null, null, 30);
                        return;
                    }
                    gzl0 gzl0Var = ((bq8) X()).j.b;
                    if (gzl0Var instanceof fzl0) {
                        tje.N(ds31.a(this), null, null, new CardDetailsViewModel$requestSamsungPayloadAndAddCard$1(this, c3, gzl0Var, null), 3);
                        return;
                    } else {
                        Z(new fe8(gao.e(null, null, null, 7)));
                        d.b(this.M, "Empty walletInfo when trying to tokenize card", null, null, null, null, 30);
                        return;
                    }
                }
                if (i == 2) {
                    final int i3 = 0;
                    Z(new ee8(new sls(this) { // from class: ce8
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            b bVar = this.b;
                            switch (i4) {
                                case 0:
                                    bVar.J.a.l.a.a("card.main_screen.samsungpay.activation.show", null);
                                    com.samsung.android.sdk.samsungpay.v2.d dVar = bVar.M.e;
                                    (dVar != null ? dVar : null).B();
                                    break;
                                default:
                                    bVar.J.a.l.a.a("card.main_screen.samsungpay.update.show", null);
                                    com.samsung.android.sdk.samsungpay.v2.d dVar2 = bVar.M.e;
                                    (dVar2 != null ? dVar2 : null).E();
                                    break;
                            }
                            return zy11Var;
                        }
                    }));
                    return;
                } else if (i == 3) {
                    Z(new ee8(new sls(this) { // from class: ce8
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i2;
                            zy11 zy11Var = zy11.a;
                            b bVar = this.b;
                            switch (i4) {
                                case 0:
                                    bVar.J.a.l.a.a("card.main_screen.samsungpay.activation.show", null);
                                    com.samsung.android.sdk.samsungpay.v2.d dVar = bVar.M.e;
                                    (dVar != null ? dVar : null).B();
                                    break;
                                default:
                                    bVar.J.a.l.a.a("card.main_screen.samsungpay.update.show", null);
                                    com.samsung.android.sdk.samsungpay.v2.d dVar2 = bVar.M.e;
                                    (dVar2 != null ? dVar2 : null).E();
                                    break;
                            }
                            return zy11Var;
                        }
                    }));
                    return;
                } else if (i != 4) {
                    w511.b();
                    return;
                }
            }
            x4c.g("Invalid state for SamsungPay button: it is clicked but should be invisible", null, null, null, 14);
            Z(new fe8(gao.e(null, null, null, 7)));
        }
    }

    public final void f0() {
        String c = ((bq8) X()).c();
        if (c == null) {
            x4c.g("Can't copy number for card at position", null, String.valueOf(((bq8) X()).e), null, 10);
        } else {
            x0(this, c, Integer.valueOf(dzh0.ybsdk_card_card_payment_details_copying_failure), new CardDetailsViewModel$onCopyCardNumberClick$1(this, null), 12);
        }
    }

    public final void g0() {
        String c = ((bq8) X()).c();
        if (c == null) {
            x4c.g("Can't copy cvv for card at position", null, String.valueOf(((bq8) X()).e), null, 10);
        } else {
            x0(this, c, Integer.valueOf(dzh0.ybsdk_card_card_payment_details_copying_failure), new CardDetailsViewModel$onCopyCvvClick$1(this, null), 12);
        }
    }

    public final void h0() {
        this.J.b(CardMainScreenEvents$CardMainScreenDetailsCopyField.DATE);
        bq51 b = ((bq8) X()).b();
        String str = b != null ? b.l : null;
        if (str != null) {
            tje.N(ds31.a(this), null, null, new CardDetailsViewModel$onCopyExpireDateClick$1(this, str, null), 3);
        } else {
            x4c.g("Can't copy expiration date for card at position", null, String.valueOf(((bq8) X()).e), null, 10);
        }
    }

    public final void i0() {
        bq51 b = ((bq8) X()).b();
        if (b == null) {
            x4c.g("Can't delete card at position", null, String.valueOf(((bq8) X()).e), null, 10);
            return;
        }
        vp51 vp51Var = b.o.a;
        String str = vp51Var != null ? vp51Var.b : null;
        if (str == null || !((com.ybsdk.di.modules.features.c) this.I).a(str)) {
            CardDeletionScreenParams cardDeletionScreenParams = new CardDeletionScreenParams(b.d, b.j, false, null, kotlin.collections.b.f(), 8, null);
            this.G.getClass();
            this.C.h(new FragmentScreen("CardDeletionScreen", false, cardDeletionScreenParams, TransitionPolicyType.POPUP, qoi0.a(CardDeletionFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
        }
    }

    public final void j0(String str) {
        bq51 b = ((bq8) X()).b();
        if (b == null) {
            x4c.g("Can't freeze card at position", null, String.valueOf(((bq8) X()).e), null, 10);
        } else {
            tje.N(ds31.a(this), null, null, new CardDetailsViewModel$freezeCard$1(this, b, str, null), 3);
        }
    }

    public final void l0() {
        bq51 b = ((bq8) X()).b();
        if (b == null) {
            x4c.g("Can't react on pin click for card at position", null, String.valueOf(((bq8) X()).e), null, 10);
            return;
        }
        if (je8.c[b.e.ordinal()] == 1) {
            tje.N(ds31.a(this), null, null, new CardDetailsViewModel$onPinCodeClick$1(this, null), 3);
            return;
        }
        String str = b.d;
        this.G.getClass();
        this.C.h(pn8.a(str));
    }

    public final void m0() {
        fq51 fq51Var;
        gq51 e = ((bq8) X()).e();
        String str = (e == null || (fq51Var = e.j) == null) ? null : fq51Var.c;
        if (str == null || !((com.ybsdk.di.modules.features.c) this.I).a(str)) {
            this.L.a.j();
        }
    }

    public final void n0() {
        fq51 fq51Var;
        gq51 e = ((bq8) X()).e();
        String str = (e == null || (fq51Var = e.i) == null) ? null : fq51Var.c;
        if (str == null || !((com.ybsdk.di.modules.features.c) this.I).a(str)) {
            gq51 e2 = ((bq8) X()).e();
            String str2 = e2 != null ? e2.b : null;
            if (str2 != null) {
                CardDetailsScreenArguments cardDetailsScreenArguments = this.B;
                if (cardDetailsScreenArguments.getAgreementId() != null) {
                    String agreementId = cardDetailsScreenArguments.getAgreementId();
                    this.G.getClass();
                    this.C.h(new FragmentScreen("CardActivation", false, new CardActivationParams(str2, agreementId), null, qoi0.a(CardActivationFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null));
                    return;
                }
            }
            x4c.g("Can't open card activation screen without agreement id and promo id", null, null, null, 14);
        }
    }

    public final void o0(int i) {
        String a;
        r0 r0Var;
        Object value;
        bq8 bq8Var;
        ae8 d = ((bq8) X()).d();
        if (d == null || (a = mfb1.a(d)) == null) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            bq8Var = (bq8) value;
        } while (!r0Var.k(value, bq8.a(bq8Var, null, null, false, null, null, null, kotlin.collections.b.o(bq8Var.i, new Pair(a, Integer.valueOf(i))), null, null, 15871)));
    }

    public final void p0() {
        this.J.a.l.a.a("card.main_screen.reissue.click", null);
        bq51 b = ((bq8) X()).b();
        if (b == null) {
            x4c.g("Can't reissue card at position", null, String.valueOf(((bq8) X()).e), null, 10);
            return;
        }
        vp51 vp51Var = b.o.b;
        String str = vp51Var != null ? vp51Var.b : null;
        if (str == null || !((com.ybsdk.di.modules.features.c) this.I).a(str)) {
            x4c.g("Couldn't resolve card reissue action", null, str, null, 10);
        }
    }

    public final void q0() {
        r0 r0Var;
        Object value;
        bq8 bq8Var;
        v0(false);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            bq8Var = (bq8) value;
        } while (!r0Var.k(value, bq8.a(bq8Var, null, null, false, null, null, null, null, SamsungPayState.a(bq8Var.j, null, null, null, false, null, null, 111), null, 15359)));
        if (((SamsungPayFeature) ((if8) this.E).a.d(com.ybsdk.rconfig.configs.b.a).getData()).isEnabled()) {
            tje.N(ds31.a(this), null, null, new CardDetailsViewModel$initializeSamsungPay$1(this, null), 3);
        }
    }

    public final void r0(g9r0 g9r0Var) {
        List list;
        Object obj;
        bq51 b = ((bq8) X()).b();
        if (b == null || (list = b.n) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((o8r0) obj).a, g9r0Var.a)) {
                    break;
                }
            }
        }
        o8r0 o8r0Var = (o8r0) obj;
        if (o8r0Var == null) {
            return;
        }
        this.W.h(o8r0Var);
    }

    public final void s0() {
        r0 r0Var;
        Object value;
        if (((bq8) X()).c) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, bq8.a((bq8) value, null, null, false, null, null, null, null, null, null, 16379)));
            this.J.a(false);
            return;
        }
        String c = ((bq8) X()).c();
        if (c != null) {
            x0(this, c, null, new CardDetailsViewModel$onShowRequisitesClick$2(this, null), 14);
        } else {
            x4c.g("Can't show requisites for card at position", null, String.valueOf(((bq8) X()).e), null, 10);
        }
    }

    public final void t0() {
        String str;
        com.ybsdk.core.analytics.a aVar = this.K.k.a;
        byte[] bArr = y5e.I;
        byte[] bArr2 = new byte[28];
        for (int i = 0; i < 28; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        aVar.a(new String(bArr2, uza.a), null);
        bq51 b = ((bq8) X()).b();
        if (b == null || (str = b.h) == null) {
            return;
        }
        ((com.ybsdk.di.modules.features.c) this.I).b(str);
    }

    public final void u0() {
        r0 r0Var;
        Object value;
        tje.N(ds31.a(this), null, null, new CardDetailsViewModel$pushAutoTokenization$1(this, null), 3);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, bq8.a((bq8) value, null, null, false, null, null, null, null, null, null, 12287)));
    }

    public final pzt0 v0(boolean z) {
        return tje.N(ds31.a(this), null, null, new CardDetailsViewModel$reload$1(this, z, null), 3);
    }

    public final void y0(String str) {
        this.V = str;
    }
}
