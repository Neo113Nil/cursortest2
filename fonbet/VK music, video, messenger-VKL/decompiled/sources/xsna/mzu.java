package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HealthConnectClientImpl.kt */
@b6l(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", l = {237}, m = "aggregateGroupByDuration")
/* loaded from: classes12.dex */
public final class mzu extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nzu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzu(nzu nzuVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nzuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
