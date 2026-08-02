package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import android.text.SpannedString;
import com.yandex.plus.acquisition.sdk.api.internal.diagnostic.PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.b27;
import defpackage.b5d0;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.hnt0;
import defpackage.i27;
import defpackage.jse;
import defpackage.ny61;
import defpackage.pzc0;
import defpackage.qzc0;
import defpackage.rzc0;
import defpackage.tzc0;
import defpackage.uzc0;
import defpackage.vzc0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements rzc0 {
    public final b27 a;
    public final hnt0 b;
    public final b5d0 c;
    public final jse d;

    public a(b27 b27Var, hnt0 hnt0Var, b5d0 b5d0Var, jse jseVar) {
        this.a = b27Var;
        this.b = hnt0Var;
        this.c = b5d0Var;
        this.d = jseVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:18)(2:15|16)))|32|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        ButtonSectionStateFactory$loadCompositeOfferProductIcon$1 buttonSectionStateFactory$loadCompositeOfferProductIcon$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ButtonSectionStateFactory$loadCompositeOfferProductIcon$1) {
            buttonSectionStateFactory$loadCompositeOfferProductIcon$1 = (ButtonSectionStateFactory$loadCompositeOfferProductIcon$1) continuationImpl;
            int i2 = buttonSectionStateFactory$loadCompositeOfferProductIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                buttonSectionStateFactory$loadCompositeOfferProductIcon$1.label = i2 - Integer.MIN_VALUE;
                obj = buttonSectionStateFactory$loadCompositeOfferProductIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = buttonSectionStateFactory$loadCompositeOfferProductIcon$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.plus.glide.a b = ((com.yandex.plus.glide.b) aVar.c).b(str);
                    b.a.g(null);
                    buttonSectionStateFactory$loadCompositeOfferProductIcon$1.L$0 = null;
                    buttonSectionStateFactory$loadCompositeOfferProductIcon$1.L$1 = null;
                    buttonSectionStateFactory$loadCompositeOfferProductIcon$1.L$2 = null;
                    buttonSectionStateFactory$loadCompositeOfferProductIcon$1.L$3 = null;
                    buttonSectionStateFactory$loadCompositeOfferProductIcon$1.I$0 = 0;
                    buttonSectionStateFactory$loadCompositeOfferProductIcon$1.I$1 = 0;
                    buttonSectionStateFactory$loadCompositeOfferProductIcon$1.label = 1;
                    obj = b.c(buttonSectionStateFactory$loadCompositeOfferProductIcon$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                return null;
            }
        }
        buttonSectionStateFactory$loadCompositeOfferProductIcon$1 = new ButtonSectionStateFactory$loadCompositeOfferProductIcon$1(aVar, continuationImpl);
        obj = buttonSectionStateFactory$loadCompositeOfferProductIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = buttonSectionStateFactory$loadCompositeOfferProductIcon$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer) {
        boolean z;
        if (plusAcquisitionSmartOffer.getCompositeOffer().getTariff() != null && !plusAcquisitionSmartOffer.getCompositeOffer().getOptions().isEmpty() && !evu0.J(plusAcquisitionSmartOffer.getTexts().getSubscriptionName()) && !evu0.J(plusAcquisitionSmartOffer.getTexts().getCombinedFullOfferText()) && !evu0.J(plusAcquisitionSmartOffer.getTexts().getButtonText())) {
            com.yandex.plus.acquisition.sdk.pay.common.api.b compositeTariffTexts = plusAcquisitionSmartOffer.getTexts().getCompositeTariffTexts();
            if (!evu0.J(compositeTariffTexts.a) && !evu0.J(compositeTariffTexts.b) && !evu0.J(compositeTariffTexts.c)) {
                com.yandex.plus.acquisition.sdk.pay.common.api.b compositeOptionTexts = plusAcquisitionSmartOffer.getTexts().getCompositeOptionTexts();
                if (!evu0.J(compositeOptionTexts.a) && !evu0.J(compositeOptionTexts.b) && !evu0.J(compositeOptionTexts.c)) {
                    z = true;
                    if (!z) {
                        b27.a(this.a, plusAcquisitionSmartOffer.getPage(), plusAcquisitionSmartOffer.getPlace(), plusAcquisitionSmartOffer.getPriority(), plusAcquisitionSmartOffer.getTexts().getSubscriptionName(), null, null, plusAcquisitionSmartOffer.getTexts().getCombinedFullOfferText(), plusAcquisitionSmartOffer.getTexts().getButtonText(), plusAcquisitionSmartOffer.getTexts().getCompositeTariffTexts().a, plusAcquisitionSmartOffer.getTexts().getCompositeTariffTexts().b, plusAcquisitionSmartOffer.getTexts().getCompositeTariffTexts().c, plusAcquisitionSmartOffer.getTexts().getCompositeOptionTexts().a, plusAcquisitionSmartOffer.getTexts().getCompositeOptionTexts().b, plusAcquisitionSmartOffer.getTexts().getCompositeOptionTexts().c, PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.Composite, plusAcquisitionSmartOffer.getMeta().getConfigId(), 48);
                    }
                    return z;
                }
            }
        }
        z = false;
        if (!z) {
        }
        return z;
    }

    public final boolean c(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer) {
        boolean z = (((plusAcquisitionSmartOffer.getCompositeOffer().getTariff() == null || !plusAcquisitionSmartOffer.getCompositeOffer().getOptions().isEmpty()) && (plusAcquisitionSmartOffer.getCompositeOffer().getTariff() != null || plusAcquisitionSmartOffer.getCompositeOffer().getOptions().isEmpty())) || evu0.J(plusAcquisitionSmartOffer.getTexts().getSubscriptionName()) || evu0.J(plusAcquisitionSmartOffer.getTexts().getCombinedIntroductoryText()) || evu0.J(plusAcquisitionSmartOffer.getTexts().getCombinedPriceText()) || evu0.J(plusAcquisitionSmartOffer.getTexts().getButtonText())) ? false : true;
        if (!z) {
            b27.a(this.a, plusAcquisitionSmartOffer.getPage(), plusAcquisitionSmartOffer.getPlace(), plusAcquisitionSmartOffer.getPriority(), plusAcquisitionSmartOffer.getTexts().getSubscriptionName(), plusAcquisitionSmartOffer.getTexts().getCombinedIntroductoryText(), plusAcquisitionSmartOffer.getTexts().getCombinedPriceText(), null, plusAcquisitionSmartOffer.getTexts().getButtonText(), null, null, null, null, null, null, PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.OneTariff, plusAcquisitionSmartOffer.getMeta().getConfigId(), 16192);
        }
        return z;
    }

    public final boolean d(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer) {
        boolean z = (((plusAcquisitionSmartOffer.getCompositeOffer().getTariff() == null || !plusAcquisitionSmartOffer.getCompositeOffer().getOptions().isEmpty()) && (plusAcquisitionSmartOffer.getCompositeOffer().getTariff() != null || plusAcquisitionSmartOffer.getCompositeOffer().getOptions().isEmpty())) || evu0.J(plusAcquisitionSmartOffer.getTexts().getSubscriptionName()) || evu0.J(plusAcquisitionSmartOffer.getTexts().getCombinedIntroductoryText()) || evu0.J(plusAcquisitionSmartOffer.getTexts().getCombinedPriceText()) || evu0.J(plusAcquisitionSmartOffer.getTexts().getCombinedFullOfferText()) || evu0.J(plusAcquisitionSmartOffer.getTexts().getButtonText())) ? false : true;
        if (!z) {
            b27.a(this.a, plusAcquisitionSmartOffer.getPage(), plusAcquisitionSmartOffer.getPlace(), plusAcquisitionSmartOffer.getPriority(), plusAcquisitionSmartOffer.getTexts().getSubscriptionName(), plusAcquisitionSmartOffer.getTexts().getCombinedIntroductoryText(), plusAcquisitionSmartOffer.getTexts().getCombinedPriceText(), plusAcquisitionSmartOffer.getTexts().getCombinedFullOfferText(), plusAcquisitionSmartOffer.getTexts().getButtonText(), null, null, null, null, null, null, PlusAcquisitionButtonSectionDiagnostic$ButtonSectionType.TwoTariffs, plusAcquisitionSmartOffer.getMeta().getConfigId(), 16128);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, List list, ContinuationImpl continuationImpl) {
        ButtonSectionStateFactory$createButtonSectionState$1 buttonSectionStateFactory$createButtonSectionState$1;
        int i;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof ButtonSectionStateFactory$createButtonSectionState$1) {
            buttonSectionStateFactory$createButtonSectionState$1 = (ButtonSectionStateFactory$createButtonSectionState$1) continuationImpl;
            int i2 = buttonSectionStateFactory$createButtonSectionState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                buttonSectionStateFactory$createButtonSectionState$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = buttonSectionStateFactory$createButtonSectionState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = buttonSectionStateFactory$createButtonSectionState$1.label;
                if (i == 0) {
                    if (i == 1) {
                        plusAcquisitionPaymentAnalytics$Params = (PlusAcquisitionPaymentAnalytics$Params) buttonSectionStateFactory$createButtonSectionState$1.L$7;
                        b.b(obj3);
                        return new tzc0(plusAcquisitionPaymentAnalytics$Params, (pzc0) obj3);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusAcquisitionPaymentAnalytics$Params = (PlusAcquisitionPaymentAnalytics$Params) buttonSectionStateFactory$createButtonSectionState$1.L$7;
                    b.b(obj3);
                    return new tzc0(plusAcquisitionPaymentAnalytics$Params, (pzc0) obj3);
                }
                b.b(obj3);
                List x0 = kotlin.collections.a.x0(list, new i27());
                List list2 = x0;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((PlusAcquisitionSmartOffer) obj).getPriority() == 0) {
                        break;
                    }
                }
                PlusAcquisitionSmartOffer plusAcquisitionSmartOffer = (PlusAcquisitionSmartOffer) obj;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((PlusAcquisitionSmartOffer) obj2).getPriority() == 1) {
                        break;
                    }
                }
                PlusAcquisitionSmartOffer plusAcquisitionSmartOffer2 = (PlusAcquisitionSmartOffer) obj2;
                if (x0.isEmpty()) {
                    return new qzc0(str, str2, new NoSuchElementException("The list of smart offers is empty"));
                }
                if (plusAcquisitionSmartOffer != null && d(plusAcquisitionSmartOffer) && plusAcquisitionSmartOffer2 != null && d(plusAcquisitionSmartOffer2)) {
                    return new vzc0(plusAcquisitionPaymentAnalytics$Params, f(plusAcquisitionSmartOffer), f(plusAcquisitionSmartOffer2));
                }
                if (plusAcquisitionSmartOffer != null && b(plusAcquisitionSmartOffer)) {
                    buttonSectionStateFactory$createButtonSectionState$1.L$0 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$1 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$2 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$3 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$4 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$5 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$6 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$7 = plusAcquisitionPaymentAnalytics$Params;
                    buttonSectionStateFactory$createButtonSectionState$1.label = 1;
                    obj3 = bvf0.n(new ButtonSectionStateFactory$createButtonSectionOfferForComposite$2(this, plusAcquisitionSmartOffer, null), buttonSectionStateFactory$createButtonSectionState$1);
                } else {
                    if (plusAcquisitionSmartOffer2 == null || !b(plusAcquisitionSmartOffer2)) {
                        return (plusAcquisitionSmartOffer == null || !c(plusAcquisitionSmartOffer)) ? (plusAcquisitionSmartOffer2 == null || !c(plusAcquisitionSmartOffer2)) ? new qzc0(str, str2, new NoSuchElementException("No suitable offers were found in the list")) : new uzc0(plusAcquisitionPaymentAnalytics$Params, f(plusAcquisitionSmartOffer2)) : new uzc0(plusAcquisitionPaymentAnalytics$Params, f(plusAcquisitionSmartOffer));
                    }
                    buttonSectionStateFactory$createButtonSectionState$1.L$0 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$1 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$2 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$3 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$4 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$5 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$6 = null;
                    buttonSectionStateFactory$createButtonSectionState$1.L$7 = plusAcquisitionPaymentAnalytics$Params;
                    buttonSectionStateFactory$createButtonSectionState$1.label = 2;
                    obj3 = bvf0.n(new ButtonSectionStateFactory$createButtonSectionOfferForComposite$2(this, plusAcquisitionSmartOffer2, null), buttonSectionStateFactory$createButtonSectionState$1);
                }
                return coroutineSingletons;
            }
        }
        buttonSectionStateFactory$createButtonSectionState$1 = new ButtonSectionStateFactory$createButtonSectionState$1(this, continuationImpl);
        Object obj32 = buttonSectionStateFactory$createButtonSectionState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = buttonSectionStateFactory$createButtonSectionState$1.label;
        if (i == 0) {
        }
    }

    public final pzc0 f(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer) {
        SpannedString a = this.b.a(plusAcquisitionSmartOffer);
        return new pzc0(PlusAcquisitionSmartOffer.copy$default(plusAcquisitionSmartOffer, 0, null, null, null, null, a != null && plusAcquisitionSmartOffer.isOneClickEnabled(), null, null, null, null, null, 2015, null), a, null, null);
    }
}
