package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishFileStorageImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.file.PublishFileStorageImpl", f = "PublishFileStorageImpl.kt", l = {25}, m = "getVideoPreview-0E7RQCE")
/* loaded from: classes7.dex */
public final class xbe0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zbe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbe0(zbe0 zbe0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zbe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
