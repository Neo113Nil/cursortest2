package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CheckServiceAliveInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.CheckServiceAliveInteractor", f = "CheckServiceAliveInteractor.kt", l = {31}, m = "getConfig")
/* loaded from: classes5.dex */
public final class u0c extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t0c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0c(t0c t0cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t0cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t0c.a(this.this$0, this);
    }
}
