package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import com.ybsdk.feature.card.api.entities.YbCardPaymentSystemEntity;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.api.entities.YbCardType;
import com.ybsdk.feature.card.internal.network.dto.CardButtonResponse;
import com.ybsdk.feature.card.internal.network.dto.CardSkinResponse;
import com.ybsdk.feature.card.internal.network.dto.CarouselCardDetailsV2;
import com.ybsdk.feature.card.internal.network.dto.CarouselCardPromoV2;
import com.ybsdk.feature.card.internal.network.dto.CarouselReferenceDto;
import com.ybsdk.feature.card.internal.network.dto.GetCardCarouselResponseV2;
import com.ybsdk.feature.card.internal.network.dto.TokenResponse;
import com.ybsdk.feature.card.internal.network.dto.YbCardPromoButtonResponse;
import com.ybsdk.feature.card.internal.network.dto.YbCardPromoPointV2Response;
import com.ybsdk.feature.settings.api.data.SettingDto;
import defpackage.ag8;
import defpackage.bq51;
import defpackage.fq51;
import defpackage.gq51;
import defpackage.hq51;
import defpackage.j9r0;
import defpackage.jl40;
import defpackage.jp8;
import defpackage.jq51;
import defpackage.jqp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.pfb1;
import defpackage.qxy0;
import defpackage.tcc;
import defpackage.trp0;
import defpackage.vp51;
import defpackage.vq51;
import defpackage.w511;
import defpackage.wls;
import defpackage.wp51;
import defpackage.x4c;
import defpackage.xp51;
import defpackage.yp51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselResponseV2;", "cardCarouselResponse", "Lvq51;", "<anonymous>", "(Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselResponseV2;)Lvq51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardInfoRepository$getCardsCarouselV2$3$1", f = "CardInfoRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardInfoRepository$getCardsCarouselV2$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInfoRepository$getCardsCarouselV2$3$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardInfoRepository$getCardsCarouselV2$3$1 cardInfoRepository$getCardsCarouselV2$3$1 = new CardInfoRepository$getCardsCarouselV2$3$1(this.this$0, continuation);
        cardInfoRepository$getCardsCarouselV2$3$1.L$0 = obj;
        return cardInfoRepository$getCardsCarouselV2$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInfoRepository$getCardsCarouselV2$3$1) create((GetCardCarouselResponseV2) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x033b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0303 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object yp51Var;
        YbCardType ybCardType;
        CarouselCardPromoV2 carouselCardPromoV2;
        fq51 fq51Var;
        YbCardType ybCardType2;
        CardCarouselProductType cardCarouselProductType;
        GetCardCarouselResponseV2 getCardCarouselResponseV2;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        jq51 jq51Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        GetCardCarouselResponseV2 getCardCarouselResponseV22 = (GetCardCarouselResponseV2) this.L$0;
        this.this$0.getClass();
        boolean l = jl40.l(getCardCarouselResponseV22.getCardsPartial(), Boolean.TRUE);
        List<CarouselCardDetailsV2> cards = getCardCarouselResponseV22.getCards();
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(cards, 10));
        Iterator<T> it = cards.iterator();
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                GetCardCarouselResponseV2 getCardCarouselResponseV23 = getCardCarouselResponseV22;
                List<CarouselCardPromoV2> promos = getCardCarouselResponseV23.getPromos();
                ArrayList arrayList2 = new ArrayList(tcc.n(promos, 10));
                for (CarouselCardPromoV2 carouselCardPromoV22 : promos) {
                    String id = carouselCardPromoV22.getId();
                    String groupId = carouselCardPromoV22.getGroupId();
                    String agreementId = carouselCardPromoV22.getAgreementId();
                    int i3 = ag8.a[carouselCardPromoV22.getCardType().ordinal()];
                    if (i3 == 1) {
                        ybCardType = YbCardType.DIGITAL;
                    } else {
                        if (i3 != i2) {
                            w511.b();
                            return null;
                        }
                        ybCardType = YbCardType.PLASTIC;
                    }
                    YbCardType ybCardType3 = ybCardType;
                    String applicationId = carouselCardPromoV22.getApplicationId();
                    String title = carouselCardPromoV22.getTitle();
                    String subtitle = carouselCardPromoV22.getSubtitle();
                    String agreement = carouselCardPromoV22.getAgreement();
                    CardSkinResponse skin = carouselCardPromoV22.getSkin();
                    jq51 c = skin != null ? pfb1.c(skin) : null;
                    String caption = carouselCardPromoV22.getCaption();
                    List<YbCardPromoPointV2Response> points = carouselCardPromoV22.getPoints();
                    ArrayList arrayList3 = new ArrayList(tcc.n(points, 10));
                    for (YbCardPromoPointV2Response ybCardPromoPointV2Response : points) {
                        arrayList3.add(new hq51(ybCardPromoPointV2Response.getText(), qxy0.c(ybCardPromoPointV2Response.getIconUrl(), null)));
                        carouselCardPromoV22 = carouselCardPromoV22;
                    }
                    CarouselCardPromoV2 carouselCardPromoV23 = carouselCardPromoV22;
                    YbCardPromoButtonResponse acquireCardButton = carouselCardPromoV23.getAcquireCardButton();
                    if (!acquireCardButton.getVisible()) {
                        acquireCardButton = null;
                    }
                    if (acquireCardButton != null) {
                        fq51 fq51Var2 = new fq51(acquireCardButton.getTitle(), acquireCardButton.getSubtitle(), acquireCardButton.getAction());
                        carouselCardPromoV2 = carouselCardPromoV23;
                        fq51Var = fq51Var2;
                    } else {
                        carouselCardPromoV2 = carouselCardPromoV23;
                        fq51Var = null;
                    }
                    YbCardPromoButtonResponse claimCardButton = carouselCardPromoV2.getClaimCardButton();
                    if (!claimCardButton.getVisible()) {
                        claimCardButton = null;
                    }
                    arrayList2.add(new gq51(id, groupId, agreementId, ybCardType3, title, subtitle, arrayList3, caption, claimCardButton != null ? new fq51(claimCardButton.getTitle(), claimCardButton.getSubtitle(), claimCardButton.getAction()) : null, fq51Var, applicationId, agreement, c));
                    i2 = 2;
                }
                List<CarouselReferenceDto> carousel = getCardCarouselResponseV23.getCarousel();
                ArrayList arrayList4 = new ArrayList();
                for (CarouselReferenceDto carouselReferenceDto : carousel) {
                    if (carouselReferenceDto.getCardId() != null) {
                        yp51Var = new xp51(carouselReferenceDto.getCardId());
                    } else if (carouselReferenceDto.getPromoId() != null) {
                        yp51Var = new yp51(carouselReferenceDto.getPromoId());
                    } else {
                        x4c.g("get_cards_carousel v2 item doesn't contain any id", null, null, null, 14);
                        obj2 = null;
                        if (obj2 == null) {
                            arrayList4.add(obj2);
                        }
                    }
                    obj2 = yp51Var;
                    if (obj2 == null) {
                    }
                }
                return new vq51(l, arrayList, arrayList2, arrayList4);
            }
            CarouselCardDetailsV2 carouselCardDetailsV2 = (CarouselCardDetailsV2) it.next();
            String id2 = carouselCardDetailsV2.getId();
            int i4 = ag8.a[carouselCardDetailsV2.getCardType().ordinal()];
            if (i4 == 1) {
                ybCardType2 = YbCardType.DIGITAL;
            } else {
                if (i4 != 2) {
                    w511.b();
                    return jq51Var;
                }
                ybCardType2 = YbCardType.PLASTIC;
            }
            YbCardType ybCardType4 = ybCardType2;
            int i5 = ag8.b[carouselCardDetailsV2.getProductType().ordinal()];
            if (i5 == 1) {
                cardCarouselProductType = CardCarouselProductType.WALLET;
            } else if (i5 == 2) {
                cardCarouselProductType = CardCarouselProductType.PRO;
            } else if (i5 == 3) {
                cardCarouselProductType = CardCarouselProductType.CREDIT_LIMIT;
            } else if (i5 == 4) {
                cardCarouselProductType = CardCarouselProductType.CORP_CARD;
            } else {
                if (i5 != 5) {
                    w511.b();
                    return jq51Var;
                }
                cardCarouselProductType = CardCarouselProductType.UNKNOWN;
            }
            CardCarouselProductType cardCarouselProductType2 = cardCarouselProductType;
            String title2 = carouselCardDetailsV2.getTitle();
            String subtitle2 = carouselCardDetailsV2.getSubtitle();
            CardSkinResponse skin2 = carouselCardDetailsV2.getSkin();
            jq51 c2 = skin2 != null ? pfb1.c(skin2) : jq51Var;
            String lastPanDigits = carouselCardDetailsV2.getLastPanDigits();
            String expirationDate = carouselCardDetailsV2.getExpirationDate();
            YbCardStatusEntity status = carouselCardDetailsV2.getStatus();
            YbCardPaymentSystemEntity paymentSystem = carouselCardDetailsV2.getPaymentSystem();
            List<TokenResponse> tokens = carouselCardDetailsV2.getTokens();
            ArrayList arrayList5 = new ArrayList(tcc.n(tokens, i));
            for (TokenResponse tokenResponse : tokens) {
                try {
                    getCardCarouselResponseV2 = getCardCarouselResponseV22;
                    try {
                        failure = new jp8(tokenResponse.getToken(), tokenResponse.getTokenId(), tokenResponse.getType(), tokenResponse.getSuffix());
                    } catch (Exception e) {
                        e = e;
                        trp0 trp0Var = trp0.a;
                        trp0.e(new jqp0(e, "Exception during mapCatching() in CommonExt", null, null));
                        failure = new Result.Failure(e);
                        arrayList5.add(new Result(failure));
                        getCardCarouselResponseV22 = getCardCarouselResponseV2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    getCardCarouselResponseV2 = getCardCarouselResponseV22;
                }
                arrayList5.add(new Result(failure));
                getCardCarouselResponseV22 = getCardCarouselResponseV2;
            }
            GetCardCarouselResponseV2 getCardCarouselResponseV24 = getCardCarouselResponseV22;
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!(((Result) next).getValue() instanceof Result.Failure)) {
                    arrayList6.add(next);
                }
            }
            ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                Object value = ((Result) it3.next()).getValue();
                kotlin.b.b(value);
                arrayList7.add(value);
            }
            String blockReason = carouselCardDetailsV2.getBlockReason();
            String supportUrl = carouselCardDetailsV2.getSupportUrl();
            List<SettingDto> settings = carouselCardDetailsV2.getSettings();
            ArrayList arrayList8 = new ArrayList();
            Iterator<T> it4 = settings.iterator();
            while (it4.hasNext()) {
                o8r0 a = j9r0.a((SettingDto) it4.next(), null);
                if (a != null) {
                    arrayList8.add(a);
                }
            }
            CardButtonResponse deleteButton = carouselCardDetailsV2.getButtons().getDeleteButton();
            vp51 vp51Var = deleteButton == null ? null : new vp51(deleteButton.getTitle(), deleteButton.getAction());
            CardButtonResponse reissueButton = carouselCardDetailsV2.getButtons().getReissueButton();
            arrayList.add(new bq51(ybCardType4, title2, subtitle2, id2, status, arrayList7, carouselCardDetailsV2.getButtons().getDeleteButton() != null, supportUrl, blockReason, lastPanDigits, paymentSystem, expirationDate, c2, arrayList8, new wp51(vp51Var, reissueButton == null ? null : new vp51(reissueButton.getTitle(), reissueButton.getAction())), cardCarouselProductType2));
            getCardCarouselResponseV22 = getCardCarouselResponseV24;
            jq51Var = null;
            i = 10;
        }
    }
}
