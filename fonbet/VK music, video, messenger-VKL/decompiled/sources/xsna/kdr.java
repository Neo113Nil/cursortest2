package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FilterRepository.kt */
@b6l(c = "com.vk.photo.editor.repository.filter.FilterRepository", f = "FilterRepository.kt", l = {97}, m = "getLutById")
/* loaded from: classes4.dex */
public final class kdr extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mdr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdr(mdr mdrVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mdrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, this);
    }
}
