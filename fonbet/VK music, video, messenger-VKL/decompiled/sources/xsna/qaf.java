package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsTrendingHashtagsDataSourceImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsTrendingHashtagsDataSourceImpl", f = "ClipsTrendingHashtagsDataSourceImpl.kt", l = {15}, m = "loadTrendingHashtags")
/* loaded from: classes17.dex */
public final class qaf extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ raf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaf(raf rafVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
