package com.ybsdk.feature.card.internal.presentation.cardactivation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardActivationClaimingResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardActivationInputValidationResultValidationResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.di.modules.features.c;
import com.ybsdk.feature.card.api.CardScenarioEventsReceiver$ActivationResult;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.card.internal.interactors.b;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.al8;
import defpackage.cf8;
import defpackage.d6w;
import defpackage.df8;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.ffb1;
import defpackage.ga8;
import defpackage.gvu0;
import defpackage.h98;
import defpackage.i98;
import defpackage.ij7;
import defpackage.j3h;
import defpackage.l3h;
import defpackage.lf8;
import defpackage.mc8;
import defpackage.mf8;
import defpackage.ny61;
import defpackage.p98;
import defpackage.pk11;
import defpackage.pn8;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.qn8;
import defpackage.r98;
import defpackage.ra8;
import defpackage.rk11;
import defpackage.rt1;
import defpackage.s98;
import defpackage.sk11;
import defpackage.sza;
import defpackage.t98;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v98;
import defpackage.w511;
import defpackage.w98;
import defpackage.x4c;
import defpackage.x98;
import defpackage.xk8;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tfl0 B;
    public final CardActivationParams C;
    public final AppAnalyticsReporter D;
    public final cf8 E;
    public final mc8 F;
    public final qn8 G;
    public final xk8 H;
    public final al8 I;
    public final lf8 J;
    public final b K;

    public a(tfl0 tfl0Var, CardActivationParams cardActivationParams, AppAnalyticsReporter appAnalyticsReporter, cf8 cf8Var, mc8 mc8Var, qn8 qn8Var, xk8 xk8Var, al8 al8Var, lf8 lf8Var, b bVar) {
        super(new ij7(26), new ra8());
        this.B = tfl0Var;
        this.C = cardActivationParams;
        this.D = appAnalyticsReporter;
        this.E = cf8Var;
        this.F = mc8Var;
        this.G = qn8Var;
        this.H = xk8Var;
        this.I = al8Var;
        this.J = lf8Var;
        this.K = bVar;
        d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, String str, ContinuationImpl continuationImpl) {
        CardActivationViewModel$cardActivation$1 cardActivationViewModel$cardActivation$1;
        int i;
        Object a;
        Object obj;
        Throwable a2;
        r0 r0Var;
        Object value;
        pk11 pk11Var;
        AppAnalyticsReporter appAnalyticsReporter = aVar.D;
        CardActivationParams cardActivationParams = aVar.C;
        if (continuationImpl instanceof CardActivationViewModel$cardActivation$1) {
            cardActivationViewModel$cardActivation$1 = (CardActivationViewModel$cardActivation$1) continuationImpl;
            int i2 = cardActivationViewModel$cardActivation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardActivationViewModel$cardActivation$1.label = i2 - Integer.MIN_VALUE;
                CardActivationViewModel$cardActivation$1 cardActivationViewModel$cardActivation$12 = cardActivationViewModel$cardActivation$1;
                Object obj2 = cardActivationViewModel$cardActivation$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardActivationViewModel$cardActivation$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b bVar = aVar.K;
                    String b = ((s98) aVar.X()).b();
                    StringBuilder sb = new StringBuilder();
                    int length = b.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = b.charAt(i3);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    String str2 = ((s98) aVar.X()).a;
                    String agreementId = cardActivationParams.getAgreementId();
                    String str3 = ((s98) aVar.X()).o;
                    cardActivationViewModel$cardActivation$12.label = 1;
                    a = bVar.a(sb2, str2, agreementId, aVar, str, str3, cardActivationViewModel$cardActivation$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    a = ((Result) obj2).getValue();
                }
                if (a instanceof Result.Failure) {
                    sk11 sk11Var = (sk11) a;
                    if (sk11Var instanceof pk11) {
                        appAnalyticsReporter.k.c(CardCommonEvents$CardActivationClaimingResultResult.OK, null);
                        pz40 Y = aVar.Y();
                        while (true) {
                            r0 r0Var2 = (r0) Y;
                            Object value2 = r0Var2.getValue();
                            pk11Var = (pk11) sk11Var;
                            obj = a;
                            if (r0Var2.k(value2, s98.a((s98) value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, pk11Var.b, 16383))) {
                                break;
                            }
                            a = obj;
                        }
                        String str4 = pk11Var.a;
                        tfl0 tfl0Var = aVar.B;
                        qn8 qn8Var = aVar.G;
                        com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                        int i4 = dzh0.ybsdk_card_card_activation;
                        bVar2.getClass();
                        new Text.Resource(i4);
                        tfl0Var.h(((mf8) qn8Var).b(str4, CardSecondFactorHelper$Request.ACTIVATION));
                    } else {
                        obj = a;
                        if (sk11Var instanceof rk11) {
                            appAnalyticsReporter.k.c(CardCommonEvents$CardActivationClaimingResultResult.OK, null);
                            pz40 Y2 = aVar.Y();
                            do {
                                r0Var = (r0) Y2;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, s98.a((s98) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383)));
                            String str5 = ((i98) ((rk11) sk11Var).a).a;
                            if (str5 != null) {
                                String promoId = cardActivationParams.getPromoId();
                                if (promoId != null) {
                                    aVar.K.d.g(new h98(promoId, str5));
                                }
                                aVar.o0(str5);
                            }
                        } else {
                            if (!(sk11Var instanceof qk11)) {
                                w511.b();
                                return null;
                            }
                            aVar.f0(((qk11) sk11Var).a, null);
                        }
                    }
                } else {
                    obj = a;
                }
                a2 = Result.a(obj);
                if (a2 != null) {
                    aVar.f0(a2.getMessage(), a2);
                }
                return zy11.a;
            }
        }
        cardActivationViewModel$cardActivation$1 = new CardActivationViewModel$cardActivation$1(aVar, continuationImpl);
        CardActivationViewModel$cardActivation$1 cardActivationViewModel$cardActivation$122 = cardActivationViewModel$cardActivation$1;
        Object obj22 = cardActivationViewModel$cardActivation$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardActivationViewModel$cardActivation$122.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        a2 = Result.a(obj);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public final void c0(String str) {
        r0 r0Var;
        Object value;
        this.D.k.a.a("card.activation.claiming.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s98.a((s98) value, null, null, null, null, t98.a, null, null, null, null, null, null, null, null, null, null, 32751)));
        tje.N(ds31.a(this), null, null, new CardActivationViewModel$activateCard$2(this, str, null), 3);
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        this.D.k.a.a("card.activation.initial_loading.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s98.a((s98) value, null, null, null, null, v98.a, null, null, null, null, null, null, null, null, null, null, 32751)));
        tje.N(ds31.a(this), null, null, new CardActivationViewModel$loadActivationInfo$2(this, null), 3);
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        if (((s98) X()).c == CardActivationInputState.CVV) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, s98.a((s98) value, "", null, CardActivationInputState.CARD, null, null, null, null, null, null, null, null, null, null, null, null, 32762)));
        }
    }

    public final void f0(String str, Throwable th) {
        r0 r0Var;
        Object value;
        this.D.k.c(CardCommonEvents$CardActivationClaimingResultResult.ERROR, str);
        x4c.g("Card activation failed", th, str, null, 8);
        this.J.a(CardScenarioEventsReceiver$ActivationResult.FAIL);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s98.a((s98) value, "", null, CardActivationInputState.CARD, null, null, null, CardNumberValidationResult.SERVER_VALIDATION_ERROR, null, null, null, null, null, null, null, null, 16298)));
    }

    public final void g0() {
        this.B.e();
    }

    public final void h0() {
        CardCvvValidationResult cardCvvValidationResult;
        CardCommonEvents$CardActivationInputValidationResultValidationResult cardCommonEvents$CardActivationInputValidationResultValidationResult;
        CardNumberValidationResult cardNumberValidationResult;
        CardNumberValidationResult cardNumberValidationResult2;
        CardCommonEvents$CardActivationInputValidationResultValidationResult cardCommonEvents$CardActivationInputValidationResultValidationResult2;
        int i = ga8.a[((s98) X()).c.ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.D;
        r98 r98Var = r98.a;
        if (i == 1) {
            String str = ((s98) X()).a;
            p98 p98Var = ((s98) X()).d;
            d6w d6wVar = p98Var != null ? p98Var.d.c : null;
            p98 p98Var2 = ((s98) X()).d;
            boolean z = (p98Var2 != null ? p98Var2.d.a : null) == null;
            this.F.getClass();
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            CardCvvValidationResult cardCvvValidationResult2 = (z || !evu0.J(sb2)) ? (d6wVar == null || d6wVar.g(sb2.length())) ? CardCvvValidationResult.VALID : CardCvvValidationResult.WRONG_LENGTH : CardCvvValidationResult.EMPTY;
            CardCvvValidationResult cardCvvValidationResult3 = ((s98) X()).f;
            pz40 Y = Y();
            while (true) {
                r0 r0Var = (r0) Y;
                Object value = r0Var.getValue();
                cardCvvValidationResult = cardCvvValidationResult2;
                if (r0Var.k(value, s98.a((s98) value, null, null, null, null, null, cardCvvValidationResult2, null, null, null, null, null, null, null, null, null, 32735))) {
                    break;
                } else {
                    cardCvvValidationResult2 = cardCvvValidationResult;
                }
            }
            CardCvvValidationResult cardCvvValidationResult4 = CardCvvValidationResult.VALID;
            if (cardCvvValidationResult != cardCvvValidationResult4 && cardCvvValidationResult != cardCvvValidationResult3) {
                Z(r98Var);
            }
            if (cardCvvValidationResult == cardCvvValidationResult4) {
                c0(null);
            }
            rt1 rt1Var = appAnalyticsReporter.k;
            int i3 = ga8.b[cardCvvValidationResult.ordinal()];
            if (i3 == 1) {
                cardCommonEvents$CardActivationInputValidationResultValidationResult = CardCommonEvents$CardActivationInputValidationResultValidationResult.CVV_VALID;
            } else {
                if (i3 != 2 && i3 != 3) {
                    w511.b();
                    return;
                }
                cardCommonEvents$CardActivationInputValidationResultValidationResult = CardCommonEvents$CardActivationInputValidationResultValidationResult.CVV_WRONG_LENGTH;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("validation_result", cardCommonEvents$CardActivationInputValidationResultValidationResult.getOriginalValue());
            rt1Var.a.a("card.activation.input_validation_result", linkedHashMap);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        p98 p98Var3 = ((s98) X()).d;
        d6w d6wVar2 = p98Var3 != null ? p98Var3.e.d : null;
        String str2 = ((s98) X()).b;
        p98 p98Var4 = ((s98) X()).d;
        boolean z2 = (p98Var4 != null ? p98Var4.e.a : null) == null;
        String b = ((s98) X()).b();
        this.H.getClass();
        StringBuilder sb3 = new StringBuilder();
        int length2 = str2.length();
        for (int i4 = 0; i4 < length2; i4++) {
            char charAt2 = str2.charAt(i4);
            if (Character.isDigit(charAt2)) {
                sb3.append(charAt2);
            }
        }
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        int length3 = b.length();
        for (int i5 = 0; i5 < length3; i5++) {
            char charAt3 = b.charAt(i5);
            if (Character.isDigit(charAt3)) {
                sb5.append(charAt3);
            }
        }
        String sb6 = sb5.toString();
        if (!z2 && evu0.J(sb4)) {
            cardNumberValidationResult = CardNumberValidationResult.EMPTY;
        } else if (d6wVar2 == null || d6wVar2.g(sb6.length())) {
            int i6 = 0;
            while (true) {
                if (i6 >= sb6.length()) {
                    String obj = gvu0.z0(sb6).toString();
                    ArrayList arrayList = new ArrayList(obj.length());
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < obj.length()) {
                        int i9 = i8 + 1;
                        int d = sza.d(obj.charAt(i7));
                        if (i8 % 2 != 0 && (d = d * 2) >= 10) {
                            d -= 9;
                        }
                        arrayList.add(Integer.valueOf(d));
                        i7++;
                        i8 = i9;
                    }
                    if (kotlin.collections.a.z0(arrayList) % 10 == 0) {
                        cardNumberValidationResult = CardNumberValidationResult.VALID;
                    }
                } else if (!Character.isDigit(sb6.charAt(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            cardNumberValidationResult = CardNumberValidationResult.WRONG_VALUE;
        } else {
            cardNumberValidationResult = CardNumberValidationResult.WRONG_LENGTH;
        }
        CardNumberValidationResult cardNumberValidationResult3 = CardNumberValidationResult.VALID;
        CardActivationInputState cardActivationInputState = cardNumberValidationResult == cardNumberValidationResult3 ? CardActivationInputState.CVV : ((s98) X()).c;
        CardNumberValidationResult cardNumberValidationResult4 = ((s98) X()).g;
        pz40 Y2 = Y();
        while (true) {
            r0 r0Var2 = (r0) Y2;
            Object value2 = r0Var2.getValue();
            cardNumberValidationResult2 = cardNumberValidationResult;
            if (r0Var2.k(value2, s98.a((s98) value2, null, null, cardActivationInputState, null, null, CardCvvValidationResult.VALID, cardNumberValidationResult2, null, null, null, null, null, null, null, null, 32667))) {
                break;
            } else {
                cardNumberValidationResult = cardNumberValidationResult2;
            }
        }
        if (cardNumberValidationResult2 != cardNumberValidationResult3 && cardNumberValidationResult2 != cardNumberValidationResult4) {
            Z(r98Var);
        }
        rt1 rt1Var2 = appAnalyticsReporter.k;
        int i10 = ga8.c[cardNumberValidationResult2.ordinal()];
        if (i10 == 1) {
            cardCommonEvents$CardActivationInputValidationResultValidationResult2 = CardCommonEvents$CardActivationInputValidationResultValidationResult.CARD_VALID;
        } else if (i10 == 2) {
            cardCommonEvents$CardActivationInputValidationResultValidationResult2 = CardCommonEvents$CardActivationInputValidationResultValidationResult.CARD_WRONG_LENGTH;
        } else if (i10 == 3) {
            cardCommonEvents$CardActivationInputValidationResultValidationResult2 = CardCommonEvents$CardActivationInputValidationResultValidationResult.CARD_WRONG_VALUE;
        } else if (i10 == 4) {
            cardCommonEvents$CardActivationInputValidationResultValidationResult2 = CardCommonEvents$CardActivationInputValidationResultValidationResult.CARD_WRONG_LENGTH;
        } else {
            if (i10 != 5) {
                w511.b();
                return;
            }
            cardCommonEvents$CardActivationInputValidationResultValidationResult2 = CardCommonEvents$CardActivationInputValidationResultValidationResult.CARD_WRONG_VALUE;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put("validation_result", cardCommonEvents$CardActivationInputValidationResultValidationResult2.getOriginalValue());
        rt1Var2.a.a("card.activation.input_validation_result", linkedHashMap2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        String str;
        ffb1 ffb1Var = ((s98) X()).e;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        w98 w98Var = ffb1Var instanceof w98 ? (w98) ffb1Var : null;
        if (w98Var == null || (str = w98Var.b) == null) {
            ((l3h) ((j3h) ((c) this.I).a.get())).d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Support(str2, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0), DeeplinkNavigation.Add.INSTANCE));
        } else {
            o0(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0() {
        j3h j3hVar = (j3h) ((c) this.I).a.get();
        l3h l3hVar = (l3h) j3hVar;
        l3hVar.d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Support(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), DeeplinkNavigation.Add.INSTANCE));
    }

    public final void k0() {
        d0();
    }

    public final void l0(CardSecondFactorHelper$SecondFactorResult cardSecondFactorHelper$SecondFactorResult) {
        r0 r0Var;
        Object value;
        if (cardSecondFactorHelper$SecondFactorResult instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            c0(((CardSecondFactorHelper$SecondFactorResult.VerificationToken) cardSecondFactorHelper$SecondFactorResult).getVerificationToken());
            return;
        }
        if (cardSecondFactorHelper$SecondFactorResult != null && !cardSecondFactorHelper$SecondFactorResult.equals(CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE)) {
            w511.b();
        } else if (((s98) X()).e instanceof t98) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, s98.a((s98) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32751)));
        }
    }

    public final void m0() {
        ffb1 ffb1Var = ((s98) X()).e;
        x98 x98Var = ffb1Var instanceof x98 ? (x98) ffb1Var : null;
        if (x98Var == null) {
            x4c.g("Can't set pin without card id", null, null, null, 14);
            return;
        }
        String str = x98Var.a;
        this.D.k.a.a("card.activation.set_pin", null);
        ((df8) this.E).c.getClass();
        this.B.l(pn8.a(str));
    }

    public final void n0() {
        this.D.k.a.a("card.activation.skip_pin", null);
        this.B.e();
    }

    public final void o0(String str) {
        r0 r0Var;
        Object value;
        this.D.k.a.a("card.activation.claiming_status.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s98.a((s98) value, null, null, null, null, t98.a, null, null, null, null, null, null, null, null, null, null, 32751)));
        tje.N(ds31.a(this), null, null, new CardActivationViewModel$pollActivationStatus$2(this, str, null), 3);
    }
}
