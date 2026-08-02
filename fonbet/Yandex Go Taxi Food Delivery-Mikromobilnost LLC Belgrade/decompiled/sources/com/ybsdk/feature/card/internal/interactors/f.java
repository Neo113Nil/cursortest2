package com.ybsdk.feature.card.internal.interactors;

import defpackage.ny61;
import defpackage.ua8;
import defpackage.wls;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class f {
    public final ua8 a;
    public final com.ybsdk.feature.card.internal.repositories.b b;

    public f(ua8 ua8Var, com.ybsdk.feature.card.internal.repositories.b bVar) {
        this.a = ua8Var;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, com.ybsdk.feature.card.internal.presentation.cardissue.a aVar, String str2, ContinuationImpl continuationImpl) {
        CardIssueInteractor$cardSubmit$1 cardIssueInteractor$cardSubmit$1;
        int i;
        if (continuationImpl instanceof CardIssueInteractor$cardSubmit$1) {
            cardIssueInteractor$cardSubmit$1 = (CardIssueInteractor$cardSubmit$1) continuationImpl;
            int i2 = cardIssueInteractor$cardSubmit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardIssueInteractor$cardSubmit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardIssueInteractor$cardSubmit$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardIssueInteractor$cardSubmit$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls cardIssueInteractor$cardSubmit$2 = new CardIssueInteractor$cardSubmit$2(this, str, str2, null);
                cardIssueInteractor$cardSubmit$1.label = 1;
                Object O = aVar.O(cardIssueInteractor$cardSubmit$2, str2, cardIssueInteractor$cardSubmit$1);
                return O == obj2 ? obj2 : O;
            }
        }
        cardIssueInteractor$cardSubmit$1 = new CardIssueInteractor$cardSubmit$1(this, continuationImpl);
        Object obj3 = cardIssueInteractor$cardSubmit$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardIssueInteractor$cardSubmit$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.ybsdk.feature.card.internal.presentation.cardissue.a aVar, ContinuationImpl continuationImpl) {
        CardIssueInteractor$createApplication$1 cardIssueInteractor$createApplication$1;
        int i;
        if (continuationImpl instanceof CardIssueInteractor$createApplication$1) {
            cardIssueInteractor$createApplication$1 = (CardIssueInteractor$createApplication$1) continuationImpl;
            int i2 = cardIssueInteractor$createApplication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardIssueInteractor$createApplication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardIssueInteractor$createApplication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardIssueInteractor$createApplication$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardIssueInteractor$createApplication$2 cardIssueInteractor$createApplication$2 = new CardIssueInteractor$createApplication$2(this, null);
                cardIssueInteractor$createApplication$1.label = 1;
                Object a = com.ybsdk.core.utils.d.a(aVar, cardIssueInteractor$createApplication$2, cardIssueInteractor$createApplication$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        cardIssueInteractor$createApplication$1 = new CardIssueInteractor$createApplication$1(this, continuationImpl);
        Object obj2 = cardIssueInteractor$createApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardIssueInteractor$createApplication$1.label;
        if (i == 0) {
        }
    }
}
