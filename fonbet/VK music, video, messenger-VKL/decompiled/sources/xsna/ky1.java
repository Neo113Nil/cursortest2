package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnalyticsSendingTimestampRepository.kt */
@b6l(c = "com.vk.push.pushsdk.data.repository.AnalyticsSendingTimestampRepository", f = "AnalyticsSendingTimestampRepository.kt", l = {18}, m = "setNewTimestampPushCountEventSending")
/* loaded from: classes5.dex */
public final class ky1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ly1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky1(ly1 ly1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ly1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
