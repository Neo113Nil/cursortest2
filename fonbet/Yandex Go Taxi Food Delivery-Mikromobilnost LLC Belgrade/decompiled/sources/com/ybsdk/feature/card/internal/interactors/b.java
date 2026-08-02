package com.ybsdk.feature.card.internal.interactors;

import com.ybsdk.api.entities.YBProduct;
import defpackage.ba8;
import defpackage.bvf0;
import defpackage.d6v;
import defpackage.ffx;
import defpackage.mth;
import defpackage.ny61;
import defpackage.q98;
import defpackage.tpr;
import defpackage.ua8;
import defpackage.x4c;
import defpackage.xj1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.card.internal.repositories.b a;
    public final ua8 b;
    public final com.ybsdk.di.modules.features.b c;
    public final n0 d = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);

    public b(com.ybsdk.feature.card.internal.repositories.b bVar, ua8 ua8Var, com.ybsdk.di.modules.features.b bVar2) {
        this.a = bVar;
        this.b = ua8Var;
        this.c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, com.ybsdk.feature.card.internal.presentation.cardactivation.a aVar, String str4, String str5, ContinuationImpl continuationImpl) {
        CardActivationInteractor$activate$1 cardActivationInteractor$activate$1;
        int i;
        d6v d6vVar;
        String str6;
        String str7;
        Object obj;
        String str8;
        String str9;
        Throwable a;
        if (continuationImpl instanceof CardActivationInteractor$activate$1) {
            cardActivationInteractor$activate$1 = (CardActivationInteractor$activate$1) continuationImpl;
            int i2 = cardActivationInteractor$activate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardActivationInteractor$activate$1.label = i2 - Integer.MIN_VALUE;
                CardActivationInteractor$activate$1 cardActivationInteractor$activate$12 = cardActivationInteractor$activate$1;
                Object obj2 = cardActivationInteractor$activate$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardActivationInteractor$activate$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cardActivationInteractor$activate$12.L$0 = str;
                    cardActivationInteractor$activate$12.L$1 = str2;
                    d6vVar = aVar;
                    cardActivationInteractor$activate$12.L$2 = d6vVar;
                    str6 = str4;
                    cardActivationInteractor$activate$12.L$3 = str6;
                    str7 = str5;
                    cardActivationInteractor$activate$12.L$4 = str7;
                    cardActivationInteractor$activate$12.label = 1;
                    com.ybsdk.di.modules.features.b bVar = this.c;
                    bVar.getClass();
                    Object a2 = com.ybsdk.feature.card.api.a.a(bVar, str3, cardActivationInteractor$activate$12);
                    if (a2 != coroutineSingletons) {
                        obj = a2;
                        str8 = str2;
                        str9 = str;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str10 = (String) cardActivationInteractor$activate$12.L$4;
                String str11 = (String) cardActivationInteractor$activate$12.L$3;
                d6vVar = (d6v) cardActivationInteractor$activate$12.L$2;
                String str12 = (String) cardActivationInteractor$activate$12.L$1;
                String str13 = (String) cardActivationInteractor$activate$12.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                str7 = str10;
                str9 = str13;
                str6 = str11;
                str8 = str12;
                d6v d6vVar2 = d6vVar;
                a = Result.a(obj);
                if (a == null) {
                    return new Result.Failure(a);
                }
                xj1 xj1Var = (xj1) obj;
                String str14 = xj1Var.a;
                CardActivationInteractor$activate$2$1 cardActivationInteractor$activate$2$1 = new CardActivationInteractor$activate$2$1(this, str9, str8, xj1Var, str6, str7, null);
                cardActivationInteractor$activate$12.L$0 = null;
                cardActivationInteractor$activate$12.L$1 = null;
                cardActivationInteractor$activate$12.L$2 = null;
                cardActivationInteractor$activate$12.L$3 = null;
                cardActivationInteractor$activate$12.L$4 = null;
                cardActivationInteractor$activate$12.label = 2;
                Object O = d6vVar2.O(cardActivationInteractor$activate$2$1, str14, cardActivationInteractor$activate$12);
                return O == coroutineSingletons ? coroutineSingletons : O;
            }
        }
        cardActivationInteractor$activate$1 = new CardActivationInteractor$activate$1(this, continuationImpl);
        CardActivationInteractor$activate$1 cardActivationInteractor$activate$122 = cardActivationInteractor$activate$1;
        Object obj22 = cardActivationInteractor$activate$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardActivationInteractor$activate$122.label;
        if (i != 0) {
        }
        d6v d6vVar22 = d6vVar;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(String str, ContinuationImpl continuationImpl) {
        CardActivationInteractor$cardProductForSkinChoosing$1 cardActivationInteractor$cardProductForSkinChoosing$1;
        int i;
        Object a;
        Throwable a2;
        YBProduct yBProduct;
        if (continuationImpl instanceof CardActivationInteractor$cardProductForSkinChoosing$1) {
            cardActivationInteractor$cardProductForSkinChoosing$1 = (CardActivationInteractor$cardProductForSkinChoosing$1) continuationImpl;
            int i2 = cardActivationInteractor$cardProductForSkinChoosing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardActivationInteractor$cardProductForSkinChoosing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardActivationInteractor$cardProductForSkinChoosing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardActivationInteractor$cardProductForSkinChoosing$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardActivationInteractor$cardProductForSkinChoosing$1.label = 1;
                    com.ybsdk.di.modules.features.b bVar = this.c;
                    bVar.getClass();
                    a = com.ybsdk.feature.card.api.a.a(bVar, str, cardActivationInteractor$cardProductForSkinChoosing$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    x4c.g("Can't receive card product", a2, null, null, 12);
                }
                xj1 xj1Var = (xj1) (a instanceof Result.Failure ? null : a);
                return (xj1Var != null || (yBProduct = xj1Var.c) == null) ? YBProduct.PRO : yBProduct;
            }
        }
        cardActivationInteractor$cardProductForSkinChoosing$1 = new CardActivationInteractor$cardProductForSkinChoosing$1(this, continuationImpl);
        Object obj2 = cardActivationInteractor$cardProductForSkinChoosing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardActivationInteractor$cardProductForSkinChoosing$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        xj1 xj1Var2 = (xj1) (a instanceof Result.Failure ? null : a);
        if (xj1Var2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        CardActivationInteractor$getActivationInfo$1 cardActivationInteractor$getActivationInfo$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof CardActivationInteractor$getActivationInfo$1) {
            cardActivationInteractor$getActivationInfo$1 = (CardActivationInteractor$getActivationInfo$1) continuationImpl;
            int i2 = cardActivationInteractor$getActivationInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardActivationInteractor$getActivationInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardActivationInteractor$getActivationInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardActivationInteractor$getActivationInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardActivationInteractor$getActivationInfo$1.label = 1;
                    com.ybsdk.di.modules.features.b bVar = this.c;
                    bVar.getClass();
                    a = com.ybsdk.feature.card.api.a.a(bVar, str, cardActivationInteractor$getActivationInfo$1);
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
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 == null) {
                    return new Result.Failure(a2);
                }
                String str2 = ((xj1) a).a;
                cardActivationInteractor$getActivationInfo$1.label = 2;
                Object d = this.a.d(str2, cardActivationInteractor$getActivationInfo$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        cardActivationInteractor$getActivationInfo$1 = new CardActivationInteractor$getActivationInfo$1(this, continuationImpl);
        Object obj2 = cardActivationInteractor$getActivationInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardActivationInteractor$getActivationInfo$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (((com.ybsdk.common.repositiories.card.b) r6).c(r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        CardActivationInteractor$pollActivationStatus$1 cardActivationInteractor$pollActivationStatus$1;
        int i;
        Object obj;
        Object putIfAbsent;
        if (continuationImpl instanceof CardActivationInteractor$pollActivationStatus$1) {
            cardActivationInteractor$pollActivationStatus$1 = (CardActivationInteractor$pollActivationStatus$1) continuationImpl;
            int i2 = cardActivationInteractor$pollActivationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardActivationInteractor$pollActivationStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cardActivationInteractor$pollActivationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardActivationInteractor$pollActivationStatus$1.label;
                ua8 ua8Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cardActivationInteractor$pollActivationStatus$1.L$0 = str;
                    cardActivationInteractor$pollActivationStatus$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return (ba8) obj2;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) cardActivationInteractor$pollActivationStatus$1.L$0;
                    kotlin.b.b(obj2);
                }
                ConcurrentHashMap concurrentHashMap = ((com.ybsdk.common.repositiories.card.b) ua8Var).g;
                obj = concurrentHashMap.get(str);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = bvf0.c(null)))) != null) {
                    obj = putIfAbsent;
                }
                q98 q98Var = new q98(new mth((tpr) obj, 6), 0);
                cardActivationInteractor$pollActivationStatus$1.L$0 = null;
                cardActivationInteractor$pollActivationStatus$1.label = 2;
                obj2 = kotlinx.coroutines.flow.e.y(q98Var, cardActivationInteractor$pollActivationStatus$1);
            }
        }
        cardActivationInteractor$pollActivationStatus$1 = new CardActivationInteractor$pollActivationStatus$1(this, continuationImpl);
        Object obj22 = cardActivationInteractor$pollActivationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardActivationInteractor$pollActivationStatus$1.label;
        ua8 ua8Var2 = this.b;
        if (i != 0) {
        }
        ConcurrentHashMap concurrentHashMap2 = ((com.ybsdk.common.repositiories.card.b) ua8Var2).g;
        obj = concurrentHashMap2.get(str);
        if (obj == null) {
            obj = putIfAbsent;
        }
        q98 q98Var2 = new q98(new mth((tpr) obj, 6), 0);
        cardActivationInteractor$pollActivationStatus$1.L$0 = null;
        cardActivationInteractor$pollActivationStatus$1.label = 2;
        obj22 = kotlinx.coroutines.flow.e.y(q98Var2, cardActivationInteractor$pollActivationStatus$1);
    }
}
