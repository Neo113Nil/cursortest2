package com.yandex.passport.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.SendAuthToTrackRequest", f = "SendAuthToTrackRequest.kt", l = {46}, m = "run-gIAlu-s")
/* loaded from: classes15.dex */
final class SendAuthToTrackRequest$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAuthToTrackRequest$run$1(wb wbVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
