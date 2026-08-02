package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FilterPreviewRepository.kt */
@b6l(c = "com.vk.photo.editor.repository.filter.FilterPreviewRepository", f = "FilterPreviewRepository.kt", l = {109, 71, 82}, m = "createPreview")
/* loaded from: classes4.dex */
public final class fdr extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hdr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdr(hdr hdrVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hdrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
