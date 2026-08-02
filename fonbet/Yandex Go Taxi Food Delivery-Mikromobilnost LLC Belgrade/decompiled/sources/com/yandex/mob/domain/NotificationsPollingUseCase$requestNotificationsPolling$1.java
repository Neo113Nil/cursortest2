package com.yandex.mob.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.domain.NotificationsPollingUseCase", f = "NotificationsPollingUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 66, 70, 74}, m = "requestNotificationsPolling")
/* loaded from: classes8.dex */
final class NotificationsPollingUseCase$requestNotificationsPolling$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsPollingUseCase$requestNotificationsPolling$1(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return q.a(this.this$0, null, this);
    }
}
