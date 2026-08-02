package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushIPCClientInteractorImpl.kt */
@b6l(c = "com.vk.push.pushsdk.client.ipc.PushIPCClientInteractorImpl", f = "PushIPCClientInteractorImpl.kt", l = {45}, m = "isPushTokenExist-0E7RQCE")
/* loaded from: classes5.dex */
public final class wie0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ aje0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wie0(aje0 aje0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aje0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
