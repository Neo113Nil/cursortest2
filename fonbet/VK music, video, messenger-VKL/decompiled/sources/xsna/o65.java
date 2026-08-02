package xsna;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AuthTokenIPCInteractorImpl.kt */
@b6l(c = "com.vk.push.authsdk.ipc.AuthTokenIPCInteractorImpl", f = "AuthTokenIPCInteractorImpl.kt", l = {83}, m = "getAuthToken-gIAlu-s")
/* loaded from: classes5.dex */
public final class o65 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q65 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o65(q65 q65Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = q65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable g = q65.g(this.this$0, null, this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
