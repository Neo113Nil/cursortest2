package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushIPCClientImpl.kt */
@b6l(c = "com.vk.push.pushsdk.client.ipc.PushIPCClientImpl", f = "PushIPCClientImpl.kt", l = {37}, m = "sendMessages-0E7RQCE")
/* loaded from: classes5.dex */
public final class pie0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uie0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pie0(uie0 uie0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uie0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.e(null, this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
