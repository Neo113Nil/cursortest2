package com.ybsdk.common.repositiories.creditlimit;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.UzApi;
import com.ybsdk.network.dto.creditlimit.CreditLimitSetSettingsRequest;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final Api a;
    public final UzApi b;

    public a(Api api, UzApi uzApi) {
        this.a = api;
        this.b = uzApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CreditLimitSetSettingsRequest creditLimitSetSettingsRequest, String str, ContinuationImpl continuationImpl) {
        CreditLimitRepository$setCreditLimitPurchaseSettings$1 creditLimitRepository$setCreditLimitPurchaseSettings$1;
        int i;
        if (continuationImpl instanceof CreditLimitRepository$setCreditLimitPurchaseSettings$1) {
            creditLimitRepository$setCreditLimitPurchaseSettings$1 = (CreditLimitRepository$setCreditLimitPurchaseSettings$1) continuationImpl;
            int i2 = creditLimitRepository$setCreditLimitPurchaseSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditLimitRepository$setCreditLimitPurchaseSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditLimitRepository$setCreditLimitPurchaseSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditLimitRepository$setCreditLimitPurchaseSettings$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                CreditLimitRepository$setCreditLimitPurchaseSettings$2 creditLimitRepository$setCreditLimitPurchaseSettings$2 = new CreditLimitRepository$setCreditLimitPurchaseSettings$2(this, str, creditLimitSetSettingsRequest, null);
                creditLimitRepository$setCreditLimitPurchaseSettings$1.label = 1;
                Object c = c.c(creditLimitRepository$setCreditLimitPurchaseSettings$2, creditLimitRepository$setCreditLimitPurchaseSettings$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        creditLimitRepository$setCreditLimitPurchaseSettings$1 = new CreditLimitRepository$setCreditLimitPurchaseSettings$1(this, continuationImpl);
        Object obj2 = creditLimitRepository$setCreditLimitPurchaseSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditLimitRepository$setCreditLimitPurchaseSettings$1.label;
        if (i == 0) {
        }
    }
}
