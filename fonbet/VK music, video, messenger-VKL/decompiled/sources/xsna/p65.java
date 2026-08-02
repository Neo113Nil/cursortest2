package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AuthTokenIPCInteractorImpl.kt */
@b6l(c = "com.vk.push.authsdk.ipc.AuthTokenIPCInteractorImpl", f = "AuthTokenIPCInteractorImpl.kt", l = {88, 95}, m = "getAuthTokenResult")
/* loaded from: classes5.dex */
public final class p65 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q65 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p65(q65 q65Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = q65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return q65.h(this.this$0, null, this);
    }
}
