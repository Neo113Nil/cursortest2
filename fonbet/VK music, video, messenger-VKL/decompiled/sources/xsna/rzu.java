package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@b6l(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", l = {234, 244}, m = "aggregate")
/* loaded from: classes12.dex */
public final class rzu extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qzu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzu(qzu qzuVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qzuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
