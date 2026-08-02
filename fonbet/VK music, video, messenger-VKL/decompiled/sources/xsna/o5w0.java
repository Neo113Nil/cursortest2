package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsPusherMessagesInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.pusher.VkpnsPusherMessagesInteractor", f = "VkpnsPusherMessagesInteractor.kt", l = {31}, m = "getBatchedMessages-BWLJW6A")
/* loaded from: classes5.dex */
public final class o5w0 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q5w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5w0(q5w0 q5w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = q5w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
