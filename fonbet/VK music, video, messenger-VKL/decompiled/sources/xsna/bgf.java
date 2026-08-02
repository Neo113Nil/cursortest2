package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsUploadGroupsInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadGroupsInteractorImpl", f = "ClipsUploadGroupsInteractorImpl.kt", l = {59}, m = "getGroup")
/* loaded from: classes17.dex */
public final class bgf extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgf(dgf dgfVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dgfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
