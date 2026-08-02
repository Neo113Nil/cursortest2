package com.ybsdk.feature.accountdetails.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.accountdetails.internal.network.AccountDetailsApi;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final AccountDetailsApi a;

    public a(AccountDetailsApi accountDetailsApi) {
        this.a = accountDetailsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AccountDetailsRepository$getDetails$1 accountDetailsRepository$getDetails$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AccountDetailsRepository$getDetails$1) {
            accountDetailsRepository$getDetails$1 = (AccountDetailsRepository$getDetails$1) continuationImpl;
            int i2 = accountDetailsRepository$getDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountDetailsRepository$getDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountDetailsRepository$getDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDetailsRepository$getDetails$1.label;
                if (i != 0) {
                    b.b(obj);
                    AccountDetailsRepository$getDetails$2 accountDetailsRepository$getDetails$2 = new AccountDetailsRepository$getDetails$2(this, str, null);
                    accountDetailsRepository$getDetails$1.label = 1;
                    c = c.c(accountDetailsRepository$getDetails$2, accountDetailsRepository$getDetails$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                AccountDetailsRepository$getDetails$3$1 accountDetailsRepository$getDetails$3$1 = AccountDetailsRepository$getDetails$3$1.b;
                accountDetailsRepository$getDetails$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, accountDetailsRepository$getDetails$3$1, accountDetailsRepository$getDetails$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        accountDetailsRepository$getDetails$1 = new AccountDetailsRepository$getDetails$1(this, continuationImpl);
        Object obj2 = accountDetailsRepository$getDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDetailsRepository$getDetails$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
