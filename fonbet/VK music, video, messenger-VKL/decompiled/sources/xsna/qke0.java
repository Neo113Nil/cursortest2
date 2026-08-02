package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushTokenApiImpl.kt */
@b6l(c = "com.vk.push.pushsdk.pusher.token.PushTokenApiImpl", f = "PushTokenApiImpl.kt", l = {24}, m = "deleteToken-0E7RQCE")
/* loaded from: classes5.dex */
public final class qke0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rke0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qke0(rke0 rke0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rke0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
