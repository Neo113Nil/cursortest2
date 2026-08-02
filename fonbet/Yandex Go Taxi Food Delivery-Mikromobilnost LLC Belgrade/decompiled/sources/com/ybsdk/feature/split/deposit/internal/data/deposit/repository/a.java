package com.ybsdk.feature.split.deposit.internal.data.deposit.repository;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.split.deposit.internal.data.network.SplitDepositApi;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.bvf0;
import defpackage.ny61;
import defpackage.ytt0;
import defpackage.ztt0;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final SplitDepositApi a;
    public final ytt0 b;
    public final com.ybsdk.feature.divkit.api.domain.a c = new com.ybsdk.feature.divkit.api.domain.a(null);

    public a(SplitDepositApi splitDepositApi, ytt0 ytt0Var) {
        this.a = splitDepositApi;
        this.b = ytt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, GetDepositPageResponse getDepositPageResponse, ContinuationImpl continuationImpl) {
        SplitDepositPageRepository$getSplitDepositPageResponseData$1 splitDepositPageRepository$getSplitDepositPageResponseData$1;
        int i;
        aVar.getClass();
        try {
            if (continuationImpl instanceof SplitDepositPageRepository$getSplitDepositPageResponseData$1) {
                splitDepositPageRepository$getSplitDepositPageResponseData$1 = (SplitDepositPageRepository$getSplitDepositPageResponseData$1) continuationImpl;
                int i2 = splitDepositPageRepository$getSplitDepositPageResponseData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    splitDepositPageRepository$getSplitDepositPageResponseData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = splitDepositPageRepository$getSplitDepositPageResponseData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = splitDepositPageRepository$getSplitDepositPageResponseData$1.label;
                    if (i != 0) {
                        b.b(obj);
                        SplitDepositPageRepository$getSplitDepositPageResponseData$2$1 splitDepositPageRepository$getSplitDepositPageResponseData$2$1 = new SplitDepositPageRepository$getSplitDepositPageResponseData$2$1(aVar, getDepositPageResponse, null);
                        splitDepositPageRepository$getSplitDepositPageResponseData$1.label = 1;
                        obj = bvf0.n(splitDepositPageRepository$getSplitDepositPageResponseData$2$1, splitDepositPageRepository$getSplitDepositPageResponseData$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return (ztt0) obj;
                }
            }
            if (i != 0) {
            }
            return (ztt0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        splitDepositPageRepository$getSplitDepositPageResponseData$1 = new SplitDepositPageRepository$getSplitDepositPageResponseData$1(aVar, continuationImpl);
        Object obj2 = splitDepositPageRepository$getSplitDepositPageResponseData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splitDepositPageRepository$getSplitDepositPageResponseData$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        SplitDepositPageRepository$getSplitDepositPage$1 splitDepositPageRepository$getSplitDepositPage$1;
        int i;
        if (continuationImpl instanceof SplitDepositPageRepository$getSplitDepositPage$1) {
            splitDepositPageRepository$getSplitDepositPage$1 = (SplitDepositPageRepository$getSplitDepositPage$1) continuationImpl;
            int i2 = splitDepositPageRepository$getSplitDepositPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splitDepositPageRepository$getSplitDepositPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splitDepositPageRepository$getSplitDepositPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splitDepositPageRepository$getSplitDepositPage$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                SplitDepositPageRepository$getSplitDepositPage$2 splitDepositPageRepository$getSplitDepositPage$2 = new SplitDepositPageRepository$getSplitDepositPage$2(this, str2, str, str3, null);
                splitDepositPageRepository$getSplitDepositPage$1.label = 1;
                Object c = c.c(splitDepositPageRepository$getSplitDepositPage$2, splitDepositPageRepository$getSplitDepositPage$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        splitDepositPageRepository$getSplitDepositPage$1 = new SplitDepositPageRepository$getSplitDepositPage$1(this, continuationImpl);
        Object obj2 = splitDepositPageRepository$getSplitDepositPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splitDepositPageRepository$getSplitDepositPage$1.label;
        if (i == 0) {
        }
    }
}
