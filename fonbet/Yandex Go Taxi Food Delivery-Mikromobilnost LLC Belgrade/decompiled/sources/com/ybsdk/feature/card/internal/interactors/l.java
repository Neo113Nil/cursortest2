package com.ybsdk.feature.card.internal.interactors;

import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class l {
    public final com.ybsdk.feature.card.internal.repositories.b a;

    public l(com.ybsdk.feature.card.internal.repositories.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        SingleCardInteractor$getCardData$1 singleCardInteractor$getCardData$1;
        int i;
        if (continuationImpl instanceof SingleCardInteractor$getCardData$1) {
            singleCardInteractor$getCardData$1 = (SingleCardInteractor$getCardData$1) continuationImpl;
            int i2 = singleCardInteractor$getCardData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleCardInteractor$getCardData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleCardInteractor$getCardData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleCardInteractor$getCardData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    singleCardInteractor$getCardData$1.label = 1;
                    Object h = this.a.h(str, str2, singleCardInteractor$getCardData$1);
                    return h == coroutineSingletons ? coroutineSingletons : h;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        singleCardInteractor$getCardData$1 = new SingleCardInteractor$getCardData$1(this, continuationImpl);
        Object obj2 = singleCardInteractor$getCardData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleCardInteractor$getCardData$1.label;
        if (i != 0) {
        }
    }
}
