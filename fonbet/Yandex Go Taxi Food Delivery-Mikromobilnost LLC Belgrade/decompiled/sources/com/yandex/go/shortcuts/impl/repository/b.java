package com.yandex.go.shortcuts.impl.repository;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ny61;
import defpackage.q6y0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public b(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1 feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1) {
            feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1 = (FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1) continuation;
            int i2 = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q6y0 q6y0Var = (q6y0) obj;
                    i iVar = this.b;
                    boolean booleanValue = ((Boolean) iVar.e.e.a.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) iVar.f.a.a.getValue()).booleanValue();
                    Screen b = iVar.g.b();
                    if (booleanValue && !booleanValue2) {
                        iVar.k.put(q6y0Var.a(), q6y0Var.l);
                    }
                    if ((!booleanValue && b != Screen.ORDER_TRACKING) || booleanValue2) {
                        feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.L$0 = null;
                        feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.L$1 = null;
                        feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.L$2 = null;
                        feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.L$3 = null;
                        feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1 = new FeedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedOrderStatusNotificationRepositoryImpl$startObserveOrderStatuses$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
