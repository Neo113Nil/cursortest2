package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FilterRepository.kt */
@b6l(c = "com.vk.photo.editor.repository.filter.FilterRepository", f = "FilterRepository.kt", l = {83}, m = "onFilterNoLongerVisibleToUser")
/* loaded from: classes4.dex */
public final class ndr extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mdr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndr(mdr mdrVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mdrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0, this);
    }
}
