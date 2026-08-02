package com.ybsdk.common.repositiories.card;

import com.ybsdk.common.e;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import com.ybsdk.feature.card.api.CardApplicationsRepository$CardIssueResult;
import com.ybsdk.network.Api;
import defpackage.a03;
import defpackage.ba8;
import defpackage.bvf0;
import defpackage.gff;
import defpackage.jqr;
import defpackage.k03;
import defpackage.lzd0;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.o0e0;
import defpackage.pb;
import defpackage.pz40;
import defpackage.ta8;
import defpackage.tpr;
import defpackage.ua8;
import defpackage.z98;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b implements ua8 {
    public final Api a;
    public final nbp0 b;
    public final e c;
    public final gff d;
    public final k03 e;
    public final com.ybsdk.utils.poller.b f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public b(Api api, nbp0 nbp0Var, e eVar, gff gffVar, k03 k03Var, com.ybsdk.utils.poller.b bVar) {
        this.a = api;
        this.b = nbp0Var;
        this.c = eVar;
        this.d = gffVar;
        this.e = k03Var;
        this.f = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardApplicationsRepositoryImpl$createApplication$1 cardApplicationsRepositoryImpl$createApplication$1;
        int i;
        Object b;
        if (continuationImpl instanceof CardApplicationsRepositoryImpl$createApplication$1) {
            cardApplicationsRepositoryImpl$createApplication$1 = (CardApplicationsRepositoryImpl$createApplication$1) continuationImpl;
            int i2 = cardApplicationsRepositoryImpl$createApplication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardApplicationsRepositoryImpl$createApplication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardApplicationsRepositoryImpl$createApplication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardApplicationsRepositoryImpl$createApplication$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ApplicationType applicationType = ApplicationType.DIGITAL_CARD_ISSUE;
                    cardApplicationsRepositoryImpl$createApplication$1.label = 1;
                    b = ((com.ybsdk.common.repositiories.applications.b) this.e).b(applicationType, str, cardApplicationsRepositoryImpl$createApplication$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    return b;
                }
                a03 a03Var = (a03) b;
                return new ta8(a03Var.a, a03Var.c);
            }
        }
        cardApplicationsRepositoryImpl$createApplication$1 = new CardApplicationsRepositoryImpl$createApplication$1(this, continuationImpl);
        Object obj2 = cardApplicationsRepositoryImpl$createApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardApplicationsRepositoryImpl$createApplication$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r7.c.f(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(String str, ContinuationImpl continuationImpl) {
        CardApplicationsRepositoryImpl$pollCardIssue$1 cardApplicationsRepositoryImpl$pollCardIssue$1;
        int i;
        Object b;
        if (continuationImpl instanceof CardApplicationsRepositoryImpl$pollCardIssue$1) {
            cardApplicationsRepositoryImpl$pollCardIssue$1 = (CardApplicationsRepositoryImpl$pollCardIssue$1) continuationImpl;
            int i2 = cardApplicationsRepositoryImpl$pollCardIssue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardApplicationsRepositoryImpl$pollCardIssue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardApplicationsRepositoryImpl$pollCardIssue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardApplicationsRepositoryImpl$pollCardIssue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lzd0 lzd0Var = lzd0.b;
                    cardApplicationsRepositoryImpl$pollCardIssue$1.L$0 = str;
                    cardApplicationsRepositoryImpl$pollCardIssue$1.label = 1;
                    obj = ((com.ybsdk.common.repositiories.applications.b) this.e).f(str, lzd0Var, cardApplicationsRepositoryImpl$pollCardIssue$1);
                } else if (i == 1) {
                    str = (String) cardApplicationsRepositoryImpl$pollCardIssue$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return CardApplicationsRepository$CardIssueResult.SUCCESS;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) cardApplicationsRepositoryImpl$pollCardIssue$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                    if (Result.a(b) != null) {
                        return CardApplicationsRepository$CardIssueResult.FAIL;
                    }
                    cardApplicationsRepositoryImpl$pollCardIssue$1.L$0 = null;
                    cardApplicationsRepositoryImpl$pollCardIssue$1.label = 3;
                }
                cardApplicationsRepositoryImpl$pollCardIssue$1.L$0 = str;
                cardApplicationsRepositoryImpl$pollCardIssue$1.label = 2;
                b = com.ybsdk.utils.poller.e.b((tpr) obj, cardApplicationsRepositoryImpl$pollCardIssue$1);
            }
        }
        cardApplicationsRepositoryImpl$pollCardIssue$1 = new CardApplicationsRepositoryImpl$pollCardIssue$1(this, continuationImpl);
        Object obj2 = cardApplicationsRepositoryImpl$pollCardIssue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardApplicationsRepositoryImpl$pollCardIssue$1.label;
        if (i != 0) {
        }
        cardApplicationsRepositoryImpl$pollCardIssue$1.L$0 = str;
        cardApplicationsRepositoryImpl$pollCardIssue$1.label = 2;
        b = com.ybsdk.utils.poller.e.b((tpr) obj2, cardApplicationsRepositoryImpl$pollCardIssue$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        CardApplicationsRepositoryImpl$startActivationStatusPolling$1 cardApplicationsRepositoryImpl$startActivationStatusPolling$1;
        int i;
        pz40 pz40Var;
        Object putIfAbsent;
        if (continuationImpl instanceof CardApplicationsRepositoryImpl$startActivationStatusPolling$1) {
            cardApplicationsRepositoryImpl$startActivationStatusPolling$1 = (CardApplicationsRepositoryImpl$startActivationStatusPolling$1) continuationImpl;
            int i2 = cardApplicationsRepositoryImpl$startActivationStatusPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardApplicationsRepositoryImpl$startActivationStatusPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardApplicationsRepositoryImpl$startActivationStatusPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardApplicationsRepositoryImpl$startActivationStatusPolling$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ConcurrentHashMap concurrentHashMap = this.g;
                    pz40 pz40Var2 = (pz40) concurrentHashMap.get(str);
                    if ((pz40Var2 != null ? (ba8) ((r0) pz40Var2).getValue() : null) instanceof z98) {
                        return zy11Var;
                    }
                    Object obj2 = concurrentHashMap.get(str);
                    if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj2 = bvf0.c(z98.a)))) != null) {
                        obj2 = putIfAbsent;
                    }
                    pz40 pz40Var3 = (pz40) obj2;
                    com.ybsdk.utils.poller.c a = com.ybsdk.core.utils.poller.a.a(this.f, o0e0.b, new CardApplicationsRepositoryImpl$startActivationStatusPolling$2(this, null), new CardApplicationsRepositoryImpl$startActivationStatusPolling$3(this, str, null));
                    cardApplicationsRepositoryImpl$startActivationStatusPolling$1.L$0 = pz40Var3;
                    cardApplicationsRepositoryImpl$startActivationStatusPolling$1.label = 1;
                    Object d = a.d(null, cardApplicationsRepositoryImpl$startActivationStatusPolling$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pz40Var = pz40Var3;
                    obj = d;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40 pz40Var4 = (pz40) cardApplicationsRepositoryImpl$startActivationStatusPolling$1.L$0;
                    kotlin.b.b(obj);
                    pz40Var = pz40Var4;
                }
                kotlinx.coroutines.flow.e.H(this.b.b, new jqr(new pb((tpr) obj, 20), new CardApplicationsRepositoryImpl$startActivationStatusPolling$5(2, pz40Var, pz40.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3));
                return zy11Var;
            }
        }
        cardApplicationsRepositoryImpl$startActivationStatusPolling$1 = new CardApplicationsRepositoryImpl$startActivationStatusPolling$1(this, continuationImpl);
        Object obj3 = cardApplicationsRepositoryImpl$startActivationStatusPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardApplicationsRepositoryImpl$startActivationStatusPolling$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        kotlinx.coroutines.flow.e.H(this.b.b, new jqr(new pb((tpr) obj3, 20), new CardApplicationsRepositoryImpl$startActivationStatusPolling$5(2, pz40Var, pz40.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3));
        return zy11Var2;
    }
}
