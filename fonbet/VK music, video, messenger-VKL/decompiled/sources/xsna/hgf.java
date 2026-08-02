package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsUploadInitCompactExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadInitCompactExecutor", f = "ClipsUploadInitCompactExecutor.kt", l = {103}, m = "createUploadData")
/* loaded from: classes17.dex */
public final class hgf extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ lgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgf(lgf lgfVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lgfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lgf.t(this.this$0, null, null, this);
    }
}
