package com.ybsdk.utils.poller;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.s2e0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"BLOCK", "Ls2e0;", "pollingState", "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.utils.poller.PollerImpl$poll$2$3", f = "PollerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PollerImpl$poll$2$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollerImpl$poll$2$3(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollerImpl$poll$2$3 pollerImpl$poll$2$3 = new PollerImpl$poll$2$3(this.this$0, continuation);
        pollerImpl$poll$2$3.L$0 = obj;
        return pollerImpl$poll$2$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PollerImpl$poll$2$3 pollerImpl$poll$2$3 = (PollerImpl$poll$2$3) create((s2e0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pollerImpl$poll$2$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l8x l8xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s2e0 s2e0Var = (s2e0) this.L$0;
        if (e.a(s2e0Var) && (l8xVar = this.this$0.j) != null) {
            l8xVar.a(s2e0Var instanceof q2e0 ? new CancellationException() { // from class: com.ybsdk.utils.poller.PollerImpl$SuccessCancellationException
            } : null);
        }
        return zy11.a;
    }
}
