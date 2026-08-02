package com.ybsdk.feature.card.internal.interactors;

import defpackage.d6v;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wk6;
import defpackage.wls;
import defpackage.xc8;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final com.ybsdk.feature.card.internal.repositories.b a;

    public c(com.ybsdk.feature.card.internal.repositories.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d6v d6vVar, String str, String str2, ContinuationImpl continuationImpl) {
        CardDeletionInteractor$deleteYbCard$1 cardDeletionInteractor$deleteYbCard$1;
        int i;
        if (continuationImpl instanceof CardDeletionInteractor$deleteYbCard$1) {
            cardDeletionInteractor$deleteYbCard$1 = (CardDeletionInteractor$deleteYbCard$1) continuationImpl;
            int i2 = cardDeletionInteractor$deleteYbCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardDeletionInteractor$deleteYbCard$1.label = i2 - Integer.MIN_VALUE;
                CardDeletionInteractor$deleteYbCard$1 cardDeletionInteractor$deleteYbCard$12 = cardDeletionInteractor$deleteYbCard$1;
                Object obj = cardDeletionInteractor$deleteYbCard$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDeletionInteractor$deleteYbCard$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                sls xc8Var = new xc8(str2, 0);
                tls wk6Var = new wk6(26);
                wls cardDeletionInteractor$deleteYbCard$4 = new CardDeletionInteractor$deleteYbCard$4(this, str, str2, null);
                cardDeletionInteractor$deleteYbCard$12.label = 1;
                Object B = d6vVar.B(str, xc8Var, wk6Var, cardDeletionInteractor$deleteYbCard$4, cardDeletionInteractor$deleteYbCard$12);
                return B == obj2 ? obj2 : B;
            }
        }
        cardDeletionInteractor$deleteYbCard$1 = new CardDeletionInteractor$deleteYbCard$1(this, continuationImpl);
        CardDeletionInteractor$deleteYbCard$1 cardDeletionInteractor$deleteYbCard$122 = cardDeletionInteractor$deleteYbCard$1;
        Object obj3 = cardDeletionInteractor$deleteYbCard$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDeletionInteractor$deleteYbCard$122.label;
        if (i == 0) {
        }
    }
}
