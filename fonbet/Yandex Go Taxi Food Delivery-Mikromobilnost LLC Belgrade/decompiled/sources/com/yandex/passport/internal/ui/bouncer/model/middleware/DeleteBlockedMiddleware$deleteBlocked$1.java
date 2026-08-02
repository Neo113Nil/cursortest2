package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.DeleteBlockedMiddleware", f = "DeleteBlockedMiddleware.kt", l = {35}, m = "deleteBlocked")
/* loaded from: classes2.dex */
final class DeleteBlockedMiddleware$deleteBlocked$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteBlockedMiddleware$deleteBlocked$1(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return w.b(this.this$0, null, this);
    }
}
