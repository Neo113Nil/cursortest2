package com.ybsdk.core.utils.poller;

import defpackage.mvg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.poller.PollerFactory$createPollerWithMapping$1", f = "PollerFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PollerFactory$createPollerWithMapping$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollerFactory$createPollerWithMapping$1 pollerFactory$createPollerWithMapping$1 = new PollerFactory$createPollerWithMapping$1(2, continuation);
        pollerFactory$createPollerWithMapping$1.L$0 = obj;
        return pollerFactory$createPollerWithMapping$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((PollerFactory$createPollerWithMapping$1) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        throw ((Throwable) this.L$0);
    }
}
