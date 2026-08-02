package com.yandex.go.shortcuts.impl.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements tpr {
    public final /* synthetic */ c a;
    public final /* synthetic */ i b;

    public e(c cVar, i iVar) {
        this.a = cVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1 feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1;
        int i;
        if (continuation instanceof FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1) {
            feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1 = (FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1) continuation;
            int i2 = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.L$0 = null;
                    feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.L$1 = null;
                    feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.L$2 = null;
                    feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.label = 1;
                    if (this.a.collect(dVar, feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1) == coroutineSingletons) {
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
        feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1 = new FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1(this, continuation);
        Object obj2 = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
