package com.yandex.plus.acquisition.sdk.pay.impl.providers;

import com.yandex.plus.acquisition.sdk.api.PlusAcquisitionExperiments;
import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionAssets;
import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionOffer;
import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionPrice;
import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionProduct;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.internal.feature.offers.i;
import defpackage.aed0;
import defpackage.fnb0;
import defpackage.lzs0;
import defpackage.ms90;
import defpackage.ns90;
import defpackage.ny61;
import defpackage.ozs0;
import defpackage.tcc;
import defpackage.th40;
import defpackage.v7d0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a {
    public final v7d0 a;
    public final ms90 b;
    public final ozs0 c;

    public a(v7d0 v7d0Var, ms90 ms90Var, ozs0 ozs0Var) {
        this.a = v7d0Var;
        this.b = ms90Var;
        this.c = ozs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, Set set, Map map, String str2, boolean z, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, ContinuationImpl continuationImpl) {
        SmartOffersProvider$getSmartOffers$1 smartOffersProvider$getSmartOffers$1;
        Object obj;
        int i;
        PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params2;
        aed0 aed0Var;
        PlusPayAnalyticsParams a;
        Result.Failure failure;
        ?? r1;
        PlusAcquisitionProduct plusAcquisitionProduct;
        PlusPaySmartOffer.Meta meta;
        String sessionId;
        try {
            if (continuationImpl instanceof SmartOffersProvider$getSmartOffers$1) {
                smartOffersProvider$getSmartOffers$1 = (SmartOffersProvider$getSmartOffers$1) continuationImpl;
                int i2 = smartOffersProvider$getSmartOffers$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    smartOffersProvider$getSmartOffers$1.label = i2 - Integer.MIN_VALUE;
                    SmartOffersProvider$getSmartOffers$1 smartOffersProvider$getSmartOffers$12 = smartOffersProvider$getSmartOffers$1;
                    obj = smartOffersProvider$getSmartOffers$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = smartOffersProvider$getSmartOffers$12.label;
                    if (i != 0) {
                        b.b(obj);
                        try {
                            aed0Var = (aed0) ((com.yandex.plus.pay.internal.b) this.a).e.getValue();
                            ms90 ms90Var = this.b;
                            PlusAcquisitionExperiments experiments = plusAcquisitionPaymentAnalytics$Params.getExperiments();
                            Map<String, String> customParams = plusAcquisitionPaymentAnalytics$Params.getCustomParams();
                            ns90 ns90Var = (ns90) ms90Var;
                            ns90Var.getClass();
                            com.yandex.plus.pay.api.analytics.a aVar = PlusPayAnalyticsParams.Companion;
                            th40 th40Var = new th40(str2, experiments, customParams, ns90Var);
                            aVar.getClass();
                            a = com.yandex.plus.pay.api.analytics.a.a(th40Var);
                            smartOffersProvider$getSmartOffers$12.L$0 = null;
                            smartOffersProvider$getSmartOffers$12.L$1 = null;
                            smartOffersProvider$getSmartOffers$12.L$2 = null;
                            smartOffersProvider$getSmartOffers$12.L$3 = null;
                            plusAcquisitionPaymentAnalytics$Params2 = plusAcquisitionPaymentAnalytics$Params;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            plusAcquisitionPaymentAnalytics$Params2 = plusAcquisitionPaymentAnalytics$Params;
                        } catch (Throwable th) {
                            th = th;
                            plusAcquisitionPaymentAnalytics$Params2 = plusAcquisitionPaymentAnalytics$Params;
                        }
                        try {
                            smartOffersProvider$getSmartOffers$12.L$4 = plusAcquisitionPaymentAnalytics$Params2;
                            smartOffersProvider$getSmartOffers$12.L$5 = null;
                            smartOffersProvider$getSmartOffers$12.L$6 = null;
                            smartOffersProvider$getSmartOffers$12.L$7 = null;
                            smartOffersProvider$getSmartOffers$12.Z$0 = z;
                            smartOffersProvider$getSmartOffers$12.I$0 = 0;
                            smartOffersProvider$getSmartOffers$12.I$1 = 0;
                            smartOffersProvider$getSmartOffers$12.label = 1;
                            obj = ((i) aed0Var).d(str, set, map, a, z, new fnb0(22), smartOffersProvider$getSmartOffers$12);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            if (Result.a(obj) != null) {
                            }
                            return (Serializable) r1;
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            if (Result.a(obj) != null) {
                            }
                            return (Serializable) r1;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params3 = (PlusAcquisitionPaymentAnalytics$Params) smartOffersProvider$getSmartOffers$12.L$4;
                        try {
                            b.b(obj);
                            plusAcquisitionPaymentAnalytics$Params2 = plusAcquisitionPaymentAnalytics$Params3;
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            plusAcquisitionPaymentAnalytics$Params2 = plusAcquisitionPaymentAnalytics$Params3;
                            failure = new Result.Failure(e);
                            obj = failure;
                            if (Result.a(obj) != null) {
                            }
                            return (Serializable) r1;
                        } catch (Throwable th3) {
                            th = th3;
                            plusAcquisitionPaymentAnalytics$Params2 = plusAcquisitionPaymentAnalytics$Params3;
                            failure = new Result.Failure(th);
                            obj = failure;
                            if (Result.a(obj) != null) {
                            }
                            return (Serializable) r1;
                        }
                    }
                    if (Result.a(obj) != null) {
                        List list = (List) obj;
                        lzs0 lzs0Var = (lzs0) this.c.a;
                        lzs0Var.getClass();
                        PlusPaySmartOffer plusPaySmartOffer = (PlusPaySmartOffer) kotlin.collections.a.R(list);
                        if (plusPaySmartOffer != null && (meta = plusPaySmartOffer.getMeta()) != null && (sessionId = meta.getSessionId()) != null) {
                            lzs0Var.a.put(sessionId, list);
                        }
                        List list2 = list;
                        int i3 = 10;
                        r1 = new ArrayList(tcc.n(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            PlusPaySmartOffer plusPaySmartOffer2 = (PlusPaySmartOffer) it.next();
                            int priority = plusPaySmartOffer2.getPriority();
                            String page = plusPaySmartOffer2.getPage();
                            String place = plusPaySmartOffer2.getPlace();
                            PlusAcquisitionSmartOffer.TargetAndFeatures targetAndFeatures = new PlusAcquisitionSmartOffer.TargetAndFeatures(plusPaySmartOffer2.getTargetAndFeatures().getTarget(), plusPaySmartOffer2.getTargetAndFeatures().getFeatures());
                            String offerToken = plusPaySmartOffer2.getOfferToken();
                            boolean isOneClickEnabled = plusPaySmartOffer2.isOneClickEnabled();
                            PlusPaySmartOffer.Texts texts = plusPaySmartOffer2.getTexts();
                            PlusAcquisitionSmartOffer.Texts texts2 = new PlusAcquisitionSmartOffer.Texts(texts.getSubscriptionName(), texts.getButtonText(), texts.getButtonTextWithDetails(), texts.getCombinedIntroductoryText(), texts.getCombinedPriceText(), texts.getCombinedFullOfferText(), texts.getPriceInMonth(), texts.getCommonPrice(), texts.getCurrencySymbol(), texts.getDiscountPercent(), texts.getFullPriceText(), texts.getCustomTexts());
                            PlusPaySmartOffer.Legals legals = plusPaySmartOffer2.getLegals();
                            String oneClickDisclaimer = legals.getOneClickDisclaimer();
                            String format = legals.getFormat();
                            List<PlusPaySmartOffer.Legals.Argument> arguments = legals.getArguments();
                            ArrayList arrayList = new ArrayList(tcc.n(arguments, i3));
                            for (PlusPaySmartOffer.Legals.Argument argument : arguments) {
                                arrayList.add(new PlusAcquisitionSmartOffer.Legals.Argument(argument.getKey(), argument.getValue(), argument.getUri()));
                                it = it;
                            }
                            Iterator it2 = it;
                            PlusAcquisitionSmartOffer.Legals legals2 = new PlusAcquisitionSmartOffer.Legals(oneClickDisclaimer, format, arrayList);
                            String language = plusPaySmartOffer2.getLanguage();
                            PlusPaySmartOffer.Meta meta2 = plusPaySmartOffer2.getMeta();
                            PlusAcquisitionSmartOffer.Meta meta3 = new PlusAcquisitionSmartOffer.Meta(meta2.getSessionId(), meta2.getBatchId(), meta2.getPositionId(), meta2.getMlRequestId(), meta2.getConfigId(), meta2.getPlaceId());
                            PlusPayCompositeOffers.Offer compositeOffer = plusPaySmartOffer2.getCompositeOffer();
                            String positionId = compositeOffer.getPositionId();
                            String activeTariffId = compositeOffer.getActiveTariffId();
                            PlusPayCompositeOffers.Offer.Tariff tariffOffer = compositeOffer.getTariffOffer();
                            if (tariffOffer != null) {
                                String id = tariffOffer.getId();
                                String name = tariffOffer.getName();
                                String title = tariffOffer.getTitle();
                                String description = tariffOffer.getDescription();
                                String text = tariffOffer.getText();
                                String additionalText = tariffOffer.getAdditionalText();
                                String commonPeriod = tariffOffer.getCommonPeriod();
                                PlusPayPrice commonPrice = tariffOffer.getCommonPrice();
                                plusAcquisitionProduct = new PlusAcquisitionProduct(id, name, title, description, text, additionalText, commonPeriod, new PlusAcquisitionPrice(commonPrice.getAmount(), commonPrice.getCurrency()), ozs0.a(tariffOffer.getVendor()), tariffOffer.getPayload());
                            } else {
                                plusAcquisitionProduct = null;
                            }
                            List<PlusPayCompositeOffers.Offer.Option> optionOffers = compositeOffer.getOptionOffers();
                            ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers, 10));
                            for (PlusPayCompositeOffers.Offer.Option option : optionOffers) {
                                String id2 = option.getId();
                                String name2 = option.getName();
                                String title2 = option.getTitle();
                                String description2 = option.getDescription();
                                String text2 = option.getText();
                                String additionalText2 = option.getAdditionalText();
                                String commonPeriod2 = option.getCommonPeriod();
                                PlusPayPrice commonPrice2 = option.getCommonPrice();
                                arrayList2.add(new PlusAcquisitionProduct(id2, name2, title2, description2, text2, additionalText2, commonPeriod2, new PlusAcquisitionPrice(commonPrice2.getAmount(), commonPrice2.getCurrency()), ozs0.a(option.getVendor()), option.getPayload()));
                            }
                            PlusPayCompositeOffers.Offer.Assets assets = compositeOffer.getAssets();
                            r1.add(new PlusAcquisitionSmartOffer(priority, page, place, targetAndFeatures, offerToken, isOneClickEnabled, texts2, legals2, language, meta3, new PlusAcquisitionOffer(positionId, activeTariffId, plusAcquisitionProduct, arrayList2, new PlusAcquisitionAssets(assets.getButtonText(), assets.getButtonTextWithDetails(), assets.getSubscriptionName()), new PlusAcquisitionOffer.Meta(compositeOffer.getMeta().getSessionId(), compositeOffer.getMeta().getOffersBatchId()), plusAcquisitionPaymentAnalytics$Params2.getCustomParams(), compositeOffer.getCanAttemptSilentPurchase())));
                            it = it2;
                            i3 = 10;
                        }
                    } else {
                        r1 = EmptyList.a;
                    }
                    return (Serializable) r1;
                }
            }
            if (i != 0) {
            }
            if (Result.a(obj) != null) {
            }
            return (Serializable) r1;
        } catch (CancellationException e4) {
            throw e4;
        }
        smartOffersProvider$getSmartOffers$1 = new SmartOffersProvider$getSmartOffers$1(this, continuationImpl);
        SmartOffersProvider$getSmartOffers$1 smartOffersProvider$getSmartOffers$122 = smartOffersProvider$getSmartOffers$1;
        obj = smartOffersProvider$getSmartOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartOffersProvider$getSmartOffers$122.label;
    }
}
