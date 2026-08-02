package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsEditTrendingHashtagsHandlerVk.kt */
@b6l(c = "com.vk.clips.edit.impl.deps.features.ClipsEditTrendingHashtagsHandlerVk", f = "ClipsEditTrendingHashtagsHandlerVk.kt", l = {11}, m = "getPopularHashtags")
/* loaded from: classes16.dex */
public final class qvd extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rvd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvd(rvd rvdVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rvdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
