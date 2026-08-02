package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WorkExecutorIPCClient.kt */
@b6l(c = "com.vk.push.pushsdk.work.multiprocess.ipc.WorkExecutorIPCClient", f = "WorkExecutorIPCClient.kt", l = {33}, m = "executeWork-gIAlu-s")
/* loaded from: classes5.dex */
public final class kvx0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ovx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvx0(ovx0 ovx0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ovx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object n = this.this$0.n(null, this);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : new Result(n);
    }
}
