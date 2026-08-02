package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl", f = "PublishNetworkApiImpl.kt", l = {56}, m = "getVideoFile-gIAlu-s")
/* loaded from: classes7.dex */
public final class rde0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rde0(bee0 bee0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
