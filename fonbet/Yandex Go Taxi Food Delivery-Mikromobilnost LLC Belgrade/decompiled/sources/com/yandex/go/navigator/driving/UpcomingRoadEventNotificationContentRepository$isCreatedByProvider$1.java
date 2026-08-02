package com.yandex.go.navigator.driving;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.driving.UpcomingRoadEventNotificationContentRepository", f = "UpcomingRoadEventNotificationContentRepository.kt", l = {114}, m = "isCreatedByProvider", v = 2)
/* loaded from: classes12.dex */
final class UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$1(p0 p0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p0.b(this.this$0, null, this);
    }
}
