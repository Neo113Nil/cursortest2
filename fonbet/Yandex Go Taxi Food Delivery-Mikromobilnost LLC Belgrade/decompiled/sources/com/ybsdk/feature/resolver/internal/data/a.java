package com.ybsdk.feature.resolver.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.resolver.internal.network.LinkApi;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final LinkApi a;

    public a(LinkApi linkApi) {
        this.a = linkApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ResolveLinkRepository$getDeeplink$1 resolveLinkRepository$getDeeplink$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof ResolveLinkRepository$getDeeplink$1) {
            resolveLinkRepository$getDeeplink$1 = (ResolveLinkRepository$getDeeplink$1) continuationImpl;
            int i2 = resolveLinkRepository$getDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveLinkRepository$getDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveLinkRepository$getDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveLinkRepository$getDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    ResolveLinkRepository$getDeeplink$2 resolveLinkRepository$getDeeplink$2 = new ResolveLinkRepository$getDeeplink$2(this, str, null);
                    resolveLinkRepository$getDeeplink$1.label = 1;
                    c = c.c(resolveLinkRepository$getDeeplink$2, resolveLinkRepository$getDeeplink$1);
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
                ResolveLinkRepository$getDeeplink$3$1 resolveLinkRepository$getDeeplink$3$1 = new ResolveLinkRepository$getDeeplink$3$1(2, null);
                resolveLinkRepository$getDeeplink$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, resolveLinkRepository$getDeeplink$3$1, resolveLinkRepository$getDeeplink$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        resolveLinkRepository$getDeeplink$1 = new ResolveLinkRepository$getDeeplink$1(this, continuationImpl);
        Object obj2 = resolveLinkRepository$getDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveLinkRepository$getDeeplink$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ResolveLinkRepository$getDeeplinks$1 resolveLinkRepository$getDeeplinks$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof ResolveLinkRepository$getDeeplinks$1) {
            resolveLinkRepository$getDeeplinks$1 = (ResolveLinkRepository$getDeeplinks$1) continuationImpl;
            int i2 = resolveLinkRepository$getDeeplinks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveLinkRepository$getDeeplinks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveLinkRepository$getDeeplinks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveLinkRepository$getDeeplinks$1.label;
                if (i != 0) {
                    b.b(obj);
                    ResolveLinkRepository$getDeeplinks$2 resolveLinkRepository$getDeeplinks$2 = new ResolveLinkRepository$getDeeplinks$2(this, str, null);
                    resolveLinkRepository$getDeeplinks$1.label = 1;
                    c = c.c(resolveLinkRepository$getDeeplinks$2, resolveLinkRepository$getDeeplinks$1);
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
                ResolveLinkRepository$getDeeplinks$3$1 resolveLinkRepository$getDeeplinks$3$1 = new ResolveLinkRepository$getDeeplinks$3$1(2, null);
                resolveLinkRepository$getDeeplinks$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, resolveLinkRepository$getDeeplinks$3$1, resolveLinkRepository$getDeeplinks$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        resolveLinkRepository$getDeeplinks$1 = new ResolveLinkRepository$getDeeplinks$1(this, continuationImpl);
        Object obj2 = resolveLinkRepository$getDeeplinks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveLinkRepository$getDeeplinks$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ResolveLinkRepository$getShortDeeplink$1 resolveLinkRepository$getShortDeeplink$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof ResolveLinkRepository$getShortDeeplink$1) {
            resolveLinkRepository$getShortDeeplink$1 = (ResolveLinkRepository$getShortDeeplink$1) continuationImpl;
            int i2 = resolveLinkRepository$getShortDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveLinkRepository$getShortDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveLinkRepository$getShortDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveLinkRepository$getShortDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    ResolveLinkRepository$getShortDeeplink$2 resolveLinkRepository$getShortDeeplink$2 = new ResolveLinkRepository$getShortDeeplink$2(this, str, null);
                    resolveLinkRepository$getShortDeeplink$1.label = 1;
                    c = c.c(resolveLinkRepository$getShortDeeplink$2, resolveLinkRepository$getShortDeeplink$1);
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
                ResolveLinkRepository$getShortDeeplink$3$1 resolveLinkRepository$getShortDeeplink$3$1 = new ResolveLinkRepository$getShortDeeplink$3$1(2, null);
                resolveLinkRepository$getShortDeeplink$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, resolveLinkRepository$getShortDeeplink$3$1, resolveLinkRepository$getShortDeeplink$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        resolveLinkRepository$getShortDeeplink$1 = new ResolveLinkRepository$getShortDeeplink$1(this, continuationImpl);
        Object obj2 = resolveLinkRepository$getShortDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveLinkRepository$getShortDeeplink$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
