package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushIPCClientInteractorImpl.kt */
@b6l(c = "com.vk.push.pushsdk.client.ipc.PushIPCClientInteractorImpl", f = "PushIPCClientInteractorImpl.kt", l = {32}, m = "onTokenInvalidated-gIAlu-s")
/* loaded from: classes5.dex */
public final class yie0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ aje0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yie0(aje0 aje0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aje0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
