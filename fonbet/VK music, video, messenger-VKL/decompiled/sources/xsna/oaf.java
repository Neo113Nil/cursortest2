package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsTrendingHashtagRepositoryImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsTrendingHashtagRepositoryImpl", f = "ClipsTrendingHashtagRepositoryImpl.kt", l = {38, 24}, m = "loadTrendingHashtags")
/* loaded from: classes17.dex */
public final class oaf extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ paf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oaf(paf pafVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
