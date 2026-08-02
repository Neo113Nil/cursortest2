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
public final class b {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final cne0 b;

    public b(dne0 dne0Var) {
        this.b = dne0Var.a("lottie_animation_id");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LottieAnimationCachedIdsRepository$clear$1 lottieAnimationCachedIdsRepository$clear$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof LottieAnimationCachedIdsRepository$clear$1) {
                lottieAnimationCachedIdsRepository$clear$1 = (LottieAnimationCachedIdsRepository$clear$1) continuationImpl;
                int i2 = lottieAnimationCachedIdsRepository$clear$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedIdsRepository$clear$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedIdsRepository$clear$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedIdsRepository$clear$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.a;
                        lottieAnimationCachedIdsRepository$clear$1.L$0 = aVar;
                        lottieAnimationCachedIdsRepository$clear$1.label = 1;
                        if (aVar.a(lottieAnimationCachedIdsRepository$clear$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) lottieAnimationCachedIdsRepository$clear$1.L$0;
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
        lottieAnimationCachedIdsRepository$clear$1 = new LottieAnimationCachedIdsRepository$clear$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedIdsRepository$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedIdsRepository$clear$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LottieAnimationCachedIdsRepository$generateNextAnimationId$1 lottieAnimationCachedIdsRepository$generateNextAnimationId$1;
        int i;
        g050 g050Var;
        cne0 cne0Var = this.b;
        try {
            if (continuationImpl instanceof LottieAnimationCachedIdsRepository$generateNextAnimationId$1) {
                lottieAnimationCachedIdsRepository$generateNextAnimationId$1 = (LottieAnimationCachedIdsRepository$generateNextAnimationId$1) continuationImpl;
                int i2 = lottieAnimationCachedIdsRepository$generateNextAnimationId$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedIdsRepository$generateNextAnimationId$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedIdsRepository$generateNextAnimationId$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedIdsRepository$generateNextAnimationId$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g050Var = this.a;
                        lottieAnimationCachedIdsRepository$generateNextAnimationId$1.L$0 = g050Var;
                        lottieAnimationCachedIdsRepository$generateNextAnimationId$1.label = 1;
                        if (g050Var.a(lottieAnimationCachedIdsRepository$generateNextAnimationId$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) lottieAnimationCachedIdsRepository$generateNextAnimationId$1.L$0;
                        kotlin.b.b(obj);
                    }
                    long j = cne0Var.j("last_lottie_animation_id", 1L) + 1;
                    cne0Var.q(j, "last_lottie_animation_id");
                    return String.valueOf(j);
                }
            }
            long j2 = cne0Var.j("last_lottie_animation_id", 1L) + 1;
            cne0Var.q(j2, "last_lottie_animation_id");
            return String.valueOf(j2);
        } finally {
            g050Var.d(null);
        }
        lottieAnimationCachedIdsRepository$generateNextAnimationId$1 = new LottieAnimationCachedIdsRepository$generateNextAnimationId$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedIdsRepository$generateNextAnimationId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedIdsRepository$generateNextAnimationId$1.label;
        if (i != 0) {
        }
    }
}
