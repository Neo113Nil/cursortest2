package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsUploadUserInfoInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadUserInfoInteractorImpl", f = "ClipsUploadUserInfoInteractorImpl.kt", l = {36}, m = "getUserInfo")
/* loaded from: classes17.dex */
public final class wkf extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ykf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkf(ykf ykfVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ykfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
