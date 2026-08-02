package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsCtaInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsCtaInteractorImpl", f = "ClipsCtaInteractorImpl.kt", l = {22}, m = "isCurrentCtaValid")
/* loaded from: classes17.dex */
public final class mod extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nod this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mod(nod nodVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nodVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
