package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsDraftSyncCoordinatorImpl.kt */
@b6l(c = "com.vk.camera.clips.drafts.sync.impl.ClipsDraftSyncCoordinatorImpl", f = "ClipsDraftSyncCoordinatorImpl.kt", l = {207}, m = "getDraftListAsync")
/* loaded from: classes14.dex */
public final class wtd extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ytd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtd(ytd ytdVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ytdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
