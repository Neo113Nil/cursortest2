package com.ybsdk.feature.card.internal.interactors;

import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class h {
    public final com.ybsdk.feature.card.internal.repositories.b a;

    public h(com.ybsdk.feature.card.internal.repositories.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        CardPinInteractor$setYbCardPin$1 cardPinInteractor$setYbCardPin$1;
        int i;
        if (continuationImpl instanceof CardPinInteractor$setYbCardPin$1) {
            cardPinInteractor$setYbCardPin$1 = (CardPinInteractor$setYbCardPin$1) continuationImpl;
            int i2 = cardPinInteractor$setYbCardPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardPinInteractor$setYbCardPin$1.label = i2 - Integer.MIN_VALUE;
                CardPinInteractor$setYbCardPin$1 cardPinInteractor$setYbCardPin$12 = cardPinInteractor$setYbCardPin$1;
                Object obj = cardPinInteractor$setYbCardPin$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardPinInteractor$setYbCardPin$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardPinInteractor$setYbCardPin$12.label = 1;
                    Object k = this.a.k(str, str2, str3, str4, str5, cardPinInteractor$setYbCardPin$12);
                    return k == coroutineSingletons ? coroutineSingletons : k;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cardPinInteractor$setYbCardPin$1 = new CardPinInteractor$setYbCardPin$1(this, continuationImpl);
        CardPinInteractor$setYbCardPin$1 cardPinInteractor$setYbCardPin$122 = cardPinInteractor$setYbCardPin$1;
        Object obj2 = cardPinInteractor$setYbCardPin$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardPinInteractor$setYbCardPin$122.label;
        if (i != 0) {
        }
    }
}
