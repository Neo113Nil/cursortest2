package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.SetCurrentAccountMiddleware$accept$$inlined$filterIsInstance$1$2", f = "SetCurrentAccountMiddleware.kt", l = {50}, m = "emit")
/* loaded from: classes2.dex */
public final class SetCurrentAccountMiddleware$accept$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCurrentAccountMiddleware$accept$$inlined$filterIsInstance$1$2$1(x0 x0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
