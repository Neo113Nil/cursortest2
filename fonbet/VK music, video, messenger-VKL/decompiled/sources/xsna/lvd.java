package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsEditSdkPrivacyHandlerVk.kt */
@b6l(c = "com.vk.clips.edit.impl.deps.features.ClipsEditSdkPrivacyHandlerVk", f = "ClipsEditSdkPrivacyHandlerVk.kt", l = {22}, m = "openGroupPrivacy")
/* loaded from: classes16.dex */
public final class lvd extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mvd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvd(mvd mvdVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mvdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
