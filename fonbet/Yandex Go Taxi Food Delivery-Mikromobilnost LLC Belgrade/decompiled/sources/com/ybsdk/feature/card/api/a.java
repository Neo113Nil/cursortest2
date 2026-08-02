package com.ybsdk.feature.card.api;

import com.ybsdk.di.modules.features.b;
import defpackage.ny61;
import defpackage.xj1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(b bVar, String str, ContinuationImpl continuationImpl) {
        CardAgreementProvider$getExistedOrDefault$1 cardAgreementProvider$getExistedOrDefault$1;
        int i;
        Object a;
        xj1 xj1Var;
        if (continuationImpl instanceof CardAgreementProvider$getExistedOrDefault$1) {
            cardAgreementProvider$getExistedOrDefault$1 = (CardAgreementProvider$getExistedOrDefault$1) continuationImpl;
            int i2 = cardAgreementProvider$getExistedOrDefault$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardAgreementProvider$getExistedOrDefault$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardAgreementProvider$getExistedOrDefault$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardAgreementProvider$getExistedOrDefault$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        cardAgreementProvider$getExistedOrDefault$1.label = 1;
                        Object b = bVar.b(cardAgreementProvider$getExistedOrDefault$1);
                        if (b != coroutineSingletons) {
                            return b;
                        }
                    } else {
                        cardAgreementProvider$getExistedOrDefault$1.L$0 = bVar;
                        cardAgreementProvider$getExistedOrDefault$1.label = 2;
                        a = bVar.a(str, cardAgreementProvider$getExistedOrDefault$1);
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        bVar = (b) cardAgreementProvider$getExistedOrDefault$1.L$0;
                        kotlin.b.b(obj);
                        a = ((Result) obj).getValue();
                    } else if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
                if (a instanceof Result.Failure) {
                    a = null;
                }
                xj1Var = (xj1) a;
                if (xj1Var == null) {
                    return xj1Var;
                }
                cardAgreementProvider$getExistedOrDefault$1.L$0 = null;
                cardAgreementProvider$getExistedOrDefault$1.label = 3;
                Object b2 = bVar.b(cardAgreementProvider$getExistedOrDefault$1);
                return b2 == coroutineSingletons ? coroutineSingletons : b2;
            }
        }
        cardAgreementProvider$getExistedOrDefault$1 = new CardAgreementProvider$getExistedOrDefault$1(continuationImpl);
        Object obj2 = cardAgreementProvider$getExistedOrDefault$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardAgreementProvider$getExistedOrDefault$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        xj1Var = (xj1) a;
        if (xj1Var == null) {
        }
    }
}
