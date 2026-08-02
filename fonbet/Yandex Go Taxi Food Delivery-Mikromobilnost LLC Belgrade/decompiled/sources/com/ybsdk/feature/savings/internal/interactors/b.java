package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.core.utils.poller.PollerTimeoutException;
import defpackage.d6v;
import defpackage.dps;
import defpackage.e0e0;
import defpackage.fps;
import defpackage.hps;
import defpackage.ny61;
import defpackage.s1r;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.savings.internal.data.b a;
    public final com.ybsdk.utils.poller.b b;
    public volatile hps c;

    public b(com.ybsdk.feature.savings.internal.data.b bVar, com.ybsdk.utils.poller.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, d6v d6vVar, boolean z, ContinuationImpl continuationImpl) {
        FundOperationInteractor$fundOperation$1 fundOperationInteractor$fundOperation$1;
        int i;
        if (continuationImpl instanceof FundOperationInteractor$fundOperation$1) {
            fundOperationInteractor$fundOperation$1 = (FundOperationInteractor$fundOperation$1) continuationImpl;
            int i2 = fundOperationInteractor$fundOperation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fundOperationInteractor$fundOperation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fundOperationInteractor$fundOperation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fundOperationInteractor$fundOperation$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                FundOperationInteractor$fundOperation$2 fundOperationInteractor$fundOperation$2 = new FundOperationInteractor$fundOperation$2(this, str3, str4, str, str2, z, null);
                fundOperationInteractor$fundOperation$1.label = 1;
                Object a = com.ybsdk.core.utils.d.a(d6vVar, fundOperationInteractor$fundOperation$2, fundOperationInteractor$fundOperation$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        fundOperationInteractor$fundOperation$1 = new FundOperationInteractor$fundOperation$1(this, continuationImpl);
        Object obj2 = fundOperationInteractor$fundOperation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fundOperationInteractor$fundOperation$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, s1r s1rVar, ContinuationImpl continuationImpl) {
        FundOperationInteractor$requestFundOperationStatus$1 fundOperationInteractor$requestFundOperationStatus$1;
        int i;
        Object e;
        fps fpsVar;
        if (continuationImpl instanceof FundOperationInteractor$requestFundOperationStatus$1) {
            fundOperationInteractor$requestFundOperationStatus$1 = (FundOperationInteractor$requestFundOperationStatus$1) continuationImpl;
            int i2 = fundOperationInteractor$requestFundOperationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fundOperationInteractor$requestFundOperationStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fundOperationInteractor$requestFundOperationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fundOperationInteractor$requestFundOperationStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.b.c(e0e0.b, new FundOperationInteractor$requestFundOperationStatus$2(this, null), new FundOperationInteractor$requestFundOperationStatus$3(this, str, str2, str3, s1rVar, null));
                    fundOperationInteractor$requestFundOperationStatus$1.label = 1;
                    e = c.e(fundOperationInteractor$requestFundOperationStatus$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (Result.a(e) instanceof PollerTimeoutException) {
                    return e;
                }
                hps hpsVar = this.c;
                dps dpsVar = hpsVar instanceof dps ? (dps) hpsVar : null;
                return (dpsVar == null || (fpsVar = dpsVar.c) == null) ? this.c : fpsVar;
            }
        }
        fundOperationInteractor$requestFundOperationStatus$1 = new FundOperationInteractor$requestFundOperationStatus$1(this, continuationImpl);
        Object obj2 = fundOperationInteractor$requestFundOperationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fundOperationInteractor$requestFundOperationStatus$1.label;
        if (i != 0) {
        }
        if (Result.a(e) instanceof PollerTimeoutException) {
        }
    }
}
