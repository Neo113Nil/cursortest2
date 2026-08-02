package com.ybsdk.feature.card.internal.interactors;

import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class k {
    public final com.ybsdk.feature.card.internal.repositories.b a;

    public k(com.ybsdk.feature.card.internal.repositories.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardRenameInteractor$getCardRenameScreen$1 cardRenameInteractor$getCardRenameScreen$1;
        int i;
        if (continuationImpl instanceof CardRenameInteractor$getCardRenameScreen$1) {
            cardRenameInteractor$getCardRenameScreen$1 = (CardRenameInteractor$getCardRenameScreen$1) continuationImpl;
            int i2 = cardRenameInteractor$getCardRenameScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRenameInteractor$getCardRenameScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRenameInteractor$getCardRenameScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRenameInteractor$getCardRenameScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardRenameInteractor$getCardRenameScreen$1.label = 1;
                    Object e = this.a.e(str, cardRenameInteractor$getCardRenameScreen$1);
                    return e == coroutineSingletons ? coroutineSingletons : e;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cardRenameInteractor$getCardRenameScreen$1 = new CardRenameInteractor$getCardRenameScreen$1(this, continuationImpl);
        Object obj2 = cardRenameInteractor$getCardRenameScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRenameInteractor$getCardRenameScreen$1.label;
        if (i != 0) {
        }
    }
}
