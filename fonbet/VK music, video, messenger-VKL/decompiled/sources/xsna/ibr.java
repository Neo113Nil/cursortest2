package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FileStorage.kt */
@b6l(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
/* loaded from: classes12.dex */
public final class ibr extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ jbr<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibr(jbr jbrVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jbrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
