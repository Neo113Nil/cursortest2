package com.yandex.messaging.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.domain.GetCanReportChatUseCase", f = "GetCanReportChatUseCase.kt", l = {48}, m = "canReportChat")
/* loaded from: classes15.dex */
final class GetCanReportChatUseCase$canReportChat$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCanReportChatUseCase$canReportChat$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, 0L, this);
    }
}
