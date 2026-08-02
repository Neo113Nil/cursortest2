package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsPrivacyInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsPrivacyInteractorImpl", f = "ClipsPrivacyInteractorImpl.kt", l = {28}, m = "loadDisplayString")
/* loaded from: classes17.dex */
public final class vwe extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xwe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwe(xwe xweVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xweVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, null, this);
    }
}
