package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.SetCurrentAccountMiddleware$accept$$inlined$map$1$2", f = "SetCurrentAccountMiddleware.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 50}, m = "emit")
/* loaded from: classes2.dex */
public final class SetCurrentAccountMiddleware$accept$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCurrentAccountMiddleware$accept$$inlined$map$1$2$1(y0 y0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
