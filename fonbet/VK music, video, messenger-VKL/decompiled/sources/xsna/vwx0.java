package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WorkRegistratorIPCClient.kt */
@b6l(c = "com.vk.push.pushsdk.work.multiprocess.ipc.WorkRegistratorIPCClient", f = "WorkRegistratorIPCClient.kt", l = {57}, m = "cancelWork-gIAlu-s")
/* loaded from: classes5.dex */
public final class vwx0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cxx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwx0(cxx0 cxx0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cxx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object o = this.this$0.o(null, this);
        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : new Result(o);
    }
}
