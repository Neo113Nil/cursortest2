package com.ybsdk.common.repositiories.cashback;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Api a;

    public a(Api api) {
        this.a = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(YBProduct yBProduct, ContinuationImpl continuationImpl) {
        CashbackPublicInfoRepository$getCashbackStatus$1 cashbackPublicInfoRepository$getCashbackStatus$1;
        int i;
        if (continuationImpl instanceof CashbackPublicInfoRepository$getCashbackStatus$1) {
            cashbackPublicInfoRepository$getCashbackStatus$1 = (CashbackPublicInfoRepository$getCashbackStatus$1) continuationImpl;
            int i2 = cashbackPublicInfoRepository$getCashbackStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackPublicInfoRepository$getCashbackStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackPublicInfoRepository$getCashbackStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackPublicInfoRepository$getCashbackStatus$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                CashbackPublicInfoRepository$getCashbackStatus$2 cashbackPublicInfoRepository$getCashbackStatus$2 = new CashbackPublicInfoRepository$getCashbackStatus$2(this, yBProduct, null);
                cashbackPublicInfoRepository$getCashbackStatus$1.label = 1;
                Object c = c.c(cashbackPublicInfoRepository$getCashbackStatus$2, cashbackPublicInfoRepository$getCashbackStatus$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cashbackPublicInfoRepository$getCashbackStatus$1 = new CashbackPublicInfoRepository$getCashbackStatus$1(this, continuationImpl);
        Object obj2 = cashbackPublicInfoRepository$getCashbackStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackPublicInfoRepository$getCashbackStatus$1.label;
        if (i == 0) {
        }
    }
}
