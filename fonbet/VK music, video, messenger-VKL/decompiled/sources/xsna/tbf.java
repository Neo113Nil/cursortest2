package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor", f = "ClipsUploadAsyncLoadExecutor.kt", l = {332}, m = "getLinksAvailabilityState")
/* loaded from: classes17.dex */
public final class tbf extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbf(wcf wcfVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wcfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return wcf.v(this.this$0, null, this);
    }
}
