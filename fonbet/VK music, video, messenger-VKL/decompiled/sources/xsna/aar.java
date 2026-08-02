package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FileStorage.kt */
@b6l(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
/* loaded from: classes12.dex */
public final class aar<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bar<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aar(bar barVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = barVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bar.f(this.this$0, this);
    }
}
