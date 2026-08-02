package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ElectionInitializedDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.storage.ElectionInitializedDataSource", f = "ElectionInitializedDataSource.kt", l = {27}, m = "isElectionNotFinished")
/* loaded from: classes.dex */
public final class tap extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tap(sap sapVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sapVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
