package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsGeolocationInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsGeolocationInteractorImpl", f = "ClipsGeolocationInteractorImpl.kt", l = {31, 37}, m = "getSuggestedPlaces")
/* loaded from: classes17.dex */
public final class y9e extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z9e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9e(z9e z9eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = z9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, this);
    }
}
