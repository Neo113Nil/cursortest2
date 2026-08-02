package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsPusherMessagesInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.pusher.VkpnsPusherMessagesInteractor", f = "VkpnsPusherMessagesInteractor.kt", l = {21}, m = "getMessages-gIAlu-s")
/* loaded from: classes5.dex */
public final class p5w0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q5w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5w0(q5w0 q5w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = q5w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
