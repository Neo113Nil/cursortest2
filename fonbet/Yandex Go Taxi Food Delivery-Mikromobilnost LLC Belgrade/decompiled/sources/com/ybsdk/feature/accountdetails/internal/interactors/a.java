package com.ybsdk.feature.accountdetails.internal.interactors;

import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.accountdetails.internal.data.a a;

    public a(com.ybsdk.feature.accountdetails.internal.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AccountDetailsInteractor$getDetails$1 accountDetailsInteractor$getDetails$1;
        int i;
        if (continuationImpl instanceof AccountDetailsInteractor$getDetails$1) {
            accountDetailsInteractor$getDetails$1 = (AccountDetailsInteractor$getDetails$1) continuationImpl;
            int i2 = accountDetailsInteractor$getDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountDetailsInteractor$getDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountDetailsInteractor$getDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDetailsInteractor$getDetails$1.label;
                if (i != 0) {
                    b.b(obj);
                    accountDetailsInteractor$getDetails$1.label = 1;
                    Object a = this.a.a(str, accountDetailsInteractor$getDetails$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        accountDetailsInteractor$getDetails$1 = new AccountDetailsInteractor$getDetails$1(this, continuationImpl);
        Object obj2 = accountDetailsInteractor$getDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDetailsInteractor$getDetails$1.label;
        if (i != 0) {
        }
    }
}
