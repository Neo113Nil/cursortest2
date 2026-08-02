package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AttachedClipsNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.attachedclips.data.network.AttachedClipsNetworkApiImpl", f = "AttachedClipsNetworkApiImpl.kt", l = {21}, m = "getVideoAttachedClips-gIAlu-s")
/* loaded from: classes7.dex */
public final class t54 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x54 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t54(x54 x54Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = x54Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
