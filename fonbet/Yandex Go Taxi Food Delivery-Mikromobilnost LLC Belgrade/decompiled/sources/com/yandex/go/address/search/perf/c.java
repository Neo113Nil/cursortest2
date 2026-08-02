package com.yandex.go.address.search.perf;

import defpackage.ny61;
import defpackage.wbv0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final wbv0 a;
    public volatile Boolean b;

    public c(wbv0 wbv0Var) {
        this.a = wbv0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (((com.yandex.go.address.search.perf.experiment.SuggestsPerformanceOptimizationExperiment) r6).c != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1 suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SuggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1) {
            suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1 = (SuggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1) continuationImpl;
            int i2 = suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean bool = this.b;
                    if (bool != null) {
                        return bool;
                    }
                    wbv0 wbv0Var = this.a;
                    suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.label = 1;
                    obj = wbv0Var.a.f(suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    wbv0 wbv0Var2 = this.a;
                    suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.label = 2;
                    obj = wbv0Var2.a.b(suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1);
                }
                z = false;
                this.b = Boolean.valueOf(z);
                return Boolean.valueOf(z);
            }
        }
        suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1 = new SuggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1(this, continuationImpl);
        obj = suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestsPerformanceOptimizationInteractorImpl$isSuggestsRequestOptimizationEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        this.b = Boolean.valueOf(z2);
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        if (((com.yandex.go.address.search.perf.experiment.SuggestsPerformanceOptimizationExperiment) r6).d != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1 suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SuggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1) {
            suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1 = (SuggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1) continuationImpl;
            int i2 = suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.label;
                wbv0 wbv0Var = this.a;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.label = 1;
                    obj = wbv0Var.a.f(suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.label = 2;
                    obj = wbv0Var.a.b(suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1 = new SuggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1(this, continuationImpl);
        obj = suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestsPerformanceOptimizationInteractorImpl$isZerosuggestPrefetchEnabled$1.label;
        wbv0 wbv0Var2 = this.a;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
