package com.ybsdk.feature.card.internal.interactors.requisites;

import defpackage.en8;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b implements en8 {
    public final com.ybsdk.feature.card.internal.repositories.b a;

    public b(com.ybsdk.feature.card.internal.repositories.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.en8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        CorpCardRequisitesInteractorImpl$getCardRequisites$1 corpCardRequisitesInteractorImpl$getCardRequisites$1;
        int i;
        if (continuationImpl instanceof CorpCardRequisitesInteractorImpl$getCardRequisites$1) {
            corpCardRequisitesInteractorImpl$getCardRequisites$1 = (CorpCardRequisitesInteractorImpl$getCardRequisites$1) continuationImpl;
            int i2 = corpCardRequisitesInteractorImpl$getCardRequisites$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                corpCardRequisitesInteractorImpl$getCardRequisites$1.label = i2 - Integer.MIN_VALUE;
                CorpCardRequisitesInteractorImpl$getCardRequisites$1 corpCardRequisitesInteractorImpl$getCardRequisites$12 = corpCardRequisitesInteractorImpl$getCardRequisites$1;
                Object obj = corpCardRequisitesInteractorImpl$getCardRequisites$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = corpCardRequisitesInteractorImpl$getCardRequisites$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    corpCardRequisitesInteractorImpl$getCardRequisites$12.label = 1;
                    Object g = this.a.g(str, str2, str3, str4, corpCardRequisitesInteractorImpl$getCardRequisites$12);
                    return g == coroutineSingletons ? coroutineSingletons : g;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        corpCardRequisitesInteractorImpl$getCardRequisites$1 = new CorpCardRequisitesInteractorImpl$getCardRequisites$1(this, continuationImpl);
        CorpCardRequisitesInteractorImpl$getCardRequisites$1 corpCardRequisitesInteractorImpl$getCardRequisites$122 = corpCardRequisitesInteractorImpl$getCardRequisites$1;
        Object obj2 = corpCardRequisitesInteractorImpl$getCardRequisites$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpCardRequisitesInteractorImpl$getCardRequisites$122.label;
        if (i != 0) {
        }
    }
}
