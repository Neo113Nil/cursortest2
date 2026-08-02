package com.yandex.go.taxi.order.details.v2.domain.feedback.sending;

import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.services.d;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.g6u;
import defpackage.k1y0;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final FeedbackApi a;
    public final d b;
    public final tt2 c;
    public final k1y0 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final cne0 g;

    public a(FeedbackApi feedbackApi, d dVar, tt2 tt2Var, k1y0 k1y0Var, dne0 dne0Var) {
        this.a = feedbackApi;
        this.b = dVar;
        this.c = tt2Var;
        this.d = k1y0Var;
        this.g = dne0Var.a("feedback_preferences");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:26|27|(1:29))|19|20|(2:22|(1:24))|12|13))|34|6|7|(0)(0)|19|20|(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r2 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, FeedbackParam feedbackParam, ContinuationImpl continuationImpl) {
        TaxiOrderFeedbackRepositoryImpl$makeRequest$1 taxiOrderFeedbackRepositoryImpl$makeRequest$1;
        int i;
        Object failure;
        aVar.getClass();
        if (continuationImpl instanceof TaxiOrderFeedbackRepositoryImpl$makeRequest$1) {
            taxiOrderFeedbackRepositoryImpl$makeRequest$1 = (TaxiOrderFeedbackRepositoryImpl$makeRequest$1) continuationImpl;
            int i2 = taxiOrderFeedbackRepositoryImpl$makeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFeedbackRepositoryImpl$makeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderFeedbackRepositoryImpl$makeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFeedbackRepositoryImpl$makeRequest$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    cmt<zy11> b = aVar.a.b(feedbackParam);
                    taxiOrderFeedbackRepositoryImpl$makeRequest$1.L$0 = feedbackParam;
                    taxiOrderFeedbackRepositoryImpl$makeRequest$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(b, null, taxiOrderFeedbackRepositoryImpl$makeRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return zy11Var;
                    }
                    feedbackParam = (FeedbackParam) taxiOrderFeedbackRepositoryImpl$makeRequest$1.L$0;
                    b.b(obj);
                }
                failure = zy11Var;
                if (!(failure instanceof Result.Failure)) {
                    aVar.c.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    TaxiOrderFeedbackRepositoryImpl$makeRequest$3$1 taxiOrderFeedbackRepositoryImpl$makeRequest$3$1 = new TaxiOrderFeedbackRepositoryImpl$makeRequest$3$1(feedbackParam, null);
                    taxiOrderFeedbackRepositoryImpl$makeRequest$1.L$0 = null;
                    taxiOrderFeedbackRepositoryImpl$makeRequest$1.L$1 = failure;
                    taxiOrderFeedbackRepositoryImpl$makeRequest$1.L$2 = null;
                    taxiOrderFeedbackRepositoryImpl$makeRequest$1.label = 2;
                    if (tje.k0(g6uVar, taxiOrderFeedbackRepositoryImpl$makeRequest$3$1, taxiOrderFeedbackRepositoryImpl$makeRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        taxiOrderFeedbackRepositoryImpl$makeRequest$1 = new TaxiOrderFeedbackRepositoryImpl$makeRequest$1(aVar, continuationImpl);
        Object obj2 = taxiOrderFeedbackRepositoryImpl$makeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFeedbackRepositoryImpl$makeRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        failure = zy11Var2;
        if (!(failure instanceof Result.Failure)) {
        }
        return zy11Var2;
    }

    public final void b(String str, TaxiOrderFeedback taxiOrderFeedback, ContinuationImpl continuationImpl) {
        FeedbackParam a = this.d.a(str, taxiOrderFeedback);
        ConcurrentHashMap concurrentHashMap = this.e;
        if (a.equals(concurrentHashMap.get(str))) {
            return;
        }
        concurrentHashMap.put(str, a);
        ConcurrentHashMap concurrentHashMap2 = this.f;
        l8x l8xVar = (l8x) concurrentHashMap2.get(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        concurrentHashMap2.put(str, tje.N(bvf0.a(continuationImpl.get_context()), null, null, new TaxiOrderFeedbackRepositoryImpl$sendFeedback$2(this, a, null), 3));
    }
}
