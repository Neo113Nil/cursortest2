package com.yandex.quark.webchat.auth.internal.synchronizer;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.quark.webchat.auth.internal.synchronizer.WebAuthorizationSynchronizer", f = "WebAuthorizationSynchronizer.kt", l = {141, 405}, m = "synchronizeState")
/* loaded from: classes8.dex */
final class WebAuthorizationSynchronizer$synchronizeState$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthorizationSynchronizer$synchronizeState$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, this);
    }
}
