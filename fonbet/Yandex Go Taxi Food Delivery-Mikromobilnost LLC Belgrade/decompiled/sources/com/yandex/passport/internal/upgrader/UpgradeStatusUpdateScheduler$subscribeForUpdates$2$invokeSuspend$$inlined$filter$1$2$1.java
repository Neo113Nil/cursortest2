package com.yandex.passport.internal.upgrader;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.upgrader.UpgradeStatusUpdateScheduler$subscribeForUpdates$2$invokeSuspend$$inlined$filter$1$2", f = "UpgradeStatusUpdateScheduler.kt", l = {50}, m = "emit")
/* loaded from: classes2.dex */
public final class UpgradeStatusUpdateScheduler$subscribeForUpdates$2$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeStatusUpdateScheduler$subscribeForUpdates$2$invokeSuspend$$inlined$filter$1$2$1(q qVar, Continuation continuation) {
        super(continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
