package com.yandex.go.summary.interactor.core;

import defpackage.ldv0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c {
    public final ldv0 a;

    public c(ldv0 ldv0Var) {
        this.a = ldv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1 showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1;
        int i;
        if (continuationImpl instanceof ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1) {
            showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1 = (ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1) continuationImpl;
            int i2 = showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$2 showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$2 = new ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$2(this, null);
                    showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1.label = 1;
                    if (kotlinx.coroutines.a.w(1000L, showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$2, showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1 = new ShowRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1(this, continuationImpl);
        Object obj2 = showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showRunnableWhenSummaryExpandedInteractor$awaitExpandedSummaryOrFallback$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Runnable runnable, ContinuationImpl continuationImpl) {
        ShowRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1 showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1;
        int i;
        if (continuationImpl instanceof ShowRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1) {
            showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1 = (ShowRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1) continuationImpl;
            int i2 = showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.L$0 = runnable;
                    showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.label = 1;
                    if (a(showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    runnable = (Runnable) showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.L$0;
                    kotlin.b.b(obj);
                }
                runnable.run();
                return zy11.a;
            }
        }
        showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1 = new ShowRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1(this, continuationImpl);
        Object obj3 = showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showRunnableWhenSummaryExpandedInteractor$showRunnableWhenSummaryExpanded$1.label;
        if (i != 0) {
        }
        runnable.run();
        return zy11.a;
    }
}
