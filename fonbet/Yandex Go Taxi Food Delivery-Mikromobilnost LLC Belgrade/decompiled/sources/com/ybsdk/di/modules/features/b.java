package com.ybsdk.di.modules.features;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.xj1;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final /* synthetic */ com.ybsdk.common.repositiories.agreements.a a;

    public b(com.ybsdk.common.repositiories.agreements.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardFeatureModule$cardAgreementIdProvider$1$get$1 cardFeatureModule$cardAgreementIdProvider$1$get$1;
        int i;
        Object a;
        if (continuationImpl instanceof CardFeatureModule$cardAgreementIdProvider$1$get$1) {
            cardFeatureModule$cardAgreementIdProvider$1$get$1 = (CardFeatureModule$cardAgreementIdProvider$1$get$1) continuationImpl;
            int i2 = cardFeatureModule$cardAgreementIdProvider$1$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardFeatureModule$cardAgreementIdProvider$1$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardFeatureModule$cardAgreementIdProvider$1$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardFeatureModule$cardAgreementIdProvider$1$get$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardFeatureModule$cardAgreementIdProvider$1$get$1.L$0 = str;
                    cardFeatureModule$cardAgreementIdProvider$1$get$1.label = 1;
                    a = this.a.a(true, cardFeatureModule$cardAgreementIdProvider$1$get$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) cardFeatureModule$cardAgreementIdProvider$1$get$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                Iterator it = ((List) a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((xj1) next).a, str)) {
                        obj2 = next;
                        break;
                    }
                }
                return (xj1) obj2;
            }
        }
        cardFeatureModule$cardAgreementIdProvider$1$get$1 = new CardFeatureModule$cardAgreementIdProvider$1$get$1(this, continuationImpl);
        Object obj3 = cardFeatureModule$cardAgreementIdProvider$1$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardFeatureModule$cardAgreementIdProvider$1$get$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        CardFeatureModule$cardAgreementIdProvider$1$getDefault$1 cardFeatureModule$cardAgreementIdProvider$1$getDefault$1;
        int i;
        if (continuationImpl instanceof CardFeatureModule$cardAgreementIdProvider$1$getDefault$1) {
            cardFeatureModule$cardAgreementIdProvider$1$getDefault$1 = (CardFeatureModule$cardAgreementIdProvider$1$getDefault$1) continuationImpl;
            int i2 = cardFeatureModule$cardAgreementIdProvider$1$getDefault$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardFeatureModule$cardAgreementIdProvider$1$getDefault$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardFeatureModule$cardAgreementIdProvider$1$getDefault$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardFeatureModule$cardAgreementIdProvider$1$getDefault$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardFeatureModule$cardAgreementIdProvider$1$getDefault$1.label = 1;
                    Object b = this.a.b(cardFeatureModule$cardAgreementIdProvider$1$getDefault$1);
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
        cardFeatureModule$cardAgreementIdProvider$1$getDefault$1 = new CardFeatureModule$cardAgreementIdProvider$1$getDefault$1(this, continuationImpl);
        Object obj2 = cardFeatureModule$cardAgreementIdProvider$1$getDefault$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardFeatureModule$cardAgreementIdProvider$1$getDefault$1.label;
        if (i != 0) {
        }
    }
}
