package com.ybsdk.common.domain;

import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.common.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CreditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult;
import defpackage.gao;
import defpackage.ljo;
import defpackage.mzz0;
import defpackage.nf51;
import defpackage.ny61;
import defpackage.of51;
import defpackage.z94;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements nf51 {
    public final com.ybsdk.common.repositiories.creditlimit.a a;
    public final e b;
    public final AppAnalyticsReporter c;

    public a(com.ybsdk.common.repositiories.creditlimit.a aVar, e eVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = aVar;
        this.b = eVar;
        this.c = appAnalyticsReporter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r13 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r12.b.c(r14, r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(of51 of51Var, ContinuationImpl continuationImpl) {
        CreditLimitInteractor$setCreditLimitPurchaseSettings$1 creditLimitInteractor$setCreditLimitPurchaseSettings$1;
        int i;
        Object a;
        if (continuationImpl instanceof CreditLimitInteractor$setCreditLimitPurchaseSettings$1) {
            creditLimitInteractor$setCreditLimitPurchaseSettings$1 = (CreditLimitInteractor$setCreditLimitPurchaseSettings$1) continuationImpl;
            int i2 = creditLimitInteractor$setCreditLimitPurchaseSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditLimitInteractor$setCreditLimitPurchaseSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditLimitInteractor$setCreditLimitPurchaseSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditLimitInteractor$setCreditLimitPurchaseSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    StartSessionCallSource.PublicApi publicApi = new StartSessionCallSource.PublicApi("setCreditLimitPurchaseSettings");
                    creditLimitInteractor$setCreditLimitPurchaseSettings$1.L$0 = of51Var;
                    creditLimitInteractor$setCreditLimitPurchaseSettings$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        a = ((Result) obj).getValue();
                        boolean z = a instanceof Result.Failure;
                        AppAnalyticsReporter appAnalyticsReporter = this.c;
                        if (!z) {
                            appAnalyticsReporter.q.n(CreditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult.OK, null, null, null, null);
                        }
                        Throwable a2 = Result.a(a);
                        if (a2 != 0) {
                            z94 z94Var = appAnalyticsReporter.q;
                            CreditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult creditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult = CreditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult.ERROR;
                            String message = a2.getMessage();
                            Integer a3 = gao.a(a2);
                            String b = ljo.b(a2);
                            mzz0 mzz0Var = a2 instanceof mzz0 ? (mzz0) a2 : null;
                            z94Var.n(creditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult, message, a3, b, mzz0Var != null ? mzz0Var.getTraceId() : null);
                        }
                        return a;
                    }
                    of51Var = (of51) creditLimitInteractor$setCreditLimitPurchaseSettings$1.L$0;
                    kotlin.b.b(obj);
                }
                com.ybsdk.core.utils.c cVar = new com.ybsdk.core.utils.c();
                CreditLimitInteractor$setCreditLimitPurchaseSettings$2 creditLimitInteractor$setCreditLimitPurchaseSettings$2 = new CreditLimitInteractor$setCreditLimitPurchaseSettings$2(this, of51Var, null);
                creditLimitInteractor$setCreditLimitPurchaseSettings$1.L$0 = null;
                creditLimitInteractor$setCreditLimitPurchaseSettings$1.label = 2;
                a = com.ybsdk.core.utils.d.a(cVar, creditLimitInteractor$setCreditLimitPurchaseSettings$2, creditLimitInteractor$setCreditLimitPurchaseSettings$1);
            }
        }
        creditLimitInteractor$setCreditLimitPurchaseSettings$1 = new CreditLimitInteractor$setCreditLimitPurchaseSettings$1(this, continuationImpl);
        Object obj2 = creditLimitInteractor$setCreditLimitPurchaseSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditLimitInteractor$setCreditLimitPurchaseSettings$1.label;
        if (i != 0) {
        }
        com.ybsdk.core.utils.c cVar2 = new com.ybsdk.core.utils.c();
        CreditLimitInteractor$setCreditLimitPurchaseSettings$2 creditLimitInteractor$setCreditLimitPurchaseSettings$22 = new CreditLimitInteractor$setCreditLimitPurchaseSettings$2(this, of51Var, null);
        creditLimitInteractor$setCreditLimitPurchaseSettings$1.L$0 = null;
        creditLimitInteractor$setCreditLimitPurchaseSettings$1.label = 2;
        a = com.ybsdk.core.utils.d.a(cVar2, creditLimitInteractor$setCreditLimitPurchaseSettings$22, creditLimitInteractor$setCreditLimitPurchaseSettings$1);
    }
}
