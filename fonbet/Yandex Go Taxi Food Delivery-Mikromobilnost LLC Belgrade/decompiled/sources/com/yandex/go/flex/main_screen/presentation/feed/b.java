package com.yandex.go.flex.main_screen.presentation.feed;

import defpackage.di9;
import defpackage.goq;
import defpackage.ny61;
import defpackage.t2m;
import defpackage.wgr;
import defpackage.yip0;
import flex.feature.sections.action.ScrollPositionSurrogate;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final goq a;
    public final e b;
    public final t2m c;
    public final wgr d;

    public b(goq goqVar, e eVar, t2m t2mVar, wgr wgrVar) {
        this.a = goqVar;
        this.b = eVar;
        this.c = t2mVar;
        this.d = wgrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (kotlinx.coroutines.a.i(500, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ContinuationImpl continuationImpl) {
        FeedScroller$scrollToFeedTop$1 feedScroller$scrollToFeedTop$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof FeedScroller$scrollToFeedTop$1) {
            feedScroller$scrollToFeedTop$1 = (FeedScroller$scrollToFeedTop$1) continuationImpl;
            int i2 = feedScroller$scrollToFeedTop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedScroller$scrollToFeedTop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedScroller$scrollToFeedTop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedScroller$scrollToFeedTop$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    feedScroller$scrollToFeedTop$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                wgr wgrVar = bVar.d;
                yip0 yip0Var = new yip0("feed_onboarding_scroll_anchor", ScrollPositionSurrogate.TOP, 1, true);
                feedScroller$scrollToFeedTop$1.label = 2;
                Object a = wgrVar.a(yip0Var, feedScroller$scrollToFeedTop$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        feedScroller$scrollToFeedTop$1 = new FeedScroller$scrollToFeedTop$1(bVar, continuationImpl);
        Object obj2 = feedScroller$scrollToFeedTop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedScroller$scrollToFeedTop$1.label;
        if (i != 0) {
        }
        wgr wgrVar2 = bVar.d;
        yip0 yip0Var2 = new yip0("feed_onboarding_scroll_anchor", ScrollPositionSurrogate.TOP, 1, true);
        feedScroller$scrollToFeedTop$1.label = 2;
        Object a2 = wgrVar2.a(yip0Var2, feedScroller$scrollToFeedTop$1);
        if (a2 != coroutineSingletons2) {
        }
    }

    public final Object b(Continuation continuation) {
        return kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.X(new di9(this.a.a), new FeedScroller$waitForFeedLoadingFinished$1(this, null)), new FeedScroller$listenForFeedDeeplink$2(this, null), continuation);
    }
}
