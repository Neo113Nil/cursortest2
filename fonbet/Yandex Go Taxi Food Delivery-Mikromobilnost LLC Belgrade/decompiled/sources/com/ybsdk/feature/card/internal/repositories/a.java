package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.card.internal.network.CardApi;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final CardApi a;

    public a(CardApi cardApi) {
        this.a = cardApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardInfoRepository$getCardsCarouselV2$1 cardInfoRepository$getCardsCarouselV2$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CardInfoRepository$getCardsCarouselV2$1) {
            cardInfoRepository$getCardsCarouselV2$1 = (CardInfoRepository$getCardsCarouselV2$1) continuationImpl;
            int i2 = cardInfoRepository$getCardsCarouselV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardInfoRepository$getCardsCarouselV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardInfoRepository$getCardsCarouselV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardInfoRepository$getCardsCarouselV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CardInfoRepository$getCardsCarouselV2$2 cardInfoRepository$getCardsCarouselV2$2 = new CardInfoRepository$getCardsCarouselV2$2(this, str, null);
                    cardInfoRepository$getCardsCarouselV2$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(cardInfoRepository$getCardsCarouselV2$2, cardInfoRepository$getCardsCarouselV2$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                CardInfoRepository$getCardsCarouselV2$3$1 cardInfoRepository$getCardsCarouselV2$3$1 = new CardInfoRepository$getCardsCarouselV2$3$1(this, null);
                cardInfoRepository$getCardsCarouselV2$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, cardInfoRepository$getCardsCarouselV2$3$1, cardInfoRepository$getCardsCarouselV2$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        cardInfoRepository$getCardsCarouselV2$1 = new CardInfoRepository$getCardsCarouselV2$1(this, continuationImpl);
        Object obj2 = cardInfoRepository$getCardsCarouselV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardInfoRepository$getCardsCarouselV2$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
