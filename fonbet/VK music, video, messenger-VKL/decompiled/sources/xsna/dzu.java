package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.zef0;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
@b6l(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt", f = "HealthConnectClientAggregationExtensions.kt", l = {160}, m = "aggregate")
/* loaded from: classes12.dex */
public final class dzu<T extends zef0, R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public dzu() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return kzu.a(null, null, null, this);
    }
}
