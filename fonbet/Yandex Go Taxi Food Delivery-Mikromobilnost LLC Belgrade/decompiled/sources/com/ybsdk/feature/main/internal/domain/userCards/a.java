package com.ybsdk.feature.main.internal.domain.userCards;

import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserCardsInteractor$getUserCards$1 userCardsInteractor$getUserCards$1;
        int i;
        if (continuationImpl instanceof UserCardsInteractor$getUserCards$1) {
            userCardsInteractor$getUserCards$1 = (UserCardsInteractor$getUserCards$1) continuationImpl;
            int i2 = userCardsInteractor$getUserCards$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userCardsInteractor$getUserCards$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userCardsInteractor$getUserCards$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCardsInteractor$getUserCards$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userCardsInteractor$getUserCards$1.label = 1;
                    Object a = this.a.a(userCardsInteractor$getUserCards$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        userCardsInteractor$getUserCards$1 = new UserCardsInteractor$getUserCards$1(this, continuationImpl);
        Object obj2 = userCardsInteractor$getUserCards$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCardsInteractor$getUserCards$1.label;
        if (i != 0) {
        }
    }
}
