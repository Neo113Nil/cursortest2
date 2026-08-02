package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterIPCClient.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.ipc.MasterIPCClient", f = "MasterIPCClient.kt", l = {50}, m = "sendRequestToInitiateElections-IoAF18A")
/* loaded from: classes5.dex */
public final class wj10 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ak10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj10(ak10 ak10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ak10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object q = this.this$0.q(this);
        return q == CoroutineSingletons.COROUTINE_SUSPENDED ? q : new Result(q);
    }
}
