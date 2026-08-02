package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.bvf0;
import defpackage.cpd0;
import defpackage.dio;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.hue0;
import defpackage.hzk;
import defpackage.ind0;
import defpackage.jnd0;
import defpackage.lbb0;
import defpackage.mue0;
import defpackage.ny61;
import defpackage.s570;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u570;
import defpackage.vod0;
import defpackage.wbt;
import defpackage.wod0;
import defpackage.xvz;
import defpackage.yr31;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a extends yr31 {
    public boolean A;
    public PlusPayPresale B;
    public final r0 C;
    public final r0 D;
    public final jnd0 b;
    public final wbt c;
    public final s570 w;
    public final vod0 x;
    public final cpd0 y;
    public final hzk z;

    public a(jnd0 jnd0Var, wbt wbtVar, s570 s570Var, vod0 vod0Var, cpd0 cpd0Var, hzk hzkVar) {
        this.b = jnd0Var;
        this.c = wbtVar;
        this.w = s570Var;
        this.x = vod0Var;
        this.y = cpd0Var;
        this.z = hzkVar;
        r0 c = bvf0.c(mue0.a);
        this.C = c;
        this.D = c;
        tje.N(ds31.a(this), null, null, new PresaleViewModel$fetchAndShowPresale$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(a aVar, PlusPayPresale.Assets assets, ContinuationImpl continuationImpl) {
        PresaleViewModel$createSuggestionContent$1 presaleViewModel$createSuggestionContent$1;
        PlusPayPresale.Assets assets2;
        CharSequence charSequence;
        Object Y;
        PlusPayPresale.Assets assets3;
        Object Y2;
        CharSequence charSequence2;
        PlusPayPresale.Assets assets4;
        CharSequence charSequence3;
        Object Y3;
        PlusPayPresale.Assets assets5;
        CharSequence charSequence4;
        Object Y4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        PlusPayRichText suggestedOfferButtonAdditionalText;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        CharSequence charSequence15;
        CharSequence charSequence16;
        aVar.getClass();
        if (continuationImpl instanceof PresaleViewModel$createSuggestionContent$1) {
            presaleViewModel$createSuggestionContent$1 = (PresaleViewModel$createSuggestionContent$1) continuationImpl;
            int i = presaleViewModel$createSuggestionContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presaleViewModel$createSuggestionContent$1.label = i - Integer.MIN_VALUE;
                Object obj = presaleViewModel$createSuggestionContent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (presaleViewModel$createSuggestionContent$1.label) {
                    case 0:
                        b.b(obj);
                        PlusPayRichText benefitText = assets.getBenefitText();
                        if (benefitText == null) {
                            assets2 = assets;
                            charSequence = null;
                            PlusPayRichText periodText = assets2.getPeriodText();
                            presaleViewModel$createSuggestionContent$1.L$0 = assets2;
                            presaleViewModel$createSuggestionContent$1.L$1 = charSequence;
                            presaleViewModel$createSuggestionContent$1.label = 2;
                            Y = aVar.Y(periodText, presaleViewModel$createSuggestionContent$1);
                            if (Y != obj2) {
                                assets3 = assets2;
                                obj = Y;
                                CharSequence charSequence17 = (CharSequence) obj;
                                PlusPayRichText priceText = assets3.getPriceText();
                                presaleViewModel$createSuggestionContent$1.L$0 = assets3;
                                presaleViewModel$createSuggestionContent$1.L$1 = charSequence;
                                presaleViewModel$createSuggestionContent$1.L$2 = charSequence17;
                                presaleViewModel$createSuggestionContent$1.label = 3;
                                Y2 = aVar.Y(priceText, presaleViewModel$createSuggestionContent$1);
                                if (Y2 != obj2) {
                                    PlusPayPresale.Assets assets6 = assets3;
                                    charSequence2 = charSequence;
                                    assets4 = assets6;
                                    charSequence3 = charSequence17;
                                    obj = Y2;
                                    CharSequence charSequence18 = (CharSequence) obj;
                                    PlusPayRichText priceDescriptionText = assets4.getPriceDescriptionText();
                                    presaleViewModel$createSuggestionContent$1.L$0 = assets4;
                                    presaleViewModel$createSuggestionContent$1.L$1 = charSequence2;
                                    presaleViewModel$createSuggestionContent$1.L$2 = charSequence3;
                                    presaleViewModel$createSuggestionContent$1.L$3 = charSequence18;
                                    presaleViewModel$createSuggestionContent$1.label = 4;
                                    Y3 = aVar.Y(priceDescriptionText, presaleViewModel$createSuggestionContent$1);
                                    if (Y3 != obj2) {
                                        assets5 = assets4;
                                        charSequence4 = charSequence18;
                                        obj = Y3;
                                        CharSequence charSequence19 = (CharSequence) obj;
                                        PlusPayRichText suggestedOfferButtonText = assets5.getSuggestedOfferButtonText();
                                        presaleViewModel$createSuggestionContent$1.L$0 = assets5;
                                        presaleViewModel$createSuggestionContent$1.L$1 = charSequence2;
                                        presaleViewModel$createSuggestionContent$1.L$2 = charSequence3;
                                        presaleViewModel$createSuggestionContent$1.L$3 = charSequence4;
                                        presaleViewModel$createSuggestionContent$1.L$4 = charSequence19;
                                        presaleViewModel$createSuggestionContent$1.label = 5;
                                        Y4 = aVar.Y(suggestedOfferButtonText, presaleViewModel$createSuggestionContent$1);
                                        if (Y4 != obj2) {
                                            CharSequence charSequence20 = charSequence3;
                                            charSequence5 = charSequence4;
                                            charSequence6 = charSequence19;
                                            obj = Y4;
                                            charSequence7 = charSequence2;
                                            charSequence8 = charSequence20;
                                            CharSequence charSequence21 = (CharSequence) obj;
                                            suggestedOfferButtonAdditionalText = assets5.getSuggestedOfferButtonAdditionalText();
                                            if (suggestedOfferButtonAdditionalText != null) {
                                                charSequence9 = charSequence21;
                                                charSequence10 = charSequence5;
                                                charSequence11 = null;
                                                charSequence12 = charSequence8;
                                                return new hue0(charSequence7, charSequence12, charSequence10, charSequence6, charSequence9, charSequence11);
                                            }
                                            presaleViewModel$createSuggestionContent$1.L$0 = null;
                                            presaleViewModel$createSuggestionContent$1.L$1 = charSequence7;
                                            presaleViewModel$createSuggestionContent$1.L$2 = charSequence8;
                                            presaleViewModel$createSuggestionContent$1.L$3 = charSequence5;
                                            presaleViewModel$createSuggestionContent$1.L$4 = charSequence6;
                                            presaleViewModel$createSuggestionContent$1.L$5 = charSequence21;
                                            presaleViewModel$createSuggestionContent$1.label = 6;
                                            Object Y5 = aVar.Y(suggestedOfferButtonAdditionalText, presaleViewModel$createSuggestionContent$1);
                                            if (Y5 != obj2) {
                                                obj = Y5;
                                                charSequence13 = charSequence21;
                                                charSequence14 = charSequence5;
                                                charSequence15 = charSequence8;
                                                charSequence16 = charSequence7;
                                                charSequence9 = charSequence13;
                                                charSequence11 = (CharSequence) obj;
                                                charSequence10 = charSequence14;
                                                charSequence12 = charSequence15;
                                                charSequence7 = charSequence16;
                                                return new hue0(charSequence7, charSequence12, charSequence10, charSequence6, charSequence9, charSequence11);
                                            }
                                        }
                                    }
                                }
                            }
                            return obj2;
                        }
                        presaleViewModel$createSuggestionContent$1.L$0 = assets;
                        presaleViewModel$createSuggestionContent$1.label = 1;
                        obj = aVar.Y(benefitText, presaleViewModel$createSuggestionContent$1);
                        break;
                    case 1:
                        assets = (PlusPayPresale.Assets) presaleViewModel$createSuggestionContent$1.L$0;
                        b.b(obj);
                        CharSequence charSequence22 = (CharSequence) obj;
                        assets2 = assets;
                        charSequence = charSequence22;
                        PlusPayRichText periodText2 = assets2.getPeriodText();
                        presaleViewModel$createSuggestionContent$1.L$0 = assets2;
                        presaleViewModel$createSuggestionContent$1.L$1 = charSequence;
                        presaleViewModel$createSuggestionContent$1.label = 2;
                        Y = aVar.Y(periodText2, presaleViewModel$createSuggestionContent$1);
                        if (Y != obj2) {
                        }
                        return obj2;
                    case 2:
                        charSequence = (CharSequence) presaleViewModel$createSuggestionContent$1.L$1;
                        PlusPayPresale.Assets assets7 = (PlusPayPresale.Assets) presaleViewModel$createSuggestionContent$1.L$0;
                        b.b(obj);
                        assets3 = assets7;
                        CharSequence charSequence172 = (CharSequence) obj;
                        PlusPayRichText priceText2 = assets3.getPriceText();
                        presaleViewModel$createSuggestionContent$1.L$0 = assets3;
                        presaleViewModel$createSuggestionContent$1.L$1 = charSequence;
                        presaleViewModel$createSuggestionContent$1.L$2 = charSequence172;
                        presaleViewModel$createSuggestionContent$1.label = 3;
                        Y2 = aVar.Y(priceText2, presaleViewModel$createSuggestionContent$1);
                        if (Y2 != obj2) {
                        }
                        return obj2;
                    case 3:
                        CharSequence charSequence23 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$2;
                        CharSequence charSequence24 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$1;
                        PlusPayPresale.Assets assets8 = (PlusPayPresale.Assets) presaleViewModel$createSuggestionContent$1.L$0;
                        b.b(obj);
                        charSequence3 = charSequence23;
                        assets4 = assets8;
                        charSequence2 = charSequence24;
                        CharSequence charSequence182 = (CharSequence) obj;
                        PlusPayRichText priceDescriptionText2 = assets4.getPriceDescriptionText();
                        presaleViewModel$createSuggestionContent$1.L$0 = assets4;
                        presaleViewModel$createSuggestionContent$1.L$1 = charSequence2;
                        presaleViewModel$createSuggestionContent$1.L$2 = charSequence3;
                        presaleViewModel$createSuggestionContent$1.L$3 = charSequence182;
                        presaleViewModel$createSuggestionContent$1.label = 4;
                        Y3 = aVar.Y(priceDescriptionText2, presaleViewModel$createSuggestionContent$1);
                        if (Y3 != obj2) {
                        }
                        return obj2;
                    case 4:
                        charSequence4 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$3;
                        charSequence3 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$2;
                        charSequence2 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$1;
                        PlusPayPresale.Assets assets9 = (PlusPayPresale.Assets) presaleViewModel$createSuggestionContent$1.L$0;
                        b.b(obj);
                        assets5 = assets9;
                        CharSequence charSequence192 = (CharSequence) obj;
                        PlusPayRichText suggestedOfferButtonText2 = assets5.getSuggestedOfferButtonText();
                        presaleViewModel$createSuggestionContent$1.L$0 = assets5;
                        presaleViewModel$createSuggestionContent$1.L$1 = charSequence2;
                        presaleViewModel$createSuggestionContent$1.L$2 = charSequence3;
                        presaleViewModel$createSuggestionContent$1.L$3 = charSequence4;
                        presaleViewModel$createSuggestionContent$1.L$4 = charSequence192;
                        presaleViewModel$createSuggestionContent$1.label = 5;
                        Y4 = aVar.Y(suggestedOfferButtonText2, presaleViewModel$createSuggestionContent$1);
                        if (Y4 != obj2) {
                        }
                        return obj2;
                    case 5:
                        charSequence6 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$4;
                        charSequence5 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$3;
                        charSequence8 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$2;
                        charSequence7 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$1;
                        assets5 = (PlusPayPresale.Assets) presaleViewModel$createSuggestionContent$1.L$0;
                        b.b(obj);
                        CharSequence charSequence212 = (CharSequence) obj;
                        suggestedOfferButtonAdditionalText = assets5.getSuggestedOfferButtonAdditionalText();
                        if (suggestedOfferButtonAdditionalText != null) {
                        }
                        break;
                    case 6:
                        charSequence13 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$5;
                        charSequence6 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$4;
                        charSequence14 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$3;
                        charSequence15 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$2;
                        charSequence16 = (CharSequence) presaleViewModel$createSuggestionContent$1.L$1;
                        b.b(obj);
                        charSequence9 = charSequence13;
                        charSequence11 = (CharSequence) obj;
                        charSequence10 = charSequence14;
                        charSequence12 = charSequence15;
                        charSequence7 = charSequence16;
                        return new hue0(charSequence7, charSequence12, charSequence10, charSequence6, charSequence9, charSequence11);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        presaleViewModel$createSuggestionContent$1 = new PresaleViewModel$createSuggestionContent$1(aVar, continuationImpl);
        Object obj3 = presaleViewModel$createSuggestionContent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (presaleViewModel$createSuggestionContent$1.label) {
        }
    }

    public final void X() {
        ((u570) this.w).a(this.b.a.a().b);
    }

    public final Object Y(PlusPayRichText plusPayRichText, ContinuationImpl continuationImpl) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) this.y).a(plusPayRichText, new lbb0(5, this), continuationImpl);
    }

    public final void Z() {
        PlusPayPresale plusPayPresale = this.B;
        if (plusPayPresale != null) {
            ind0 a = this.b.a.a();
            eu90 eu90Var = ((wod0) this.x).b;
            String d = dio.d(a.a);
            PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            if (id == null) {
                id = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            String productTarget = plusPayPresale.getSuggestedOffer().getMeta().getProductTarget();
            long loadingDelayMillis = plusPayPresale.getLoadingDelayMillis();
            PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayPresale.getSuggestedOffer().getTariffOffer();
            String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
            String str = id2 != null ? id2 : "no_value";
            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayPresale.getSuggestedOffer().getOptionOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
            Iterator<T> it2 = optionOffers2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            t.put("options_id", arrayList);
            t.put("target", productTarget);
            t.put("loading_duration_millis", String.valueOf(loadingDelayMillis));
            t.put("presale_product_id", str);
            t.put("presale_options_id", arrayList2);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("Presale.Screen.Closed", t);
            this.B = null;
        }
    }
}
