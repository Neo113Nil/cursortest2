package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsSdkDraftsInteractorVkImpl.kt */
@b6l(c = "com.vk.camera.clips.drafts.sync.impl.interactor.ClipsSdkDraftsInteractorVkImpl", f = "ClipsSdkDraftsInteractorVkImpl.kt", l = {30}, m = "getDraftById")
/* loaded from: classes14.dex */
public final class w2f extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v2f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2f(v2f v2fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = v2fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
