package com.ybsdk.feature.card.internal.interactors;

import defpackage.cd0;
import defpackage.ny61;
import defpackage.nzd0;
import defpackage.tpr;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class j {
    public final com.ybsdk.feature.card.internal.repositories.b a;
    public final com.ybsdk.utils.poller.b b;

    public j(com.ybsdk.feature.card.internal.repositories.b bVar, com.ybsdk.utils.poller.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardReissueInteractor$getCardReissueStatus$1 cardReissueInteractor$getCardReissueStatus$1;
        int i;
        if (continuationImpl instanceof CardReissueInteractor$getCardReissueStatus$1) {
            cardReissueInteractor$getCardReissueStatus$1 = (CardReissueInteractor$getCardReissueStatus$1) continuationImpl;
            int i2 = cardReissueInteractor$getCardReissueStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardReissueInteractor$getCardReissueStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardReissueInteractor$getCardReissueStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardReissueInteractor$getCardReissueStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.b.c(nzd0.b, new CardReissueInteractor$getCardReissueStatus$2(2, null), new CardReissueInteractor$getCardReissueStatus$3(this, str, null));
                    cardReissueInteractor$getCardReissueStatus$1.label = 1;
                    obj = c.d(null, cardReissueInteractor$getCardReissueStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new cd0(15, (tpr) obj, this);
            }
        }
        cardReissueInteractor$getCardReissueStatus$1 = new CardReissueInteractor$getCardReissueStatus$1(this, continuationImpl);
        Object obj2 = cardReissueInteractor$getCardReissueStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardReissueInteractor$getCardReissueStatus$1.label;
        if (i != 0) {
        }
        return new cd0(15, (tpr) obj2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        CardReissueInteractor$startCardReissue$1 cardReissueInteractor$startCardReissue$1;
        int i;
        if (continuationImpl instanceof CardReissueInteractor$startCardReissue$1) {
            cardReissueInteractor$startCardReissue$1 = (CardReissueInteractor$startCardReissue$1) continuationImpl;
            int i2 = cardReissueInteractor$startCardReissue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardReissueInteractor$startCardReissue$1.label = i2 - Integer.MIN_VALUE;
                CardReissueInteractor$startCardReissue$1 cardReissueInteractor$startCardReissue$12 = cardReissueInteractor$startCardReissue$1;
                Object obj = cardReissueInteractor$startCardReissue$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardReissueInteractor$startCardReissue$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardReissueInteractor$startCardReissue$12.label = 1;
                    Object b = this.a.b(str, str2, str3, str4, cardReissueInteractor$startCardReissue$12);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cardReissueInteractor$startCardReissue$1 = new CardReissueInteractor$startCardReissue$1(this, continuationImpl);
        CardReissueInteractor$startCardReissue$1 cardReissueInteractor$startCardReissue$122 = cardReissueInteractor$startCardReissue$1;
        Object obj2 = cardReissueInteractor$startCardReissue$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardReissueInteractor$startCardReissue$122.label;
        if (i != 0) {
        }
    }
}
