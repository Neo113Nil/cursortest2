package com.ybsdk.feature.card.internal.interactors;

import defpackage.d6v;
import defpackage.il8;
import defpackage.mzd0;
import defpackage.ny61;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class g {
    public final com.ybsdk.feature.card.internal.data.a a;
    public final com.ybsdk.utils.poller.b b;

    public g(com.ybsdk.feature.card.internal.data.a aVar, com.ybsdk.utils.poller.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardLimitInteractor$getPeriodLimitsInfo$1 cardLimitInteractor$getPeriodLimitsInfo$1;
        int i;
        if (continuationImpl instanceof CardLimitInteractor$getPeriodLimitsInfo$1) {
            cardLimitInteractor$getPeriodLimitsInfo$1 = (CardLimitInteractor$getPeriodLimitsInfo$1) continuationImpl;
            int i2 = cardLimitInteractor$getPeriodLimitsInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardLimitInteractor$getPeriodLimitsInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardLimitInteractor$getPeriodLimitsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardLimitInteractor$getPeriodLimitsInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardLimitInteractor$getPeriodLimitsInfo$1.label = 1;
                    Object a = this.a.a(str, cardLimitInteractor$getPeriodLimitsInfo$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cardLimitInteractor$getPeriodLimitsInfo$1 = new CardLimitInteractor$getPeriodLimitsInfo$1(this, continuationImpl);
        Object obj2 = cardLimitInteractor$getPeriodLimitsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardLimitInteractor$getPeriodLimitsInfo$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, il8 il8Var, BigDecimal bigDecimal, d6v d6vVar, String str2, ContinuationImpl continuationImpl) {
        CardLimitInteractor$saveCardLimit$1 cardLimitInteractor$saveCardLimit$1;
        int i;
        if (continuationImpl instanceof CardLimitInteractor$saveCardLimit$1) {
            cardLimitInteractor$saveCardLimit$1 = (CardLimitInteractor$saveCardLimit$1) continuationImpl;
            int i2 = cardLimitInteractor$saveCardLimit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardLimitInteractor$saveCardLimit$1.label = i2 - Integer.MIN_VALUE;
                CardLimitInteractor$saveCardLimit$1 cardLimitInteractor$saveCardLimit$12 = cardLimitInteractor$saveCardLimit$1;
                Object obj = cardLimitInteractor$saveCardLimit$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardLimitInteractor$saveCardLimit$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.ybsdk.utils.poller.c c = this.b.c(mzd0.b, new CardLimitInteractor$saveCardLimit$2(2, null), new CardLimitInteractor$saveCardLimit$3(d6vVar, str, str2, this, il8Var, bigDecimal, null));
                cardLimitInteractor$saveCardLimit$12.label = 1;
                Object e = c.e(cardLimitInteractor$saveCardLimit$12);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        cardLimitInteractor$saveCardLimit$1 = new CardLimitInteractor$saveCardLimit$1(this, continuationImpl);
        CardLimitInteractor$saveCardLimit$1 cardLimitInteractor$saveCardLimit$122 = cardLimitInteractor$saveCardLimit$1;
        Object obj2 = cardLimitInteractor$saveCardLimit$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardLimitInteractor$saveCardLimit$122.label;
        if (i == 0) {
        }
    }
}
