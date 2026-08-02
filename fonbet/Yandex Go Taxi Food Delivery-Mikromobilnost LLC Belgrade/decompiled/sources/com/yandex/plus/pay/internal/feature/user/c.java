package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final ExternalMediaBillingApi a;
    public final mdd0 b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();

    public c(ExternalMediaBillingApi externalMediaBillingApi, mdd0 mdd0Var) {
        this.a = externalMediaBillingApi;
        this.b = mdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RestUserExtendedInfoRepository$resetCache$1 restUserExtendedInfoRepository$resetCache$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof RestUserExtendedInfoRepository$resetCache$1) {
                restUserExtendedInfoRepository$resetCache$1 = (RestUserExtendedInfoRepository$resetCache$1) continuationImpl;
                int i2 = restUserExtendedInfoRepository$resetCache$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    restUserExtendedInfoRepository$resetCache$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = restUserExtendedInfoRepository$resetCache$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = restUserExtendedInfoRepository$resetCache$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.c;
                        restUserExtendedInfoRepository$resetCache$1.L$0 = aVar;
                        restUserExtendedInfoRepository$resetCache$1.I$0 = 0;
                        restUserExtendedInfoRepository$resetCache$1.label = 1;
                        if (aVar.a(restUserExtendedInfoRepository$resetCache$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) restUserExtendedInfoRepository$resetCache$1.L$0;
                        kotlin.b.b(obj);
                    }
                    mdd0 mdd0Var = this.b;
                    LogPriority logPriority = LogPriority.DEBUG;
                    mdd0Var.getClass();
                    ((ndd0) mdd0Var).a(logPriority, "RestUserExtendedInfoRepository", "Resetting user extended info cache");
                    return zy11.a;
                }
            }
            mdd0 mdd0Var2 = this.b;
            LogPriority logPriority2 = LogPriority.DEBUG;
            mdd0Var2.getClass();
            ((ndd0) mdd0Var2).a(logPriority2, "RestUserExtendedInfoRepository", "Resetting user extended info cache");
            return zy11.a;
        } finally {
            g050Var.d(null);
        }
        restUserExtendedInfoRepository$resetCache$1 = new RestUserExtendedInfoRepository$resetCache$1(this, continuationImpl);
        Object obj2 = restUserExtendedInfoRepository$resetCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restUserExtendedInfoRepository$resetCache$1.label;
        if (i != 0) {
        }
    }
}
