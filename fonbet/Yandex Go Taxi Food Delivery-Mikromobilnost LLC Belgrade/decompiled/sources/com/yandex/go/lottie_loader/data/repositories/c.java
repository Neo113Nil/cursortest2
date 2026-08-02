package com.yandex.go.lottie_loader.data.repositories;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final cne0 b;

    public c(dne0 dne0Var) {
        this.b = dne0Var.a("lottie_animation_urls");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LottieAnimationCachedUrlsRepository$clear$1 lottieAnimationCachedUrlsRepository$clear$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof LottieAnimationCachedUrlsRepository$clear$1) {
                lottieAnimationCachedUrlsRepository$clear$1 = (LottieAnimationCachedUrlsRepository$clear$1) continuationImpl;
                int i2 = lottieAnimationCachedUrlsRepository$clear$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedUrlsRepository$clear$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedUrlsRepository$clear$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedUrlsRepository$clear$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.a;
                        lottieAnimationCachedUrlsRepository$clear$1.L$0 = aVar;
                        lottieAnimationCachedUrlsRepository$clear$1.label = 1;
                        if (aVar.a(lottieAnimationCachedUrlsRepository$clear$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) lottieAnimationCachedUrlsRepository$clear$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.b.a();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.b.a();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        lottieAnimationCachedUrlsRepository$clear$1 = new LottieAnimationCachedUrlsRepository$clear$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedUrlsRepository$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedUrlsRepository$clear$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        LottieAnimationCachedUrlsRepository$removeUrl$1 lottieAnimationCachedUrlsRepository$removeUrl$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof LottieAnimationCachedUrlsRepository$removeUrl$1) {
                lottieAnimationCachedUrlsRepository$removeUrl$1 = (LottieAnimationCachedUrlsRepository$removeUrl$1) continuationImpl;
                int i2 = lottieAnimationCachedUrlsRepository$removeUrl$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedUrlsRepository$removeUrl$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedUrlsRepository$removeUrl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedUrlsRepository$removeUrl$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationCachedUrlsRepository$removeUrl$1.L$0 = str;
                        aVar = this.a;
                        lottieAnimationCachedUrlsRepository$removeUrl$1.L$1 = aVar;
                        lottieAnimationCachedUrlsRepository$removeUrl$1.label = 1;
                        if (aVar.a(lottieAnimationCachedUrlsRepository$removeUrl$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) lottieAnimationCachedUrlsRepository$removeUrl$1.L$1;
                        String str2 = (String) lottieAnimationCachedUrlsRepository$removeUrl$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    this.b.w(str);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.b.w(str);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        lottieAnimationCachedUrlsRepository$removeUrl$1 = new LottieAnimationCachedUrlsRepository$removeUrl$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedUrlsRepository$removeUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedUrlsRepository$removeUrl$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        LottieAnimationCachedUrlsRepository$saveAnimationId$1 lottieAnimationCachedUrlsRepository$saveAnimationId$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof LottieAnimationCachedUrlsRepository$saveAnimationId$1) {
                lottieAnimationCachedUrlsRepository$saveAnimationId$1 = (LottieAnimationCachedUrlsRepository$saveAnimationId$1) continuationImpl;
                int i2 = lottieAnimationCachedUrlsRepository$saveAnimationId$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedUrlsRepository$saveAnimationId$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedUrlsRepository$saveAnimationId$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedUrlsRepository$saveAnimationId$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationCachedUrlsRepository$saveAnimationId$1.L$0 = str;
                        lottieAnimationCachedUrlsRepository$saveAnimationId$1.L$1 = str2;
                        aVar = this.a;
                        lottieAnimationCachedUrlsRepository$saveAnimationId$1.L$2 = aVar;
                        lottieAnimationCachedUrlsRepository$saveAnimationId$1.label = 1;
                        if (aVar.a(lottieAnimationCachedUrlsRepository$saveAnimationId$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) lottieAnimationCachedUrlsRepository$saveAnimationId$1.L$2;
                        str2 = (String) lottieAnimationCachedUrlsRepository$saveAnimationId$1.L$1;
                        String str3 = (String) lottieAnimationCachedUrlsRepository$saveAnimationId$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str3;
                    }
                    this.b.r(str, str2);
                    return zy11.a;
                }
            }
            this.b.r(str, str2);
            return zy11.a;
        } finally {
            aVar.d(null);
        }
        lottieAnimationCachedUrlsRepository$saveAnimationId$1 = new LottieAnimationCachedUrlsRepository$saveAnimationId$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedUrlsRepository$saveAnimationId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedUrlsRepository$saveAnimationId$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        LottieAnimationCachedUrlsRepository$tryGetAnimationId$1 lottieAnimationCachedUrlsRepository$tryGetAnimationId$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof LottieAnimationCachedUrlsRepository$tryGetAnimationId$1) {
                lottieAnimationCachedUrlsRepository$tryGetAnimationId$1 = (LottieAnimationCachedUrlsRepository$tryGetAnimationId$1) continuationImpl;
                int i2 = lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.L$0 = str;
                        aVar = this.a;
                        lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.L$1 = aVar;
                        lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.label = 1;
                        if (aVar.a(lottieAnimationCachedUrlsRepository$tryGetAnimationId$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.L$1;
                        String str2 = (String) lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    return this.b.l(str, null);
                }
            }
            return this.b.l(str, null);
        } finally {
            aVar.d(null);
        }
        lottieAnimationCachedUrlsRepository$tryGetAnimationId$1 = new LottieAnimationCachedUrlsRepository$tryGetAnimationId$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedUrlsRepository$tryGetAnimationId$1.label;
        if (i != 0) {
        }
    }
}
