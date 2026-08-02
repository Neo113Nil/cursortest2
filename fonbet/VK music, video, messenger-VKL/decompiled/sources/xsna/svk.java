package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DataStoreSynStorage.kt */
@b6l(c = "com.vk.push.pushsdk.storage.DataStoreSynStorage", f = "DataStoreSynStorage.kt", l = {63}, m = "getLastSyn")
/* loaded from: classes5.dex */
public final class svk extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rvk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svk(rvk rvkVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rvkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
