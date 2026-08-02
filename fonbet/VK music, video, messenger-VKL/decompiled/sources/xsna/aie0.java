package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushIPCClientImpl.kt */
@b6l(c = "com.vk.push.pushsdk.client.ipc.PushIPCClientImpl", f = "PushIPCClientImpl.kt", l = {67}, m = "isPushTokenExist-gIAlu-s")
/* loaded from: classes5.dex */
public final class aie0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uie0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aie0(uie0 uie0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uie0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
