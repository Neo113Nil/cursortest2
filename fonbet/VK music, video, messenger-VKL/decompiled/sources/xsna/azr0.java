package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoAdFreeSubscriptionRepositoryImpl.kt */
@b6l(c = "com.vk.libvideo.adfree.impl.data.VideoAdFreeSubscriptionRepositoryImpl", f = "VideoAdFreeSubscriptionRepositoryImpl.kt", l = {17}, m = "getSubscriptionState-IoAF18A")
/* loaded from: classes18.dex */
public final class azr0 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ czr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azr0(czr0 czr0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = czr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
